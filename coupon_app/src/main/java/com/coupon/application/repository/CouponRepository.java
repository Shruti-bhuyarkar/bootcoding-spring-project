package com.coupon.application.repository;

import com.coupon.application.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,Integer> {
}
