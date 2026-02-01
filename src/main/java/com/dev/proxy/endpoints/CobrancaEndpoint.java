package com.dev.proxy.endpoints;


import com.dev.proxy.service.AsaasProxy;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import proxy.dev.servicos.GerarCobrancaRequest;
import proxy.dev.servicos.GerarCobrancaResponse;

@Endpoint
public class CobrancaEndpoint {

    private static final String NAMESPACE_URI = "http://dev.proxy/servicos";

    private final AsaasProxy proxy;

    public CobrancaEndpoint(AsaasProxy proxy) {
        this.proxy = proxy;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "gerarCobrancaRequest")
    @ResponsePayload
    public GerarCobrancaResponse gerarCobranca(@RequestPayload GerarCobrancaRequest criarCobrancaRequest) {
        return proxy.createCharge(criarCobrancaRequest);
    }
}
