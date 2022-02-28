package com.example.parcial_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ReproductorVideo extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_video);
        Button bVolver8 = (Button)findViewById(R.id.bVolver8);

        bVolver8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(ReproductorVideo.this,Menu.class);
                startActivity(vuelva);
            }
        });

        videoView = (VideoView)findViewById(R.id.videoView);

        String path = "android.resource://"+ getPackageName() + "/" +
                R.raw.video;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}