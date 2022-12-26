package com.cs320.PHARM.model;

public class TransactionHistory {
    private int transactionhistoryId;
    private int patientID;
    private int doctorId;
    private int pharmacyId;
    private int drugListId;
    private int drugID;
    private int amount_sold;

    public TransactionHistory patientID(int patientId) {
        this.patientID = patientId;
        return this;
    }

    public TransactionHistory doctorID(int doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    public TransactionHistory transactionHistory(int transactionHistoryID) {
        this.transactionhistoryId = transactionHistoryID;
        return this;
    }

    public TransactionHistory pharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
        return this;
    }

    public TransactionHistory drugListId(int drugListId) {
        this.drugListId = drugListId;
        return this;
    }

    public TransactionHistory drugId(int drugID) {
        this.drugID = drugID;
        return this;
    }

    public TransactionHistory amountSold(int amount_sold) {
        this.amount_sold = amount_sold;
        return this;
    }


    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public int getDrugListId() {
        return drugListId;
    }

    public void setDrugListId(int drugListId) {
        this.drugListId = drugListId;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public int getAmount_sold() {
        return amount_sold;
    }

    public void setAmount_sold(int amount_sold) {
        this.amount_sold = amount_sold;
    }

    public int getTransactionhistoryId() {
        return transactionhistoryId;
    }

    public void setTransactionhistoryId(int transactionhistoryId) {
        this.transactionhistoryId = transactionhistoryId;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientId) {
        this.patientID = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

}

