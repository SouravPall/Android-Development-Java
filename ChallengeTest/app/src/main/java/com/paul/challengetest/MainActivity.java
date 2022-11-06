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

        EditText firstName = findViewById(R.id.firstName_id);
        EditText lastName = findViewById(R.id.lastName_id);
        EditText email = findViewById(R.id.email_id);

        Button register = findViewById(R.id.register_id);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView firstNameTextView = findViewById(R.id.firstName_textView_id);
                firstNameTextView.setText( "First Name: "+ firstName.getText());

                TextView lastNameTextView = findViewById(R.id.lastName_textView_id);
                lastNameTextView.setText( "Last Name: "+ lastName.getText());

                TextView emailTextView = findViewById(R.id.email_textView_id);
                emailTextView.setText( "Email: " +email.getText());
            }
        });
    }
}