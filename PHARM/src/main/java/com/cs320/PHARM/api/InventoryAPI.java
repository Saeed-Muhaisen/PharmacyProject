package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.InventoryDao;
import com.cs320.PHARM.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InventoryAPI {
    @Autowired
    InventoryDao inventoryDao;
    public List<Inventory> findByInventoryId(int InventoryId){
        return inventoryDao.findByInventoryId(InventoryId);
    }

    public Inventory findByInventoryIdAndDrugID(int inventoryId, int DrugID){
        return inventoryDao.findByInventoryIdAndDrugID(inventoryId, DrugID);
    }

    public void insertDrug(int inventoryId, int drugId, int amount) {
        inventoryDao.insertDrug(inventoryId,drugId,amount);
    }

    public void deleteDrugFromInventory(int InventoryId, int drugId) {
        inventoryDao.deleteDrugFromInventory(InventoryId,drugId);
    }

    public void updateInventory(Inventory inv) {
        updateInventory(inv);
    }
}
