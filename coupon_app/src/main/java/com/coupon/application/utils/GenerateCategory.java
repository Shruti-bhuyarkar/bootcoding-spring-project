package com.coupon.application.utils;

import java.util.Random;

public class GenerateCategory {
    public static String[] category = {"Groceries",
                "Apparel and Accessories",
                "Electronics", "Home and Garden",
                "Beauty and Personal Care", "Health and Wellness", "Travel", "Entertainment",
                "Restaurants and Dining", "Automotive", "Baby and Kids", " Books and Magazines",
                "Office Supplies", "Pet Supplies", "Online Retailers", "Local Services", "Special Occasions"
        };
    public static String getRandomCategory() {
        Random random = new Random();
        int randomIndex = random.nextInt(0,category.length-1);
        return category[randomIndex];
    }
}
