package com.employee.employee_app.utils;

import java.util.Random;

public class NameGenerate {
    public static String[] Name = {
            "Aarav", "Rashi", "Nachiket",
            "Aditi", "Sakshi", "Abhishek",
            "Aryan", "Prerna", "Om",
            "Tanmay", "Divya", "Ishaan",
            "Krishna", "Mira", "Neha",
            "Rahul", "Sneha", "Sharayu"
    };


    public static String getName() {
        Random random = new Random();
        return Name[random.nextInt(0, Name.length - 1)];
    }
}
