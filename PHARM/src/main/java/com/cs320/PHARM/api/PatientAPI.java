package com.cs320.PHARM.api;

import com.cs320.PHARM.dao.PatientDao;
import com.cs320.PHARM.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientAPI {
    @Autowired
    PatientDao patientDao;
}
