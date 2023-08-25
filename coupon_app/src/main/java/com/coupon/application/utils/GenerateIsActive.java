package com.coupon.application.utils;

import java.util.Random;

public class GenerateIsActive {
    public static void main(String[] args) {
        boolean isActive = generateCouponStatus();
        System.out.println("Is the coupon active? " + isActive);
    }

    public static boolean generateCouponStatus() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
