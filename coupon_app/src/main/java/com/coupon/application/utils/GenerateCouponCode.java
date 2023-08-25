package com.coupon.application.utils;

import java.util.Random;
import java.util.UUID;

public class GenerateCouponCode {
    public static String generateCouponCode() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","").substring(10);
    }
}
