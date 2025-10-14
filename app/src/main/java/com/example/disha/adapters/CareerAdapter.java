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
import com.example.disha.models.Career;

import java.util.List;

import com.example.disha.models.Career;

public class CareerAdapter extends RecyclerView.Adapter<CareerAdapter.ViewHolder> {
    private List<Career> careers;
    private OnCareerClickListener listener;
    private Context context;

    public interface OnCareerClickListener {
        void onCareerClick(Career career);
    }

    public CareerAdapter(List<Career> careers, OnCareerClickListener listener) {
        this.careers = careers;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_career, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Career career = careers.get(position);
        holder.bind(career);
    }

    @Override
    public int getItemCount() {
        return careers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCareerName;
        private TextView tvCareerCategory;
        private TextView tvSalary;
        private TextView tvCareerDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCareerName = itemView.findViewById(R.id.tv_career_name);
            tvCareerCategory = itemView.findViewById(R.id.tv_career_category);
            tvSalary = itemView.findViewById(R.id.tv_salary);
            tvCareerDescription = itemView.findViewById(R.id.tv_career_description);
        }

        public void bind(Career career) {
            tvCareerName.setText(career.getCareerName());
            tvSalary.setText(career.getSalaryRange());
            tvCareerDescription.setText(career.getDescription());

            // Determine category based on career name
            String category = determineCategoryFromCareer(career.getCareerName());
            tvCareerCategory.setText(category);

            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onCareerClick(career);
                }
            });
        }

        private String determineCategoryFromCareer(String careerName) {
            String lower = careerName.toLowerCase();
            if (lower.contains("software") || lower.contains("developer") ||
                    lower.contains("engineer") || lower.contains("technology")) {
                return "Technology";
            } else if (lower.contains("doctor") || lower.contains("medical") ||
                    lower.contains("health") || lower.contains("nurse")) {
                return "Healthcare";
            } else if (lower.contains("business") || lower.contains("manager") ||
                    lower.contains("analyst") || lower.contains("finance")) {
                return "Business";
            } else if (lower.contains("design") || lower.contains("art") ||
                    lower.contains("creative")) {
                return "Arts";
            } else {
                return "General";
            }
        }
    }

}
