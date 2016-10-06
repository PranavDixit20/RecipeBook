package com.adservices.recipick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Bookmark extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, PopupMenu.OnMenuItemClickListener {

    ListView lv;
    String cat,mat;
    Processs p;
    Bundle b;
    Intent in;
    DataBase db;
    String a;
    String pr2[] =new String[10];
    String pr[] =new String[10];
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        AdView adView = new AdView(this);
        adView = (AdView)findViewById(R.id.ad);
        AdRequest ar=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(ar);

        lv=(ListView)findViewById(R.id.lv);

        db=new DataBase(this);
        pr2=db.cheak();

        ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.list_item,R.id.product_name,pr2);
        lv.setAdapter(adpt);
        Log.d("adapter","done");
        lv.setOnItemClickListener(this);
        lv.setOnItemLongClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        v = view;

        cat = parent.getItemAtPosition(position).toString();
        db = new DataBase(this);
        p = new Processs();
        cat = parent.getItemAtPosition(position).toString();
        a=cat;

        in = new Intent(this,Processs.class);
        b = new Bundle();
        b.putString("name",cat);
        in.putExtras(b);
        startActivity(in);


    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

        mat = parent.getItemAtPosition(position).toString();

        PopupMenu pop = new PopupMenu(this,view);
        pop.setOnMenuItemClickListener(this);
        pop.getMenuInflater().inflate(R.menu.menufile, pop.getMenu());
        pop.show();
        return true;
    }
    @Override
    public boolean onMenuItemClick(MenuItem item){
            Log.d("function", "ok");

            switch (item.getItemId()) {
                case R.id.remove:
                    db.delete(mat);
                    Toast.makeText(getBaseContext(),mat+" Recipe Is Remove From Bookmark",Toast.LENGTH_LONG).show();
                    pr=db.cheak();
                    ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.list_item,R.id.product_name,pr);
                    lv.setAdapter(adpt);
                    return true;
                default:
                    return false;
            }

    }
}
