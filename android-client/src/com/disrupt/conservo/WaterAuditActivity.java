package com.disrupt.conservo;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class WaterAuditActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.wateraudit);
    }
    
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.LastAudit_0:
                if (checked)
                    // Pirates are the best
                break;
            case R.id.LastAudit_1:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.LastAudit_2:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.AuditProject_radio0:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.AuditProject_radio1:
                if (checked)
                    // Pirates are the best
                break;
            case R.id.AuditProject_radio2:
                if (checked)
                    // Ninjas rule
                break;
            case R.id.AuditProject_radio3:
                if (checked)
                    // Ninjas rule
                break;
        }
    }
}