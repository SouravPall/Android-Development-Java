package com.paul.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        imageView = findViewById(R.id.imageview_id);
        textView = findViewById(R.id.textView_id);
        
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            
            String countryName = bundle.getString("name");
            
            showDetails(countryName);
        }
    }

     void showDetails(String countryName) {

        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.parliament);
            textView.setText(R.string.bd_text);
        }
        if (countryName.equals("U.K")){
            imageView.setImageResource(R.drawable.uk);
            textView.setText(R.string.uk_text);
        }
        if (countryName.equals("India")){
            imageView.setImageResource(R.drawable.indiaf);
            textView.setText(R.string.india_text);
        }
    }


}