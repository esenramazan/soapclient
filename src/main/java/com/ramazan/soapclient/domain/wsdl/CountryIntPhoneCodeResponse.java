
package com.ramazan.soapclient.domain.wsdl;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryIntPhoneCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryIntPhoneCodeResult"
})
@XmlRootElement(name = "CountryIntPhoneCodeResponse")
public class CountryIntPhoneCodeResponse {

    @XmlElement(name = "CountryIntPhoneCodeResult", required = true)
    protected String countryIntPhoneCodeResult;

    /**
     * Gets the value of the countryIntPhoneCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIntPhoneCodeResult() {
        return countryIntPhoneCodeResult;
    }

    /**
     * Sets the value of the countryIntPhoneCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIntPhoneCodeResult(String value) {
        this.countryIntPhoneCodeResult = value;
    }

}
