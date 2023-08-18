package com.coupon.application.service;

import com.coupon.application.model.Voucher;

import java.util.Random;
import java.util.UUID;

public class VoucherService {

    public static Voucher generateNewVoucher() {
        Voucher voucher = Voucher.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .category("VOUCHER")
                .discount(10)
                .title("Voucher")
                .build();
        return voucher;
    }
}
