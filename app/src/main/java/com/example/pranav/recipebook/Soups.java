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
public class Soups extends Activity implements AdapterView.OnItemClickListener {

    ListView lv;
    String cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soups);
        {
            lv=(ListView)findViewById(R.id.lv);
            lv.setOnItemClickListener(this);


            ArrayAdapter<String> adpt = new ArrayAdapter<String>(this,R.layout.soups);

        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
       cat = parent.getItemAtPosition(position).toString();
        switch (cat)
        {
            case "Non-Veg" :
                startActivity(new Intent(this,Soupnon.class));
                break;

            case "Veg" :
                startActivity(new Intent(this,Soupveg.class));
                break;
        }
    }
}

