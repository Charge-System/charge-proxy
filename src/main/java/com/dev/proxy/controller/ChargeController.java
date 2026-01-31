package com.dev.proxy.controller;

import com.dev.proxy.dto.CreateChargeRequest;
import com.dev.proxy.dto.CreateChargeResponse;
import com.dev.proxy.service.AsaasProxy;
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

