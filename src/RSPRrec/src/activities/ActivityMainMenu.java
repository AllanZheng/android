package activities;

import data.DataStore;
import android.app.Activity;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMainMenu extends Activity {

	private DataStore dataStore;
	private Button login;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        login = (Button) findViewById(R.id.login_out_button);
        Bundle extra = getIntent().getExtras();
		if(extra == null){
			System.out.println("making new datastore");
			dataStore = new DataStore();
			login.setText("Log in");
			login.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					toLogin(v);					
				}
			});
			
		}else{
			System.out.println("datastore already exists");
			login.setText("Log out");
			login.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					logout(v);					
				}
			});
			Intent intent = getIntent();
			dataStore = (DataStore) intent.getSerializableExtra("DataStorage");
		}
    }
    
    
    public void toRecordings(View v){
		Intent i  = new Intent(ActivityMainMenu.this, ActivityAddRecording.class);
		startActivity(i);
    }
    
    public void toPlantSpecies(View v){
		Intent i  = new Intent(ActivityMainMenu.this, ActivityPlantSpecies.class);
		startActivity(i);
    }
    
    
    public void toSettings(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivitySettings.class);
    	i.putExtra("DataStorage", dataStore);
    	startActivity(i);
    }   
    
    public void toLogin(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivityLogin.class);
    	i.putExtra("DataStorage", dataStore);
    	startActivity(i);
    }
    
    public void logout(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivityLogin.class);
    	//TODO: destory dataStore
    	startActivity(i);
    }
 
}
