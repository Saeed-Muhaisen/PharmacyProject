package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.TransactionHistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionHistoryAPI {
    @Autowired
    TransactionHistoryDao transactionHistoryDao;
}
