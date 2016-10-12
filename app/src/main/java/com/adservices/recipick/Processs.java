package com.adservices.recipick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Pranav on 01-08-2016.
 */
public class Processs extends Activity implements View.OnClickListener {
    DataBase db;
    ImageButton t;
    TextView nam,despr,ingr,pros,l1,l2,l3,l4,l5;
    String[] info;
    String n;
    Bundle b;
    Intent in;
    String a;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process);
        db=new DataBase(this);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3715652664770345/1938033915");
        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

            nam = (TextView) findViewById(R.id.recipename);
            despr = (TextView) findViewById(R.id.descr);
            ingr = (TextView) findViewById(R.id.ing);
            pros = (TextView) findViewById(R.id.pro);
            l1 = (TextView)findViewById(R.id.l);
            l2 = (TextView)findViewById(R.id.li);
            l3 = (TextView)findViewById(R.id.lin);
            l4 = (TextView)findViewById(R.id.link);
            l5 = (TextView)findViewById(R.id.linke);

            t = (ImageButton) findViewById(R.id.favorite);
            t.setOnClickListener(this);
            l1.setOnClickListener(this);
            l2.setOnClickListener(this);
            l3.setOnClickListener(this);
            l4.setOnClickListener(this);
            l5.setOnClickListener(this);

        wv = (WebView) findViewById(R.id.webvv);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);

            xyz();

    }

    public void xyz() {

        Bundle b = this.getIntent().getExtras();

        String nm=b.getString("name");
        info = db.show(nm);
        nam.setText(info[0]);
        despr.setText(info[1]);
        ingr.setText(info[2]);
        pros.setText(info[3]);
        l1.setText(info[4]);
        l2.setText(info[5]);
        l3.setText(info[6]);
        l4.setText(info[7]);
        l5.setText(info[8]);

        n=info[0];

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.l:
                wv.loadUrl(info[4]);
                break;

            case R.id.li:

                wv.loadUrl(info[5]);
                break;

            case R.id.lin:

                wv.loadUrl(info[6]);
                break;

            case R.id.link:
                wv.loadUrl(info[7]);
                break;

            case R.id.linke:

                wv.loadUrl(info[8]);
                break;


        }

        switch (v.getId()) {
            case R.id.favorite:
                int i = db.save(n);
                if (i == 1) {
                    Toast.makeText(this, "Your have already save this recipe", Toast.LENGTH_LONG).show();
                    Log.d("ok", n);

                } else {
                    v.setSelected(true);
                    Toast.makeText(this, "Your recipe is save", Toast.LENGTH_LONG).show();
                    Log.d("ok", n);

                }
            break;

        }
    }

}
