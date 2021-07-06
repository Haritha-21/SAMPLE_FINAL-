package com.example.shimmereffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    ShimmerFrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        // Button 1 to start Shimmer Effect
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If auto-start is set to false
                container.startShimmer();
            }
        });

        // Button 2 to stop Shimmer Effect
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If auto-start is set to false
                container.stopShimmer();
            }
        });

        // Shimmer effect
        container = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
    }
    }
