package com.ramazan.soapclient.config;

import com.ramazan.soapclient.handler.gateway.SoapGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapConfig {

    @Value("${soap.uri}")
    private String uri;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.ramazan.soapclient.domain.wsdl");
        return marshaller;
    }


    @Bean
    public SoapGateway soapGateway(Jaxb2Marshaller marshaller) {
        SoapGateway soapGateway = new SoapGateway();
        soapGateway.setDefaultUri(uri);
        soapGateway.setMarshaller(marshaller);
        soapGateway.setUnmarshaller(marshaller);
        return soapGateway;
    }
}
