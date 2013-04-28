package com.disrupt.conservo;

import android.R;
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
                if (checked)
                    // 0
                	Score.landscapeScore = 0;
                break;
            case R.id.OutsideWater_radio1:
                if (checked)
                    // 100
                	Score.landscapeScore = 100;
                break;
            case R.id.OutsideWater_radio2:
                if (checked)
                    // 85
                	Score.landscapeScore = 85;
                break;
            case R.id.OutsideWater_radio3:
                if (checked)
                    // 75
                	Score.landscapeScore = 75;
                break;
        }
    }
}