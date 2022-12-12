package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PharmacyDao;
import com.cs320.PHARM.model.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PharmacyAPI {
    @Autowired
    PharmacyDao pharmacyDao;
    public void addPharmacy(Pharmacy pharmacy){
        pharmacyDao.insertPharmacy(pharmacy.getPharmacyName());
    }

    public void updatePharmacy(Pharmacy pharmacy){
        pharmacyDao.updatePharmacy(pharmacy.getPharmacyName(),pharmacy.getPharmacyID());
    }


    public void deletePHarmacy(int pharmacyId){
        pharmacyDao.deletePharmacyById(pharmacyId);
    }


    public Pharmacy findPharmacyByID(int pharmacyId) {
        return pharmacyDao.findPharmacy(pharmacyId);
    }

    public List<Pharmacy> PharmacyList(){
        return pharmacyDao.PharmacyList();
    }
}
