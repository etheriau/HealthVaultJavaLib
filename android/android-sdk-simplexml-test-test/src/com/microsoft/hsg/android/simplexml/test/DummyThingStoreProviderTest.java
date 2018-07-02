package com.microsoft.hsg.android.simplexml.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import junit.framework.TestCase;

import android.util.Base64;

import com.microsoft.hsg.android.ConnectionFactory;
import com.microsoft.hsg.android.HealthVaultService;
import com.microsoft.hsg.android.simplexml.things.store.impl.ThingStoreProvider;
import com.microsoft.hsg.android.simplexml.things.thing.Thing2;
import com.microsoft.hsg.android.simplexml.things.thing.ThingType;
import com.microsoft.hsg.android.simplexml.things.types.allergy.Allergy;
import com.microsoft.hsg.android.simplexml.things.types.appointment.Appointment;
import com.microsoft.hsg.android.simplexml.things.types.base.WeightValue;
import com.microsoft.hsg.android.simplexml.things.types.condition.Condition;
import com.microsoft.hsg.android.simplexml.things.types.dates.DateTime;
import com.microsoft.hsg.android.simplexml.things.types.medication.Medication;
import com.microsoft.hsg.android.simplexml.things.types.weight.Weight;

public class DummyThingStoreProviderTest extends TestCase {

	ThingStoreProvider provider;
	
	public DummyThingStoreProviderTest() {
	}
	
	private void Init()
	{
		if (provider == null) {
		HVSettings settings = new HVSettings();
		HealthVaultService.initialize(settings);
	    provider = new ThingStoreProvider(
		    "3402dc9e-a444-4d96-8004-8b9a165c71f3",
	        "29a42ebb-397c-4fb5-a6ac-17b17c0c82b7");
		provider.setConnection(
				ConnectionFactory.getConnection(
			            "90976b0c-e0c2-467e-b65c-ed9117aa94e9",
			            Base64.decode("JpGYZ54MRAhy2Gw9uoWCfxTG97ufR3v7kZ/i2JG+Utw=", Base64.DEFAULT)));
		}
	}
	
	public void getThingsTest() {
		Init();
		List<Thing2> things = provider.getThingsByType(Allergy.getThingType());
		things = provider.getThingsByType(Appointment.getThingType());
		things = provider.getThingsByType(Condition.getThingType());
		things = provider.getThingsByType(Medication.getThingType());
		things = provider.getThingsByType(Weight.getThingType());
	}
	
	public void putThingsTest() {
		Init();
		
		WeightValue wv = new WeightValue();
		wv.setKg(50);
		
		Weight w = new Weight();
		w.setWhen(DateTime.fromCalendar(Calendar.getInstance()));
		w.setValue(wv);
		
		ThingType type = new ThingType();
		type.setValue(Weight.getThingType());
		
		Thing2 thing = new Thing2();
		thing.setData(w);
		thing.setTypeId(type);
		
		ArrayList<Thing2> l = new ArrayList<Thing2>();
		l.add(thing);
	
		provider.putThings(l);
	}
	
	
}
