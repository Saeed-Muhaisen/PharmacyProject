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
}
