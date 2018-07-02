package com.microsoft.hsg.android.simplexml.things.types.personalimage;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns="http://www.w3.org/2001/XMLSchema" xmlns:pi="urn:com.microsoft.wc.thing.personal-image" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         An image that represents the person.
 *                     &lt;/summary&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;remarks xmlns="http://www.w3.org/2001/XMLSchema" xmlns:pi="urn:com.microsoft.wc.thing.personal-image" xmlns:t="urn:com.microsoft.wc.thing.types"&gt;
 *                         This type has no XML data associated with it. All data
 *                         is stored as base64 encoded binary data in the "other
 *                         data" section of the thing.
 *                     &lt;/remarks&gt;
 * </pre>
 * 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class PersonalImage  {

	public static String getThingType() {
		return "a5294488-f865-4ce3-92fa-187cd3b58930";
	}
}
