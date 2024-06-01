package com.phone_recharges.infraestructure.repository;

import com.phone_recharges.infraestructure.api.dto.RechargeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RechargeRepository extends JpaRepository<RechargeDto, Long> {
}
