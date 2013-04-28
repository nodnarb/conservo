package com.disrupt.conservo;

import com.disrupt.conservo.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *  @author Brandon Dorris
 */
public class ScoreActivity extends Activity {

    private ArrayList<String> mScoreListStrings;
    private ListView mListView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_screen);


        mScoreListStrings = new ArrayList<String>(11);
        fillScoreList();
        mListView = (ListView)findViewById(R.id.score_list_view);
        mListView.setAdapter(new ScoreArrayAdapter());
    }

    private void fillScoreList() {
        mScoreListStrings.add("Water Consumption Score");
        mScoreListStrings.add("Water Audit Score");
        mScoreListStrings.add("Water Projects Score");
        mScoreListStrings.add("Faucets And Fixtures Score");
        mScoreListStrings.add("Landscape Score");
        mScoreListStrings.add("Goals Score");
        mScoreListStrings.add("Sewer Credits Score");
        mScoreListStrings.add("Re-use Score");
        mScoreListStrings.add("Rebates Score");
        mScoreListStrings.add("Innovation Score");
        mScoreListStrings.add("Cooling Tower Efforts Score");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.score_menu, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (item.getItemId() == R.id.menu_item_new_scoring) {
            Intent scoringStartIntent = new Intent(this, QuestionnaireActivity.class);
            startActivity(scoringStartIntent);
            return true;
        }
        return false;
    }

    private class ScoreArrayAdapter extends BaseAdapter {

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return i;
        }

        public ScoreArrayAdapter() {
            super();
        }

        public int getCount() {
            return 11;
        }

        public View getView(int position, View convertView, ViewGroup viewGroup) {
            View view = convertView;
            if (view == null) {
                LayoutInflater vi = (LayoutInflater)ScoreActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = vi.inflate(R.layout.score_grid_item, null);
            }

            TextView title = (TextView)view.findViewById(R.id.row_title);
            title.setText(mScoreListStrings.get(position));

            ProgressBar progressBar = (ProgressBar)view.findViewById(R.id.progress_bar);
            progressBar.setMax(100);

            switch (position) {
                case 0:
                    progressBar.setProgress((int)Score.waterConsumptionScore);
                    break;
                case 1:
                    progressBar.setProgress((int)Score.waterAuditScore);
                    break;
                case 2:
                    progressBar.setProgress((int)Score.waterProjectsScore);
                    break;
                case 3:
                    progressBar.setProgress((int)Score.faucetsAndFixturesScore);
                    break;
                case 4:
                    progressBar.setProgress((int)Score.landscapeScore);
                    break;
                case 5:
                    progressBar.setProgress((int)Score.goalsScore);
                    break;
                case 6:
                    progressBar.setProgress((int)Score.sewerCreditsScore);
                    break;
                case 7:
                    progressBar.setProgress((int)Score.reUseScore);
                    break;
                case 8:
                    progressBar.setProgress((int)Score.rebatesScore);
                    break;
                case 9:
                    progressBar.setProgress((int)Score.innovationScore);
                    break;
                case 10:
                    progressBar.setProgress((int)Score.coolingTowerEffortsScore);
                    break;
            }

            return view;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}