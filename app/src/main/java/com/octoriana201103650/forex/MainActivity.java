package com.octoriana201103650.forex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar loadingProgressBar;
    private SwipeRefreshLayout swipeRefreshLayout1;
    private TextView idrTextView, usdTextView, myrTextView, krwTextView, jpyTextView, hkdTextView, eurTextView, fjdTextView, fkpTextView, gbpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout1 = (TextView)findViewById(R.id.swipeRefreshLayout1);
        idrTextView = (TextView) findViewById(R.id.idrTextView);
    }
}