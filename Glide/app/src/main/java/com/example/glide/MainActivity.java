package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.imageview1);
        imageView2=findViewById(R.id.imageview2);


        Glide.with(MainActivity.this)
                .load("https://images.app.goo.gl/pydFswwKfdriyrEx5")
                .placeholder(R.drawable.progress_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imageView1);


        Glide.with(MainActivity.this)
                .load("https://en.wikipedia.org/wiki/File:Peach_flowers.jpg")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);
    }
}