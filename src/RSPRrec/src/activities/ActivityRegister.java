package activities;

import utilities.TestData;
import data.DataStore;
import android.app.Activity;
import android.content.Intent;
import android.group11.rsprrec.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    
    public void collectData(View v){
    	//String authorEmail = emailField.getText().toString();
    	String authorName = uidField.getText().toString();
    	String authorPass = passField.getText().toString();
    	/*if(authorName.equals("") || authorPass.equals("") || authorEmail.equals("") ){
    		
    	}*/
    	dataStore.getTd().addAccount(authorName, authorPass);
    	
    }
    
    public void toMainMenu(View v){
    	Intent i = new Intent(ActivityRegister.this, ActivityMainMenu.class);
    	collectData(v);
    	i.putExtra("DataStore", dataStore);
    	startActivity(i);
    	
    }
    
    public void toLogin(View v){
    	Intent i = new Intent(ActivityRegister.this, ActivityLogin.class);
    	startActivity(i);

    }
}
