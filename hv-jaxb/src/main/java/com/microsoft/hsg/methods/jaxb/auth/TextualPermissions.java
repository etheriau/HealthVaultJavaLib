//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:22:44 PM PST 
//


package com.microsoft.hsg.methods.jaxb.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.auth" xmlns:wc-thing="urn:com.microsoft.wc.thing" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TextualPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextualPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textual-permissions-type" type="{urn:com.microsoft.wc.auth}TextualPermissionsType"/>
 *         &lt;element name="textual-rule" type="{urn:com.microsoft.wc.auth}TextualRule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextualPermissions", propOrder = {
    "textualPermissionsType",
    "textualRule"
})
public class TextualPermissions {

    @XmlElement(name = "textual-permissions-type", required = true)
    protected TextualPermissionsType textualPermissionsType;
    @XmlElement(name = "textual-rule", required = true)
    protected TextualRule textualRule;

    /**
     * Gets the value of the textualPermissionsType property.
     * 
     * @return
     *     possible object is
     *     {@link TextualPermissionsType }
     *     
     */
    public TextualPermissionsType getTextualPermissionsType() {
        return textualPermissionsType;
    }

    /**
     * Sets the value of the textualPermissionsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualPermissionsType }
     *     
     */
    public void setTextualPermissionsType(TextualPermissionsType value) {
        this.textualPermissionsType = value;
    }

    /**
     * Gets the value of the textualRule property.
     * 
     * @return
     *     possible object is
     *     {@link TextualRule }
     *     
     */
    public TextualRule getTextualRule() {
        return textualRule;
    }

    /**
     * Sets the value of the textualRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualRule }
     *     
     */
    public void setTextualRule(TextualRule value) {
        this.textualRule = value;
    }

}
