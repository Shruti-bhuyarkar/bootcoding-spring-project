package com.patientapp.patient_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient/")
public class PatientController {
    @Autowired
    public patientservice patientservice;



    @GetMapping("all-patient")
    public List<String> getAllPatient(){
        int quantity = 10;
        return patientservice.getNewPatient(quantity);
    }

    @GetMapping("search_patient")
    public String searchPatient(
            @RequestParam("name") String name,
            @RequestParam(value = "disease", required = false) String patientDisease,
            @RequestParam("age") int age) {
        return "Patient  Name = " + name
                + " | Patient Disease = " + patientDisease
                + " | Patient Age = " + age;
    }


    
}

