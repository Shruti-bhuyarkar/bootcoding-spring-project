package com.patientapp.patient_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class PatientService {

    @Autowired
    private PatientHelper patientHelper;

    public PatientService(PatientHelper patientHelper){
        this.patientHelper = patientHelper;
    }
    public String newPatient(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewPatient(int quantity){
        List<String> patients = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newPatient = newPatient();
            patients.add(newPatient);
        }
        return patients;

    }

}
