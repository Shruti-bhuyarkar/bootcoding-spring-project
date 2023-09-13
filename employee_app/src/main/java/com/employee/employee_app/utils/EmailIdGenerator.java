package com.employee.employee_app.utils;

import java.util.Random;

public class EmailIdGenerator {
    public static String generateEmail() {
        Random random = new Random();
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) (random.nextInt(36) + (random.nextInt(2) == 0 ? 'a' : '0'));
            email.append(randomChar);
        }
        return email.append("@example.com").toString();
    }
}
