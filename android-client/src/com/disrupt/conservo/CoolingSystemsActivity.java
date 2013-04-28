package com.disrupt.conservo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CheckBox;

/**
 *  @author Skylar Castator
 */
public class CoolingSystemsActivity extends Activity {
    
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coolingsystem);
    }

        
    //Cooling Tower CheckBox
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
       boolean checked = ((CheckBox) view).isChecked();
            
        // Check which checkbox was clicked
        switch(view.getId()) {
                case R.id.coolingtowercheckbox_1:
                    if (checked)
                        // Put Add next question
                    else
                        // Continue to Results
                    break;
                case R.id.coolingtowercheckbox_2:
                    if (checked)
                        // Put Add next question
                    else
                        // Continue to Results
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
                        // Pirates are the best
                    break;
                case R.id.WaterEfficiencyradio_1:
                    if (checked)
                        // Ninjas rule
                    break;
                case R.id.WaterEfficiencyradio_2:
                    if (checked)
                        // Ninjas rule
                    break;
                case R.id.WaterEfficiencyradio_3:
                    if (checked)
                        // Ninjas rule
                    break;
            }
        }
}