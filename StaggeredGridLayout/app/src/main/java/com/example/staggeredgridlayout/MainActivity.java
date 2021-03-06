package com.example.staggeredgridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;

    ArrayList<Integer> ImageList;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageList = new ArrayList<>(Arrays.asList(
                R.drawable.k1, R.drawable.k2,
                R.drawable.k3, R.drawable.k4,
                R.drawable.k5, R.drawable.k6,
                R.drawable.k7, R.drawable.k8,
                R.drawable.k9)
        );

        recyclerView = findViewById(R.id.recycleViewStagged);

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(ImageList, this);
        
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}