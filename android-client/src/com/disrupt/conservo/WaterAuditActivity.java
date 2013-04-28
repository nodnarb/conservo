package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class WaterAuditActivity extends Activity {
	
	Button mButton;
	int m_WaterAuditScore;
	int m_WaterProjectScore;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.wateraudit);
        
        mButton = (Button)findViewById(R.id.m_submitButton);

        mButton.setOnClickListener(
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                	Score.waterAuditScore = m_WaterAuditScore;
                	Score.waterProjectsScore = m_WaterProjectScore;
                }
            });
    }
    
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.LastAudit_radio0:
                if (checked)
                    //Water Audit 0
                	m_WaterAuditScore = 0;
                break;
            case R.id.LastAudit_radio1:
                if (checked)
                    //Water Audit 80
                	m_WaterAuditScore = 80;
                break;
            case R.id.LastAudit_radio2:
                if (checked)
                    //Water Audit 100
                	m_WaterAuditScore = 100;
                break;
            case R.id.AuditProject_radio0:
                if (checked)
                    //Water Project 0
                	m_WaterProjectScore = 0;
                break;
            case R.id.AuditProject_radio1:
                if (checked)
                    //Water Project 75
                	m_WaterProjectScore = 75;
                break;
            case R.id.AuditProject_radio2:
                if (checked)
                    //Water Project 85
                	m_WaterProjectScore = 85;
                break;
            case R.id.AuditProject_radio3:
                if (checked)
                    //Water Project 100
                	m_WaterProjectScore = 100;
                break;
        }
    }
}