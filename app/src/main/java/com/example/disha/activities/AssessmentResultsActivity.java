package com.example.disha.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.disha.MainActivity;
import com.example.disha.R;
import com.example.disha.adapters.CareerRecommendationAdapter;
import com.example.disha.models.CareerRecommendation;
import com.example.disha.utils.AssessmentManager;

import java.util.ArrayList;
import java.util.List;

public class AssessmentResultsActivity extends AppCompatActivity {

    private ImageView btnBack;
    private ImageView btnShare;
    private RecyclerView recyclerCareerRecommendations;
    private Button btnExploreCourses;
    private Button btnFindUniversities;
    private Button btnRetakeAssessment;

    private CareerRecommendationAdapter adapter;
    private List<CareerRecommendation> recommendations;
    private ArrayList<String> selectedAnswers;

    private SharedPreferences sharedPreferences;
    private static final String PREFS_NAME = "CareerGuidancePrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_results);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        initializeViews();
        getDataFromIntent();
        generateRecommendations();
        setupRecyclerView();
        setClickListeners();
        saveResults();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        btnShare = findViewById(R.id.btn_share);
        recyclerCareerRecommendations = findViewById(R.id.recycler_career_recommendations);
        btnExploreCourses = findViewById(R.id.btn_explore_courses);
        btnFindUniversities = findViewById(R.id.btn_find_universities);
        btnRetakeAssessment = findViewById(R.id.btn_retake_assessment);
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        selectedAnswers = intent.getStringArrayListExtra("selected_answers");

        if (selectedAnswers == null) {
            selectedAnswers = new ArrayList<>();
            Toast.makeText(this, "No assessment data found", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private void generateRecommendations() {
        AssessmentManager assessmentManager = new AssessmentManager();
        recommendations = assessmentManager.generateRecommendations(selectedAnswers);

        if (recommendations.isEmpty()) {
            Toast.makeText(this, "Unable to generate recommendations", Toast.LENGTH_SHORT).show();
        }
    }

    private void setupRecyclerView() {
        adapter = new CareerRecommendationAdapter(recommendations, this::onCareerRecommendationClick);
        recyclerCareerRecommendations.setLayoutManager(new LinearLayoutManager(this));
        recyclerCareerRecommendations.setAdapter(adapter);
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareResults();
            }
        });

        btnExploreCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exploreCourses();
            }
        });

        btnFindUniversities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findUniversities();
            }
        });

        btnRetakeAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retakeAssessment();
            }
        });
    }

    private void onCareerRecommendationClick(CareerRecommendation recommendation) {
        // Navigate to career details page
        Intent intent = new Intent(AssessmentResultsActivity.this, CareerDetailsActivity.class);
        intent.putExtra("career_name", recommendation.getCareer().getCareerName());
        intent.putExtra("career_description", recommendation.getCareer().getDescription());
        intent.putExtra("salary_range", recommendation.getCareer().getSalaryRange());
        intent.putExtra("growth_prospects", recommendation.getCareer().getGrowthProspects());
        intent.putStringArrayListExtra("required_skills", recommendation.getCareer().getRequiredSkills());
        intent.putStringArrayListExtra("education_paths", recommendation.getCareer().getEducationPaths());
        intent.putExtra("match_percentage", recommendation.getMatchPercentage());
        startActivity(intent);
    }

    private void shareResults() {
        StringBuilder shareText = new StringBuilder();
        shareText.append("🎯 My Career Assessment Results\n\n");

        shareText.append("Top Career Matches:\n");
        for (int i = 0; i < Math.min(3, recommendations.size()); i++) {
            CareerRecommendation rec = recommendations.get(i);
            shareText.append(String.format("%d. %s (%.0f%% match)\n",
                    i + 1,
                    rec.getCareer().getCareerName(),
                    rec.getMatchPercentage()));
        }

        shareText.append("\nTaken via Career Guidance App 📱");

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText.toString());
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My Career Assessment Results");

        startActivity(Intent.createChooser(shareIntent, "Share Results"));
    }

    private void exploreCourses() {
        // Pass recommended careers to courses activity
        ArrayList<String> careerNames = new ArrayList<>();
        for (CareerRecommendation rec : recommendations) {
            careerNames.add(rec.getCareer().getCareerName());
        }

        Intent intent = new Intent(AssessmentResultsActivity.this, CoursesActivity.class);
        intent.putStringArrayListExtra("recommended_careers", careerNames);
        startActivity(intent);
    }

    private void findUniversities() {
        // Pass education paths to universities activity
        ArrayList<String> educationPaths = new ArrayList<>();
        for (CareerRecommendation rec : recommendations) {
            educationPaths.addAll(rec.getCareer().getEducationPaths());
        }

        Intent intent = new Intent(AssessmentResultsActivity.this, UniversitiesActivity.class);
        intent.putStringArrayListExtra("education_paths", educationPaths);
        startActivity(intent);
    }

    private void retakeAssessment() {
        Intent intent = new Intent(AssessmentResultsActivity.this, AssessmentActivity.class);
        startActivity(intent);
        finish();
    }

    private void saveResults() {
        // Save assessment results to SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("last_assessment_date", System.currentTimeMillis());

        // Save top 3 recommendations
        if (!recommendations.isEmpty()) {
            editor.putString("top_career_1", recommendations.get(0).getCareer().getCareerName());
            editor.putFloat("top_career_1_match", (float) recommendations.get(0).getMatchPercentage());
        }
        if (recommendations.size() > 1) {
            editor.putString("top_career_2", recommendations.get(1).getCareer().getCareerName());
            editor.putFloat("top_career_2_match", (float) recommendations.get(1).getMatchPercentage());
        }
        if (recommendations.size() > 2) {
            editor.putString("top_career_3", recommendations.get(2).getCareer().getCareerName());
            editor.putFloat("top_career_3_match", (float) recommendations.get(2).getMatchPercentage());
        }

        editor.apply();
    }

    @Override
    public void onBackPressed() {
        // Navigate back to main activity
        super.onBackPressed();
        Intent intent = new Intent(AssessmentResultsActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}