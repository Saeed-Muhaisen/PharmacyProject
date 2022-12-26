package com.cs320.PHARM.model;



public class Inventory {
    private int InventoryID;
    private int DrugID;
    private int Capacity;

    public Inventory inventoryID(int InventoryID){
        this.InventoryID= InventoryID;
        return this;
    }

    public Inventory drugID(int DrugID){
        this.DrugID=DrugID;
        return this;
    }
    public Inventory capacity(int Capacity){
        this.Capacity=Capacity;
        return this;
    }
    public int getInventoryID() {
        return InventoryID;
    }

    public void setInventoryID(int inventoryID) {
        InventoryID = inventoryID;
    }

    public int getDrugID() {
        return DrugID;
    }

    public void setDrugID(int drugID) {
        DrugID = drugID;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}

