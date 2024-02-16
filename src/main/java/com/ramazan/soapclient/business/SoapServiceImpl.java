package com.ramazan.soapclient.business;

import com.ramazan.soapclient.domain.wsdl.FullCountryInfo;
import com.ramazan.soapclient.domain.wsdl.FullCountryInfoResponse;
import com.ramazan.soapclient.domain.wsdl.TLanguage;
import com.ramazan.soapclient.handler.gateway.SoapGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SoapServiceImpl implements SoapService {

    private final SoapGateway soapGateway;
    @Override
    public String callSoapServiceAndPrintIt(String countryISOCode) {

        FullCountryInfo request = new FullCountryInfo();
        request.setSCountryISOCode(countryISOCode);
        FullCountryInfoResponse response = (FullCountryInfoResponse) soapGateway.soapServiceCall(request);

        System.out.println("Languages");
        response.getFullCountryInfoResult().getLanguages().getTLanguage().forEach(System.out::println);
        StringBuilder sb = new StringBuilder("Languages:");
        for (TLanguage language : response.getFullCountryInfoResult().getLanguages().getTLanguage()) {
            sb.append("\n- ").append(language.getSISOCode() + "-" +language.getSName());
        }
        return sb.toString();
    }
}
