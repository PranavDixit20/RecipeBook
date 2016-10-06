package com.adservices.recipick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Pranav on 19-08-2016.
 */
public class Search extends Activity implements AdapterView.OnItemClickListener {
    ListView lv;
    EditText et;
    ArrayAdapter<String> adpt;
    String cat;
    Processs p;
    Bundle b;
    Intent in;
    DataBase db;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        lv=(ListView)findViewById(R.id.lv);
        et = (EditText)findViewById(R.id.serc);
        lv.setOnItemClickListener(this);
        String[] l = getResources().getStringArray(R.array.Allrecipe);
        adpt = new ArrayAdapter<String>(this,R.layout.list_item,R.id.product_name,l);
        lv.setAdapter(adpt);

        et.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                Search.this.adpt.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

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
