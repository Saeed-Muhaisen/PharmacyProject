package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("doctor")
public class DoctorDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Doctor> doctorRowMapper = (resultSet, i) -> new Doctor()
            .DoctorId(resultSet.getInt("doctorId"))
            .DoctorName(resultSet.getString("DoctorName"));
    @Autowired
    public DoctorDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void insertDoctor(String DoctorName) {
        String sql = "INSERT INTO Doctor (doctorname) values (?)";

            jdbcTemplate.update(sql, new Object[]{DoctorName});


    }

    public void updateDoctor(String DoctorName, int DoctorId) {
        String sql = "UPDATE Doctor SET doctorname=? where doctorid=?";

            jdbcTemplate.update(sql, new Object[]{DoctorName,DoctorId});

    }


    public void deleteDoctorByID(Integer DoctorId) {
        String sql = "DELETE FROM Doctor WHERE doctorId=?;";

            jdbcTemplate.update(sql, DoctorId);

    }


    public Doctor findDoctor(Integer DoctorId) {
        String sql = "SELECT * FROM doctor WHERE doctorid=?";
        Doctor doctor;

        doctor = jdbcTemplate.queryForObject(sql, new Object[]{DoctorId}, doctorRowMapper);

        return doctor;
    }

    public List<Doctor> DoctorList() {
        return jdbcTemplate.query("SELECT * FROM doctor", doctorRowMapper);
    }
}
