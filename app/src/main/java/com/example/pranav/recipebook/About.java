package com.example.pranav.recipebook;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pranav on 20-08-2016.
 */
public class About extends Activity implements View.OnClickListener {

    TextView tv,tv1,tv2;
    ImageView im1,im2;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        tv = (TextView) findViewById(R.id.web);
        tv1 = (TextView)findViewById(R.id.num);
        tv2 = (TextView)findViewById(R.id.numm);

        im1 = (ImageView) findViewById(R.id.fb);
        im2 = (ImageView) findViewById(R.id.tw);

        tv.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);

        im1.setOnClickListener(this);
        im2.setOnClickListener(this);

        wv = (WebView) findViewById(R.id.webvv);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.num :
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +1 604 704 8811"));
                startActivity(intent);
                break;

            case R.id.numm :
                Intent in = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: +918888058537"));
                startActivity(in);
                break;
        }

        switch (v.getId()) {
            case R.id.web:
                wv.loadUrl("http://www.adservices.in/");
                break;

            case R.id.fb:

                wv.loadUrl("https://www.facebook.com/adservices.in/");
                break;

            case R.id.tw:

                wv.loadUrl("https://twitter.com/ADservicesamaze/");
                break;
        }

    }

}
