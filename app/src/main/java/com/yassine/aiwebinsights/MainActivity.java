package com.yassine.aiwebinsights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;


    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        button1 = (android.widget.ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToChatgptActivity2.class);
                startActivity(intent);
            }
        });
        button2 = (android.widget.ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToMidjourneyActivity3.class);
                startActivity(intent);
            }
        });
        button3 = (android.widget.ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToBingActivity4.class);
                startActivity(intent);
            }
        });
        button4 = (android.widget.ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToBardActivity5.class);
                startActivity(intent);
            }
        });
        button5 = (android.widget.ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToMicroDesignerActivity6.class);
                startActivity(intent);
            }
        });
        button6 = (android.widget.ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToIdeogramActivity7.class);
                startActivity(intent);
            }
        });
        button7 = (android.widget.ImageButton) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToClaudeAiActivity8.class);
                startActivity(intent);
            }
        });
        button8 = (android.widget.ImageButton) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeToWhisperActivity9.class);
                startActivity(intent);
            }
        });





    }
    @Override
    public void onBackPressed() {
        // Handle back key press to exit the app
        finish();
    }
}