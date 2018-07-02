package com.microsoft.hsg.android.simplexml.things.types.dates;

import java.util.Calendar;

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
 * <p>Java class for date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="date">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="y" type="{urn:com.microsoft.wc.dates}year"/>
 *         &lt;element name="m" type="{urn:com.microsoft.wc.dates}month"/>
 *         &lt;element name="d" type="{urn:com.microsoft.wc.dates}day"/>
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
public class Date {

    @Element(required = false)
    protected int y;

    @Element(required = false)
    protected int m;

    @Element(required = false)
    protected int d;

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
     */
    public int getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     */
    public void setM(int value) {
        this.m = value;
    }

    /**
     * Gets the value of the d property.
     * 
     */
    public int getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(int value) {
        this.d = value;
    }
    
    /**
     * Generate Date instance from calendar.
     * 
     * @param cal the cal
     * 
     * @return the date
     */
    public static Date fromCalendar(Calendar cal)
    {
    	Date date = new Date();
    	date.setD(cal.get(Calendar.DAY_OF_MONTH));
    	date.setM(cal.get(Calendar.MONTH) + 1);
    	date.setY(cal.get(Calendar.YEAR));
    	
    	return date;
    }
}
