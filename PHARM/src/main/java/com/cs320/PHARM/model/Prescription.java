package com.cs320.PHARM.model;

public class Prescription {
    private int PrescriptionId;
    private int drugListId;
    private int doctorID;
    private int patientId;
    private String PatientName;
    private String Note;

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
