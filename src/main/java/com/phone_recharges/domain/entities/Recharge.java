package com.phone_recharges.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recharge {
    private Long id;
    private String phone;
    private Double valueRecharge;
    private Operator operator;
    private Seller seller;
}
