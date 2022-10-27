package com.paul.clockdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextClock textClock;
    private AnalogClock analogClock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textClock = findViewById(R.id.textClock_id);
        analogClock = findViewById(R.id.analogClock_id);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.analogClock_id){
            Toast.makeText(this, "Analog Clock", Toast.LENGTH_SHORT).show();
        }if (v.getId() == R.id.textClock_id){
            Toast.makeText(this, "Text Clock", Toast.LENGTH_SHORT).show();
        }
    }
}