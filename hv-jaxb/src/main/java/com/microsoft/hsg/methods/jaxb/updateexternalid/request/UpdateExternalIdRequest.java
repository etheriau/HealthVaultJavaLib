//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:17:10 PM PST 
//


package com.microsoft.hsg.methods.jaxb.updateexternalid.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         The element of the request that contains the method
 *                         specific parameters.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                         All requests contain the info element to pass parameters
 *                         that are specific to each method. If the method does not
 *                         define an info element, the method does not take any
 *                         parameters.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="identity-code" type="{urn:com.microsoft.wc.types}stringnz"/>
 *           &lt;element name="old-external-id" type="{urn:com.microsoft.wc.types}stringnz"/>
 *         &lt;/choice>
 *         &lt;element name="new-external-id" type="{urn:com.microsoft.wc.types}stringnz"/>
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
    "identityCode",
    "oldExternalId",
    "newExternalId"
})
@XmlRootElement(name = "info")
public class UpdateExternalIdRequest {

    @XmlElement(name = "identity-code")
    protected String identityCode;
    @XmlElement(name = "old-external-id")
    protected String oldExternalId;
    @XmlElement(name = "new-external-id", required = true)
    protected String newExternalId;

    /**
     * Gets the value of the identityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCode() {
        return identityCode;
    }

    /**
     * Sets the value of the identityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCode(String value) {
        this.identityCode = value;
    }

    /**
     * Gets the value of the oldExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldExternalId() {
        return oldExternalId;
    }

    /**
     * Sets the value of the oldExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldExternalId(String value) {
        this.oldExternalId = value;
    }

    /**
     * Gets the value of the newExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewExternalId() {
        return newExternalId;
    }

    /**
     * Sets the value of the newExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewExternalId(String value) {
        this.newExternalId = value;
    }

}
