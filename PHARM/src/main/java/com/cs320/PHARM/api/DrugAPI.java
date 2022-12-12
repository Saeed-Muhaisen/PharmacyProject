package com.cs320.PHARM.api;


import com.cs320.PHARM.dao.DrugDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DrugAPI {

    @Autowired
    public final DrugDao drugDao;

    @Autowired
    public DrugAPI(DrugDao drugDao) {
        this.drugDao = drugDao;
    }
}