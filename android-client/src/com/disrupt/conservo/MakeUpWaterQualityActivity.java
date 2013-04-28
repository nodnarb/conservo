package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *  @author Skylar Castator
 */
public class MakeUpWaterQualityActivity extends Activity {
    
	Button mButton; 
	EditText mText;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makeupwaterquality);
        
        mButton = (Button)findViewById(R.id.m_submitButton);
        mText   = (EditText)findViewById(R.id.m_PropertyManagerName);

        mButton.setOnClickListener(
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                    Log.v("EditText", mText.getText().toString());
                }
            });
    }
    
}