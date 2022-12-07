package com.cs320.PHARM.model;

public class Pharmacy {

    private int PharmacyID;
    private String PharmacyName;
    private int inventoryId;

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
