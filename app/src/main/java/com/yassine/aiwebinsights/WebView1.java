package com.yassine.aiwebinsights;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.net.NetworkInterface;

public class WebView1 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);
        webView1  = (WebView) findViewById(R.id.webview1);
        webView1.loadUrl("https://chat.openai.com");
        webView1.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView1.getSettings();
        webSettings.setUseWideViewPort(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setDomStorageEnabled(true);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        boolean isWifiConn = false;
        boolean isMobileConn = false;
        for (Network network : connectivityManager.getAllNetworks()){
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI){
                isWifiConn |= networkInfo.isConnected();
            }
            if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE){
                isMobileConn |= networkInfo.isConnected();
            }
        }
        if (!isWifiConn && !isMobileConn){
            Toast toast = Toast.makeText(getApplicationContext(),"YOU ARE NOT CONNECTED",Toast.LENGTH_LONG);
            toast.show();
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView1.canGoBack()){
            webView1.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
