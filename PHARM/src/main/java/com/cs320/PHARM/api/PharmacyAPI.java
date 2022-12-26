package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PharmacyDao;
import com.cs320.PHARM.model.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class PharmacyAPI {
    @Autowired
    PharmacyDao pharmacyDao;
    @PostMapping
    public void addPharmacy(Pharmacy pharmacy){
        pharmacyDao.insertPharmacy(pharmacy.getPharmacyName());
    }
    @PutMapping
    public void updatePharmacy(Pharmacy pharmacy){
        pharmacyDao.updatePharmacy(pharmacy.getPharmacyName(),pharmacy.getPharmacyID());
    }

    @DeleteMapping
    public void deletePHarmacy(int pharmacyId){
        pharmacyDao.deletePharmacyById(pharmacyId);
    }

    @ModelAttribute
    public Pharmacy findPharmacyByID(int pharmacyId) {
        return pharmacyDao.findPharmacy(pharmacyId);
    }
    @RequestMapping
    public List<Pharmacy> pharmacyList(){
        return pharmacyDao.pharmacyList();
    }
}
