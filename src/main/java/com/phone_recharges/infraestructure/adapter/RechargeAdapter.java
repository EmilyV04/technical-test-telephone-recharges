package com.phone_recharges.infraestructure.adapter;

import com.phone_recharges.domain.entities.Recharge;
import com.phone_recharges.domain.services.RechargeService;
import com.phone_recharges.infraestructure.api.mapper.RechargeMapper;
import com.phone_recharges.infraestructure.repository.RechargeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RechargeAdapter implements RechargeService {
    private final RechargeMapper rechargeMapper;
    private final RechargeRepository rechargeRepository;

    @Override
    public List<Recharge> getAll() {
        return rechargeMapper.toEntity(rechargeRepository.findAll());
    }

    @Override
    public Recharge save(Recharge recharge) {
        return rechargeMapper.toEntity(rechargeRepository.save(rechargeMapper.toDto(recharge)));
    }
}
