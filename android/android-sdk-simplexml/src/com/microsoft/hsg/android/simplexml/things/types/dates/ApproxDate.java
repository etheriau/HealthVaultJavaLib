package com.microsoft.hsg.android.simplexml.things.types.dates;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:t="urn:com.microsoft.wc.types" xmlns:this="urn:com.microsoft.wc.dates"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for approx-date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approx-date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="y" type="{urn:com.microsoft.wc.dates}year"/>
 *         &lt;element name="m" type="{urn:com.microsoft.wc.dates}month" minOccurs="0"/>
 *         &lt;element name="d" type="{urn:com.microsoft.wc.dates}day" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Order(elements = {
    "y",
    "m",
    "d"
})
public class ApproxDate {

    @Element(required = false)
    protected int y;

    @Element(required = false)
    protected Integer m;

    @Element(required = false)
    protected Integer d;

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setM(Integer value) {
        this.m = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setD(Integer value) {
        this.d = value;
    }

}
