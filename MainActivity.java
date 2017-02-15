package com.example.a;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {
	String[] inst = {
			"Juniour College(ITI)",
			};
	String[] state = {
			"BIHAR"
	};
	String[] district = {
			"PATNA"
	};
	String[] parent = {
			"Bihar Board"
	};
	String[] upload = {
			"BROWSE"
	};
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText e1= (EditText) findViewById(R.id.editText1);
		EditText e2= (EditText) findViewById(R.id.editText2);
		Button b1= (Button) findViewById(R.id.button1);
		Spinner s1 = (Spinner) findViewById(R.id.spinner1);
		Spinner s2 = (Spinner) findViewById(R.id.spinner2);
		Spinner s3 = (Spinner) findViewById(R.id.spinner3);
		Spinner s4 = (Spinner) findViewById(R.id.spinner4);
		Spinner s5 = (Spinner) findViewById(R.id.spinner5);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,inst);
s1.setAdapter(adapter);
        
        s1.setOnItemSelectedListener(new OnItemSelectedListener()
        {
        	@Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
           	 
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getBaseContext(), "You have selected item : " + inst[index],
             Toast.LENGTH_SHORT).show();
            }
           @Override
           public void onNothingSelected(AdapterView<?> arg0) { }
           });
           
       
        
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, state);
s2.setAdapter(adapter1);
        
        s1.setOnItemSelectedListener(new OnItemSelectedListener()
        {
        	@Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
           	 
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getApplicationContext(), "You have selected item : " + state[index],Toast.LENGTH_SHORT).show();
            }
           @Override
           public void onNothingSelected(AdapterView<?> arg0) { }
           });
        
        
        
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, district);
s3.setAdapter(adapter2);
        
        s3.setOnItemSelectedListener(new OnItemSelectedListener()
        {
        	@Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
           	 
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getApplicationContext(), "You have selected item : " + district[index],Toast.LENGTH_SHORT).show();
            }
           @Override
           public void onNothingSelected(AdapterView<?> arg0) { }
           });
        
        
        
        
        
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, parent);
s4.setAdapter(adapter3);
        
        s4.setOnItemSelectedListener(new OnItemSelectedListener()
        {
        	@Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
           	 
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getApplicationContext(), "You have selected item : " + parent[index],Toast.LENGTH_SHORT).show();
            }
           @Override
           public void onNothingSelected(AdapterView<?> arg0) { }
           });
        
        
        
        
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, upload);
s5.setAdapter(adapter4);
        
        s5.setOnItemSelectedListener(new OnItemSelectedListener()
        {
        	@Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {
           	 
             int index = arg0.getSelectedItemPosition();
             Toast.makeText(getApplicationContext(), "You have selected item : " + upload[index],Toast.LENGTH_SHORT).show();
            }
           @Override
           public void onNothingSelected(AdapterView<?> arg0) { }
           });
           }
       


        
           
       


        
           
       


        
       


        


        
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
