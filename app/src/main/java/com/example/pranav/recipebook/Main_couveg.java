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
 * Created by Pranav on 01-08-2016.
 */
public class Main_couveg extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainveg);
        {
            AdView adView = new AdView(this);
            adView = (AdView)findViewById(R.id.ad);
            AdRequest ar=new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adView.loadAd(ar);

            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.mainveg);

        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {


            case "Curries" :
                startActivity(new Intent(this,Currie.class));
                break;

            case "Noodles" :
                startActivity(new Intent(this,Noodles.class));
                break;

            case "Other" :
                startActivity(new Intent(this,Other.class));
                break;

            case "Pickles" :
                startActivity(new Intent(this,Pickles.class));
                break;

            case "Rice" :
                startActivity(new Intent(this,Vrice.class));
                break;

            case "Rotis" :
                startActivity(new Intent(this,Roti.class));
                break;

            case "Salads" :
                startActivity(new Intent(this,Salads.class));
                break;
        }
    }
}
