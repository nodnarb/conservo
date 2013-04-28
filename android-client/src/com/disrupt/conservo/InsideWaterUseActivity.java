package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 *  @author Skylar Castator
 */
public class InsideWaterUseActivity extends Activity {
	
	int m_FaucetsScore;
	public int TotalTolietriesScore1;
	public int TotalTolietriesScore2; 
	public int TotalTolietriesScore3;
	public int TotalTolietriesScoreTotal; 
	Button mButton;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insidewateruse);
        
        mButton = (Button)findViewById(R.id.m_submitButton);

        mButton.setOnClickListener(
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                	TotalTolietriesScoreTotal = (((TotalTolietriesScore1 + TotalTolietriesScore2 + TotalTolietriesScore3)/300)*10);
                	int FaucetsScoreTotal = ((m_FaucetsScore/100)* 10);
                	//Facets are half, fixtures the other half
                	Score.faucetsAndFixturesScore = FaucetsScoreTotal + TotalTolietriesScoreTotal;
                }
            });
    }
    
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.InsideWater_radio0:
                if (checked)
                    //Faucet Aerators 0
                	m_FaucetsScore = 0;
                break;
            case R.id.InsideWater_radio1:
                if (checked)
                    //Faucet Aerators 75
                	m_FaucetsScore = 75;
                break;
            case R.id.InsideWater_radio2:
                if (checked)
                    //Faucet Aerators 85
                	m_FaucetsScore = 85;
                break;
            case R.id.InsideWater_radio3:
                if (checked)
                    //Faucet Aerators 100
                	m_FaucetsScore = 100;
                break;
            case R.id.InsideWater2_radio0:
                if (checked)
                    // Low Flow 60
                	TotalTolietriesScore1 += 60;
                	
                break;
            case R.id.InsideWater2_radio1:
                if (checked)
                	// Low Flow 80
                	TotalTolietriesScore1 += 80;
                break;
            case R.id.InsideWater2_radio2:
                if (checked)
                	// Low Flow 100
                	TotalTolietriesScore1 += 100;
                break;
            case R.id.InsideWater3_radio0:
                if (checked)
                    //Ultra Low Flow 60
                	TotalTolietriesScore2 += 60;
                break;
            case R.id.InsideWater3_radio1:
                if (checked)
                	//Ultra Low Flow 60
                	TotalTolietriesScore2 += 80;
                break;
            case R.id.InsideWater3_radio2:
                if (checked)
                	//Ultra Low Flow 60
                	TotalTolietriesScore2 += 100;
                break;
            case R.id.InsideWater4_radio0:
                if (checked)
                    // Automatic Control 60
                	TotalTolietriesScore3 += 60;
                break;
            case R.id.InsideWater4_radio1:
                if (checked)
                    // Automatic Control 80
                	TotalTolietriesScore3 += 80;
                break;
            case R.id.InsideWater4_radio2:
                if (checked)
                    // Automatic Control 100
                	TotalTolietriesScore3 += 100;
                break;
                
                //Send Full Value to score
        }
    }
}