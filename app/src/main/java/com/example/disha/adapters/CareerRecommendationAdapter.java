package com.example.disha.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.disha.R;
import com.example.disha.models.CareerRecommendation;

import java.util.List;

public class CareerRecommendationAdapter extends RecyclerView.Adapter<CareerRecommendationAdapter.ViewHolder> {

    private List<CareerRecommendation> recommendations;
    private OnCareerRecommendationClickListener listener;
    private Context context;

    public interface OnCareerRecommendationClickListener {
        void onCareerRecommendationClick(CareerRecommendation recommendation);
    }

    public CareerRecommendationAdapter(List<CareerRecommendation> recommendations,
                                       OnCareerRecommendationClickListener listener) {
        this.recommendations = recommendations;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_career_recommendation, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CareerRecommendation recommendation = recommendations.get(position);
        holder.bind(recommendation);
    }

    @Override
    public int getItemCount() {
        return recommendations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCareerName;
        private TextView tvSalaryRange;
        private TextView tvMatchPercentage;
        private TextView tvCareerDescription;
        private LinearLayout layoutEducationPaths;
        private Button btnLearnMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCareerName = itemView.findViewById(R.id.tv_career_name);
            tvSalaryRange = itemView.findViewById(R.id.tv_salary_range);
            tvMatchPercentage = itemView.findViewById(R.id.tv_match_percentage);
            tvCareerDescription = itemView.findViewById(R.id.tv_career_description);
            layoutEducationPaths = itemView.findViewById(R.id.layout_education_paths);
            btnLearnMore = itemView.findViewById(R.id.btn_learn_more);
        }

        public void bind(CareerRecommendation recommendation) {
            // Set basic career information
            tvCareerName.setText(recommendation.getCareer().getCareerName());
            tvSalaryRange.setText(recommendation.getCareer().getSalaryRange());
            tvCareerDescription.setText(recommendation.getCareer().getDescription());

            // Set match percentage
            int matchPercent = (int) Math.round(recommendation.getMatchPercentage());
            tvMatchPercentage.setText(matchPercent + "%");

            // Add skills chips
            addSkillsChips(recommendation);

            // Add education paths
            addEducationPaths(recommendation);

            // Set click listener for learn more button
            btnLearnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onCareerRecommendationClick(recommendation);
                    }
                }
            });

            // Set click listener for entire card
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onCareerRecommendationClick(recommendation);
                    }
                }
            });
        }

        private void addSkillsChips(CareerRecommendation recommendation) {
            // Note: Since FlexboxLayout might not be available, we'll use a simple horizontal layout
            // You can add FlexboxLayout dependency for better chip layout

            // For now, we'll create a simple text view with comma-separated skills
            TextView skillsText = new TextView(context);
            StringBuilder skills = new StringBuilder();

            for (int i = 0; i < recommendation.getCareer().getRequiredSkills().size(); i++) {
                if (i > 0) skills.append(", ");
                skills.append(recommendation.getCareer().getRequiredSkills().get(i));
            }

            skillsText.setText(skills.toString());
            skillsText.setTextSize(12);
            skillsText.setTextColor(context.getResources().getColor(R.color.primary_color));
            skillsText.setPadding(8, 4, 8, 4);
            skillsText.setBackgroundResource(R.drawable.chip_background);

            // Find the flexbox layout (or create alternative layout)
            // For now, we'll add to a parent layout
            ViewGroup parent = (ViewGroup) itemView.findViewById(R.id.flexbox_skills);
            if (parent != null) {
                parent.removeAllViews();
                parent.addView(skillsText);
            }
        }

        private void addEducationPaths(CareerRecommendation recommendation) {
            layoutEducationPaths.removeAllViews();

            for (String path : recommendation.getCareer().getEducationPaths()) {
                TextView pathView = new TextView(context);
                pathView.setText("• " + path);
                pathView.setTextSize(14);
                pathView.setTextColor(context.getResources().getColor(R.color.text_secondary));
                pathView.setPadding(0, 4, 0, 4);

                layoutEducationPaths.addView(pathView);
            }
        }
    }
}