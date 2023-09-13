package com.employee.employee_app.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    private int id;

    @Column (name ="Employee_name")
    private String name;

    @Column(name ="Department")
    private String department;

    @Column(name ="Salary")
    private double salary;

    @Column (name = "Email_Id")
    private String emailId;

    @Column (name = "Hire_Date")
    private Date hireDate;

    @Column(name ="Position")
    private String position;

}
