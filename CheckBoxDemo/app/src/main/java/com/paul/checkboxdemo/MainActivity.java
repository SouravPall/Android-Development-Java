package com.paul.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1,checkBox2,checkBox3;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox_id1);
        checkBox2 = findViewById(R.id.checkbox_id2);
        checkBox3 = findViewById(R.id.checkbox_id3);

        submitButton = findViewById(R.id.submitButton_id);

        resultTextView = findViewById(R.id.resultTextView_id);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (checkBox1.isChecked()){
                    String value = checkBox1.getText().toString();
                    stringBuilder.append(value + " "+ " is ordered."+"\n");
                }
                if (checkBox2.isChecked()){
                    String value = checkBox2.getText().toString();
                    stringBuilder.append(value + " "+ " is ordered."+"\n");
                }
                if (checkBox3.isChecked()){
                    String value = checkBox3.getText().toString();
                    stringBuilder.append(value + " "+ " is ordered."+"\n");
                }

                resultTextView.setText(stringBuilder);
            }
        });
    }
}