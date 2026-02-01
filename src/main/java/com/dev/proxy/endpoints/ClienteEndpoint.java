package com.dev.proxy.endpoints;


import com.dev.proxy.service.AsaasProxy;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import proxy.dev.servicos.CriarClienteRequest;
import proxy.dev.servicos.CriarClienteResponse;

@Endpoint
public class ClienteEndpoint {

    private static final String NAMESPACE_URI = "http://dev.proxy/servicos";

    private final AsaasProxy proxy;

    public ClienteEndpoint(AsaasProxy proxy) {
        this.proxy = proxy;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "criarClienteRequest")
    @ResponsePayload
    public CriarClienteResponse criarCliente(@RequestPayload CriarClienteRequest criarCliente) {
        return proxy.createCostumer(criarCliente);
    }
}
