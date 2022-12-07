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
}
