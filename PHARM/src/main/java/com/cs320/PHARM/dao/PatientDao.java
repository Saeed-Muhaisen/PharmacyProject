package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {

    int deletePatientById(int id);
    List<Patient> findAll();

    Patient save(Patient patient);

    Patient findPatientById(int id);
}
