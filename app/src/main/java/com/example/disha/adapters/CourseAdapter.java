package com.example.disha.adapters;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.disha.R;
import com.example.disha.models.Course;

import java.util.List;
public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder>{
    private List<Course> courses;
    private OnCourseClickListener listener;
    private Context context;

    public interface OnCourseClickListener {
        void onCourseClick(Course course);
    }

    public CourseAdapter(List<Course> courses, OnCourseClickListener listener) {
        this.courses = courses;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_course, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Course course = courses.get(position);
        holder.bind(course);
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCourseName;
        private TextView tvDegree;
        private TextView tvDuration;
        private TextView tvDescription;
        private TextView tvEligibility;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCourseName = itemView.findViewById(R.id.tv_course_name);
            tvDegree = itemView.findViewById(R.id.tv_degree);
            tvDuration = itemView.findViewById(R.id.tv_duration);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvEligibility = itemView.findViewById(R.id.tv_eligibility);
        }

        public void bind(Course course) {
            tvCourseName.setText(course.getCourseName());
            tvDegree.setText(course.getDegree());
            tvDuration.setText(course.getDuration());
            tvDescription.setText(course.getDescription());

            if (course.getEligibility() != null && !course.getEligibility().isEmpty()) {
                tvEligibility.setText("Eligibility: " + course.getEligibility());
                tvEligibility.setVisibility(View.VISIBLE);
            } else {
                tvEligibility.setVisibility(View.GONE);
            }

            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onCourseClick(course);
                }
            });
        }
    }
}
