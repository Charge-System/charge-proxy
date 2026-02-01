package com.dev.proxy.service;

import com.dev.proxy.infra.client.AsaasFeignClient;
import org.springframework.stereotype.Service;
import proxy.dev.servicos.CriarClienteRequest;
import proxy.dev.servicos.CriarClienteResponse;
import proxy.dev.servicos.GerarCobrancaRequest;
import proxy.dev.servicos.GerarCobrancaResponse;

@Service
public class AsaasProxy {

    private final AsaasFeignClient client;

    public AsaasProxy(AsaasFeignClient client) {
        this.client = client;
    }

    /*
     * Objetivo: Configurar soicitação de geração de cobrança
     * erequisição para o ASAAS
     * */
    public GerarCobrancaResponse createCharge(GerarCobrancaRequest request) {
        return client.createCharge(request);
    }

    /*
    * Objetivo: Configurar soicitação de criação de um novo
    * cliente e encaminhar a requisição para o ASAAS
    * */
    public CriarClienteResponse createCostumer(CriarClienteRequest gerarCobranca) {
        return client.createCostumer(gerarCobranca);
    }
}
