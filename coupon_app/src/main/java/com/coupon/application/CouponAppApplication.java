package com.coupon.application;

import com.coupon.application.service.CouponService;
import com.coupon.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(CouponAppApplication.class, args);
	}

	@Autowired
	private CouponService couponService;

	@Override
	public void run(ApplicationArguments args) throws Exception{
		String s = String.valueOf(UserService.generateNewCoupon());
		System.out.println("New Coupon = "+s);
	}
}
