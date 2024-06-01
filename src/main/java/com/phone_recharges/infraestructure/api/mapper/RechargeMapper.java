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

    @Mapping(source = "operator.id", target = "operatorDto.id")
    @Mapping(source = "operator.name", target = "operatorDto.name")
    @Mapping(source = "seller.id", target = "sellerDto.id")
    @Mapping(source = "seller.name", target = "sellerDto.name")
    RechargeDto toDto(Recharge recharge);

    List<Recharge> toEntity(List<RechargeDto> rechargeDtos);
}
