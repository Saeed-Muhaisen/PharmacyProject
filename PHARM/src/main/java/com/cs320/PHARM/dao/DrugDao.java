package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("drug")
public class DrugDao {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Drug> drugRowMapper = (resultSet, i) -> new Drug()
            .DrugID(resultSet.getInt("DrugID"))
            .DrugName(resultSet.getString("DrugName"));
    @Autowired
    public DrugDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }
    public void insertDrug(String DrugName) {
        String sql = "INSERT INTO Drug (drugname) values (?)";

        jdbcTemplate.update(sql, new Object[]{DrugName});

    }

    public int updateDrug(String DrugName, int DrugId) {
        String sql = "UPDATE Drug SET drugname=? where drugid=?";
        try {
            jdbcTemplate.update(sql, new Object[]{DrugName,DrugId});
        } catch (Exception e) {
            System.out.println("Drug Update failed on DAO");
            return 0;
        }
        return 1;
    }


    public int deleteDrugById(Integer DrugID) {
        String sql = "DELETE FROM drug WHERE drugId=?;";
        try {
            jdbcTemplate.update(sql, DrugID);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }


    public Drug findDrugById(Integer DrugId)  {
        String sql = "SELECT * FROM Drug WHERE DrugId=?";
        Drug drug;
        drug = jdbcTemplate.queryForObject(sql, new Object[]{DrugId}, drugRowMapper);
        return drug;
    }

    public List<Drug> DrugList() {
        return jdbcTemplate.query("SELECT * FROM drug", drugRowMapper);
    }
}
