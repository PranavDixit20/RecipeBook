package com.example.pranav.recipebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Pranav on 29-07-2016.
 */
public class Drinks extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink);
        {
            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.soup);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {
            case "Cocktails" :
                startActivity(new Intent(this,Cocktails.class));
                break;

            case "Mocktails" :
                startActivity(new Intent(this,Mocktails.class));
                break;

            case "Smoothies" :
                startActivity(new Intent(this,Smoothies.class));
                break;
        }
    }
}