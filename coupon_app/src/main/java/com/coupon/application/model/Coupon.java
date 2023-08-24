package com.coupon.application.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@Table(name = "coupon_table")
@Entity
public class Coupon {
    @Id
    @GeneratedValue
    private int id;

   // @Column(name = "title")
    private String title;

    //@Column(name = "description")
    private String description;

    @Column(name = "coupon_code")
    private  String couponcode;

   // @Column(name = "discount")
    private int discount;

    //@Column(name = "category")
    private String category;

    @Column(name = "created_date")
    private LocalDate createddate;

    @Column(name = "validity_date")
    private LocalDate validitydate;

   @Column(name = "is_Active")
    private boolean isActive;

    @Column(name = "created_by")
    private String createdBy;
   private String type;
}