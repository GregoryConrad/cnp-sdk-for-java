//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currencyCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="USD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currencyCodeEnum")
@XmlEnum
public enum CurrencyCodeEnum {

    AUD,
    CAD,
    CHF,
    DKK,
    EUR,
    GBP,
    HKD,
    JPY,
    NOK,
    NZD,
    SEK,
    SGD,
    USD;

    public String value() {
        return name();
    }

    public static CurrencyCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
