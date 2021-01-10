package com.jps.ex_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tV2 = (TextView) findViewById(R.id.tV2);
        tV2.setText("Ιωάννης");
        TextView tV3 = (TextView) findViewById(R.id.tV3);
        tV3.setText("Παπαδόπουλος");
    }
}
