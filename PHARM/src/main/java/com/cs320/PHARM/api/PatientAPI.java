package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PatientDao;
import com.cs320.PHARM.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.Doc;
import java.util.List;

@Component
public class PatientAPI {
    @Autowired
    PatientDao patientDao;
    @DeleteMapping
    public void deletePatientByIdAndDoctorId(int id,int doctorid){
        patientDao.deletePatientByIDAndDoctorID(id,doctorid);
    }
    @RequestMapping
    public List<Patient> findAll(){
        return patientDao.findAll();
    }
    @PostMapping
    public void save(Patient patient){
        patientDao.save(patient);
    }
    @ModelAttribute
    public Patient findPatientById(int id){
        return patientDao.findPatientById(id);
    }
    @ModelAttribute
    public Patient findPatientByIdAndDoctorId(int id,int DoctorId){
        return patientDao.findPatientByIdAndDoctorId(id, DoctorId);
    }

    @RequestMapping
    public List<Patient> findByDoctorId(int id){
        return patientDao.findByDoctorId(id);
    }
    @DeleteMapping
    public void deletePatientById(int id) {
        patientDao.deletePatientById(id);
    }

    public void update(String name, int id) {
        patientDao.update(name,id);
    }
}
