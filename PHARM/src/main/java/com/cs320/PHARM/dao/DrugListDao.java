package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.DrugList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("druglist")
public class DrugListDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<DrugList> DrugListRowMapper = (resultSet, i) -> new DrugList()
            .DrugListID(resultSet.getInt("DrugListId"))
            .DrugID(resultSet.getInt("DrugID"))
            .amount(resultSet.getInt("Amount"));


}
