package com.coupon.application.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Coupon {
    private String id;
    private String type;
    private int validFor;

}