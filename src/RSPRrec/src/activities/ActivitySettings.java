package activities;

import data.DataStore;
import utilities.Settings;
import android.app.Activity;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class ActivitySettings extends Activity{
	
	private DataStore dataStore;
	private RadioButton gps;
	private RadioButton sendPrompt;
	private RadioButton photoSave;
	private RadioButton wiFi;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
		Intent intent = getIntent();
		dataStore = (DataStore) intent.getSerializableExtra("DataStore");
        gps = (RadioButton) findViewById(R.id.gps_radio);
        sendPrompt = (RadioButton) findViewById(R.id.send_prompt_radio);
        photoSave = (RadioButton) findViewById(R.id.photo_to_device_radio);
        wiFi = (RadioButton) findViewById(R.id.wifi_radio);
        
        
        gps.setChecked(dataStore.getCurrentSettings().isGps());
        sendPrompt.setChecked(dataStore.getCurrentSettings().isSendPrompt());
        photoSave.setChecked(dataStore.getCurrentSettings().isPhotoSave());
        wiFi.setChecked(dataStore.getCurrentSettings().isWiFi());

       /* OnClickListener gpsListener = new OnClickListener (){
       	 	public void onClick(View v) {
       	 		if(gps.isChecked() == true){
       	 			gps.setChecked(false);
       	 		}else{
       	 			gps.setChecked(true);
       	 		}
       	 	}
       	};
        OnClickListener sendListener = new OnClickListener (){
       	 	public void onClick(View v) {
       	 		if(sendPrompt.isChecked() == true){
       	 			sendPrompt.setChecked(false);
       	 		}else{
       	 			sendPrompt.setChecked(true);
       	 		}
       	 	}
       	};
       	
        OnClickListener saveListener = new OnClickListener (){
       	 	public void onClick(View v) {
       	 		if(photoSave.isChecked() == true){
       	 			photoSave.setChecked(false);
       	 		}else{
       	 			photoSave.setChecked(true);
       	 		}
       	 	}
       	};
        OnClickListener wifiListener = new OnClickListener (){
       	 	public void onClick(View v) {
       	 		if(wiFi.isChecked() == true){
       	 			wiFi.setChecked(false);
       	 		}else{
       	 			wiFi.setChecked(true);
       	 		}
       	 	}
       	};
       	
        gps.setOnClickListener(gpsListener);
        sendPrompt.setOnClickListener(sendListener);
        photoSave.setOnClickListener(saveListener);
        wiFi.setOnClickListener(wifiListener);*/
	}

 
	
	public void getData(View v){
		Settings s = dataStore.getCurrentSettings();
		if(gps.isChecked() == true){
			s.setGps(true);
		}else{
			s.setGps(false);
		}
		if(sendPrompt.isChecked() == true){
			s.setSendPrompt(true);
		}else{
			s.setSendPrompt(false);
		}
		if(photoSave.isChecked() == true){
			s.setPhotoSave(true);
		}else{
			s.setPhotoSave(false);
		}
		if(wiFi.isChecked() == true){
			s.setWiFi(true);
		}else{
			s.setWiFi(false);
		}
		
		
	}
	
	public void toMainMenu(View v){
		Intent i  = new Intent(ActivitySettings.this, ActivityMainMenu.class);
		getData(v);
		i.putExtra("DataStore", dataStore);
		startActivity(i);
	}
	
	public void toMainMenuBack(View v){
		Intent i  = new Intent(ActivitySettings.this, ActivityMainMenu.class);
		i.putExtra("DataStore", dataStore);
		startActivity(i);
	}

}
