package com.example.recyclerviewcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public MainActivity(RecyclerView mRecyclerView, RecyclerView.Adapter mAdapter) {
        this.mRecyclerView = mRecyclerView;
        this.mAdapter = mAdapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<exampleitem>exampleList= new ArrayList<>();
        exampleList.add(new exampleitem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new exampleitem(R.drawable.bluetooth,"Line 3","Line 4"));
        exampleList.add(new exampleitem(R.drawable.adb,"Line 5","Line 6"));

        mRecyclerView=findViewById(R.id.Recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}