package com.cs320.PHARM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pharmacy {

    @Id
    @Column(name = "PharmacyId")
    private int PharmacyID;
    @Column(name="PharmacyName")
    private String PharmacyName;
    @Column(name="InventoryID")
    private int inventoryId;

    //RowMapper Functions:
    public Pharmacy PharmacyID(int PharmacyID){
        this.PharmacyID=PharmacyID;
        return this;
    }
    public Pharmacy PharmacyName(String PharmacyName){
        this.PharmacyName=PharmacyName;
        return this;
    }
    public Pharmacy PharmacyInventoryID(int inventoryID) {
        this.inventoryId=inventoryID;
        return this;
    }
    //----------

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getPharmacyID() {
        return PharmacyID;
    }

    public void setPharmacyID(int pharmacyID) {
        PharmacyID = pharmacyID;
    }

    public String getPharmacyName() {
        return PharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        PharmacyName = pharmacyName;
    }

}
