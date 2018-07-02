package com.microsoft.hsg.android.simplexml.things.types.height;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

import com.microsoft.hsg.android.simplexml.things.types.dates.DateTime;

@Order(elements = {
		"when",
		"value"		
})

@Root(name = "height")
public class Height {
	@Element(name = "when", required=true)
    protected DateTime when;
	
	@Element(name="value", required=false)
	protected HeightValue value;
	
    public DateTime getWhen() {
    	return when;
    }
    
    public void setWhen(DateTime value) {
    	this.when = value;
    }

    public HeightValue getValue() {
    	return value;
    }
    
    public void setValue(HeightValue value) {
    	this.value = value;
    }
}
