package com.adservices.recipick;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv, tv1,tv2,tv3,tv4;
    DataBase db;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3715652664770345/1938033915");

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView = (AdView)findViewById(R.id.ad);

        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);


        tv = (TextView) findViewById(R.id.allrec);
        tv1 = (TextView) findViewById(R.id.bycate);
        tv2 = (TextView) findViewById(R.id.ser);
        tv3 = (TextView) findViewById(R.id.about);
        tv4 = (TextView) findViewById(R.id.sa);

        tv.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);

        db = new DataBase(this);
        db.bookMarkTable();
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.allrec:
                startActivity(new Intent(this, AllRecipe.class));
                break;
            case R.id.bycate:
                startActivity(new Intent(this, Bycat.class));
                break;

            case R.id.ser:
                startActivity(new Intent(this, Search.class));
                break;

            case R.id.about:
                startActivity(new Intent(this, About.class));
                break;

            case R.id.sa:
                startActivity(new Intent(this, Bookmark.class));
                break;
        }

    }

}