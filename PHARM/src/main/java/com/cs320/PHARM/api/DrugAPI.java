package com.cs320.PHARM.api;


import com.cs320.PHARM.dao.DrugDao;
import com.cs320.PHARM.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrugAPI {

    @Autowired
    public final DrugDao drugDao;

    @Autowired
    public DrugAPI(DrugDao drugDao) {
        this.drugDao = drugDao;
    }
    public void addDrug(Drug drug){
        drugDao.insertDrug(drug.getDrugName());
    }

    public void updateDrug(Drug drug){
        drugDao.updateDrug(drug.getDrugName(),drug.getDrugID());
    }

    public void deleteDrug(int drugID){
        drugDao.deleteDrugById(drugID);
    }

    public Drug findDrugByID(int drugId)  {
        return drugDao.findDrugById(drugId);
    }

    public List<Drug> DrugList(){
        return drugDao.DrugList();
    }
}