package com.phone_recharges.application;

import com.phone_recharges.domain.entities.Seller;
import com.phone_recharges.domain.services.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SellerApplication {
    private final SellerService sellerService;

    public Seller findById(Long id) {
        return sellerService.findById(id);
    }
}
