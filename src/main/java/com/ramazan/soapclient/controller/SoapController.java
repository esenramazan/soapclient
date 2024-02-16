package com.ramazan.soapclient.controller;


import com.ramazan.soapclient.business.SoapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SoapController {

    private final SoapService soapService;

    @GetMapping("/dojob")
    public String callSoapServiceAndPrintIt(@RequestParam String countryISOCode) {
        try {
            return soapService.callSoapServiceAndPrintIt(countryISOCode);
        } catch (Exception e) {
            return e.getMessage();
        }

    }
}
