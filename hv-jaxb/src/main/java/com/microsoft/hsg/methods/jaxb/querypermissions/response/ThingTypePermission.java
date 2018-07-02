//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 08:21:42 PM PST 
//


package com.microsoft.hsg.methods.jaxb.querypermissions.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.QueryPermissions" xmlns:wc-types="urn:com.microsoft.wc.types"&gt;
 *                     The permissions for online or offline access that the
 *                     authenticated person has for the specified thing type in
 *                     the specified record in the context of the current application.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:this="urn:com.microsoft.wc.methods.response.QueryPermissions" xmlns:wc-types="urn:com.microsoft.wc.types"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ThingTypePermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThingTypePermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thing-type-id" type="{urn:com.microsoft.wc.types}guid"/>
 *         &lt;element name="online-access-permissions" type="{urn:com.microsoft.wc.methods.response.QueryPermissions}Permissions" minOccurs="0"/>
 *         &lt;element name="offline-access-permissions" type="{urn:com.microsoft.wc.methods.response.QueryPermissions}Permissions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThingTypePermission", propOrder = {
    "thingTypeId",
    "onlineAccessPermissions",
    "offlineAccessPermissions"
})
public class ThingTypePermission {

    @XmlElement(name = "thing-type-id", required = true)
    protected String thingTypeId;
    @XmlElement(name = "online-access-permissions")
    protected Permissions onlineAccessPermissions;
    @XmlElement(name = "offline-access-permissions")
    protected Permissions offlineAccessPermissions;

    /**
     * Gets the value of the thingTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThingTypeId() {
        return thingTypeId;
    }

    /**
     * Sets the value of the thingTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThingTypeId(String value) {
        this.thingTypeId = value;
    }

    /**
     * Gets the value of the onlineAccessPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Permissions }
     *     
     */
    public Permissions getOnlineAccessPermissions() {
        return onlineAccessPermissions;
    }

    /**
     * Sets the value of the onlineAccessPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permissions }
     *     
     */
    public void setOnlineAccessPermissions(Permissions value) {
        this.onlineAccessPermissions = value;
    }

    /**
     * Gets the value of the offlineAccessPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Permissions }
     *     
     */
    public Permissions getOfflineAccessPermissions() {
        return offlineAccessPermissions;
    }

    /**
     * Sets the value of the offlineAccessPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permissions }
     *     
     */
    public void setOfflineAccessPermissions(Permissions value) {
        this.offlineAccessPermissions = value;
    }

}
