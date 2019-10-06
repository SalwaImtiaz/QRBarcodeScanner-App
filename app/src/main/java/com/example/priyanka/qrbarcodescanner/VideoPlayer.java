package com.example.priyanka.qrbarcodescanner;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {
    Intent intent;
    Uri uri ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_videoplayer );
        VideoView videoView = (VideoView) findViewById(R.id.video);
//        Bundle extras = intent.getExtras();
//        String tmp = extras.getString("myKey");

        Bundle bundle = getIntent().getExtras();
        String temp = bundle.getString("key1");

        Log.i("temp",temp);
        Log.i("temp_low",temp.toLowerCase ());


        String fileplace = "android.resource://"+ getPackageName()+"/raw/" + temp.toLowerCase ();

        videoView.setVideoURI ( Uri.parse ( fileplace ) );

//        videoView.setOnPreparedListener ( new MediaPlayer.OnPreparedListener () {
//            @Override
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                mediaPlayer.setLooping ( true );
//            }
//        } );
        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        mediaController.setAnchorView(videoView);


//        if(temp == "lam")
//        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lam);
//        else
//        if(temp == "lfm")
//            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lfm);
//        else if(temp == "lhstb")
//            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lhstb);
//        else if(temp == "llm")
//            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.llm);
//        else if(temp == "lwm")
//            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lwm);
        // else
        //print not found.
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
        videoView.start();
    }
}

