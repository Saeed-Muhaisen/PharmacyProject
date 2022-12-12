package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PrescriptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class PrescriptionAPI {

    @Autowired
    private final PrescriptionDao prescriptionDao;

    @Autowired
    public PrescriptionAPI(PrescriptionDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }


}
