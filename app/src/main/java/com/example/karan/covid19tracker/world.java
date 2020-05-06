package com.example.karan.covid19tracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class world extends Activity {
    private WebView myWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);
        myWeb =(WebView)findViewById(R.id.webView);
        WebSettings webSettings=myWeb.getSettings();
        WebSettings settings = myWeb.getSettings();
        settings.setDomStorageEnabled(true);

        webSettings.setJavaScriptEnabled(true);
//        myWeb.loadUrl("https://www.covid19india.org/");
        myWeb.loadUrl("https://www.worldometers.info/coronavirus/");
        myWeb.setWebViewClient(new WebViewClient());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
