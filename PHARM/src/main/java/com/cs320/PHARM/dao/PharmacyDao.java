package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("pharmacy")
public class PharmacyDao {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Pharmacy> pharmacyRowMapper = (resultSet, i) -> new Pharmacy()
            .pharmacyID(resultSet.getInt("pharmacyid"))
            .pharmacyName(resultSet.getString("Pharmacyname"))
            .pharmacyInventoryID(resultSet.getInt("InventoryID"));
    @Autowired
    public PharmacyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void insertPharmacy(String PharmacyName) {
        String sql = "INSERT INTO pharmacy (pharmacyname) values (?)";

            jdbcTemplate.update(sql, new Object[]{PharmacyName});

    }

    public void updatePharmacy(String PharmacyName, int PharmacyId) {
        String sql = "UPDATE Pharmacy set  pharmacyname=? where pharmacyid=?";

            jdbcTemplate.update(sql, new Object[]{PharmacyName,PharmacyId});

    }


    public void deletePharmacyById(Integer PharmacyId) {
        String sql = "DELETE FROM pharmacy WHERE pharmacyId=?;";

            jdbcTemplate.update(sql, PharmacyId);

    }

    public Pharmacy findPharmacy(Integer PharmacyId){
        String sql = "SELECT * FROM Pharmacy WHERE PharmacyId=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{PharmacyId}, pharmacyRowMapper);
    }

    public List<Pharmacy> pharmacyList() {
        return jdbcTemplate.query("SELECT * FROM pharmacy", pharmacyRowMapper);
    }
}
