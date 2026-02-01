package com.dev.proxy.config.webService;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/*
* Objetivo: COnfigurar o endpoint referente ao webservice (SOAP)
* do proxy
* */
@EnableWs
@Configuration
public class WebServiceClienteConfig {

    private static final String NAMESPACE_URI = "http://dev.proxy/servicos";

    @Bean(name = "cliente")
    public DefaultWsdl11Definition defaultWsdl11DefinitionCliente(XsdSchema clienteSchema) {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("ClientePort");
        wsdl.setLocationUri("/ws/cliente");
        wsdl.setTargetNamespace(NAMESPACE_URI);
        wsdl.setSchema(clienteSchema);
        return wsdl;
    }

    @Bean(name = "clienteSchema")
    public XsdSchema schemaApp() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/cliente.xsd"));
    }
}