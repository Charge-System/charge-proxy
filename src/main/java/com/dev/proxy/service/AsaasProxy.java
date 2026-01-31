package com.dev.proxy.service;

import com.dev.proxy.infra.client.AsaasFeignClient;
import com.dev.proxy.dto.CreateChargeRequest;
import com.dev.proxy.dto.CreateChargeResponse;
import com.dev.proxy.dto.CreateCostumerRequest;
import com.dev.proxy.dto.CreateCostumerResponse;
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
