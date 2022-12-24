package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PatientDao;
import com.cs320.PHARM.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
public class PatientAPI {
    @Autowired
    PatientDao patientDao;
    @DeleteMapping
    public int deletePatientById(int id){
        return patientDao.deletePatientById(id);
    }
    @RequestMapping
    public List<Patient> findAll(){
        return patientDao.findAll();
    }
    @PostMapping
    public Patient save(Patient patient){
        return patientDao.save(patient);
    }
    @ModelAttribute
    public Patient findPatientById(int id){
        return patientDao.findPatientById(id);
    }
}
