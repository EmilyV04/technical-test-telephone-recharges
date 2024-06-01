package com.phone_recharges.domain.services;

import com.phone_recharges.domain.entities.Operator;

public interface OperatorService {
    Operator findById(Long id);
}
