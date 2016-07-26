package com.example.pranav.recipebook;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Pranav on 22-07-2016.
 */
public class Beverage extends Activity

{
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beverage);
    }
}

