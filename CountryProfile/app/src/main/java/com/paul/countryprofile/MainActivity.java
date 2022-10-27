package com.paul.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bdButton,ukButton,indiaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = findViewById(R.id.buttonBD_id);
        ukButton = findViewById(R.id.buttonUk_id);
        indiaButton = findViewById(R.id.buttonIndia_id);

    }
}