package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.TransactionHistoryDao;
import com.cs320.PHARM.model.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;


@Component
public class TransactionHistoryAPI {
    @Autowired
    TransactionHistoryDao transactionHistoryDao;
    @PostMapping
    public void insertTransactionHistory(TransactionHistory transactionHistory){
        transactionHistoryDao.insertTransactionHistory(
                transactionHistory.getDrugListId(),
                transactionHistory.getPharmacyId(),
                transactionHistory.getDrugID(),
                transactionHistory.getDoctorId(),
                transactionHistory.getPatientID(),
                transactionHistory.getAmount_sold());
    }
    @DeleteMapping
    public void deleteTransactionHistoryByIds(int drugListId, int pharmacyId,int drugId){
        transactionHistoryDao.deleteTransactionHistoryByIds(drugListId,pharmacyId,drugId);
    }
    @PutMapping
    public void updateSoldAmount(int drugListId, int pharmacyId,int drugId, int sold_amount){
        transactionHistoryDao.updateSoldAmount(drugListId,pharmacyId,drugId,sold_amount);
    }
    @GetMapping
    public List<TransactionHistory> listAll(){
        return transactionHistoryDao.listAll();
    }
    @DeleteMapping
    public void deleteByID(int id){
        transactionHistoryDao.deleteById(id);
    }

    @GetMapping
    public List<TransactionHistory> findTransactionsByPharmacyID(int pharmacyID){
        return transactionHistoryDao.findTransactionsByPharmacyID(pharmacyID);
    }
    @GetMapping
    public List<TransactionHistory> findTransactionByDoctorID(int doctorId){
        return transactionHistoryDao.findTransactionByDoctorID(doctorId);
    }
}
