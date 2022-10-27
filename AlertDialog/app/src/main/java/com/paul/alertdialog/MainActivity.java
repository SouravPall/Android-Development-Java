package com.paul.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitButton = findViewById(R.id.button_id);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //for setting Title
        alertDialogBuilder.setTitle(R.string.title_text);

        //for setting message
        alertDialogBuilder.setMessage(R.string.message_text);

        //for setting Icon
        alertDialogBuilder.setIcon(R.drawable.warning);

        alertDialogBuilder.setCancelable(false);

        //for setting Positive Button
       alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               //exit
               finish();
           }
       });
        //for setting Negative Button
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        //for setting Neutral Button
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

       AlertDialog alertDialog = alertDialogBuilder.create();
       alertDialog.show();



    }
}