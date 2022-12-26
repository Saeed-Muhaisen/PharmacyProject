package com.cs320.PHARM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
    @Column(name="doctorID")
    private int DoctorId;

    @Column(name="doctorname")
    private String DoctorName;


    //RowMapper functions
    public Doctor doctorId(int DoctorId){
        this.DoctorId= DoctorId;
        return this;
    }
    public Doctor doctorName(String DoctorName){
        this.DoctorName= DoctorName;
        return this;
    }
    //-----------------
    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int doctorId) {
        DoctorId = doctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }




}
