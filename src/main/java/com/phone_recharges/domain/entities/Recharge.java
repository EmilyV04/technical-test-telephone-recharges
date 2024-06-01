package com.phone_recharges.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recharge {
    private Long id;
    private String phone;
    private Double value_recharge;
    private Operator operator;
    private Seller seller;
}
