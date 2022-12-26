package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PrescriptionDao;
import com.cs320.PHARM.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Component
public class PrescriptionAPI {

    @Autowired
    private final PrescriptionDao prescriptionDao;

    @Autowired
    public PrescriptionAPI(PrescriptionDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }
    @PostMapping
    public int addPrescription(Prescription prescription){
        return prescriptionDao.insertPerscription(prescription.getDoctorID(),prescription.getPatientId() ,
                prescription.getPatientName(),prescription.getNote());
    }

    @PutMapping
    public void updatePrescription(Prescription prescription){
        prescriptionDao.updatePerscription(prescription.getPrescriptionId(), prescription.getDrugListId(), prescription.getDoctorID(),
                prescription.getPatientId(), prescription.getPatientName(),prescription.getNote());
    }

    @RequestMapping
    public void deletePrescriptionbyId(int perscriptionId){
        prescriptionDao.deletePerscriptionbyId(perscriptionId);
    }

    @RequestMapping
    public Prescription findPrescriptionById(int perscriptionId){
        return prescriptionDao.findPerscriptionById(perscriptionId);
    }


    @RequestMapping
    public List<Prescription> prescirptionList(){
        return prescriptionDao.prescriptionList();
    }
    @RequestMapping
    public List<Prescription> findPrescriptionByPatientIdAndName(int patientId,String name) {
        return prescriptionDao.findPerscriptionByPatientIdAndName(patientId,name);
    }
    @RequestMapping
    public int sumOfPrescriptionByPatientID(int patientId, int doctorId){

        return prescriptionDao.sumOfPrescriptionByPatientID(patientId,doctorId);


    }
    @RequestMapping
    public Prescription findPrescriptionByPatientIdAndDoctorID(int PatientId,int DoctorId) {
        return prescriptionDao.findPerscriptionByPatientIdAndDoctorID(PatientId,DoctorId);
    }

    public void addPrescriptionWithIDs(Prescription prescription) {
        prescriptionDao.insertPerscriptionWithId(prescription.getPrescriptionId(),prescription.getDoctorID(),prescription.getPatientId() ,
                prescription.getPatientName(),prescription.getNote(),prescription.getDrugListId());
    }
}
