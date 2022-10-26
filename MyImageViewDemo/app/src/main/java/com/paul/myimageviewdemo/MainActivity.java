package com.paul.myimageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1, imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageViewID1);
        imageView2 = findViewById(R.id.imageViewID2);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.imageViewID1){

            Toast.makeText(this, "Playing a dog with ball", Toast.LENGTH_SHORT).show();

        }else if (v.getId()==R.id.imageViewID2){

            Toast.makeText(this, "A dog run in the road", Toast.LENGTH_SHORT).show();
        }

    }
}