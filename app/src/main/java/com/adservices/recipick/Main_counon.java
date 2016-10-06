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

/**
 * Created by Pranav on 01-08-2016.
 */
public class Main_counon extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnon);
        {
            AdView adView = new AdView(this);
            adView = (AdView)findViewById(R.id.ad);
            AdRequest ar=new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adView.loadAd(ar);

            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.mainnon);

        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {
            case "Beef" :
                startActivity(new Intent(this,Beef.class));
                break;

            case "Chicken" :
                startActivity(new Intent(this,Chicken.class));
                break;

            case "Egg" :
                startActivity(new Intent(this,Egg.class));
                break;

            case "Rice" :
                startActivity(new Intent(this,Rice.class));
                break;

            case "Seafood" :
                startActivity(new Intent(this,Seafood.class));
                break;

            case "Mutton" :
                startActivity(new Intent(this,Mutton.class));
                break;
        }
    }
}
