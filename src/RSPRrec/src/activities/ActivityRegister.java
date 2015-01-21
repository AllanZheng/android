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

public class ActivityRegister extends Activity {
	
	private DataStore dataStore;
	private EditText emailField;
	private EditText uidField;
	private EditText passField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dataStore = (DataStore) getIntent().getSerializableExtra("DataStore");
        emailField = (EditText) findViewById(R.id.email_input);
        uidField = (EditText) findViewById(R.id.inputUsername);
        passField = (EditText) findViewById(R.id.inputPassword);
        
        
    }
    
    public boolean collectData(View v){
    	String authorEmail = emailField.getText().toString();
    	String authorName = uidField.getText().toString();
    	String authorPass = passField.getText().toString();
    	if(authorName.equals("") || authorPass.equals("") || authorEmail.equals("") ){
			Context context = getApplicationContext();
			CharSequence text = "Please enter data into all the fields in order to create an account";
			int duration = Toast.LENGTH_SHORT;
			
			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			return false;
    	}else{
    		dataStore.getTd().addAccount(authorName, authorPass);
    		return true;
    	}
    	
    }
    
    public void toMainMenu(View v){
    	Intent i = new Intent(ActivityRegister.this, ActivityMainMenu.class);
    	boolean valid = collectData(v);
    	if(valid == true){
    		i.putExtra("DataStore", dataStore);
    		startActivity(i);
    	}
    }
    
    public void toLogin(View v){
    	Intent i = new Intent(ActivityRegister.this, ActivityLogin.class);
    	startActivity(i);

    }
}
