package com.coupon.application.utils;

import java.util.Random;

public class GenerateType {
    public static String[] couponTypes = {
                "Percentage Off", "Fixed Amount Off", "Buy One Get One (BOGO)", "Free Shipping",
                "Bundle Discount", "Cashback", "Gift Card", "Clearance Sale", "Flash Sale"
        };
    public static String getRandomType() {
        Random random = new Random();
        int randomIndex = random.nextInt(0,couponTypes.length-1);
        return couponTypes[randomIndex];
    }
}
