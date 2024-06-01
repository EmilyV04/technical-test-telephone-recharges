package com.phone_recharges.infraestructure.api.controller.request;

import com.phone_recharges.domain.entities.Recharge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface RechargeRequestMapper {
    @Mapping(source = "operator", target = "operator.id")
    @Mapping(source = "seller", target = "seller.id")
    Recharge toEntity(RechargeRequest rechargeRequest);
}
