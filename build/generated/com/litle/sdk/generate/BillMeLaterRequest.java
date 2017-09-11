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
 *       &lt;all>
 *         &lt;element name="bmlMerchantId" type="{http://www.litle.com/schema}litleIdType" minOccurs="0"/>
 *         &lt;element ref="{http://www.litle.com/schema}bmlProductType" minOccurs="0"/>
 *         &lt;element name="termsAndConditions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="preapprovalNumber" type="{http://www.litle.com/schema}ccAccountNumberType" minOccurs="0"/>
 *         &lt;element name="merchantPromotionalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerPasswordChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerBillingAddressChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerEmailChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerPhoneChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="secretQuestionCode" type="{http://www.litle.com/schema}string2Type" minOccurs="0"/>
 *         &lt;element name="secretQuestionAnswer" type="{http://www.litle.com/schema}string25Type" minOccurs="0"/>
 *         &lt;element name="virtualAuthenticationKeyPresenceIndicator" type="{http://www.litle.com/schema}virtualAuthenticationKeyPresenceIndicator" minOccurs="0"/>
 *         &lt;element name="virtualAuthenticationKeyData" type="{http://www.litle.com/schema}virtualAuthenticationKeyData" minOccurs="0"/>
 *         &lt;element name="itemCategoryCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authorizationSourcePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "billMeLaterRequest")
public class BillMeLaterRequest {

    protected Long bmlMerchantId;
    @XmlElement(defaultValue = "BL")
    protected String bmlProductType;
    protected Integer termsAndConditions;
    protected String preapprovalNumber;
    protected Integer merchantPromotionalCode;
    protected Boolean customerPasswordChanged;
    protected Boolean customerBillingAddressChanged;
    protected Boolean customerEmailChanged;
    protected Boolean customerPhoneChanged;
    protected String secretQuestionCode;
    protected String secretQuestionAnswer;
    protected String virtualAuthenticationKeyPresenceIndicator;
    protected String virtualAuthenticationKeyData;
    protected Integer itemCategoryCode;
    protected String authorizationSourcePlatform;

    /**
     * Gets the value of the bmlMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBmlMerchantId() {
        return bmlMerchantId;
    }

    /**
     * Sets the value of the bmlMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBmlMerchantId(Long value) {
        this.bmlMerchantId = value;
    }

    /**
     * Gets the value of the bmlProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmlProductType() {
        return bmlProductType;
    }

    /**
     * Sets the value of the bmlProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmlProductType(String value) {
        this.bmlProductType = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTermsAndConditions(Integer value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the preapprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreapprovalNumber() {
        return preapprovalNumber;
    }

    /**
     * Sets the value of the preapprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreapprovalNumber(String value) {
        this.preapprovalNumber = value;
    }

    /**
     * Gets the value of the merchantPromotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMerchantPromotionalCode() {
        return merchantPromotionalCode;
    }

    /**
     * Sets the value of the merchantPromotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMerchantPromotionalCode(Integer value) {
        this.merchantPromotionalCode = value;
    }

    /**
     * Gets the value of the customerPasswordChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerPasswordChanged() {
        return customerPasswordChanged;
    }

    /**
     * Sets the value of the customerPasswordChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerPasswordChanged(Boolean value) {
        this.customerPasswordChanged = value;
    }

    /**
     * Gets the value of the customerBillingAddressChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerBillingAddressChanged() {
        return customerBillingAddressChanged;
    }

    /**
     * Sets the value of the customerBillingAddressChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerBillingAddressChanged(Boolean value) {
        this.customerBillingAddressChanged = value;
    }

    /**
     * Gets the value of the customerEmailChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerEmailChanged() {
        return customerEmailChanged;
    }

    /**
     * Sets the value of the customerEmailChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerEmailChanged(Boolean value) {
        this.customerEmailChanged = value;
    }

    /**
     * Gets the value of the customerPhoneChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerPhoneChanged() {
        return customerPhoneChanged;
    }

    /**
     * Sets the value of the customerPhoneChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerPhoneChanged(Boolean value) {
        this.customerPhoneChanged = value;
    }

    /**
     * Gets the value of the secretQuestionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretQuestionCode() {
        return secretQuestionCode;
    }

    /**
     * Sets the value of the secretQuestionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretQuestionCode(String value) {
        this.secretQuestionCode = value;
    }

    /**
     * Gets the value of the secretQuestionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretQuestionAnswer() {
        return secretQuestionAnswer;
    }

    /**
     * Sets the value of the secretQuestionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretQuestionAnswer(String value) {
        this.secretQuestionAnswer = value;
    }

    /**
     * Gets the value of the virtualAuthenticationKeyPresenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualAuthenticationKeyPresenceIndicator() {
        return virtualAuthenticationKeyPresenceIndicator;
    }

    /**
     * Sets the value of the virtualAuthenticationKeyPresenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualAuthenticationKeyPresenceIndicator(String value) {
        this.virtualAuthenticationKeyPresenceIndicator = value;
    }

    /**
     * Gets the value of the virtualAuthenticationKeyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualAuthenticationKeyData() {
        return virtualAuthenticationKeyData;
    }

    /**
     * Sets the value of the virtualAuthenticationKeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualAuthenticationKeyData(String value) {
        this.virtualAuthenticationKeyData = value;
    }

    /**
     * Gets the value of the itemCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCategoryCode() {
        return itemCategoryCode;
    }

    /**
     * Sets the value of the itemCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCategoryCode(Integer value) {
        this.itemCategoryCode = value;
    }

    /**
     * Gets the value of the authorizationSourcePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationSourcePlatform() {
        return authorizationSourcePlatform;
    }

    /**
     * Sets the value of the authorizationSourcePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationSourcePlatform(String value) {
        this.authorizationSourcePlatform = value;
    }

}
