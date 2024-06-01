package com.phone_recharges.infraestructure.repository;

import com.phone_recharges.infraestructure.api.dto.OperatorDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepository extends JpaRepository<OperatorDto, Long> {
}
