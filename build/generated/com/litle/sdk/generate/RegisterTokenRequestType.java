//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerTokenRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerTokenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.litle.com/schema}transactionTypeWithReportGroup">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.litle.com/schema}string25Type" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="mpos" type="{http://www.litle.com/schema}mposType"/>
 *           &lt;element name="accountNumber" type="{http://www.litle.com/schema}ccAccountNumberType"/>
 *           &lt;element name="echeckForToken" type="{http://www.litle.com/schema}echeckForTokenType"/>
 *           &lt;element name="paypageRegistrationId" type="{http://www.litle.com/schema}string512Type"/>
 *           &lt;element name="applepay" type="{http://www.litle.com/schema}applepayType"/>
 *         &lt;/choice>
 *         &lt;element name="cardValidationNum" type="{http://www.litle.com/schema}cvNumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerTokenRequestType", propOrder = {
    "orderId",
    "applepay",
    "paypageRegistrationId",
    "echeckForToken",
    "accountNumber",
    "mpos",
    "cardValidationNum"
})
public class RegisterTokenRequestType
    extends TransactionTypeWithReportGroup
{

    protected String orderId;
    protected ApplepayType applepay;
    protected String paypageRegistrationId;
    protected EcheckForTokenType echeckForToken;
    protected String accountNumber;
    protected MposType mpos;
    protected String cardValidationNum;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the applepay property.
     * 
     * @return
     *     possible object is
     *     {@link ApplepayType }
     *     
     */
    public ApplepayType getApplepay() {
        return applepay;
    }

    /**
     * Sets the value of the applepay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplepayType }
     *     
     */
    public void setApplepay(ApplepayType value) {
        this.applepay = value;
    }

    /**
     * Gets the value of the paypageRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypageRegistrationId() {
        return paypageRegistrationId;
    }

    /**
     * Sets the value of the paypageRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypageRegistrationId(String value) {
        this.paypageRegistrationId = value;
    }

    /**
     * Gets the value of the echeckForToken property.
     * 
     * @return
     *     possible object is
     *     {@link EcheckForTokenType }
     *     
     */
    public EcheckForTokenType getEcheckForToken() {
        return echeckForToken;
    }

    /**
     * Sets the value of the echeckForToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcheckForTokenType }
     *     
     */
    public void setEcheckForToken(EcheckForTokenType value) {
        this.echeckForToken = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the mpos property.
     * 
     * @return
     *     possible object is
     *     {@link MposType }
     *     
     */
    public MposType getMpos() {
        return mpos;
    }

    /**
     * Sets the value of the mpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MposType }
     *     
     */
    public void setMpos(MposType value) {
        this.mpos = value;
    }

    /**
     * Gets the value of the cardValidationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardValidationNum() {
        return cardValidationNum;
    }

    /**
     * Sets the value of the cardValidationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardValidationNum(String value) {
        this.cardValidationNum = value;
    }

}
