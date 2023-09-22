package com.yassine.aiwebinsights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;


public class MainActivity extends AppCompatActivity {


    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton button10;
    ImageButton button11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        button1 = (android.widget.ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToChatgptActivity2.class);
            startActivity(intent);
        });
        button2 = (android.widget.ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToMidjourneyActivity3.class);
            startActivity(intent);
        });
        button3 = (android.widget.ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToBingActivity4.class);
            startActivity(intent);
        });
        button4 = (android.widget.ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToBardActivity5.class);
            startActivity(intent);
        });
        button5 = (android.widget.ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToMicroDesignerActivity6.class);
            startActivity(intent);
        });
        button6 = (android.widget.ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToIdeogramActivity7.class);
            startActivity(intent);
        });
        button7 = (android.widget.ImageButton) findViewById(R.id.button7);
        button7.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToClaudeAiActivity8.class);
            startActivity(intent);
        });
        button8 = (android.widget.ImageButton) findViewById(R.id.button8);
        button8.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToStabiliyaiActivity.class);
            startActivity(intent);
        });
        button9 = (android.widget.ImageButton) findViewById(R.id.button9);
        button9.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToRunwayActivity9.class);
            startActivity(intent);
        });
        button10 = (android.widget.ImageButton) findViewById(R.id.button10);
        button10.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToStableDiffusionActivity10.class);
            startActivity(intent);
        });
        button11 = (android.widget.ImageButton) findViewById(R.id.button11);
        button11.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WelcomeToSunoActivity11.class);
            startActivity(intent);
        });


    }
    @Override
    public void onBackPressed() {
        // Handle back key press to exit the app
        finish();
    }

}