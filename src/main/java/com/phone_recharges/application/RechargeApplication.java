package com.phone_recharges.application;

import com.phone_recharges.domain.entities.Recharge;
import com.phone_recharges.domain.services.RechargeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechargeApplication {
    private final RechargeService rechargeService;

    public RechargeApplication(RechargeService rechargeService) {
        this.rechargeService = rechargeService;
    }

    public Recharge save(Recharge recharge){
        return rechargeService.save(recharge);
    }

    public List<Recharge> getAll() {
        return rechargeService.getAll();
    }
}
