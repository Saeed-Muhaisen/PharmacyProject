package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.DoctorDao;
import com.cs320.PHARM.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DoctorAPI {

    @Autowired
    private final DoctorDao doctorDao;

    @Autowired
    public DoctorAPI(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }
    public void addDoctor(Doctor doctor){
        doctorDao.insertDoctor(doctor.getDoctorName());
    }

    public void updateDoctor(Doctor doctor){
        doctorDao.updateDoctor(doctor.getDoctorName(),doctor.getDoctorId());
    }


    public void deleteDoctor(int doctorId){
        doctorDao.deleteDoctorByID(doctorId);
    }


    public Doctor findDoctorById(int doctorId){
        return doctorDao.findDoctor(doctorId);
    }


    public List<Doctor> DoctorList(){
        return doctorDao.DoctorList();
    }
}