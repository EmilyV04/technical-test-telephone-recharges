package com.phone_recharges.infraestructure.api.mapper;

import com.phone_recharges.domain.entities.Operator;
import com.phone_recharges.infraestructure.api.dto.OperatorDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface OperatorMapper {
    Operator toEntity(OperatorDto operatorDto);
}
