package com.example.birdsvoices;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void play(View view) {

        int bird = Integer.parseInt((String) view.getTag());
        Log.i("info","bird tag: "+bird );
        switch (bird){
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.bazant);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.dzwoniec);
                mediaPlayer.start();
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.gil);
                mediaPlayer.start();
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.kos);
                mediaPlayer.start();
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.kwiczol);
                mediaPlayer.start();
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.puszczyk);
                mediaPlayer.start();
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.slowik_szary);
                mediaPlayer.start();
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.wrobel);
                mediaPlayer.start();
                break;
        }


    }
}
