package activities;

import utilities.TestData;
import data.DataStore;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityLogin extends Activity {
	
	private DataStore dataStore;
	private TestData td;
	private EditText usernameField;
	private EditText passwordField;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
		dataStore = new DataStore();
		usernameField = (EditText) findViewById(R.id.inputUsername);
		passwordField = (EditText) findViewById(R.id.inputPassword);
	
    }
    
    private boolean collectData(View v){
    	String uid = usernameField.getText().toString();
    	String pass = usernameField.getText().toString();
    	boolean validAccount = td.checkAccount(uid, pass);
    	return validAccount;
    }
    
    public void toRegister(View v){
		Intent i  = new Intent(ActivityLogin.this, ActivityRegister.class);
		startActivity(i);
    }
    
    public void toMainMenu(View v){
		Intent i  = new Intent(ActivityLogin.this, ActivityMainMenu.class);
		boolean valid = collectData(v);
		if(valid == false){
			Context context = getApplicationContext();
			CharSequence text = "The account information entered was invalid";
			int duration = Toast.LENGTH_SHORT;
			
			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}else{
			i.putExtra("DataStore", dataStore);
			startActivity(i);
		}
    }
}
