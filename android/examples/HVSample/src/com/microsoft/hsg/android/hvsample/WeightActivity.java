package com.microsoft.hsg.android.hvsample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.microsoft.hsg.HVException;
import com.microsoft.hsg.android.simplexml.HealthVaultApp;
import com.microsoft.hsg.android.simplexml.ShellActivity;
import com.microsoft.hsg.android.simplexml.client.HealthVaultClient;
import com.microsoft.hsg.android.simplexml.client.RequestCallback;
import com.microsoft.hsg.android.simplexml.methods.getthings3.request.ThingRequestGroup2;
import com.microsoft.hsg.android.simplexml.methods.getthings3.response.ThingResponseGroup2;
import com.microsoft.hsg.android.simplexml.things.thing.Thing2;
import com.microsoft.hsg.android.simplexml.things.types.types.PersonInfo;
import com.microsoft.hsg.android.simplexml.things.types.types.Record;
import com.microsoft.hsg.android.simplexml.things.types.weight.Weight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class WeightActivity extends Activity {

	private HealthVaultApp service;
    private HealthVaultClient hvClient;
    private Record currentRecord;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);
        service = HealthVaultApp.getInstance();
        hvClient = new HealthVaultClient();
        
        Button weightsBtn = (Button) findViewById(R.id.addWeight);
        final EditText editText = (EditText) findViewById(R.id.weightInput);
		
        weightsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            	if (service.isAppConnected()) {
            		putWeight(editText.getText().toString());
            	}
            }
        });
    }
    
	@Override
	protected void onStart() {
		super.onStart();
		hvClient.start();
	}
    
    @Override
    protected void onResume()
    {
        super.onResume();
        currentRecord = HealthVaultApp.getInstance().getCurrentRecord();
        getWeights();
    }
    
    @Override
	protected void onStop() {
    	hvClient.stop();
		super.onStop();
	}

    @SuppressWarnings("unchecked")
    private void getWeights()
    {
    	hvClient.asyncRequest(
    			currentRecord.getThingsAsync(ThingRequestGroup2.thingTypeQuery(Weight.ThingType)),
    			new WeightCallback(WeightCallback.RenderWeights));
    }
    
    private void putWeight(String value) {
        final Thing2 thing = new Thing2();
		thing.setData(new Weight(Double.parseDouble(value)));
        // thing.setData(new Weight(-10));
		hvClient.asyncRequest(
				currentRecord.putThingAsync(thing),
				new WeightCallback(WeightCallback.PutWeights));
    }
    
    private void renderWeights(List<Thing2> things) {
    	List<String> weights = new ArrayList<String>();
        for(Thing2 thing : things) {
        	Weight w = (Weight)thing.getData();
        	weights.add(String.valueOf(w.getValue().getKg()));	
        }
        ListView lv = (ListView)findViewById(R.id.weightList);
        lv.setAdapter(new ArrayAdapter<String>(
            WeightActivity.this,
            android.R.layout.simple_list_item_1,
            weights));
    }
    
    public class WeightCallback<Object> implements RequestCallback {
    	public final static int RenderWeights = 0;
    	public final static int PutWeights = 1;
    
    	private int event;
    	
    	public WeightCallback(int event) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(true);
    		this.event = event;
    	}

        @Override
        public void onError(HVException exception) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(false);
            Toast.makeText(
                WeightActivity.this, 
                "An error occurred.  " + exception.getMessage(), 
                Toast.LENGTH_LONG).show();
        }

		@Override
		public void onSuccess(java.lang.Object obj) {
            WeightActivity.this.setProgressBarIndeterminateVisibility(false);
            switch(event) {
            case PutWeights:
            	getWeights();
            	break;
            case RenderWeights:
                renderWeights(((ThingResponseGroup2)obj).getThing());
                break;
            }
        }
    }
}
