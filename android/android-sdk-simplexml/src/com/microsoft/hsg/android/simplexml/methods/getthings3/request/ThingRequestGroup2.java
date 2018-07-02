package com.microsoft.hsg.android.simplexml.methods.getthings3.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;

import com.microsoft.hsg.android.simplexml.things.thing.ThingKey;

/**
 * <p>Java class for ThingRequestGroup2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThingRequestGroup2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="id" type="{urn:com.microsoft.wc.types}guid" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="key" type="{urn:com.microsoft.wc.thing}ThingKey" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="client-thing-id" type="{urn:com.microsoft.wc.types}string255" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="filter" type="{urn:com.microsoft.wc.methods.GetThings}ThingFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="format" type="{urn:com.microsoft.wc.methods.GetThings3}ThingFormatSpec2"/>
 *         &lt;element name="current-version-only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="max-full" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Order(elements = {
    "id",
    "key",
    "client-thing-id",
    "filter",
    "format",
    "current-version-only"
})
public class ThingRequestGroup2 {

    @ElementList(required=false, inline=true, entry="id")
    protected ArrayList<String> id;

    @ElementList(required=false, inline=true, entry="key")
    protected ArrayList<ThingKey> key;

    @ElementList(required=false, inline=true, entry="client-thing-id")
    protected ArrayList<String> clientThingId;

    @ElementList(required=false, inline=true, entry="filter")
    protected ArrayList<ThingFilterSpec> filter;

    @Element(required = true)
    protected ThingFormatSpec2 format;

    @Element(required=false, name = "current-version-only")
    protected Boolean currentVersionOnly;

    @Attribute(required=false, name = "name")
    protected String name;

    @Attribute(required=false, name = "max")
    protected Integer max;

    @Attribute(required=false, name = "max-full")
    protected Integer maxFull;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getId() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThingKey }
     * 
     * 
     */
    public List<ThingKey> getKey() {
        if (key == null) {
            key = new ArrayList<ThingKey>();
        }
        return this.key;
    }

    /**
     * Gets the value of the clientThingId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the clientThingId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientThingId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClientThingId() {
        if (clientThingId == null) {
            clientThingId = new ArrayList<String>();
        }
        return this.clientThingId;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThingFilterSpec }
     * 
     * 
     */
    public List<ThingFilterSpec> getFilter() {
        if (filter == null) {
            filter = new ArrayList<ThingFilterSpec>();
        }
        return this.filter;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ThingFormatSpec2 }
     *     
     */
    public ThingFormatSpec2 getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThingFormatSpec2 }
     *     
     */
    public void setFormat(ThingFormatSpec2 value) {
        this.format = value;
    }

    /**
     * Gets the value of the currentVersionOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentVersionOnly() {
        return currentVersionOnly;
    }

    /**
     * Sets the value of the currentVersionOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentVersionOnly(Boolean value) {
        this.currentVersionOnly = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMax(Integer value) {
        this.max = value;
    }

    /**
     * Gets the value of the maxFull property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public Integer getMaxFull() {
        return maxFull;
    }

    /**
     * Sets the value of the maxFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFull(Integer value) {
        this.maxFull = value;
    }

}
