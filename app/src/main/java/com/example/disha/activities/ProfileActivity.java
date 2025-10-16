package com.example.disha.activities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.example.disha.R;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ProfileActivity extends AppCompatActivity {
    private ImageView btnBack;
    private ImageView btnEdit;
    private ImageView imgProfile;
    private TextView tvUserName;
    private TextView tvUserEmail;
    private TextInputEditText etName;
    private TextInputEditText etEmail;
    private TextInputEditText etAge;
    private TextInputEditText etEducation;
    private TextView tvInterestsDisplay;
    private TextView tvLastAssessmentDate;
    private TextView tvTopCareerMatch;
    private Button btnViewResults;
    private Button btnSaveProfile;

    private SharedPreferences sharedPreferences;
    private static final String PREFS_NAME = "CareerGuidancePrefs";

    private boolean isEditMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        initializeViews();
        loadProfileData();
        setClickListeners();
        checkAssessmentHistory();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        btnEdit = findViewById(R.id.btn_edit);
        imgProfile = findViewById(R.id.img_profile);
        tvUserName = findViewById(R.id.tv_user_name);
        tvUserEmail = findViewById(R.id.tv_user_email);
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);
        etAge = findViewById(R.id.et_age);
        etEducation = findViewById(R.id.et_education);
        tvInterestsDisplay = findViewById(R.id.tv_interests_display);
        tvLastAssessmentDate = findViewById(R.id.tv_last_assessment_date);
        tvTopCareerMatch = findViewById(R.id.tv_top_career_match);
        btnViewResults = findViewById(R.id.btn_view_results);
        btnSaveProfile = findViewById(R.id.btn_save_profile);
    }

    private void loadProfileData() {
        String name = sharedPreferences.getString("user_name", "");
        String email = sharedPreferences.getString("user_email", "");
        int age = sharedPreferences.getInt("user_age", 0);
        String education = sharedPreferences.getString("user_education", "");

        if (!name.isEmpty()) {
            tvUserName.setText(name);
            etName.setText(name);
        }

        if (!email.isEmpty()) {
            tvUserEmail.setText(email);
            etEmail.setText(email);
        }

        if (age > 0) {
            etAge.setText(String.valueOf(age));
        }

        if (!education.isEmpty()) {
            etEducation.setText(education);
        }

        // Initially disable editing
        setEditingEnabled(false);
    }

    private void checkAssessmentHistory() {
        long lastAssessmentDate = sharedPreferences.getLong("last_assessment_date", 0);

        if (lastAssessmentDate > 0) {
            // Format date
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
            String dateStr = sdf.format(new Date(lastAssessmentDate));
            tvLastAssessmentDate.setText("Taken on " + dateStr);

            // Get top career match
            String topCareer = sharedPreferences.getString("top_career_1", "");
            float matchPercentage = sharedPreferences.getFloat("top_career_1_match", 0);

            if (!topCareer.isEmpty()) {
                tvTopCareerMatch.setText(topCareer + " (" + (int)matchPercentage + "% match)");
                btnViewResults.setEnabled(true);

                // Display interests
                StringBuilder interests = new StringBuilder();
                interests.append("Top Career Matches:\n");
                interests.append("1. ").append(topCareer).append("\n");

                String career2 = sharedPreferences.getString("top_career_2", "");
                if (!career2.isEmpty()) {
                    interests.append("2. ").append(career2).append("\n");
                }

                String career3 = sharedPreferences.getString("top_career_3", "");
                if (!career3.isEmpty()) {
                    interests.append("3. ").append(career3);
                }

                tvInterestsDisplay.setText(interests.toString());
            }
        } else {
            tvLastAssessmentDate.setText("Not taken yet");
            tvTopCareerMatch.setText("Take assessment to see results");
            btnViewResults.setEnabled(false);
        }
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleEditMode();
            }
        });

        btnSaveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfile();
            }
        });

        btnViewResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to results if available
                Toast.makeText(ProfileActivity.this,
                        "Please take a new assessment to see updated results",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void toggleEditMode() {
        isEditMode = !isEditMode;
        setEditingEnabled(isEditMode);

        if (isEditMode) {
            btnSaveProfile.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Edit mode enabled", Toast.LENGTH_SHORT).show();
        } else {
            btnSaveProfile.setVisibility(View.GONE);
            loadProfileData(); // Reset to saved data
        }
    }

    private void setEditingEnabled(boolean enabled) {
        etName.setEnabled(enabled);
        etEmail.setEnabled(enabled);
        etAge.setEnabled(enabled);
        etEducation.setEnabled(enabled);

        if (!enabled) {
            btnSaveProfile.setVisibility(View.GONE);
        }
    }

    private void saveProfile() {
        // Get input values
        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String ageStr = etAge.getText().toString().trim();
        String education = etEducation.getText().toString().trim();

        // Validate inputs
        if (TextUtils.isEmpty(name)) {
            etName.setError("Name is required");
            etName.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(email)) {
            etEmail.setError("Email is required");
            etEmail.requestFocus();
            return;
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Invalid email address");
            etEmail.requestFocus();
            return;
        }

        int age = 0;
        if (!TextUtils.isEmpty(ageStr)) {
            try {
                age = Integer.parseInt(ageStr);
                if (age < 10 || age > 100) {
                    etAge.setError("Please enter a valid age");
                    etAge.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                etAge.setError("Invalid age");
                etAge.requestFocus();
                return;
            }
        }

        // Save to SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user_name", name);
        editor.putString("user_email", email);
        editor.putInt("user_age", age);
        editor.putString("user_education", education);
        editor.apply();

        // Update UI
        tvUserName.setText(name);
        tvUserEmail.setText(email);

        // Disable edit mode
        isEditMode = false;
        setEditingEnabled(false);

        Toast.makeText(this, "Profile saved successfully!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (isEditMode) {
            // Show confirmation dialog if in edit mode
            new androidx.appcompat.app.AlertDialog.Builder(this)
                    .setTitle("Unsaved Changes")
                    .setMessage("Do you want to save your changes?")
                    .setPositiveButton("Save", (dialog, which) -> {
                        saveProfile();
                        super.onBackPressed();
                    })
                    .setNegativeButton("Discard", (dialog, which) -> {
                        super.onBackPressed();
                    })
                    .setNeutralButton("Cancel", null)
                    .show();
        } else {
            super.onBackPressed();
        }
    }
}
