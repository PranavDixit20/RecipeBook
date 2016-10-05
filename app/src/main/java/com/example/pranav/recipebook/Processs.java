package com.example.pranav.recipebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Pranav on 01-08-2016.
 */
public class Processs extends Activity implements View.OnClickListener {
    DataBase db;
    ImageButton t;
    TextView nam,despr,ingr,pros;
    String[] info;
    String n;
    Bundle b;
    Intent in;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process);
        db=new DataBase(this);

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

            t = (ImageButton) findViewById(R.id.favorite);
            t.setOnClickListener(this);

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

        n=info[0];

    }


    @Override
    public void onClick(View v) {
        int i = db.save(n);
        if (i==1)
        {
            Toast.makeText(this,"Your have already save this recipe",Toast.LENGTH_LONG).show();
            Log.d("ok",n);

        }
        else
        {
            v.setSelected(true);
            Toast.makeText(this,"Your recipe is save",Toast.LENGTH_LONG).show();
            Log.d("ok",n);

        }

    }

}
