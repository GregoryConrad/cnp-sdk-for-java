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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bmlMerchantId" type="{http://www.litle.com/schema}litleIdType"/>
 *         &lt;element name="promotionalOfferCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedTermsCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creditLine" type="{http://www.litle.com/schema}transactionAmountType" minOccurs="0"/>
 *         &lt;element name="addressIndicator" type="{http://www.litle.com/schema}addressIndicator" minOccurs="0"/>
 *         &lt;element name="loanToValueEstimator" type="{http://www.litle.com/schema}loanToValueEstimator" minOccurs="0"/>
 *         &lt;element name="riskEstimator" type="{http://www.litle.com/schema}riskEstimator" minOccurs="0"/>
 *         &lt;element name="riskQueueAssignment" type="{http://www.litle.com/schema}riskQueueAssignment" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "billMeLaterResponseData")
public class BillMeLaterResponseData {

    protected long bmlMerchantId;
    protected String promotionalOfferCode;
    protected Integer approvedTermsCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Long creditLine;
    protected String addressIndicator;
    protected String loanToValueEstimator;
    protected String riskEstimator;
    protected String riskQueueAssignment;

    /**
     * Gets the value of the bmlMerchantId property.
     * 
     */
    public long getBmlMerchantId() {
        return bmlMerchantId;
    }

    /**
     * Sets the value of the bmlMerchantId property.
     * 
     */
    public void setBmlMerchantId(long value) {
        this.bmlMerchantId = value;
    }

    /**
     * Gets the value of the promotionalOfferCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalOfferCode() {
        return promotionalOfferCode;
    }

    /**
     * Sets the value of the promotionalOfferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalOfferCode(String value) {
        this.promotionalOfferCode = value;
    }

    /**
     * Gets the value of the approvedTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovedTermsCode() {
        return approvedTermsCode;
    }

    /**
     * Sets the value of the approvedTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovedTermsCode(Integer value) {
        this.approvedTermsCode = value;
    }

    /**
     * Gets the value of the creditLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCreditLine() {
        return creditLine;
    }

    /**
     * Sets the value of the creditLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLine(Long value) {
        this.creditLine = value;
    }

    /**
     * Gets the value of the addressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressIndicator() {
        return addressIndicator;
    }

    /**
     * Sets the value of the addressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressIndicator(String value) {
        this.addressIndicator = value;
    }

    /**
     * Gets the value of the loanToValueEstimator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanToValueEstimator() {
        return loanToValueEstimator;
    }

    /**
     * Sets the value of the loanToValueEstimator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanToValueEstimator(String value) {
        this.loanToValueEstimator = value;
    }

    /**
     * Gets the value of the riskEstimator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskEstimator() {
        return riskEstimator;
    }

    /**
     * Sets the value of the riskEstimator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskEstimator(String value) {
        this.riskEstimator = value;
    }

    /**
     * Gets the value of the riskQueueAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskQueueAssignment() {
        return riskQueueAssignment;
    }

    /**
     * Sets the value of the riskQueueAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskQueueAssignment(String value) {
        this.riskQueueAssignment = value;
    }

}
