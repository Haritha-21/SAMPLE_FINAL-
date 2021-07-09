package com.example.shimmerrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.ViewHolder> {

        // creating a variable for array list and context.
        private ArrayList<CourseModal> courseModalArrayList;

        public CourseRVAdapter(ArrayList<CourseModal> courseModalArrayList, Context context) {
            this.courseModalArrayList = courseModalArrayList;
            this.context = context;
        }

        private Context context;

        @NonNull
        @Override
        public CourseRVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            // below line is to inflate our layout.
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_item, parent, false);
            return new ViewHolder(view);
        }

    @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            // setting data to our views of recycler view.
            CourseModal modal = courseModalArrayList.get(position);
            holder.courseNameTV.setText(modal.getCourseName());
            holder.courseTracksTV.setText(modal.getCourseTracks());
            holder.courseModeTV.setText(modal.getCourseMode());
            Picasso.get().load(modal.getCourseimg()).into(holder.courseIV);
        }

        @Override
        public int getItemCount() {
            return courseModalArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            // creating variables for our views.
            private TextView courseNameTV, courseModeTV, courseTracksTV;
            private ImageView courseIV;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                // initializing our views with their ids.
                courseNameTV = itemView.findViewById(R.id.idTVCourseName);
                courseModeTV = itemView.findViewById(R.id.idTVBatch);
                courseTracksTV = itemView.findViewById(R.id.idTVTracks);
                courseIV = itemView.findViewById(R.id.idIVCourse);
            }
        }
    }

