package com.patientapp.patient_app.service;

import com.patientapp.patient_app.model.Patient;
import com.patientapp.patient_app.repository.PatientRepository;
import com.patientapp.patient_app.utils.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
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

    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> generateNewPatient(int value) {
        List<Patient> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Patient patient = Patient.builder()
                    .name(NameGenerator.getName())
                    .disease(DiseaseGenerator.getDisease())
                    .age(AgeGenerator.generateRandomAge(10, 80))
                    .phone(PhoneGenerator.getPhone())
                    .admissionDate(AdmissionDateGenerator.randomDate())
                    .build();
            list.add(patient);
        }
        return patientRepository.saveAll(list);
    }
}
