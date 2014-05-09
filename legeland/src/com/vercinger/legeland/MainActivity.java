package com.vercinger.legeland;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	boolean con_status;
	Button connect;
	TextView status;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        con_status = false;
        setContentView(R.layout.activity_main);
        connect = (Button) findViewById(R.id.connectButton);
        status = (TextView) findViewById(R.id.status);
        connect.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(tryConnect(43,71)){
					status.setText("Du er nu forbundet til DSBs WiFi!");
					connect.setVisibility(View.GONE);
				}else{
					status.setText("Det var ikke muligt at forbinde til DSBs WiFi - Prøv igen..");
				}
				
			}

		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	private boolean tryConnect(int i, int j) {
		
		//Do the actual login stuff underneath	
		
		
		if(i == 43 && j == 71){
		con_status = true;
		}else{
		con_status = false;
		}
		return con_status;
	}
    
}
