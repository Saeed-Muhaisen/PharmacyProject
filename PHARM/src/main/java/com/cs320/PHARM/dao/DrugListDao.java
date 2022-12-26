package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.DrugList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("druglist")
public class DrugListDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private final RowMapper<DrugList> DrugListRowMapper = (resultSet, i) -> new DrugList()
            .DrugListID(resultSet.getInt("DrugListId"))
            .DrugID(resultSet.getInt("DrugID"))
            .amount(resultSet.getInt("Amount"));
    public void insertDrugList(int DrugListID,int DrugID,int amount) {
        try{
            DrugList druglist=jdbcTemplate.queryForObject("Select * from druglist where druglistid=? and drugid=?",new Object[]{DrugListID,DrugID}, DrugListRowMapper);
            jdbcTemplate.update("UPDATE druglist SET amount=? where drugid=? and druglistid=?",new Object[]{amount+druglist.getAmount(),DrugID,DrugListID});
        }catch (EmptyResultDataAccessException e){
            String sql = "INSERT INTO DrugList (druglistid,drugid, amount) values (?,?,?)";
            jdbcTemplate.update(sql, new Object[]{DrugListID,DrugID,amount});
        }

    }

    public void updateDrug(int DrugId,int amount, int DrugListid) {
        String sql = "UPDATE druglist SET amount=? where drugid=? and druglistid=?";

            jdbcTemplate.update(sql, new Object[]{amount,DrugId,DrugListid});

    }


    public void deleteDrugListById(Integer Druglistid) {
        String sql = "DELETE FROM druglist WHERE druglistid=?;";
        jdbcTemplate.update(sql, Druglistid);

    }
    public void deletebyDrugListIDAndDrugID(int druglistId,int drugId){
        String sql="delete from druglist where druglistId=? and drugid=?";
        jdbcTemplate.update(sql,druglistId,drugId);
    }
    public void deleteDrugfromList(int id,int druglistId){
        jdbcTemplate.update("delete from druglist where drugid=? and druglistid=?",id,druglistId);
    }

    public List<DrugList> findDrugList(int DrugListId)  {
        String sql = "SELECT * FROM DrugList WHERE druglistid=?";
        List<DrugList> druglist;
        druglist = jdbcTemplate.query(sql, new Object[]{DrugListId}, DrugListRowMapper);
        return druglist;
    }

    public List<DrugList> findAll() {
        return jdbcTemplate.query("SELECT * FROM druglist", DrugListRowMapper);
    }

    public DrugList findDrugByDrugListID(int drugId,int druglistId){
        DrugList drugList;
        drugList=jdbcTemplate.queryForObject("Select * from druglist where drugid=? and druglistid=?",
                new Object[]{drugId,druglistId},DrugListRowMapper);
        return drugList;
    }

}
