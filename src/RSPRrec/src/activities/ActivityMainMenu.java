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
        dataStore = (DataStore) getIntent().getSerializableExtra("DataStore");
		if(dataStore.isLoggedIn() == false){
			login.setText("Log in");
			login.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					toLogin(v);					
				}
			});
			
		}else{
			login.setText("Log out");
			login.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					logout(v);					
				}
			});
			Intent intent = getIntent();
			dataStore = (DataStore) intent.getSerializableExtra("DataStore");
		}
    }
    
    
    public void toAddRecording(View v){
		Intent i  = new Intent(ActivityMainMenu.this, ActivityAddRecording.class);
		i.putExtra("DataStore", dataStore);
		startActivity(i);
    }
    
    
    public void toSettings(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivitySettings.class);
    	i.putExtra("DataStore", dataStore);
    	startActivity(i);
    }   
    
    public void toLogin(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivityLogin.class);
    	i.putExtra("DataStore", dataStore);
    	startActivity(i);
    }
    
    public void logout(View v){
    	Intent i = new Intent(ActivityMainMenu.this, ActivityLogin.class);
    	startActivity(i);
    }
 
}
