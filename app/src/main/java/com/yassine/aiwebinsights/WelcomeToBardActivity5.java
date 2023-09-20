package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeToBardActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_bard5);
        Button startButton = findViewById(R.id.startbard);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch the MainActivity
                Intent intent = new Intent(WelcomeToBardActivity5.this, WebView4.class);
                startActivity(intent);
            }
        });
    }
}