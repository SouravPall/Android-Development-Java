package com.paul.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView listView;

    private String [] countryName;
    private int[] flags = {R.drawable.bangladesh,R.drawable.united_states,
            R.drawable.china,R.drawable.unitedkingdom,R.drawable.germany,
            R.drawable.canada,R.drawable.france,R.drawable.switzerland,
            R.drawable.sweden,R.drawable.australia,R.drawable.denmark};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.country_names);

        listView = findViewById(R.id.listView_id);

        CustomAdapter adapter = new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = countryName[position];

                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}