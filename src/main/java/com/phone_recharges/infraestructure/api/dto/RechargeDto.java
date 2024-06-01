package com.phone_recharges.infraestructure.api.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="RECHARGE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RechargeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private Double valueRecharge;
    @ManyToOne
    @JoinColumn(name="operator_id", referencedColumnName = "id")
    private OperatorDto operatorDto;
    @ManyToOne
    @JoinColumn(name="seller_id", referencedColumnName = "id")
    private SellerDto sellerDto;
}
