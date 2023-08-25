package com.coupon.application.service;

import com.coupon.application.model.Coupon;
import com.coupon.application.repository.CouponRepository;
import com.coupon.application.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;


@Service
public class NewCouponService {
    @Autowired
    private CouponRepository couponRepository;
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon>list= new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Coupon coupon = Coupon.builder()
                    .title(GenerateTitle.getRandomTitle())
                    .description(GenerateDescription.getRandomDescription())
                    .couponCode(GenerateCouponCode.generateCouponCode())
                    .validityDate(GenerateValidityDate.randomDate())
                    .type(GenerateType.getRandomType())
                    .discount(GenerateDiscount.generateRandomDiscount(10,70))
                    .category(GenerateCategory.getRandomCategory())
                    .createdDate(GenerateCreatedDate.randomDate())
                    .createdBy(GenerateCreatedBy.getRandomCreator())
                    .isActive(GenerateIsActive.generateCouponStatus())
                    .build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }
}
