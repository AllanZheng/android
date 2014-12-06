package activities;

import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SeekBar;
import utilities.Settings;

public class ActivitySettings extends Activity
{
	private SeekBar GPS;
	private SeekBar sendPrompt;
	private RadioButton WiFi;
	private SeekBar savePhotoToDevice;
	
	public void getData(View v){};
	
	public boolean updateSessionSettings(){return true;};
	
	public void toMainMenu(View v){};

}
