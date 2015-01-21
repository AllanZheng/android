package activities;

import data.DataStore;
import data.Record;
import data.Reserve;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.group11.rsprrec.R.layout;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityAddRecording extends Activity {
	
	private DataStore dataStore;
	private EditText nameField;
	private SearchView reserveSearchField;
	private SearchView speciesSearchField;
	private EditText latField;
	private EditText lngField;
	private EditText commentField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordings_add);
        dataStore = (DataStore) getIntent().getSerializableExtra("DataStore");
        /*nameField = (EditText) findViewById(R.id.txt_recordings_name);
        latField = (EditText) findViewById(R.id.txt_recordings_latitude);
        lngField = (EditText) findViewById(R.id.txt_recordings_longitude);
        commentField = (EditText) findViewById(R.id.txt_recordings_notes);*/
        //reserveSearchField = (SearchView) findViewById(R.id.srh_recordings_reserves);
        //speciesSearchField = (SearchView) findViewById(R.id.srh_recordings_plants);
        
    }
    /*
    public boolean collectData(View v){
    	String name = nameField.getText().toString();
    	//String reserve = reserveSearchField.getQuery().toString(); 
    	//String species = speciesSearchField.getQuery().toString();
    	try{
    		System.out.println("lat = " + latField.getText() + "       lng = " + lngField.getText());
    		int lat = Integer.valueOf(latField.getText().toString());
    		int lng = Integer.valueOf(lngField.getText().toString());
    	}catch(NumberFormatException nfe){
			Context context = getApplicationContext();
			CharSequence text = "Latitude and Longitude should be numerical values";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			return false;
    	}
    	String comment = commentField.getText().toString();
    	return true;
    	//Record r = new Record("");
    	
    }
    */
    public void toMainMenu(View v){
    	Intent i = new Intent(ActivityAddRecording.this, ActivityMainMenu.class);
    	//boolean valid = collectData(v);
    	//if(valid == false){
    		
    	//}else{
    		i.putExtra("DataStore", dataStore);
    		startActivity(i);
    	//}
    }

}
