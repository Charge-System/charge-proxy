package com.dev.proxy.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsaasFeingConfig {

    private final AsaasProperties properties;

    public AsaasFeingConfig(AsaasProperties properties) {
        this.properties = properties;
    }

    @Bean
    public RequestInterceptor asaasRequestInterceptor() {
        return requestTemplate -> {
            //Campos do header que o asaas pede na autenticação
            requestTemplate.header("Content-Type", "application/json");
            requestTemplate.header("User-Agent", "chargeproxy");
            requestTemplate.header("access_token", properties.getToken());
        };
    }
}
