package com.phone_recharges.infraestructure.adapter;

import com.phone_recharges.domain.entities.Seller;
import com.phone_recharges.domain.services.SellerService;
import com.phone_recharges.infraestructure.api.mapper.SellerMapper;
import com.phone_recharges.infraestructure.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SellerAdapter implements SellerService {
    private final SellerMapper sellerMapper;
    private final SellerRepository sellerRepository;

    @Override
    public Seller findById(Long id) {
        return sellerMapper.toEntity(sellerRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
