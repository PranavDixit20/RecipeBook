package com.adservices.recipick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Pranav on 29-07-2016.
 */
public class Desserts extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts);
        {
            MobileAds.initialize(getApplicationContext(), "ca-app-pub-3715652664770345/1938033915");
            AdView adView = new AdView(this);
            adView = (AdView)findViewById(R.id.ad);
            AdRequest ar=new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adView.loadAd(ar);

            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.desserts);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {
            case "Cakes" :
                startActivity(new Intent(this,Cakes.class));
                break;

            case "Ice Cream" :
                startActivity(new Intent(this,Ice_Cream.class));
                break;

            case "Payasam" :
                startActivity(new Intent(this,Payasam.class));
                break;

            case "Pies" :
                startActivity(new Intent(this,Pies.class));
                break;

            case "Pudding" :
                startActivity(new Intent(this,Pudding.class));
                break;

            case "Souffles" :
                startActivity(new Intent(this,Souffles.class));
                break;

            case "Sweets" :
                startActivity(new Intent(this,Sweet.class));
                break;
        }
    }
}

