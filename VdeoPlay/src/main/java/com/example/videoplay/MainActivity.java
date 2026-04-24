package com.example.videoplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView animal = findViewById(R.id.animalVideo);
        animal.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.clip);
        MediaController mediacontroller = new MediaController(this);
        animal.setMediaController(mediacontroller);
        mediacontroller.setAnchorView(animal);
        animal.start();
    }
}