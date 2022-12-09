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
            .PharmacyID(resultSet.getInt("pharmacyid"))
            .PharmacyName(resultSet.getString("Pharmacyname"))
            .PharmacyInventoryID(resultSet.getInt("InventoryID"));
    @Autowired
    public PharmacyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int insertPharmacy(String PharmacyName) {
        String sql = "INSERT INTO pharmacy (pharmacyname) values (?)";
        try {
            jdbcTemplate.update(sql, new Object[]{PharmacyName});
        } catch (Exception e) {
            System.out.println("Error inserting pharmacy in DAO");
            return 0;
        }

        return 1;
    }

    public int updatePharmacy(String PharmacyName, int PharmacyId) {
        String sql = "UPDATE Pharmacy set  pharmacyname=? where pharmacyid=?";
        try {
            jdbcTemplate.update(sql, new Object[]{PharmacyName,PharmacyId});
        } catch (Exception e) {
            System.out.println("Pharmacy Update failed on DAO");
            return 0;
        }
        return 1;
    }


    public int deletePharmacyById(Integer PharmacyId) {
        String sql = "DELETE FROM pharmacy WHERE pharmacyId=?;";
        try {
            jdbcTemplate.update(sql, PharmacyId);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }

    public Pharmacy findPharmacy(Integer PharmacyId){
        String sql = "SELECT * FROM Pharmacy WHERE PharmacyId=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{PharmacyId}, pharmacyRowMapper);
    }

    public List<Pharmacy> PharmacyList() {
        return jdbcTemplate.query("SELECT * FROM pharmacy", pharmacyRowMapper);
    }
}
