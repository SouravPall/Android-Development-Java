package com.paul.intentdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView = findViewById(R.id.textView_id);

        Bundle bundle = getIntent().getExtras();


        if(bundle!= null){
          String value = bundle.getString("tag");
          textView.setText(value);
            textView.setTextColor(Color.parseColor("#FFFFFF"));

        }



    }
}