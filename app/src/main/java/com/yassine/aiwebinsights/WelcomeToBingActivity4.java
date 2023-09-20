package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeToBingActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_bing4);
        Button startButton = findViewById(R.id.startbing);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch the MainActivity
                Intent intent = new Intent(WelcomeToBingActivity4.this, WebView3.class);
                startActivity(intent);
            }
        });
    }
}