package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.DoctorDao;
import com.cs320.PHARM.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class DoctorAPI {

    @Autowired
    private final DoctorDao doctorDao;

    @Autowired
    public DoctorAPI(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }
    @PostMapping
    public void addDoctor(Doctor doctor){
        doctorDao.insertDoctor(doctor.getDoctorName());
    }
    @PutMapping
    public void updateDoctor(Doctor doctor){
        doctorDao.updateDoctor(doctor.getDoctorName(),doctor.getDoctorId());
    }

    @DeleteMapping
    public void deleteDoctor(int doctorId){
        doctorDao.deleteDoctorByID(doctorId);
    }

    @ModelAttribute
    public Doctor findDoctorById(int doctorId){
        return doctorDao.findDoctor(doctorId);
    }

    @RequestMapping
    public List<Doctor> doctorList(){
        return doctorDao.doctorList();
    }
}