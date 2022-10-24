package com.paul.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button loginButton, logOutButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtnID);
        logOutButton = findViewById(R.id.logOutBtnID);
        textView = findViewById(R.id.textViewID);

        Handler handler = new Handler();

        loginButton.setOnClickListener(handler);
        logOutButton.setOnClickListener(handler);


    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            if (v.getId()==R.id.loginBtnID){
                textView.setText("Log In button is clicked ");
            } else if (v.getId()==R.id.logOutBtnID){
                textView.setText("Log Out button is clicked ");
            }

        }
    }


}