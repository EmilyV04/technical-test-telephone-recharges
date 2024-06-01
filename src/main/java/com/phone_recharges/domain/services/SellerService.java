package com.phone_recharges.domain.services;

import com.phone_recharges.domain.entities.Seller;

public interface SellerService {
    Seller findById(Long id);
}
