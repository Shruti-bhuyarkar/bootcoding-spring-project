package com.coupon.application.utils;

import java.util.Random;

public class GenerateDescription {
    public static
        String[] descriptionTemplates = {
                "Get {20}% off on all {furniture} items!",
                "Save {500} on your purchase of {cold cream}!",
                "Buy one {2} and get the second one free!",
                "Enjoy free shipping on orders over {10000}!",
                "Get {50}% off when you buy the {books} bundle!",
                "Earn {20}% cashback on your next purchase!",
                "Gift a {500} {book} to a loved one!",
                "Clearance sale: {30}% off on selected {household} items!",
                "Hurry, limited-time flash sale: {60}% off everything!"
        };

    public static String getRandomDescription() {
        Random random = new Random();
        return descriptionTemplates[random.nextInt(0,descriptionTemplates.length-1)];
    }
}
