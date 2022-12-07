package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("pharmacy")
public class PharmacyDao {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Pharmacy> pharmacyRowMapper = (resultSet, i) -> new Pharmacy()
            .PharmacyID(resultSet.getInt("pharmacyid"))
            .PharmacyName(resultSet.getString("Pharmacyname"))
            .PharmacyInventoryID(resultSet.getInt("InventoryID"));
    @Autowired
    public PharmacyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
