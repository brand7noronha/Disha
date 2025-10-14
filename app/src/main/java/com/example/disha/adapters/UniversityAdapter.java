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
import com.example.disha.models.University;

import java.util.List;
public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.ViewHolder>{
    private List<University> universities;
    private OnUniversityClickListener listener;
    private Context context;

    public interface OnUniversityClickListener {
        void onUniversityClick(University university);
    }

    public UniversityAdapter(List<University> universities, OnUniversityClickListener listener) {
        this.universities = universities;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_university, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        University university = universities.get(position);
        holder.bind(university);
    }

    @Override
    public int getItemCount() {
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvUniversityName;
        private TextView tvLocation;
        private TextView tvRating;
        private TextView tvType;
        private TextView tvCoursesCount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUniversityName = itemView.findViewById(R.id.tv_university_name);
            tvLocation = itemView.findViewById(R.id.tv_location);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvType = itemView.findViewById(R.id.tv_type);
            tvCoursesCount = itemView.findViewById(R.id.tv_courses_count);
        }

        public void bind(University university) {
            tvUniversityName.setText(university.getName());
            tvLocation.setText(university.getLocation());
            tvRating.setText(String.format("%.1f", university.getRating()));
            tvType.setText(university.getType());

            int courseCount = university.getCourses().size();
            tvCoursesCount.setText(courseCount + "+ courses available");

            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onUniversityClick(university);
                }
            });
        }
    }
}
