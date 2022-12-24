package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionHistoryDao {
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    //TODO: RowMapper is creating an issue with symbols.
    private final RowMapper<TransactionHistory> TransactionRowMapper = (resultSet, i) -> new TransactionHistory()
            .DrugListId(resultSet.getInt("DrugListID"))
            .PharmacyId(resultSet.getInt("PharmacyId"))
            .DrugId(resultSet.getInt("DrugID"))
            .Amount_Sold(resultSet.getInt("amount_sold"))
            .TransactionHistory(resultSet.getInt("transactionHistoryID"))
            .PatientID(resultSet.getInt("patientid"))
            .DoctorID(resultSet.getInt("doctorId"));



    public TransactionHistoryDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertTransactionHistory(int drugListId, int pharmacyId,int drugId,int doctorId,int patientId,int amount_sold){
        jdbcTemplate.update("insert into transactionhistory(pharmacyid, druglistid, drugid,doctorid,patientid, amount_sold) values(?,?,?,?,?,?)"
                ,new Object[]{pharmacyId,drugListId,drugId,doctorId,patientId,amount_sold});
    }
    public void deleteTransactionHistoryByIds(int drugListId, int pharmacyId,int drugId){
        jdbcTemplate.update("DELETE from transactionhistory where druglistid=? and pharmacyid=? and drugid=?"
                ,new Object[]{pharmacyId,drugListId,drugId});
    }
    public void updateSoldAmount(int drugListId, int pharmacyId,int drugId, int sold_amount){
        jdbcTemplate.update("Update transactionhistory set amount_sold=? where druglistid=? and pharmacyid=? and drugid=?"
                ,new Object[]{sold_amount,drugListId,pharmacyId,drugId});
    }
    public List<TransactionHistory> ListAll(){
        return jdbcTemplate.query("select * from transactionHistory",TransactionRowMapper);

    }

    public void deleteById(int id) {
        jdbcTemplate.update("delete from transactionhistory where transactionhistoryid=?",id);
    }
    public List<TransactionHistory> findTransactionsByPharmacyID(int pharmacyID){
        return jdbcTemplate.query("Select * from transactionHistory where pharmacyId=?",new Object[]{pharmacyID},TransactionRowMapper);
    }
    public List<TransactionHistory> findTransactionByDoctorID(int doctorId){
        return jdbcTemplate.query("Select * from transactionHistory where doctorid=?",new Object[]{doctorId},TransactionRowMapper);

    }
}
