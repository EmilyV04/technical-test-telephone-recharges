package com.phone_recharges.application;

import com.phone_recharges.domain.entities.Operator;
import com.phone_recharges.domain.services.OperatorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperatorApplication {
    private final OperatorService operatorService;

    public Operator findById(Long id) {
        return operatorService.findById(id);
    }
}
