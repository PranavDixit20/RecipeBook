package com.example.pranav.recipebook;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pranav on 20-08-2016.
 */
public class About extends Activity implements View.OnClickListener {

    TextView tv;
    ImageView im1;
    Button im;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        tv = (TextView) findViewById(R.id.web);

        im1 = (ImageView) findViewById(R.id.fb);
        im = (Button) findViewById(R.id.call);

        tv.setOnClickListener(this);
        im.setOnClickListener(this);
        im1.setOnClickListener(this);

        wv = (WebView) findViewById(R.id.webvv);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.web:
                wv.loadUrl("http://www.adservices.in/");
                break;

            case R.id.fb:

                wv.loadUrl("https://www.facebook.com/adservices.in/");
                break;

            case R.id.call:
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +918600525761"));
                startActivity(intent);
                break;
        }

    }

}
