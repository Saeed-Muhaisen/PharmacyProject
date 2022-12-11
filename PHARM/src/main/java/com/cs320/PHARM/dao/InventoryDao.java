package com.cs320.PHARM.dao;

import com.cs320.PHARM.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InventoryDao {
    private final RowMapper<Inventory> InventoryRowMapper = (resultSet, i) -> new Inventory()
            .InventoryID(resultSet.getInt("InventoryID"))
            .DrugID(resultSet.getInt("DrugID"))
            .Capacity(resultSet.getInt("Capacity"));
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Inventory> findByInventoryId(int InventoryId){
        return jdbcTemplate.query("Select * from Inventory where InventoryId=?",new Object[]{InventoryId},InventoryRowMapper );
    }
    public Inventory findByInventoryIdAndDrugID(int inventoryId,int DrugID){
        return jdbcTemplate.queryForObject("Select * from inventory where InventoryId=? and drugid=?"
                ,new Object[]{inventoryId,DrugID},InventoryRowMapper);
    }


    public void insertDrug(int inventoryId, int drugId, int amount) {
        jdbcTemplate.update("INSERT INTO INVENTORY(inventoryid, drugid, capacity) values (?,?,?)"
                ,new Object[]{inventoryId,drugId,amount});

    }

    public void deleteDrugFromInventory(int InventoryId, int drugId) {
        jdbcTemplate.update("Delete from inventory where inventoryid=? and drugid=?",new Object[]{InventoryId,drugId});
    }

    //should take int int int not inv, create API and change it
    public void updateInventory(Inventory inv) {
        jdbcTemplate.update("UPDATE inventory set capacity=? where inventoryid=? and drugid=?",
                new Object[]{inv.getCapacity(),inv.getInventoryID(),inv.getDrugID()});
    }
}

