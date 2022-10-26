package com.paul.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderRadioButton;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = findViewById(R.id.radioGroup_id);

        submitButton = findViewById(R.id.submitBtn_id);

        resultTextView = findViewById(R.id.resultTextView_id);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = radioGroup.getCheckedRadioButtonId();
               genderRadioButton = findViewById(selectedID);

               String value = genderRadioButton.getText().toString();

               resultTextView.setText("You have selected : "+value);
            }
        });
    }
}