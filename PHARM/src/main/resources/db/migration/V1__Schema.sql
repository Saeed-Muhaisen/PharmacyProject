Create table if not EXISTS Doctor(
    DoctorID serial PRIMARY KEY,
    DoctorName VARCHAR(64) not null,
    CHECK (DoctorName <> '')
    );

Create table if not EXISTS Drug
(
    DrugID   serial PRIMARY KEY,
    DrugName VARCHAR(64) unique not null

    );
Create table if not EXISTS Pharmacy(
    PharmacyID serial UNIQUE,
    PharmacyName varchar(64) not null,
    InventoryID serial UNIQUE,
    PRIMARY key(PharmacyID,InventoryID)



    );
create table if not exists Inventory(
     InventoryID INTEGER,
     DrugID INTEGER	UNIQUE,
     Capacity INTEGER,
    foreign key(DrugID) references Drug(drugid),
    foreign key(InventoryID) references Pharmacy(inventoryid)
    );
create table if not exists Patient(
    PatientID serial primary key,
    patientName varchar(64) not null
    );

create Table if not exists Prescription(
    PrescriptionId serial UNIQUE ,
    DrugListID serial UNIQUE,
    DoctorID INTEGER not null,
    PatientID int not null,
    PatientName VARCHAR(64) not null,
    Notes VARCHAR(255),
    PRIMARY Key (prescriptionID, DrugListID),
    FOREIGN KEY (DoctorID) references Doctor(DoctorID),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID)
    );

create table if not exists DrugList(
    DrugListID serial,
    DrugID int,
    Amount int,
    FOREIGN KEY (DrugID) references Drug(drugid),
    Foreign Key (DrugListID) references Prescription(DrugListID)
    );

create table if not exists transactionHistory(
    PharmacyID int,
    DrugListID int NOT NULL,
    drugID int not null,
    amount_sold int not null


);

create table if not exists useraccounts(
    username varchar(20) primary key,
    id int,
    password varchar(20) not null,
    type int not null,

    check ( type>0 and type<4 )
    );
create FUNCTION IncreaseAmountinInventory() RETURNS TRIGGER AS

    ' BEGIN
   if(Exists (Select InventoryID,drugid from inventory where inventoryid=NEW.InventoryID and drugid=NEW.DrugID))
then
    UPDATE Inventory  SET capacity = inventory.capacity + NEW.Capacity
    WHERE inventoryid=NEW.InventoryID AND DrugID = NEW.DrugID;
return null;
END IF;
   return NEW;
END;

' LANGUAGE plpgsql;

create TRIGGER IncreaseInventoryAmount before insert on inventory
    FOR EACH ROW EXECUTE PROCEDURE IncreaseAmountinInventory();


create FUNCTION createDoctorAccount() RETURNS TRIGGER AS
    '    BEGIN
    insert into useraccounts (username, id, password, type) values(NEW.DoctorName,NEW.DoctorID,NEW.DoctorName,2);
    return old;
END;

' LANGUAGE plpgsql;

create TRIGGER doctorAccount after insert on Doctor
    FOR EACH ROW EXECUTE PROCEDURE createDoctorAccount();

create FUNCTION createPharmacyAccount() RETURNS TRIGGER AS
    '    BEGIN
    insert into useraccounts (username, id, password, type) values(NEW.PharmacyName,NEW.PharmacyID,NEW.PharmacyName,3);
    return old;
END;

' LANGUAGE plpgsql;

create TRIGGER pharmacyAccount after insert on Pharmacy
    FOR EACH ROW EXECUTE PROCEDURE createPharmacyAccount();

create FUNCTION deleteDoctorAccount() RETURNS TRIGGER AS
    '    BEGIN
    Delete from useraccounts where username= OLD.Doctorname and id=OLD.DoctorID;
    return OLD;
END;

' LANGUAGE plpgsql;

create TRIGGER deleteDoctor before delete on Doctor
    FOR EACH ROW EXECUTE PROCEDURE deleteDoctorAccount();

create FUNCTION deletePharmacyAccount() RETURNS TRIGGER AS
    '    BEGIN
    Delete from useraccounts where username= OLD.PharmacyName and id=OLD.PharmacyID;
    return OLD;
END;

' LANGUAGE plpgsql;

create TRIGGER deleteDrug before delete on Pharmacy
    FOR EACH ROW EXECUTE PROCEDURE deletePharmacyAccount();

create FUNCTION transactionHistoryTrigger() RETURNS TRIGGER AS
    '    BEGIN
        IF NEW.amount_sold=(select c.amount from druglist c where c.druglistid=NEW.DrugListID and c.drugid=NEW.drugID)
        THEN
            delete from druglist c where c.drugid=NEW.drugID and c.DrugListID=NEW.DrugListID;
            update inventory set capacity=Capacity-NEW.amount_sold where inventoryid=NEW.PharmacyID and DrugID=NEW.drugID;
        end if;
        IF (not EXISTS (select * from druglist c where c.druglistid=NEW.DrugListID))
        THEN
            delete from prescription c where c.DrugListID=NEW.DrugListID;
        END IF;
        RETURN old;
    END;

    ' LANGUAGE plpgsql;

create TRIGGER Transaction after INSERT on transactionhistory
    FOR EACH ROW EXECUTE PROCEDURE transactionHistoryTrigger();