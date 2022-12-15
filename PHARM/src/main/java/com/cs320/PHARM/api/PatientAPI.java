package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PatientDao;
import com.cs320.PHARM.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientAPI {
    @Autowired
    PatientDao patientDao;
    public int deletePatientById(int id){
        return patientDao.deletePatientById(id);
    }
    public List<Patient> findAll(){
        return patientDao.findAll();
    }

    public Patient save(Patient patient){
        return patientDao.save(patient);
    }

    public Patient findPatientById(int id){
        return findPatientById(id);
    }
}
