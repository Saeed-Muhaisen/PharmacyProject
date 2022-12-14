package com.cs320.PHARM.api;


import com.cs320.PHARM.dao.DrugListDao;
import com.cs320.PHARM.model.DrugList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrugListAPI {
    @Autowired
    DrugListDao drugListDao;
    public void insertDrugList(int DrugListID,int DrugID,int amount) {
        drugListDao.insertDrugList(DrugListID,DrugID,amount);

    }

    public void updateDrug(int DrugId,int amount, int DrugListid) {
        drugListDao.updateDrug(DrugId,amount,DrugListid);

    }


    public void deleteDrugListById(Integer Druglistid) {
        drugListDao.deleteDrugListById(Druglistid);

    }
    public void deletebyDrugListIDAndDrugID(int druglistId,int drugId){
        drugListDao.deletebyDrugListIDAndDrugID(druglistId,drugId);
    }
    public void deleteDrugfromList(int id,int druglistId){
        drugListDao.deleteDrugfromList(id,druglistId);
    }

    public List<DrugList> findDrugList(int DrugListId)  {
        return drugListDao.findDrugList(DrugListId);
    }

    public List<DrugList> findAll() {

        return drugListDao.findAll();
    }

    public DrugList findDrugByDrugListID(int drugId, int druglistId){
        return drugListDao.findDrugByDrugListID(drugId,druglistId);
    }
}

