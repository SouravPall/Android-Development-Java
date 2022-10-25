package com.paul.jsondataparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.StudentInfoID);

        JsonTask jsonTask = new JsonTask();
        jsonTask.execute();

    }

    public class JsonTask extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... strings) {

            HttpURLConnection httpURLConnection = null;
            BufferedReader bufferedReader = null;

            try {
                URL url = new URL("https://myjson.dit.upm.es/api/bins/85xg");

                httpURLConnection = (HttpURLConnection) url.openConnection();

                InputStream inputStream = httpURLConnection.getInputStream();

                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                String line = " ";

                while ((line=bufferedReader.readLine()) != null){

                    stringBuffer.append(line);
                }
                return  stringBuffer.toString();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                httpURLConnection.disconnect();
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}