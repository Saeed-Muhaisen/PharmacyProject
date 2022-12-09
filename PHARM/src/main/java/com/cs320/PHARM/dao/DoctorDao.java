package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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
    public int insertDoctor(String DoctorName) {
        String sql = "INSERT INTO Doctor (doctorname) values (?)";
        try {
            jdbcTemplate.update(sql, new Object[]{DoctorName});
        } catch (Exception e) {
            System.out.println("Error inserting doctor in DAO");
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    public int updateDoctor(String DoctorName, int DoctorId) {
        String sql = "UPDATE Doctor SET doctorname=? where doctorid=?";
        try {
            jdbcTemplate.update(sql, new Object[]{DoctorName,DoctorId});
        } catch (Exception e) {
            System.out.println("Doctor Update failed on DAO");
            return 0;
        }
        return 1;
    }


    public int deleteDoctorByID(Integer DoctorId) {
        String sql = "DELETE FROM Doctor WHERE doctorId=?;";
        try {
            jdbcTemplate.update(sql, DoctorId);
        } catch (Exception e) {
            return 0;
        }
        return 1;
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
