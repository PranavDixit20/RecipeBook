package com.example.pranav.recipebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * Created by Pranav on 27-07-2016.
 */
public class splashscr extends AppCompatActivity {
    int time = 10000;
    boolean mbActive;
    ProgressBar pb;
    splashscr sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

         pb= (ProgressBar)findViewById(R.id.splashbar);

        final Thread timerThread = new Thread()
        {
            @Override
                    public void run()
            {
                mbActive = true;
                try{
                    int waited = 0;
                    while (mbActive && (waited < time)){
                        sleep(200);
                        if(mbActive){
                            waited += 200;
                            updateProgress(waited);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    onContinue();
                }
            }

        };
        timerThread.start();

    }
    private void updateProgress(int timePassed) {
        if (null != pb){
            final int Progress = pb.getMax()*timePassed/ time;
            pb.setProgress(Progress);
        }
    }

    private void onContinue() {
        Log.d("bar is final","work is done");
        startapp();
    }

    private void startapp(){
        startActivity(new Intent(this,MainActivity.class));
    }

}


