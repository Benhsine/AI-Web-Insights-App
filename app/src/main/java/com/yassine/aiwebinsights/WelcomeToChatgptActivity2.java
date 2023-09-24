package com.yassine.aiwebinsights;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class WelcomeToChatgptActivity2 extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private static final String TAG = "WelcomeToChatgptActivity2"; // Define TAG

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_chatgpt2);




        // AdMob interstitial ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, getString(R.string.interadmob), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                        // You can add an ad listener to handle the close button click
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // The user closed the ad, navigate to MainActivity
                                Intent intent = new Intent(WelcomeToChatgptActivity2.this, WebView1.class);
                                startActivity(intent);
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });
        Button startButton = findViewById(R.id.startchatgpt);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mInterstitialAd != null) {
                    // Show the interstitial ad if it's loaded
                    mInterstitialAd.show(WelcomeToChatgptActivity2.this);
                } else {
                    Log.d(TAG, "The interstitial ad wasn't ready yet.");
                    // If the ad is not ready, proceed to launch the MainActivity
                    Intent intent = new Intent(WelcomeToChatgptActivity2.this, WebView1.class);
                    startActivity(intent);
                }
            }
        });
    }
}