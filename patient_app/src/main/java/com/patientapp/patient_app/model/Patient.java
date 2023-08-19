package com.patientapp.patient_app.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    private String name;
    private String disease;
    private int phone;
    private int age;
}
