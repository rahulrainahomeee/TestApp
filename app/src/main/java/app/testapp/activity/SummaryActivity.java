package app.testapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

import app.testapp.R;

/**
 * @class SummaryActivity
 * @desc Activity Class to show the summary of pending picklist.
 */
public class SummaryActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

    }
}
