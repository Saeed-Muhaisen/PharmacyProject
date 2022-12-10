package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("prescription")
public class PrescriptionDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Prescription> prescriptionRawMapper = (resultSet, i) -> new Prescription()
            .PerscriptionId(resultSet.getInt("prescriptionId"))
            .drugListId(resultSet.getInt("DrugListID"))
            .doctorID(resultSet.getInt("DoctorID"))
            .patientId(resultSet.getInt("PatientID"))
            .PatientName(resultSet.getString("PatientName"))
            .Note(resultSet.getString("Notes"));


    public PrescriptionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
