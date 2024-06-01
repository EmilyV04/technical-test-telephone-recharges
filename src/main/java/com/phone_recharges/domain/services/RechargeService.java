package com.phone_recharges.domain.services;

import com.phone_recharges.domain.entities.Recharge;

import java.util.List;

public interface RechargeService {
    List<Recharge> getAll();

    Recharge save(Recharge recharge);
}
