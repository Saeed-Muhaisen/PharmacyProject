package com.cs320.PHARM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Drug {
    @Id
    @Column(name="DrugID")
    private int DrugID;
    @Column(name="DrugName")
    private String DrugName;

    //RowMapper Functions
    public Drug DrugID(int DrugID){
        this.DrugID=DrugID;
        return this;
    }
    public Drug DrugName(String DrugName){
        this.DrugName=DrugName;
        return this;

    }
    //----------

    public int getDrugID() {
        return DrugID;
    }

    public void setDrugID(int drugID) {
        DrugID = drugID;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        DrugName = drugName;
    }
}