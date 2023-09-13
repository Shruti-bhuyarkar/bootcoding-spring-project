package com.employee.employee_app.utils;

import java.util.Random;

public class DepartmentGenerator {
    public static String[] department = {
            "Marketing",
            "Finance",
            "Human Resources",
            "Research and Development",
            "Sales",
            "Customer Service",
            "Operations",
            "Information Technology",
            "Product Management",
            "Quality Assurance",
            "Design",
            "Supply Chain",
            "Legal",
            "Public Relations",
            "Training and Development"
    };


    public static String getDepartment() {
        Random random = new Random();
        return department[random.nextInt(0, department.length - 1)];
    }
}
