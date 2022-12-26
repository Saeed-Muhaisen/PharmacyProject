package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public void updateDrug(String DrugName, int DrugId) {
        String sql = "UPDATE Drug SET drugname=? where drugid=?";

            jdbcTemplate.update(sql, new Object[]{DrugName,DrugId});

    }


    public void deleteDrugById(Integer DrugID) {
        String sql = "DELETE FROM drug WHERE drugId=?;";

            jdbcTemplate.update(sql, DrugID);

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
