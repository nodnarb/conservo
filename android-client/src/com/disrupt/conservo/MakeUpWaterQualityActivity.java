package com.disrupt.conservo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 *  @author Skylar Castator
 */
public class MakeUpWaterQualityActivity extends Activity {
    
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.makeupwaterquality);
    }
    
	EditText editText = (EditText) findViewById(R.id.);
	editText.setOnEditorActionListener(new OnEditorActionListener() {
	    @Override
	    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
	        boolean handled = false;
	        if (actionId == EditorInfo.IME_ACTION_SEND) {
	            sendMessage();
	            handled = true;
	        }
	        return handled;
	    }
	});
    
}