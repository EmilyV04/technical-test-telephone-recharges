package com.phone_recharges.infraestructure.api.controller;

import com.phone_recharges.application.RechargeApplication;
import com.phone_recharges.domain.entities.Recharge;
import com.phone_recharges.infraestructure.api.controller.request.RechargeRequest;
import com.phone_recharges.infraestructure.api.controller.request.RechargeRequestMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api")
public class RechargeController {
    private final RechargeApplication rechargeApplication;
    private final RechargeRequestMapper rechargeRequestMapper;

    @PostMapping("/buy")
    public ResponseEntity<Recharge> buyRecharge(@RequestBody RechargeRequest rechargeRequest) {
        Recharge response = rechargeApplication.save(rechargeRequestMapper.toEntity(rechargeRequest));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Recharge>> getAllRecharges() {
        try {
            List<Recharge> recharges = new ArrayList<>();
            rechargeApplication.getAll().forEach(recharges::add);
            return new ResponseEntity<>(recharges, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
