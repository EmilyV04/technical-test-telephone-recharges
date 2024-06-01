package com.phone_recharges.infraestructure.adapter;

import com.phone_recharges.domain.entities.Operator;
import com.phone_recharges.domain.services.OperatorService;
import com.phone_recharges.infraestructure.api.mapper.OperatorMapper;
import com.phone_recharges.infraestructure.repository.OperatorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OperatorAdapter implements OperatorService {
    private final OperatorMapper operatorMapper;
    private final OperatorRepository operatorRepository;

    @Override
    public Operator findById(Long id) {
        return operatorMapper.toEntity(operatorRepository.findById(id).orElseThrow(RuntimeException::new));
    }
}
