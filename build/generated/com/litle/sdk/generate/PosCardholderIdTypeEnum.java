//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posCardholderIdTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="posCardholderIdTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="signature"/>
 *     &lt;enumeration value="pin"/>
 *     &lt;enumeration value="nopin"/>
 *     &lt;enumeration value="directmarket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "posCardholderIdTypeEnum")
@XmlEnum
public enum PosCardholderIdTypeEnum {

    @XmlEnumValue("signature")
    SIGNATURE("signature"),
    @XmlEnumValue("pin")
    PIN("pin"),
    @XmlEnumValue("nopin")
    NOPIN("nopin"),
    @XmlEnumValue("directmarket")
    DIRECTMARKET("directmarket");
    private final String value;

    PosCardholderIdTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PosCardholderIdTypeEnum fromValue(String v) {
        for (PosCardholderIdTypeEnum c: PosCardholderIdTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
