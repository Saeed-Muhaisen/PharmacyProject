package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.DoctorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoctorAPI {

    @Autowired
    private final DoctorDao doctorDao;

    @Autowired
    public DoctorAPI(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }
}