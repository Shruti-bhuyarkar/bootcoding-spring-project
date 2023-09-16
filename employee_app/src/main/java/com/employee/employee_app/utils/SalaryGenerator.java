package com.employee.employee_app.utils;

import java.util.Random;

public class SalaryGenerator {
    public static double getSalary(double min, double max) {
        return min + (max - min) * new Random().nextDouble();
    }
}
