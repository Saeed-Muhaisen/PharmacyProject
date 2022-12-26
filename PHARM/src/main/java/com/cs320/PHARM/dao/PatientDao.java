package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDao  {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final RowMapper<Patient> patientRowMapper = (resultSet, i) -> new Patient()
            .patientId(resultSet.getInt("patientId"))
            .doctorId(resultSet.getInt("DoctorId"))
            .patientName(resultSet.getString("PatientName"));

    public void deletePatientByIDAndDoctorID(int id,int doctorid){
        jdbcTemplate.update("Delete from patient where patientid=? and doctorid=?",id,doctorid);
    }

    public List<Patient> findAll(){
        return jdbcTemplate.query("Select distinct on (patientid) patientid, patientname, doctorid from patient ",patientRowMapper);
    }

    public void save(Patient patient){
        jdbcTemplate.update("insert into patient values(?,?,?)",new Object[]{patient.getId(),patient.getName(),patient.getDoctorId()});

    }

    public Patient findPatientById(int id){
        return jdbcTemplate.queryForObject("Select * from patient where PatientId=?",new Object[]{id},patientRowMapper);
    }

    public List<Patient> findByDoctorId(int DoctorId){
        return jdbcTemplate.query("Select * from patient where doctorid=?",new Object[]{DoctorId},patientRowMapper);
    }

    public void deletePatientById(int id) {
        jdbcTemplate.update("Delete from patient where patientid=?",id);
    }
    public Patient findPatientByIdAndDoctorId(int id,int doctorId){
        return jdbcTemplate.queryForObject("Select * from patient where PatientId=? and doctorid=?",new Object[]{id,doctorId},patientRowMapper);
    }

    public void update(String name, int id) {
        jdbcTemplate.update("Update patient set patientname=? where patientid=?",name,id);
    }
}
