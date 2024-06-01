package com.phone_recharges.infraestructure.api.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="OPERATOR")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OperatorDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
}
