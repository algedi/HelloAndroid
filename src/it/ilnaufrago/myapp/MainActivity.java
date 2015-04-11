package it.ilnaufrago.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
 	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//EditText ousername=(EditText) findViewById(R.id.username);
		//EditText password=(EditText) findViewById(R.id.password);
		//String account_username=username.getText().toString();
		//String account_password=accounts.get(username.getText().toString());
		
    }  
	
	public void OnEntry(View v)
	{
		Intent i=new Intent(this, Page.class);
		//i.putExtra("username", account_username);
		startActivity(i);
		//EditText username=(EditText) findViewById(R.id.username);
		//EditText password=(EditText) findViewById(R.id.password);
		//String account_username=username.getText().toString();
		//String account_password=accounts.get(username.getText().toString());
	}
}
