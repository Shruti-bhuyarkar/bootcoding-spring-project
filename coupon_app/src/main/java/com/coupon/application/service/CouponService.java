package com.coupon.application.service;

import com.coupon.application.helper.CouponHelper;
import com.coupon.application.model.Coupon;
import com.coupon.application.model.User;
import com.coupon.application.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {

    @Autowired
    private CouponHelper couponHelper;

    public CouponService(CouponHelper couponHelper){
        this.couponHelper = couponHelper;
    }

    public String newCoupon(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = String.valueOf(newCoupon());
            coupons.add(newCoupon);
        }
        return coupons;

    }

    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .couponcode(UUID.randomUUID().toString())
                .type("COUPON")
                .build();
        return coupon;
    }
    public boolean save(User user) {
        users.add(user);
        return true;
    }

    public boolean save(List<User> users) {
        for(User u: users){
            save(u);
        }
        return true;
    }

    private List<User> users = new ArrayList<>();

    public User getUser(int id) {
        for(User u: users){
            if(id == u.getId()){
                return u;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }


    @Autowired
    private CouponRepository couponRepository;








}