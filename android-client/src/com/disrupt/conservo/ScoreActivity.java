package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 *  @author Brandon Dorris
 */
public class ScoreActivity extends Activity {

    private ArrayList<String> mScoreListStrings;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_screen);

        mScoreListStrings = new ArrayList<String>(11);
        fillScoreList();
    }

    private void fillScoreList() {
        mScoreListStrings.add("WaterConsumptionScore");
        mScoreListStrings.add("WaterAuditScore");
        mScoreListStrings.add("WaterProjectsScore");
        mScoreListStrings.add("FaucetsAndFixturesScore");
        mScoreListStrings.add("LandscapeScore");
        mScoreListStrings.add("GoalsScore");
        mScoreListStrings.add("SewerCreditsScore");
        mScoreListStrings.add("ReUseScore");
        mScoreListStrings.add("RebatesScore");
        mScoreListStrings.add("InnovationScore");
        mScoreListStrings.add("CoolingTowerEffortsScore");
    }
}