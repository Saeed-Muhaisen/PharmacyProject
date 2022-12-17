package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.TransactionHistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Component
public class TransactionHistoryAPI {
    @Autowired
    TransactionHistoryDao transactionHistoryDao;
    @PostMapping
    public void insertTransactionHistory(int drugListId, int pharmacyId,int drugId,int amount_sold){
        transactionHistoryDao.insertTransactionHistory(drugListId,pharmacyId,drugId,amount_sold);
    }
    @DeleteMapping
    public void deleteTransactionHistoryByIds(int drugListId, int pharmacyId,int drugId){
        transactionHistoryDao.deleteTransactionHistoryByIds(drugListId,pharmacyId,drugId);
    }
    @PutMapping
    public void updateSoldAmount(int drugListId, int pharmacyId,int drugId, int sold_amount){
        transactionHistoryDao.updateSoldAmount(drugListId,pharmacyId,drugId,sold_amount);
    }
}
