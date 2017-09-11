//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="fundingSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="type" type="{http://www.litle.com/schema}fundingSourceTypeEnum"/>
 *                   &lt;element name="availableBalance" type="{http://www.litle.com/schema}string20Type"/>
 *                   &lt;element name="reloadable" type="{http://www.litle.com/schema}string50Type" minOccurs="0"/>
 *                   &lt;element name="prepaidCardType" type="{http://www.litle.com/schema}string50Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="affluence" type="{http://www.litle.com/schema}affluenceTypeEnum" minOccurs="0"/>
 *         &lt;element name="issuerCountry" type="{http://www.litle.com/schema}string3Type" minOccurs="0"/>
 *         &lt;element name="cardProductType" type="{http://www.litle.com/schema}cardProductTypeEnum" minOccurs="0"/>
 *         &lt;element name="virtualAccountNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="networkResponse" type="{http://www.litle.com/schema}networkResponse" minOccurs="0"/>
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
    "fundingSource",
    "affluence",
    "issuerCountry",
    "cardProductType",
    "virtualAccountNumber",
    "networkResponse"
})
@XmlRootElement(name = "enhancedAuthResponse")
public class EnhancedAuthResponse {

    protected EnhancedAuthResponse.FundingSource fundingSource;
    protected AffluenceTypeEnum affluence;
    protected String issuerCountry;
    protected CardProductTypeEnum cardProductType;
    protected Boolean virtualAccountNumber;
    protected NetworkResponse networkResponse;

    /**
     * Gets the value of the fundingSource property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedAuthResponse.FundingSource }
     *     
     */
    public EnhancedAuthResponse.FundingSource getFundingSource() {
        return fundingSource;
    }

    /**
     * Sets the value of the fundingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedAuthResponse.FundingSource }
     *     
     */
    public void setFundingSource(EnhancedAuthResponse.FundingSource value) {
        this.fundingSource = value;
    }

    /**
     * Gets the value of the affluence property.
     * 
     * @return
     *     possible object is
     *     {@link AffluenceTypeEnum }
     *     
     */
    public AffluenceTypeEnum getAffluence() {
        return affluence;
    }

    /**
     * Sets the value of the affluence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffluenceTypeEnum }
     *     
     */
    public void setAffluence(AffluenceTypeEnum value) {
        this.affluence = value;
    }

    /**
     * Gets the value of the issuerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerCountry() {
        return issuerCountry;
    }

    /**
     * Sets the value of the issuerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerCountry(String value) {
        this.issuerCountry = value;
    }

    /**
     * Gets the value of the cardProductType property.
     * 
     * @return
     *     possible object is
     *     {@link CardProductTypeEnum }
     *     
     */
    public CardProductTypeEnum getCardProductType() {
        return cardProductType;
    }

    /**
     * Sets the value of the cardProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProductTypeEnum }
     *     
     */
    public void setCardProductType(CardProductTypeEnum value) {
        this.cardProductType = value;
    }

    /**
     * Gets the value of the virtualAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualAccountNumber() {
        return virtualAccountNumber;
    }

    /**
     * Sets the value of the virtualAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualAccountNumber(Boolean value) {
        this.virtualAccountNumber = value;
    }

    /**
     * Gets the value of the networkResponse property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkResponse }
     *     
     */
    public NetworkResponse getNetworkResponse() {
        return networkResponse;
    }

    /**
     * Sets the value of the networkResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkResponse }
     *     
     */
    public void setNetworkResponse(NetworkResponse value) {
        this.networkResponse = value;
    }


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
     *         &lt;element name="type" type="{http://www.litle.com/schema}fundingSourceTypeEnum"/>
     *         &lt;element name="availableBalance" type="{http://www.litle.com/schema}string20Type"/>
     *         &lt;element name="reloadable" type="{http://www.litle.com/schema}string50Type" minOccurs="0"/>
     *         &lt;element name="prepaidCardType" type="{http://www.litle.com/schema}string50Type" minOccurs="0"/>
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
        "type",
        "availableBalance",
        "reloadable",
        "prepaidCardType"
    })
    public static class FundingSource {

        @XmlElement(required = true)
        protected FundingSourceTypeEnum type;
        @XmlElement(required = true)
        protected String availableBalance;
        protected String reloadable;
        protected String prepaidCardType;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link FundingSourceTypeEnum }
         *     
         */
        public FundingSourceTypeEnum getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link FundingSourceTypeEnum }
         *     
         */
        public void setType(FundingSourceTypeEnum value) {
            this.type = value;
        }

        /**
         * Gets the value of the availableBalance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailableBalance() {
            return availableBalance;
        }

        /**
         * Sets the value of the availableBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailableBalance(String value) {
            this.availableBalance = value;
        }

        /**
         * Gets the value of the reloadable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReloadable() {
            return reloadable;
        }

        /**
         * Sets the value of the reloadable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReloadable(String value) {
            this.reloadable = value;
        }

        /**
         * Gets the value of the prepaidCardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrepaidCardType() {
            return prepaidCardType;
        }

        /**
         * Sets the value of the prepaidCardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrepaidCardType(String value) {
            this.prepaidCardType = value;
        }

    }

}
