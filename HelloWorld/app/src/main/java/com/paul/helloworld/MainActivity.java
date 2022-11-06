package com.paul.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onBtnClick(View view) {

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText_name_id);
        textView.setText("Name: "+ editText.getText().toString());

    }
}