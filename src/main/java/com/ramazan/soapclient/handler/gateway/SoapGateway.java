package com.ramazan.soapclient.handler.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


@Slf4j
@Component
public class SoapGateway extends WebServiceGatewaySupport {

    @Value("${soap.adress}")
    private String adress;
    public Object soapServiceCall(Object requestPayload) {
        return getWebServiceTemplate().marshalSendAndReceive(requestPayload,new SoapActionCallback(adress));
    }
}
