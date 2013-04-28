package com.disrupt.conservo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Score.waterConsumptionScore = 100;
        Score.waterAuditScore = 100;
        Score.waterProjectsScore = 100;
        Score.faucetsAndFixturesScore = 100;
        Score.landscapeScore = 100;
        Score.goalsScore = 100;
        Score.sewerCreditsScore = 75;
        Score.reUseScore = 30;
        Score.rebatesScore = 75;
        Score.innovationScore = 100;
        Score.coolingTowerEffortsScore = 100;
    }

    public void onSignupClicked(View view) {

    }

    public void onLoginClicked(View view) {
        Intent scoreIntent = new Intent(this, ScoreActivity.class);
        startActivity(scoreIntent);
        finish();
    }
}
