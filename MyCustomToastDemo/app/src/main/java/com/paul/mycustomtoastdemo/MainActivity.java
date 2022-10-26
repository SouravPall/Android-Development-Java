package com.paul.mycustomtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginId);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();

               View customView = inflater.inflate(R.layout.customtoast_layout, findViewById(R.id.customToast_ID));

                Toast toast = new Toast(MainActivity.this);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM,0,0);
                toast.setView(customView);
                toast.show();
            }
        });

    }
}