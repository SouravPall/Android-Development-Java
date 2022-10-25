package com.paul.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addButton,subButton,productButton,divisionButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextID1);
        editText2 = findViewById(R.id.editTextID2);

        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);
        productButton = findViewById(R.id.productButtonId);
        divisionButton = findViewById(R.id.divisionButtonId);

        resultTextView = findViewById(R.id.resultTextViewID);


        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        productButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

       try {
           String number1 = editText1.getText().toString();
           String number2 = editText2.getText().toString();

           //converting into double
           double num1 = Double.parseDouble(number1);
           double num2 = Double.parseDouble(number2);

           if (v.getId()==R.id.addButtonId){

               double sum = num1 + num2;
               resultTextView.setText("Result : " + sum);
           }else if (v.getId() == R.id.subButtonId){
               double sub = num1-num2;
               resultTextView.setText("Result : "+sub);
           }else if (v.getId() == R.id.productButtonId){
               double product = num1 * num2;
               resultTextView.setText("Result: "+product);
           }else {
               double division = num1 / num2;
               resultTextView.setText("Result: "+division);
           }

       }catch (Exception e){
           Toast.makeText(this, "Please input numbers", Toast.LENGTH_SHORT).show();
       }

    }
}