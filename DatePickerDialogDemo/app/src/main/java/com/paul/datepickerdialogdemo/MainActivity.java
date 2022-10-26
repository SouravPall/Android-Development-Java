package com.paul.datepickerdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_id);
        button = findViewById(R.id.btn_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePicker datePicker = new DatePicker(MainActivity.this);
                int currentDay = datePicker.getDayOfMonth();
                int currentMonth = (datePicker.getMonth()) + 1;
                int currentYear = datePicker.getYear();


                datePickerDialog = new DatePickerDialog(MainActivity.this,

                        new DatePickerDialog.OnDateSetListener(){

                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                                textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                            }
                        },currentYear,currentMonth,currentDay);
                datePickerDialog.show();
            }

        });
    }
}