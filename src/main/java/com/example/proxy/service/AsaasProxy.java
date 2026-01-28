package com.example.proxy.service;

import com.example.proxy.infra.client.AsaasFeignClient;
import com.example.proxy.dto.CreateChargeRequest;
import com.example.proxy.dto.CreateChargeResponse;
import com.example.proxy.dto.CreateCostumerRequest;
import com.example.proxy.dto.CreateCostumerResponse;
import org.springframework.stereotype.Service;

@Service
public class AsaasProxy {

    private final AsaasFeignClient client;

    public AsaasProxy(AsaasFeignClient client) {
        this.client = client;
    }

    public CreateChargeResponse createCharge(CreateChargeRequest request) {
        return client.createCharge(request);
    }

    public CreateCostumerResponse createCostumer(CreateCostumerRequest request) {
        return client.createCostumer(request);
    }
}
