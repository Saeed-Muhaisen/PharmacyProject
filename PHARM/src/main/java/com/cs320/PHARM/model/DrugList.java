package com.cs320.PHARM.model;


public class DrugList {
    private int DrugID;
    private int DrugListID;
    private int amount;

    public DrugList DrugID(int DrugID){
        this.DrugID=DrugID;
        return this;
    }
    public DrugList DrugListID(int DrugListID){
        this.DrugListID=DrugListID;
        return this;
    }
    public DrugList amount(int Amount){
        this.amount=Amount;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDrugID() {
        return DrugID;
    }

    public void setDrugID(int drugID) {
        DrugID = drugID;
    }

    public int getDrugListID() {
        return DrugListID;
    }

    public void setDrugListID(int drugListID) {
        DrugListID = drugListID;
    }
}
