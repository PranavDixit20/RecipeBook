package com.example.pranav.recipebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Pranav on 22-07-2016.
 */
public class Beverage extends Activity implements AdapterView.OnItemClickListener

{
    ListView lv;
    String cat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beverage);
        {
            AdView adView = new AdView(this);
            adView = (AdView)findViewById(R.id.ad);
            AdRequest ar=new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adView.loadAd(ar);

            lv = (ListView) findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, R.layout.soup);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {
            case "Fresh Juice" :
                startActivity(new Intent(this,Juice.class));
                break;

            case "Shakes" :
                startActivity(new Intent(this,Shakes.class));
                break;
        }
    }
}

