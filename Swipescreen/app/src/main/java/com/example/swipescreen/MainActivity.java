package com.example.swipescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cuberto.liquid_swipe.LiquidPager;

public class MainActivity extends AppCompatActivity {

    LiquidPager pager;
    viewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);

        viewPager = new viewPager(getSupportFragmentManager(), 1);
        pager.setAdapter(viewPager);
    }
}