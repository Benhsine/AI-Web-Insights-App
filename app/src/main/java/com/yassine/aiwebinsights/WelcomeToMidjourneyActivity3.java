package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeToMidjourneyActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_midjourney3);
        Button startButton = findViewById(R.id.startmidjourney);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch the MainActivity
                Intent intent = new Intent(WelcomeToMidjourneyActivity3.this, WebView2.class);
                startActivity(intent);
            }
        });
    }
}