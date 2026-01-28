package com.example.proxy.controller;

import com.example.proxy.dto.CreateChargeRequest;
import com.example.proxy.dto.CreateChargeResponse;
import com.example.proxy.service.AsaasProxy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class ChargeController {

    private final AsaasProxy proxy;

    public ChargeController(AsaasProxy proxy) {
        this.proxy = proxy;
    }

    @PostMapping
    public CreateChargeResponse create(@RequestBody CreateChargeRequest request) {
        return proxy.createCharge(request);
    }
}

