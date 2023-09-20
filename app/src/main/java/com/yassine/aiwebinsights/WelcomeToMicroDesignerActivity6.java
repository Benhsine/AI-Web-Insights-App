package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeToMicroDesignerActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_microdesigner6);
        Button startButton = findViewById(R.id.startmicrodesigner);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launch the MainActivity
                Intent intent = new Intent(WelcomeToMicroDesignerActivity6.this, WebView5.class);
                startActivity(intent);
            }
        });
    }
}