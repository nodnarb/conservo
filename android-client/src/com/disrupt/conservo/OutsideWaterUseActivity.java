package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class OutsideWaterUseActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outsidewateruse);
    }
    
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.OutsideWater_radio0:
                if (checked) {
                    // Pirates are the best
                }
                break;
            case R.id.OutsideWater_radio1:
                if (checked) {
                    // Ninjas rule
                }
                break;
            case R.id.OutsideWater_radio2:
                if (checked) {
                    // Ninjas rule
                }
                break;
            case R.id.OutsideWater_radio3:
                if (checked) {
                    // Ninjas rule
                }
                break;
        }
    }
}