//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 01:40:28 PM EDT 
//


package com.litle.sdk.generate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advancedFraudResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advancedFraudResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceReviewStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceReputationScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="triggeredRule" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedFraudResultsType", propOrder = {
    "deviceReviewStatus",
    "deviceReputationScore",
    "triggeredRules"
})
public class AdvancedFraudResultsType {

    protected String deviceReviewStatus;
    protected Integer deviceReputationScore;
    @XmlElement(name = "triggeredRule")
    protected List<String> triggeredRules;

    /**
     * Gets the value of the deviceReviewStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceReviewStatus() {
        return deviceReviewStatus;
    }

    /**
     * Sets the value of the deviceReviewStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceReviewStatus(String value) {
        this.deviceReviewStatus = value;
    }

    /**
     * Gets the value of the deviceReputationScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeviceReputationScore() {
        return deviceReputationScore;
    }

    /**
     * Sets the value of the deviceReputationScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeviceReputationScore(Integer value) {
        this.deviceReputationScore = value;
    }

    /**
     * Gets the value of the triggeredRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the triggeredRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTriggeredRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTriggeredRules() {
        if (triggeredRules == null) {
            triggeredRules = new ArrayList<String>();
        }
        return this.triggeredRules;
    }

}
