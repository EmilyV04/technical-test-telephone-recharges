package com.phone_recharges.application;

import com.phone_recharges.domain.entities.Operator;
import com.phone_recharges.domain.entities.Recharge;
import com.phone_recharges.domain.entities.Seller;
import com.phone_recharges.domain.services.RechargeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RechargeApplication {
    private final RechargeService rechargeService;
    private final OperatorApplication operatorApplication;
    private final SellerApplication sellerApplication;

    public Recharge save(Recharge recharge) {
        Operator operator = operatorApplication.findById(recharge.getOperator().getId());
        Seller seller = sellerApplication.findById(recharge.getSeller().getId());

        recharge.setOperator(operator);
        recharge.setSeller(seller);
        return rechargeService.save(recharge);
    }

    public List<Recharge> getAll() {
        return rechargeService.getAll();
    }
}
