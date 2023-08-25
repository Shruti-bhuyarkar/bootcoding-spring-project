package com.coupon.application.utils;

import java.util.Random;

public class GenerateTitle {
    public static
        String[] title = {"Percentage Discount", "Fixed Amount Discount",
                "Buy One Get One", "Free Shipping", "Bundle Discount",
                "First-Time Purchase", "Loyalty Reward", "Seasonal",
                "Referral Coupon",
                "Clearance Sale",
                "Birthday Coupon",
                "Flash Sale",
                "Conditional Coupon",
                "VIP Coupon",
                "Social Media Coupon"};

    public static String getRandomTitle() {
        Random random = new Random();
        return title[random.nextInt(0,title.length-1)];
    }


}
