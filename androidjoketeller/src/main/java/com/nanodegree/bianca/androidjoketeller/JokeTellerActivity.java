package com.nanodegree.bianca.androidjoketeller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);

        TextView view = findViewById(R.id.tv_joke);

        if (getIntent().getStringExtra("joke") != null) {
            view.setText(getIntent().getStringExtra("joke"));
        }
    }
}
