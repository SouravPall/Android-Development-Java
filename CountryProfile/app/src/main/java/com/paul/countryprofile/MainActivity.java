package com.paul.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bdButton,ukButton,indiaButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = findViewById(R.id.buttonBD_id);
        ukButton = findViewById(R.id.buttonUk_id);
        indiaButton = findViewById(R.id.buttonIndia_id);

        bdButton.setOnClickListener(this);
        ukButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.buttonBD_id){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.buttonUk_id){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","U.K");
            startActivity(intent);
        }
        if (v.getId()==R.id.buttonIndia_id){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.warning);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}