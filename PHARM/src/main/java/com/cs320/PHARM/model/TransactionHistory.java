package com.cs320.PHARM.model;

public class TransactionHistory {

        private int pharmacyId;
        private int drugListId;
        private int drugID;
        private int amount_sold;

        public TransactionHistory PharmacyId(int pharmacyId){
            this.pharmacyId=pharmacyId;
            return this;
        }
        public TransactionHistory DrugListId(int drugListId){
            this.drugListId=drugListId;
            return this;
        }
        public TransactionHistory DrugId(int drugID){
            this.drugID=drugID;
            return this;
        }
        public TransactionHistory Amount_Sold(int amount_sold){
            this.amount_sold=amount_sold;
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
    }

