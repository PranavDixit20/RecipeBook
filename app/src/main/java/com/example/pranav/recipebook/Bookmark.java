package com.example.pranav.recipebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bookmark extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;
    Processs p;
    Bundle b;
    Intent in;
    DataBase db;
    String a;
    String pr[],e[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

        lv=(ListView)findViewById(R.id.lv);

            db=new DataBase(this);

       String pr2[] =new String[10];
            pr2=db.cheak();


        ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.list_item,R.id.product_name,pr2);
        lv.setAdapter(adpt);
        Log.d("adapter","done");
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

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
}
