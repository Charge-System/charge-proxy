package com.example.proxy.infra.client;

import com.example.proxy.config.AsaasFeingConfig;
import com.example.proxy.dto.CreateChargeRequest;
import com.example.proxy.dto.CreateChargeResponse;
import com.example.proxy.dto.CreateCostumerRequest;
import com.example.proxy.dto.CreateCostumerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient( name = "asaasClient", url = "${asaas.url}", configuration = AsaasFeingConfig.class)
public interface AsaasFeignClient {

    @PostMapping("/payments")
    CreateChargeResponse createCharge(@RequestBody CreateChargeRequest request);

    @PostMapping("/customers")
    CreateCostumerResponse createCostumer(@RequestBody CreateCostumerRequest request
                                            );
}
