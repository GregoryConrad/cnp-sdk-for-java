//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.litle.com/schema}transactionResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.litle.com/schema}recurringTransactionResponse" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="response" use="required" type="{http://www.litle.com/schema}responseType" />
 *       &lt;attribute name="message" use="required" type="{http://www.litle.com/schema}messageType" />
 *       &lt;attribute name="version" use="required" type="{http://www.litle.com/schema}versionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recurringTransactionResponse",
    "transactionResponse"
})
@XmlRootElement(name = "litleOnlineResponse")
public class LitleOnlineResponse {

    @XmlElementRef(name = "recurringTransactionResponse", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends RecurringTransactionResponseType> recurringTransactionResponse;
    @XmlElementRef(name = "transactionResponse", namespace = "http://www.litle.com/schema", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TransactionTypeWithReportGroup> transactionResponse;
    @XmlAttribute(name = "response", required = true)
    protected String response;
    @XmlAttribute(name = "message", required = true)
    protected String message;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the recurringTransactionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatePlanResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdatePlanResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecurringTransactionResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancelSubscriptionResponse }{@code >}
     *     
     */
    public JAXBElement<? extends RecurringTransactionResponseType> getRecurringTransactionResponse() {
        return recurringTransactionResponse;
    }

    /**
     * Sets the value of the recurringTransactionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatePlanResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdatePlanResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecurringTransactionResponseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancelSubscriptionResponse }{@code >}
     *     
     */
    public void setRecurringTransactionResponse(JAXBElement<? extends RecurringTransactionResponseType> value) {
        this.recurringTransactionResponse = value;
    }

    /**
     * Gets the value of the transactionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdateCardValidationNumOnTokenResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureGivenAuthResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link BalanceInquiryResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionTypeWithReportGroup }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckRedepositResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastFundingResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmerchantCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnloadReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVerificationResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayFacCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReserveDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceStatusResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckPreNoteSaleResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckSalesResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterTokenResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnloadResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FundingInstructionVoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryTransactionUnavailableResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhysicalCheckCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeactivateReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivateReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountUpdateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepositReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhysicalCheckDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardCaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForceCaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayFacDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardAuthReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckPreNoteCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmerchantDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReserveCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryTransactionResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeactivateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FraudCheckResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadReversalResponse }{@code >}
     *     
     */
    public JAXBElement<? extends TransactionTypeWithReportGroup> getTransactionResponse() {
        return transactionResponse;
    }

    /**
     * Sets the value of the transactionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UpdateCardValidationNumOnTokenResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaptureGivenAuthResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link BalanceInquiryResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionTypeWithReportGroup }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckRedepositResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FastFundingResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmerchantCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnloadReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVerificationResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckVoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayFacCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReserveDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceStatusResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckPreNoteSaleResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckSalesResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegisterTokenResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnloadResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FundingInstructionVoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoidResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryTransactionUnavailableResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhysicalCheckCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorizationResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeactivateReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivateReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccountUpdateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DepositReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PhysicalCheckDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardCaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ForceCaptureResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayFacDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link GiftCardAuthReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link EcheckPreNoteCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubmerchantDebitResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link SaleResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReserveCreditResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link QueryTransactionResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeactivateResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthReversalResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link FraudCheckResponse }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadReversalResponse }{@code >}
     *     
     */
    public void setTransactionResponse(JAXBElement<? extends TransactionTypeWithReportGroup> value) {
        this.transactionResponse = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
