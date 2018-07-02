//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.07 at 02:19:17 PM PDT 
//


package com.microsoft.hsg.thing.oxm.jaxb.careplan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.hsg.thing.oxm.jaxb.base.CodableValue;
import com.microsoft.hsg.thing.oxm.jaxb.dates.ApproxDateTime;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:d="urn:com.microsoft.wc.dates" xmlns:t="urn:com.microsoft.wc.thing.types" xmlns:this="urn:com.microsoft.wc.thing.care-plan"&gt;
 *                     A goal defines a target for a measurement.
 *                 &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for care-plan-goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="care-plan-goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{urn:com.microsoft.wc.thing.types}codable-value"/>
 *         &lt;element name="description" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *         &lt;element name="start-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="end-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="target-completion-date" type="{urn:com.microsoft.wc.dates}approx-date-time" minOccurs="0"/>
 *         &lt;element name="associated-type-info" type="{urn:com.microsoft.wc.thing.care-plan}associated-type-info" minOccurs="0"/>
 *         &lt;element name="target-range" type="{urn:com.microsoft.wc.thing.care-plan}goal-range" minOccurs="0"/>
 *         &lt;element name="goal-additional-ranges" type="{urn:com.microsoft.wc.thing.care-plan}goal-range" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recurrence" type="{urn:com.microsoft.wc.thing.care-plan}goal-recurrence" minOccurs="0"/>
 *         &lt;element name="reference-id" type="{urn:com.microsoft.wc.thing.types}stringnznw" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "care-plan-goal", propOrder = {
    "name",
    "description",
    "startDate",
    "endDate",
    "targetCompletionDate",
    "associatedTypeInfo",
    "targetRange",
    "goalAdditionalRanges",
    "recurrence",
    "referenceId"
})
public class CarePlanGoal {

    @XmlElement(required = true)
    protected CodableValue name;
    protected String description;
    @XmlElement(name = "start-date")
    protected ApproxDateTime startDate;
    @XmlElement(name = "end-date")
    protected ApproxDateTime endDate;
    @XmlElement(name = "target-completion-date")
    protected ApproxDateTime targetCompletionDate;
    @XmlElement(name = "associated-type-info")
    protected AssociatedTypeInfo associatedTypeInfo;
    @XmlElement(name = "target-range")
    protected GoalRange targetRange;
    @XmlElement(name = "goal-additional-ranges")
    protected List<GoalRange> goalAdditionalRanges;
    protected GoalRecurrence recurrence;
    @XmlElement(name = "reference-id")
    protected String referenceId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CodableValue }
     *     
     */
    public CodableValue getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodableValue }
     *     
     */
    public void setName(CodableValue value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setStartDate(ApproxDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setEndDate(ApproxDateTime value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the targetCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApproxDateTime }
     *     
     */
    public ApproxDateTime getTargetCompletionDate() {
        return targetCompletionDate;
    }

    /**
     * Sets the value of the targetCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproxDateTime }
     *     
     */
    public void setTargetCompletionDate(ApproxDateTime value) {
        this.targetCompletionDate = value;
    }

    /**
     * Gets the value of the associatedTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedTypeInfo }
     *     
     */
    public AssociatedTypeInfo getAssociatedTypeInfo() {
        return associatedTypeInfo;
    }

    /**
     * Sets the value of the associatedTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedTypeInfo }
     *     
     */
    public void setAssociatedTypeInfo(AssociatedTypeInfo value) {
        this.associatedTypeInfo = value;
    }

    /**
     * Gets the value of the targetRange property.
     * 
     * @return
     *     possible object is
     *     {@link GoalRange }
     *     
     */
    public GoalRange getTargetRange() {
        return targetRange;
    }

    /**
     * Sets the value of the targetRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalRange }
     *     
     */
    public void setTargetRange(GoalRange value) {
        this.targetRange = value;
    }

    /**
     * Gets the value of the goalAdditionalRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalAdditionalRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalAdditionalRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoalRange }
     * 
     * 
     */
    public List<GoalRange> getGoalAdditionalRanges() {
        if (goalAdditionalRanges == null) {
            goalAdditionalRanges = new ArrayList<GoalRange>();
        }
        return this.goalAdditionalRanges;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link GoalRecurrence }
     *     
     */
    public GoalRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoalRecurrence }
     *     
     */
    public void setRecurrence(GoalRecurrence value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

}
