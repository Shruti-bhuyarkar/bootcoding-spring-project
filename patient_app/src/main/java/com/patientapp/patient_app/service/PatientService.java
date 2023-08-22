package com.patientapp.patient_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class PatientService {
    public String getNewPatient(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();

    }
    public List<String> getNewPatient(int noOfPatient){
        List<String> patient = new ArrayList<>();
        for(int i = 0; i < noOfPatient; i++){
            String newPatient = getNewPatient();
            patient.add(newPatient);
        }
        return patient;

    }

}
