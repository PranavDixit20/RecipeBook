package com.example.pranav.recipebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Pranav on 01-08-2016.
 */
public class Beef  extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;
    Processs p;
    Bundle b;
    Intent in;
    DataBase db;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beef);
        {
            AdView adView = new AdView(this);
            adView = (AdView)findViewById(R.id.ad);
            AdRequest ar=new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            adView.loadAd(ar);

            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.beef);

        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        db = new DataBase(this);
        p = new Processs();
        cat = parent.getItemAtPosition(position).toString();
        Log.d("ok",cat);
        a=cat;

        in = new Intent(this,Processs.class);
        b = new Bundle();
        b.putString("name",cat);
        in.putExtras(b);
        startActivity(in);
    }
}
