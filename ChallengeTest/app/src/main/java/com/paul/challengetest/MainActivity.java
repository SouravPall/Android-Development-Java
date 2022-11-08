package com.paul.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstNameTextView = findViewById(R.id.firstName_textView_id);
        TextView lastNameTextView = findViewById(R.id.lastName_textView_id);
        TextView emailTextView = findViewById(R.id.email_textView_id);

        EditText firstName = findViewById(R.id.firstName_id);
        EditText lastName = findViewById(R.id.lastName_id);
        EditText email = findViewById(R.id.email_id);

        Button register = findViewById(R.id.register_id);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNameTextView.setText( "First Name: "+ firstName.getText().toString());
                lastNameTextView.setText( "Last Name: "+ lastName.getText().toString());
                emailTextView.setText( "Email: " + email.getText().toString());
            }
        });
    }
}