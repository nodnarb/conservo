package com.disrupt.conservo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class InsideWaterUseActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insidewateruse);
    }
    
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.InsideWater_radio0:
                if (checked)
                    // Pirates are the best
                break;
            case R.id.InsideWater_radio1:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater_radio2:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater_radio3:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater2_radio0:
                if (checked)
                    // Pirates are the best
                break;
            case R.id.InsideWater2_radio1:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater2_radio2:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater3_radio0:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater3_radio1:
                if (checked)
                    // Pirates are the best
                break;
            case R.id.InsideWater3_radio2:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater4_radio0:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater4_radio1:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.InsideWater4_radio2:
                if (checked)
                    // Ninjas rule
                break;
        }
    }
}