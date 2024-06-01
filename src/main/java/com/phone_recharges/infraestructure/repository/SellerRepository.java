package com.phone_recharges.infraestructure.repository;

import com.phone_recharges.infraestructure.api.dto.SellerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerDto, Long> {
}
