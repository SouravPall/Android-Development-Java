package com.paul.myfontdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1, textView2;
    private Typeface typeface1, typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1_id);
        textView2 = findViewById(R.id.textView2_id);

        typeface1 = Typeface.createFromAsset(getAssets(),"Fonts/Rubik_Bold.ttf");
        textView1.setTypeface(typeface1);


        typeface2 = Typeface.createFromAsset(getAssets(),"Fonts/Rubik_Italic.ttf");
        textView2.setTypeface(typeface2);
    }
}