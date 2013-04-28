package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class CoolingSystemsActivity extends Activity {
    
	Button mButton;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coolingsystem);
        
        
        mButton = (Button)findViewById(R.id.m_submitButton);

        mButton.setOnClickListener(
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                }
            });
    }

        
    //Cooling Tower CheckBox
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
       boolean checked = ((CheckBox) view).isChecked();
            
        // Check which checkbox was clicked
        switch(view.getId()) {
                case R.id.coolingtowercheckbox_1:
                    if (checked){
                        // Put Add next question
                    } else {
                        // Continue to Results
                    }
                    break;
                case R.id.coolingtowercheckbox_2:
                    if (checked) {
                        // Put Add next question
                    } else {
                        // Continue to Results
                    }
                    break;
            }
        }
        
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            
            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.WaterEfficiencyradio_0:
                    if (checked)
                        // 0
                    	Score.coolingTowerEffortsScore = 0;
                    break;
                case R.id.WaterEfficiencyradio_1:
                    if (checked)
                        // 80
                    	Score.coolingTowerEffortsScore = 80;
                    break;
                case R.id.WaterEfficiencyradio_2:
                    if (checked)
                        // 90
                    	Score.coolingTowerEffortsScore = 90;
                    break;
                case R.id.WaterEfficiencyradio_3:
                    if (checked)
                        // 100
                    	Score.coolingTowerEffortsScore = 100;
                    break;
            }
        }
}