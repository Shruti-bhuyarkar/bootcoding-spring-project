package com.coupon.application.utils;

import java.util.Random;

public class GenerateDiscount {
    public static void main(String[] args) {
        int minDiscount = 10; // Minimum discount percentage
        int maxDiscount = 70; // Maximum discount percentage

        int randomDiscount = generateRandomDiscount(minDiscount, maxDiscount);
        System.out.println("Random discount percentage: " + randomDiscount + "%");
    }

    public static int generateRandomDiscount(int minDiscount, int maxDiscount) {
        Random random = new Random();
        return random.nextInt(maxDiscount - minDiscount + 1) + minDiscount;
    }
}
