package activities;

import android.app.Activity;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;

public class ActivitySettings extends Activity
{
	/*
	 * SeekBar GPS
	 * SeekBar sendPrompt
	 * RadioButton WiFi
	 * SeekBar savePhotoToDevice
	*/
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
	
	public void getData(View v){
		
	};
	
	public boolean updateSessionSettings(){
		return true;
	};
	
	public void toMainMenu(View v){
		Intent i  = new Intent(ActivitySettings.this, ActivityMainMenu.class);
		startActivity(i);
	};

}
