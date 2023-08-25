package com.coupon.application.utils;

import java.util.Random;

public class GenerateCreatedBy {
    public static
        String[] creators = {"Marketing Team", "Sales Team",
                "Promotions Department", "Design Team"};

          public static String getRandomCreator() {
        Random random = new Random();
        int randomIndex = random.nextInt(0,creators.length-1);
        return creators[randomIndex];
    }
}
