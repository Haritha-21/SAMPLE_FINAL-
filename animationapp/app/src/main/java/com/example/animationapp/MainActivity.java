package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnrclock;
    private Button btnrantick;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnrclock = (Button) findViewById(R.id.btnRClk);
        btnrantick = (Button) findViewById(R.id.btnRAClk);
        img = (ImageView) findViewById(R.id.imgvw);
        btnrclock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation aniRotateClk = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
                img.startAnimation(aniRotateClk);
            }
        });
        btnrantick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animRotateAclk = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
                img.startAnimation(animRotateAclk);
            }
        });
    }

    public void startZoomInAnimation(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imgvw);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
        imageView.startAnimation(animation);
    }

    public void startZoomOutAnimation(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imgvw);
        Animation animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        img.startAnimation(animZoomOut);
    }
}

