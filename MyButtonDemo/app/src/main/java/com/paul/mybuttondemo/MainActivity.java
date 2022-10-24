package com.paul.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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





    }
    public  void showMessage(View v) {

        if (v.getId() == R.id.loginBtnID) {
            //textView.setText("Login button is clicked");  //textview
            
            
            //Toast
            Toast.makeText(MainActivity.this, "Login button is clicked", Toast.LENGTH_SHORT).show();
        }else{
            //textView.setText("Log out button is clicked"); //textview

            Toast.makeText(this, "Logout button is clicked", Toast.LENGTH_SHORT).show();
        }
    }





}