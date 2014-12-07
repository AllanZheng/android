package activities;

import android.app.Activity;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;

public class ActivityMainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    
    public void toRecordings(View v){
		Intent i  = new Intent(ActivityMainMenu.this, ActivityRecordings.class);
		startActivity(i);
    }
    
    public void toPlantSpecies(View v){
		Intent i  = new Intent(ActivityMainMenu.this, ActivityPlantSpecies.class);
		startActivity(i);
    }
    
    

}
