package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PrescriptionDao;
import com.cs320.PHARM.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PrescriptionAPI {

    @Autowired
    private final PrescriptionDao prescriptionDao;

    @Autowired
    public PrescriptionAPI(PrescriptionDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }
    public int addPrescription(Prescription prescription){
        return prescriptionDao.insertPerscription(prescription.getDoctorID(),prescription.getPatientId() ,
                prescription.getPatientName());
    }

    public void updatePrescription(Prescription prescription){
        prescriptionDao.updatePerscription(prescription.getPrescriptionId(), prescription.getDrugListId(), prescription.getDoctorID(),
                prescription.getPatientId(), prescription.getPatientName(),prescription.getNote());
    }


    public void deletePrescriptionbyId(int perscriptionId){
        prescriptionDao.deletePerscriptionbyId(perscriptionId);
    }


    public Prescription findPrescriptionById(int perscriptionId){
        return prescriptionDao.findPerscriptionById(perscriptionId);
    }



    public List<Prescription> PrescirptionList(){
        return prescriptionDao.PrescriptionList();
    }

    public List<Prescription> findPrescriptionByPatientIdAndName(int patientId,String name) {
        return prescriptionDao.findPerscriptionByPatientIdAndName(patientId,name);
    }
    public int sumOfPrescriptionByPatientID(int patientId, int doctorId){

        return prescriptionDao.sumOfPrescriptionByPatientID(patientId,doctorId);


    }

    public Prescription findPrescriptionByPatientIdAndDoctorID(int PatientId,int DoctorId) {
        return prescriptionDao.findPerscriptionByPatientIdAndDoctorID(PatientId,DoctorId);
    }

}
