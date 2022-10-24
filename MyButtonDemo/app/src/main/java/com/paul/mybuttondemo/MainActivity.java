package com.paul.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginButton, logOutButton;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtnID);
        logOutButton = findViewById(R.id.logOutBtnID);
        textView = findViewById(R.id.textViewID);


        loginButton.setOnClickListener(this);
        logOutButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.loginBtnID){
            textView.setText("LogIn button is clicked ");
        }else
        textView.setText("LogOut button is clicked ");
    }
}