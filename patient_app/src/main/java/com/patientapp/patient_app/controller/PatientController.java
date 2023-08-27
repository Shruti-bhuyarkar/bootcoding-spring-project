package com.patientapp.patient_app.controller;

import com.patientapp.patient_app.model.Patient;
import com.patientapp.patient_app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    public PatientService patientservice;

    @PostMapping("/patientDetails/{value}")
    public  List<Patient> generateNewPatient(@PathVariable int value){
        return patientservice.generateNewPatient(value);
    }

    @GetMapping("all-patient")

    public List<String> getAllPatient(){
        int noOfPatient = 10;
        return patientservice.getNewPatient(noOfPatient);
    }

    @GetMapping("patient/{name}")

    public String getPatientObjectById(@PathVariable("name") String patientName){
       return patientservice.getNewPatient();
    }


    
}

