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
    InventoryID INTEGER UNIQUE,
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



