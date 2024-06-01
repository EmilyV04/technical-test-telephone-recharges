package com.phone_recharges.infraestructure.api.controller.request;

import lombok.Getter;

@Getter
public class RechargeRequest {
    private String phone;
    private Double valueRecharge;
    private Long operator;
    private Long seller;
}
