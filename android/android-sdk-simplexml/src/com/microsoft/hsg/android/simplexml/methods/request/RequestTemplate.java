package com.microsoft.hsg.android.simplexml.methods.request;

import java.io.InputStream;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.RegistryMatcher;
import org.simpleframework.xml.transform.Transform;

import com.microsoft.hsg.Connection;
import com.microsoft.hsg.HVAccessor;
import com.microsoft.hsg.HVException;
import com.microsoft.hsg.Request;

public class RequestTemplate {
	
	private String personId;
	private String recordId;
	private Connection connection;
	
	public RequestTemplate(Connection connection) {
		this(connection, null, null);
	}
	
	public RequestTemplate(Connection connection,
			String personId,
			String recordId) {
		this.connection = connection;
		this.recordId = recordId;
		this.personId = personId;
	}
	
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public <T> T makeRequest(HVRequestInfo info, Class<T> response) throws HVException
	{
		return makeRequest(new Request(), info, response);
	}
	
	public <T> T makeRequest(
			Request request, 
			HVRequestInfo requestInfo, 
			final Class<T> response) 
	throws HVException
	{
		populateRequest(request, requestInfo);
		
		return makeRequest(request, new RequestMarshaller<T>() {
			public T marshal(InputStream istream) throws Exception {
				RegistryMatcher m = new RegistryMatcher();
			    m.bind(Date.class, new DateFormatTransformer());
				Serializer s = new Persister(m);
				return s.read(response, istream, false);
			}
		});
	}
	
	public <T> T makeRequest(Request request, RequestMarshaller<T> marshaller)
	{
		request.setTtl(3600 * 8 + 300); 
		if (personId != null) request.setOfflineUserId(personId);
		if (recordId != null) request.setRecordId(recordId);
		
		HVAccessor accessor = new HVAccessor();
		accessor.send(request, connection);
		
		try
		{
			InputStream istream = accessor.getResponse().getInputStream();
			try
			{
				return marshaller.marshal(istream);
			}
			finally
			{
				istream.close();
			}
		}
		catch(HVException e)
		{
			throw e;
		}
		catch(Exception e)
		{
			//TODO: need exception translator
			throw new HVException("Could not marshal response", e);
		}	
		
	}
	
	private void populateRequest(Request request, HVRequestInfo requestInfo) {
		if (!requestInfo.getClass().isAnnotationPresent(HVMethodRequest.class))
		{
			// TODO:  use subclass
			throw new HVException("Invalid request.  Expecting HVRequest");
		}
		
		HVMethodRequest hvRequest = requestInfo.getClass().getAnnotation(HVMethodRequest.class);
		
		request.setMethodName(hvRequest.methodName());
		request.setMethodVersion(hvRequest.methodVersion());
		request.setInfo(makeInfoString(requestInfo));
	}
	
	private String makeInfoString(HVRequestInfo requestInfo) {
		try {
			Serializer s = new Persister();
			StringWriter sw = new StringWriter();
			s.write(requestInfo, sw);
			return sw.toString();
		}
		catch (Exception e)
		{
			throw new HVException("Could not serialize RequestInfo object", e);
		}
	}
	
	public static class DateFormatTransformer implements Transform<Date> {
		private static DateFormat format = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss");

		@Override
		public Date read(String value) throws Exception
		{
			return format.parse(value);
		}
		
	    @Override
	    public String write(Date value) throws Exception
	    {
	        return format.format(value);
	    }
	}
}
