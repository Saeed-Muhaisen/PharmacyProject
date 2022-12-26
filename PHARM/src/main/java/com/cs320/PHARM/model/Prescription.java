package com.cs320.PHARM.model;

public class Prescription {
    private int PrescriptionId;
    private int drugListId;
    private int doctorID;
    private int patientId;
    private String PatientName;
    private String Note;

    //For RAWMAPPER:
    public Prescription perscriptionId(int PerscriptionId) {
        this.PrescriptionId =PerscriptionId;
        return this;

    }
    public Prescription drugListId(int drugListId) {
        this.drugListId =drugListId;
        return this;

    }
    public Prescription doctorID(int doctorID) {
        this.doctorID=doctorID;
        return this;

    }
    public Prescription patientId(int patientId) {
        this.patientId=patientId;
        return this;

    }
    public Prescription patientName(String patientName) {
        this.PatientName=patientName;
        return this;

    }
    public Prescription note(String notes) {
        this.Note=notes;
        return this;
    }
    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }


    public int getDrugListId() {
        return drugListId;
    }

    public void setDrugListId(int drugListId) {
        this.drugListId = drugListId;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public int getPrescriptionId() {
        return PrescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        PrescriptionId = prescriptionId;
    }

}
