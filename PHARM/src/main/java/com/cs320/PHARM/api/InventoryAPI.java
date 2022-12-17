package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.InventoryDao;
import com.cs320.PHARM.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class InventoryAPI {
    @Autowired
    InventoryDao inventoryDao;
    @RequestMapping
    public List<Inventory> findByInventoryId(int InventoryId){
        return inventoryDao.findByInventoryId(InventoryId);
    }

    @ModelAttribute
    public Inventory findByInventoryIdAndDrugID(int inventoryId, int DrugID){
        return inventoryDao.findByInventoryIdAndDrugID(inventoryId, DrugID);
    }
    @PostMapping
    public void insertDrug(int inventoryId, int drugId, int amount) {
        inventoryDao.insertDrug(inventoryId,drugId,amount);
    }
    @DeleteMapping
    public void deleteDrugFromInventory(int InventoryId, int drugId) {
        inventoryDao.deleteDrugFromInventory(InventoryId,drugId);
    }
    @PutMapping
    public void updateInventory(Inventory inv) {
        updateInventory(inv);
    }
}
