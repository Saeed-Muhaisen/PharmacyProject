package com.cs320.PHARM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
    @Column(name="Patientname")
    private String name;
    @Id
    @Column(name="PatientID")
    private int id;

    @Column(name="DoctorId")
    private int DoctorId;

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int doctorid) {
        this.DoctorId = doctorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient patientId(int patientId) {
        this.id=patientId;
        return this;
    }
    public Patient doctorId(int doctorId) {
        this.DoctorId=doctorId;
        return this;
    }
    public Patient patientName(String patientName) {
        this.name=patientName;
        return this;
    }
}