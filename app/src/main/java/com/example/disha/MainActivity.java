package com.example.disha;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.disha.activities.AssessmentActivity;
import com.example.disha.activities.CareersActivity;
import com.example.disha.activities.ProfileActivity;
import com.example.disha.activities.UniversitiesActivity;

public class MainActivity extends AppCompatActivity {

    private LinearLayout btnStartAssessment;
    private LinearLayout btnViewCareers;
    private LinearLayout btnUniversities;
    private LinearLayout btnProfile;

    private SharedPreferences sharedPreferences;
    private static final String PREFS_NAME = "CareerGuidancePrefs";
    private static final String KEY_FIRST_TIME = "firstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        // Initialize views
        initializeViews();

        // Set click listeners
        setClickListeners();

        // Check if first time user
        checkFirstTimeUser();
    }

    private void initializeViews() {
        btnStartAssessment = findViewById(R.id.btn_start_assessment);
        btnViewCareers = findViewById(R.id.btn_view_careers);
        btnUniversities = findViewById(R.id.btn_universities);
        btnProfile = findViewById(R.id.btn_profile);
    }

    private void setClickListeners() {
        btnStartAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAssessment();
            }
        });

        btnViewCareers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewCareers();
            }
        });

        btnUniversities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findUniversities();
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewProfile();
            }
        });
    }

    private void checkFirstTimeUser() {
        boolean isFirstTime = sharedPreferences.getBoolean(KEY_FIRST_TIME, true);

        if (isFirstTime) {
            // Show welcome message or tutorial
            showWelcomeMessage();

            // Mark as not first time anymore
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(KEY_FIRST_TIME, false);
            editor.apply();
        }
    }

    private void showWelcomeMessage() {
        Toast.makeText(this, "Welcome to Career Guidance! Let's find your perfect career path.",
                Toast.LENGTH_LONG).show();
    }

    private void startAssessment() {
        // Check if user has profile
        if (hasUserProfile()) {
            Intent intent = new Intent(MainActivity.this, AssessmentActivity.class);
            startActivity(intent);
        } else {
            // Redirect to create profile first
            Toast.makeText(this, "Please create your profile first", Toast.LENGTH_SHORT).show();
            viewProfile();
        }
    }

    private void viewCareers() {
        Intent intent = new Intent(MainActivity.this, CareersActivity.class);
        startActivity(intent);
    }

    private void findUniversities() {
        Intent intent = new Intent(MainActivity.this, UniversitiesActivity.class);
        startActivity(intent);
    }

    private void viewProfile() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    private boolean hasUserProfile() {
        // Check if user has created a profile
        String userName = sharedPreferences.getString("user_name", "");
        return !userName.isEmpty();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // You can refresh data or update UI when returning to main activity
    }

    @Override
    public void onBackPressed() {
        // Handle back press - maybe show exit confirmation
        super.onBackPressed();
    }
}