package com.divakar.progressbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class BarSampleActivity extends AppCompatActivity {

    int timePassed = 0;
    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_sample);

        bar = (ProgressBar) findViewById(R.id.progressBar);

        Thread background = new Thread(new Runnable() {
            public void run() {
                while (timePassed < 100) {
                    try {
                        bar.setProgress(timePassed++);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        background.start();
    }
}
