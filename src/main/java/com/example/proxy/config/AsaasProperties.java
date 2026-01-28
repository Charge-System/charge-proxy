package com.example.proxy.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

/*`@ConfigurationProperties` mapeia valores de propriedades definidos no arquivo de
 configuração (como `properties`application.ymlou `properties` application.properties)
 para campos em uma classe Java*/

//Vai procurar por várieáveis que começam com asaas
@ConfigurationProperties(prefix = "asaas")
public class AsaasProperties {

    private String token;
    private String url;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

