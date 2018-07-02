//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.03 at 02:57:00 PM PST 
//


package com.microsoft.hsg.thing.oxm.jaxb.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:wct="urn:com.microsoft.wc.types"&gt;
 *                     A pair of doubles used to create a
 *                     range.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for double-range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="double-range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimum-range" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximum-range" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "double-range", propOrder = {
    "minimumRange",
    "maximumRange"
})
public class DoubleRange {

    @XmlElement(name = "minimum-range")
    protected double minimumRange;
    @XmlElement(name = "maximum-range")
    protected double maximumRange;

    /**
     * Gets the value of the minimumRange property.
     * 
     */
    public double getMinimumRange() {
        return minimumRange;
    }

    /**
     * Sets the value of the minimumRange property.
     * 
     */
    public void setMinimumRange(double value) {
        this.minimumRange = value;
    }

    /**
     * Gets the value of the maximumRange property.
     * 
     */
    public double getMaximumRange() {
        return maximumRange;
    }

    /**
     * Sets the value of the maximumRange property.
     * 
     */
    public void setMaximumRange(double value) {
        this.maximumRange = value;
    }

}
