package com.example.disha.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.disha.R;

import java.util.ArrayList;

public class CareerDetailsActivity extends AppCompatActivity {
    private ImageView btnBack;
    private TextView tvCareerName;
    private TextView tvSalaryRange;
    private TextView tvMatchPercentage;
    private TextView tvDescription;
    private TextView tvGrowthProspects;
    private LinearLayout layoutSkills;
    private LinearLayout layoutEducationPaths;
    private Button btnFindCourses;
    private Button btnFindUniversities;

    private String careerName;
    private String description;
    private String salaryRange;
    private String growthProspects;
    private ArrayList<String> requiredSkills;
    private ArrayList<String> educationPaths;
    private double matchPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_details);

        initializeViews();
        getDataFromIntent();
        displayCareerDetails();
        setClickListeners();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        tvCareerName = findViewById(R.id.tv_career_name);
        tvSalaryRange = findViewById(R.id.tv_salary_range);
        tvMatchPercentage = findViewById(R.id.tv_match_percentage);
        tvDescription = findViewById(R.id.tv_description);
        tvGrowthProspects = findViewById(R.id.tv_growth_prospects);
        layoutSkills = findViewById(R.id.layout_skills);
        layoutEducationPaths = findViewById(R.id.layout_education_paths);
        btnFindCourses = findViewById(R.id.btn_find_courses);
        btnFindUniversities = findViewById(R.id.btn_find_universities);
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        careerName = intent.getStringExtra("career_name");
        description = intent.getStringExtra("career_description");
        salaryRange = intent.getStringExtra("salary_range");
        growthProspects = intent.getStringExtra("growth_prospects");
        requiredSkills = intent.getStringArrayListExtra("required_skills");
        educationPaths = intent.getStringArrayListExtra("education_paths");
        matchPercentage = intent.getDoubleExtra("match_percentage", 0);
    }

    private void displayCareerDetails() {
        tvCareerName.setText(careerName);
        tvSalaryRange.setText(salaryRange);
        tvDescription.setText(description);
        tvGrowthProspects.setText(growthProspects);

        if (matchPercentage > 0) {
            tvMatchPercentage.setText((int) matchPercentage + "% Match");
            tvMatchPercentage.setVisibility(View.VISIBLE);
        } else {
            tvMatchPercentage.setVisibility(View.GONE);
        }

        // Display skills
        if (requiredSkills != null && !requiredSkills.isEmpty()) {
            for (String skill : requiredSkills) {
                TextView skillView = new TextView(this);
                skillView.setText("• " + skill);
                skillView.setTextSize(16);
                skillView.setTextColor(getResources().getColor(R.color.text_primary));
                skillView.setPadding(0, 8, 0, 8);
                layoutSkills.addView(skillView);
            }
        }

        // Display education paths
        if (educationPaths != null && !educationPaths.isEmpty()) {
            for (String path : educationPaths) {
                TextView pathView = new TextView(this);
                pathView.setText("• " + path);
                pathView.setTextSize(16);
                pathView.setTextColor(getResources().getColor(R.color.text_primary));
                pathView.setPadding(0, 8, 0, 8);
                layoutEducationPaths.addView(pathView);
            }
        }
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> onBackPressed());

        btnFindCourses.setOnClickListener(v -> {
            Intent intent = new Intent(CareerDetailsActivity.this, CoursesActivity.class);
            ArrayList<String> careerList = new ArrayList<>();
            careerList.add(careerName);
            intent.putStringArrayListExtra("recommended_careers", careerList);
            startActivity(intent);
        });

        btnFindUniversities.setOnClickListener(v -> {
            Intent intent = new Intent(CareerDetailsActivity.this, UniversitiesActivity.class);
            intent.putStringArrayListExtra("education_paths", educationPaths);
            startActivity(intent);
        });
    }
}
