//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//


package com.microsoft.hsg.methods.jaxb.application;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.application" xmlns:wc-auth="urn:com.microsoft.wc.auth" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StatementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statement" type="{urn:com.microsoft.wc.application}CultureSpecificStatement" maxOccurs="unbounded"/>
 *         &lt;element name="content-type" type="{urn:com.microsoft.wc.types}string255"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementInfo", propOrder = {
    "statement",
    "contentType"
})
public class StatementInfo {

    @XmlElement(required = true)
    protected List<CultureSpecificStatement> statement;
    @XmlElement(name = "content-type", required = true)
    protected String contentType;

    /**
     * Gets the value of the statement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CultureSpecificStatement }
     * 
     * 
     */
    public List<CultureSpecificStatement> getStatement() {
        if (statement == null) {
            statement = new ArrayList<CultureSpecificStatement>();
        }
        return this.statement;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
