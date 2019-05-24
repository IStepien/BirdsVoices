package com.example.birdsvoices;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {

        if (mediaPlayer!= null) {
            mediaPlayer.release();
            mediaPlayer= null;
        }
        String birdTag = view.getTag().toString();
        Log.i("info", "bird tag: " + birdTag);
        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(birdTag, "raw", getPackageName()));
        mediaPlayer.start();


    }

    public void stop(View view) {
        mediaPlayer.stop();
        Log.i("info", "stoped");
    }
}
