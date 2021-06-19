package com.example.recyclerviewcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<exampleitem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageview);
            mTextView1=itemView.findViewById(R.id.tv1);
            mTextView2=itemView.findViewById(R.id.tv2);
        }
    }

    public ExampleAdapter(ArrayList<exampleitem> examplelist ){
        mExampleList=examplelist;

    }

    @Override
    public ExampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
       ExampleViewHolder evh =new ExampleViewHolder(v);
       return evh;
    }

    @Override
    public void onBindViewHolder(ExampleAdapter.ExampleViewHolder holder, int position) {
        exampleitem currentItem = mExampleList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResources());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}