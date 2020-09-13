package com.example.apitest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Skapar klassen som kör en request
        HTTPRequestTask testTask = new HTTPRequestTask();

        //Kallar rent krasst på doInBackground-funktionen
        testTask.execute();


    }

}