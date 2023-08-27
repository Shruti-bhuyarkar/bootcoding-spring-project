package com.patientapp.patient_app.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Table(name = "patient")
@Entity
public class Patient {
    @Column(name = "Patient_Name")
    private String name;

    @Column(name = "Disease")
    private String disease;

    @Column(name = "Phone")
    private int phone;

    @Column(name = "Age")
    private int age;

    @Column(name = "Admission_Date")
    private Date admissionDate;


    @Id
    @GeneratedValue
    private int id;
}
