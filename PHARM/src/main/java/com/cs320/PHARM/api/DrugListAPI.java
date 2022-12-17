package com.cs320.PHARM.api;


import com.cs320.PHARM.dao.DrugListDao;
import com.cs320.PHARM.model.DrugList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class DrugListAPI {
    @Autowired
    DrugListDao drugListDao;
    @PostMapping
    public void insertDrugList(int DrugListID,int DrugID,int amount) {
        drugListDao.insertDrugList(DrugListID,DrugID,amount);

    }
    @PutMapping
    public void updateDrug(int DrugId,int amount, int DrugListid) {
        drugListDao.updateDrug(DrugId,amount,DrugListid);

    }

    @DeleteMapping
    public void deleteDrugListById(Integer Druglistid) {
        drugListDao.deleteDrugListById(Druglistid);

    }
    @DeleteMapping
    public void deletebyDrugListIDAndDrugID(int druglistId,int drugId){
        drugListDao.deletebyDrugListIDAndDrugID(druglistId,drugId);
    }
    @DeleteMapping
    public void deleteDrugfromList(int id,int druglistId){
        drugListDao.deleteDrugfromList(id,druglistId);
    }
    @RequestMapping
    public List<DrugList> findDrugList(int DrugListId)  {
        return drugListDao.findDrugList(DrugListId);
    }
    @RequestMapping
    public List<DrugList> findAll() {

        return drugListDao.findAll();
    }
    @ModelAttribute
    public DrugList findDrugByDrugListID(int drugId, int druglistId){
        return drugListDao.findDrugByDrugListID(drugId,druglistId);
    }
}

