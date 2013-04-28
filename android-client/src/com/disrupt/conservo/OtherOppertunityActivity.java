package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 *  @author Skylar Castator
 */
public class OtherOppertunityActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otheropportunities);
    }
    
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
       boolean checked = ((CheckBox) view).isChecked();
            
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.OtherOppertunities_checkBox1:
                if (checked) {
                    // Put Add next question
                } else {
                    // Continue to Results
                }
                break;
            case R.id.OtherOppertunities_checkBox2:
                if (checked) {
                    // Put Add next question
                } else {
                    // Continue to Results
                }
                break;

            case R.id.OtherOppertunities_checkBox3:
                if (checked) {
                    // Put Add next question
                } else {
                    // Continue to Results
                }
                break;

            case R.id.OtherOppertunities_checkBox4:
                if (checked){
                    // Put Add next question
                } else {
                    // Continue to Results
                }
                break;

            case R.id.OtherOppertunities_checkBox5:
                if (checked) {
                    // Put Add next question
                } else {
                    // Continue to Results
                }
                break;
        }
    }
}