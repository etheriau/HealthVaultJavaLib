package com.microsoft.hsg.android.simplexml.things.types.height;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

@Order(elements = {
	    "m",
	    "display"
	})

// TODO: need to properly define the object type for the two elements,
// right now I'm just using double
public class HeightValue {
	
	@Element(name = "m", required=true)
    protected double m;

	@Element(name="display", required=false)
//	protected DisplayValue display;
	protected double display;
	
	public double getM() {
		return m;
	}
	
	public void setM(double value) {
		this.m = value;
	}
	
	public double getDisplay() {
		return display;
	}
	
	public void setDisplay(double value) {
		this.display = value;
	}
/*	public DisplayValue getDisplay() {
		return display;
	}
	
	public void setDisplay(DisplayValue value) {
		this.display = value;
	}*/
}
