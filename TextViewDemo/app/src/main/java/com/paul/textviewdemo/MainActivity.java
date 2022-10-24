package com.paul.textviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView nameTextView2;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.nameTextViewID);
        nameTextView.setText("Sonjoy Paul");

        nameTextView2 = findViewById(R.id.nickNameTextViewID);
        nameTextView2.setText("(Sourav Paul)");

        ageTextView = findViewById(R.id.ageTextViewID);
        ageTextView.setText("25+ years old");

    }
}