package com.patientapp.patient_app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Patient {
    @Column(name = "Patient_name")
    private String name;

    @Column(name = "disease")
    private String disease;

    @Column(name = "phone")
    private int phone;

    @Column(name = "age")
    private int age;
    @Id
    @GeneratedValue
    private int id;
}
