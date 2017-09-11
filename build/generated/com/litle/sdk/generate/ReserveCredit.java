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
 *     &lt;extension base="{http://www.litle.com/schema}transactionTypeWithReportGroup">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="fundingSubmerchantId" type="{http://www.litle.com/schema}merchantIdentificationType"/>
 *           &lt;element name="fundsTransferId" type="{http://www.litle.com/schema}string36Type"/>
 *           &lt;element name="amount" type="{http://www.litle.com/schema}transactionAmountType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fundingSubmerchantId",
    "fundsTransferId",
    "amount"
})
public class ReserveCredit
    extends TransactionTypeWithReportGroup
{

    protected String fundingSubmerchantId;
    protected String fundsTransferId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Long amount;

    /**
     * Gets the value of the fundingSubmerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingSubmerchantId() {
        return fundingSubmerchantId;
    }

    /**
     * Sets the value of the fundingSubmerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingSubmerchantId(String value) {
        this.fundingSubmerchantId = value;
    }

    /**
     * Gets the value of the fundsTransferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundsTransferId() {
        return fundsTransferId;
    }

    /**
     * Sets the value of the fundsTransferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundsTransferId(String value) {
        this.fundsTransferId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

}
