package com.example.pranav.recipebook;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv, tv1,tv2,tv3;
    DataBase db;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.allrec);
        tv1 = (TextView) findViewById(R.id.bycate);
        tv2 = (TextView) findViewById(R.id.ser);
        tv3 = (TextView) findViewById(R.id.about);

        tv.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);

        db = new DataBase(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.allrec:
                startActivity(new Intent(this, AllRecipe.class));
                break;
            case R.id.bycate:
                startActivity(new Intent(this, Bycat.class));
                break;

            case R.id.ser:
                startActivity(new Intent(this, Search.class));
                break;

            case R.id.about:
                startActivity(new Intent(this, About.class));
                break;
        }

    }

}