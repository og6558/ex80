package com.example.ex80;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch swDN;
    LinearLayout dorelosh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        swDN = (Switch) findViewById(R.id.switch1);
        dorelosh = (LinearLayout) findViewById(R.id.dorely);
    }

    public void dorel(View view) {
        if(tb.isChecked() && swDN.isChecked()){
            dorelosh.setBackgroundColor(Color.BLUE);
        }
        if(tb.isChecked() && !swDN.isChecked()){
            dorelosh.setBackgroundColor(Color.RED);

        }
        if(!tb.isChecked() && swDN.isChecked()){
            dorelosh.setBackgroundColor(Color.GREEN);

        }
        if(!tb.isChecked() && !swDN.isChecked()){
            dorelosh.setBackgroundColor(Color.YELLOW);

        }
    }
}