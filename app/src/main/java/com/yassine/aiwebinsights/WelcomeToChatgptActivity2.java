package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeToChatgptActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_chatgpt2);
        Button startButton = findViewById(R.id.startchatgpt);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch the MainActivity
                Intent intent = new Intent(WelcomeToChatgptActivity2.this, WebView1.class);
                startActivity(intent);
            }
        });
    }
}