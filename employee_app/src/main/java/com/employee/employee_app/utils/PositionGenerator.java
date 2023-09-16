package com.employee.employee_app.utils;

import java.util.Random;

public class PositionGenerator {
    public static String[] position = {
            "Manager", "Developer", "Designer", "Analyst",
            "Salesperson", "Engineer", "HR Specialist",
            "Marketing Coordinator", "Accountant", "Support Specialist"
    };


    public static String getPosition() {
        Random random = new Random();
        return position[random.nextInt(0, position.length - 1)];
    }
}
