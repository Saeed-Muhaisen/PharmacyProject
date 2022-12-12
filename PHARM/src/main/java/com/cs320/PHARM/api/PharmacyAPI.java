package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PharmacyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PharmacyAPI {
    @Autowired
    PharmacyDao pharmacyDao;
}
