package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_cityName);
        Button backButton = findViewById((R.id.button_back));

        // Retrieve the city name that we passed via the intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("CITY_NAME");

        cityText.setText(cityName);

        // Return to the last activity
        backButton.setOnClickListener(v -> finish());
    }
}
