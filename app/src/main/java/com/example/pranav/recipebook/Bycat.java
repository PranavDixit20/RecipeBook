package com.example.pranav.recipebook;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pranav on 25-07-2016.
 */
public class Bycat extends Activity implements View.OnClickListener
{
        TextView im,im2,im3,im4,im5,im6,im7;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bycat);

        im = (TextView) findViewById(R.id.tv);
        im2 = (TextView) findViewById(R.id.tv1);
        im3 = (TextView) findViewById(R.id.tv2);
        im4 = (TextView) findViewById(R.id.tv3);
        im5 = (TextView) findViewById(R.id.tv4);
        im6 = (TextView) findViewById(R.id.tv5);
        im7 = (TextView) findViewById(R.id.tv6);

        im.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        im6.setOnClickListener(this);
        im7.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        switch(v.getId()) {
            case R.id.tv:
                    startActivity(new Intent(this,Beverage.class));
                break;

            case R.id.tv1:
                break;

            case R.id.tv2:
                break;

            case R.id.tv3:
                 break;

            case R.id.tv4:
                 break;

            case R.id.tv5:
                 break;

            case R.id.tv6:
                break;
        }

        }

}
