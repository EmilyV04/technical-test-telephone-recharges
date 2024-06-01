package com.phone_recharges.infraestructure.api.mapper;

import com.phone_recharges.domain.entities.Recharge;
import com.phone_recharges.infraestructure.api.dto.RechargeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface RechargeMapper {
    @Mapping(source = "operatorDto.id", target = "operator.id")
    @Mapping(source = "operatorDto.name", target = "operator.name")
    @Mapping(source = "sellerDto.id", target = "seller.id")
    @Mapping(source = "sellerDto.name", target = "seller.name")
    Recharge toEntity(RechargeDto rechargeDto);

    RechargeDto toDto(Recharge recharge);

    List<Recharge> toEntity(List<RechargeDto> rechargeDtos);
}
