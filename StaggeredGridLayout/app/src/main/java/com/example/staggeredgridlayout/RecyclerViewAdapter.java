package com.example.staggeredgridlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{

    ArrayList<Integer> Image;
    Context context;

    public RecyclerViewAdapter(ArrayList<Integer> image, Context context) {
        Image = image;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
        viewHolder.imgview.setImageResource(Image.get(i));

    }

    @Override
    public int getItemCount() {
        return Image.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgview;
        public ViewHolder(View itemView) {
            super(itemView);

            // getting ImageView reference
            imgview = (ImageView) itemView.findViewById(R.id.imgView);
        }
    }
}