package com.coupon.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponAppApplication1 implements CouponAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponAppApplication1.class, args);
	}

	@Autowired
	private CouponService couponService;

	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println("hello world");
	}
}
