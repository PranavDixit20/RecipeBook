package com.example.pranav.recipebook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Pranav on 01-08-2016.
 */
public class Processs extends Activity {
    DataBase db;

    TextView nam,despr,ingr,pros;
    String[] info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process);
        db=new DataBase(this);

            nam = (TextView) findViewById(R.id.recipename);
            despr = (TextView) findViewById(R.id.descr);
            ingr = (TextView) findViewById(R.id.ing);
            pros = (TextView) findViewById(R.id.pro);

            xyz();

    }

    public void xyz() {

        Bundle b = this.getIntent().getExtras();

        String nm=b.getString("name");
        info = db.show(nm);
        nam.setText(info[0]);
        despr.setText(info[1]);
        ingr.setText(info[2]);
        pros.setText(info[3]);

    }

}
