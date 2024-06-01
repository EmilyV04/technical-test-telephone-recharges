package com.phone_recharges.infraestructure.api.mapper;

import com.phone_recharges.domain.entities.Seller;
import com.phone_recharges.infraestructure.api.dto.SellerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface SellerMapper {
    Seller toEntity(SellerDto sellerDto);
}
