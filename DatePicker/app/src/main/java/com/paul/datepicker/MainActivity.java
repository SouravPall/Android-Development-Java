package com.paul.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView currentTextView;
    private Button selectButton;
    private DatePicker datePicker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        currentTextView = findViewById(R.id.currentDate_id);
        selectButton = findViewById(R.id.Btn_id);
        datePicker = findViewById(R.id.date_picker_id);


        currentTextView.setText(currentDate());

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentTextView.setText(currentDate());

            }
        });

    }

    String currentDate(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current Date: ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+ 1 +"/");   // .getMonth(): count start from '0' that's why we add '+1'
        stringBuilder.append(datePicker.getYear());

       return stringBuilder.toString();

    }
}