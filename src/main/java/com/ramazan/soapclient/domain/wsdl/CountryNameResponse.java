
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
 *         &lt;element name="CountryNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "countryNameResult"
})
@XmlRootElement(name = "CountryNameResponse")
public class CountryNameResponse {

    @XmlElement(name = "CountryNameResult", required = true)
    protected String countryNameResult;

    /**
     * Gets the value of the countryNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameResult() {
        return countryNameResult;
    }

    /**
     * Sets the value of the countryNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameResult(String value) {
        this.countryNameResult = value;
    }

}
