package com.dev.proxy.infra.client;


import com.dev.proxy.config.AsaasFeingConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import proxy.dev.servicos.CriarClienteRequest;
import proxy.dev.servicos.CriarClienteResponse;
import proxy.dev.servicos.GerarCobrancaRequest;
import proxy.dev.servicos.GerarCobrancaResponse;

@FeignClient( name = "asaasClient", url = "${asaas.url}", configuration = AsaasFeingConfig.class)
public interface AsaasFeignClient {

    @PostMapping("/payments")
    GerarCobrancaResponse createCharge(@RequestBody GerarCobrancaRequest request);

    @PostMapping("/customers")
    CriarClienteResponse createCostumer(@RequestBody CriarClienteRequest request);
}
