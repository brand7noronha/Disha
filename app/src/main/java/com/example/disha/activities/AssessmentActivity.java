package com.example.disha.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.disha.R;
import com.example.disha.models.AssessmentQuestion;
import com.example.disha.utils.AssessmentManager;

import java.util.ArrayList;
import java.util.List;

public class AssessmentActivity extends AppCompatActivity {

    private TextView tvQuestionCategory;
    private TextView tvQuestion;
    private TextView tvProgressText;
    private ProgressBar progressBar;
    private LinearLayout optionsContainer;
    private Button btnPrevious;
    private Button btnNext;
    private ImageView btnBack;

    private AssessmentManager assessmentManager;
    private List<AssessmentQuestion> questions;
    private int currentQuestionIndex = 0;
    private ArrayList<String> selectedAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);

        initializeViews();
        initializeAssessment();
        setClickListeners();
        displayCurrentQuestion();
    }

    private void initializeViews() {
        tvQuestionCategory = findViewById(R.id.tv_question_category);
        tvQuestion = findViewById(R.id.tv_question);
        tvProgressText = findViewById(R.id.tv_progress_text);
        progressBar = findViewById(R.id.progress_bar);
        optionsContainer = findViewById(R.id.options_container);
        btnPrevious = findViewById(R.id.btn_previous);
        btnNext = findViewById(R.id.btn_next);
        btnBack = findViewById(R.id.btn_back);
    }

    private void initializeAssessment() {
        assessmentManager = new AssessmentManager();
        questions = assessmentManager.generateAssessmentQuestions();
        selectedAnswers = new ArrayList<>();

        // Initialize selected answers for each question
        for (int i = 0; i < questions.size(); i++) {
            selectedAnswers.add("");
        }
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPreviousQuestion();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextQuestion();
            }
        });
    }

    private void displayCurrentQuestion() {
        AssessmentQuestion question = questions.get(currentQuestionIndex);

        // Update UI elements
        tvQuestionCategory.setText(question.getCategory());
        tvQuestion.setText(question.getQuestionText());

        // Update progress
        int progress = ((currentQuestionIndex + 1) * 100) / questions.size();
        progressBar.setProgress(progress);
        tvProgressText.setText((currentQuestionIndex + 1) + "/" + questions.size());

        // Update button states
        btnPrevious.setEnabled(currentQuestionIndex > 0);

        if (currentQuestionIndex == questions.size() - 1) {
            btnNext.setText("Finish");
        } else {
            btnNext.setText("Next");
        }

        // Display options
        displayOptions(question);
    }

    private void displayOptions(AssessmentQuestion question) {
        optionsContainer.removeAllViews();
        LayoutInflater inflater = LayoutInflater.from(this);

        for (String option : question.getOptions()) {
            View optionView = inflater.inflate(R.layout.item_assessment_option, optionsContainer, false);

            TextView tvOptionTitle = optionView.findViewById(R.id.tv_option_title);
            TextView tvOptionDescription = optionView.findViewById(R.id.tv_option_description);
            CheckBox checkboxOption = optionView.findViewById(R.id.checkbox_option);

            // Set option text (assuming format "Title|Description")
            String[] optionParts = option.split("\\|");
            tvOptionTitle.setText(optionParts[0]);
            if (optionParts.length > 1) {
                tvOptionDescription.setText(optionParts[1]);
                tvOptionDescription.setVisibility(View.VISIBLE);
            } else {
                tvOptionDescription.setVisibility(View.GONE);
            }

            // Check if this option was previously selected
            String previousAnswers = selectedAnswers.get(currentQuestionIndex);
            checkboxOption.setChecked(previousAnswers.contains(option));

            // Set click listener for the entire card
            optionView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkboxOption.setChecked(!checkboxOption.isChecked());
                    handleOptionSelection(option, checkboxOption.isChecked());
                }
            });

            // Set click listener for checkbox
            checkboxOption.setOnCheckedChangeListener((buttonView, isChecked) -> {
                handleOptionSelection(option, isChecked);
            });

            optionsContainer.addView(optionView);
        }
    }

    private void handleOptionSelection(String option, boolean isSelected) {
        String currentAnswers = selectedAnswers.get(currentQuestionIndex);

        if (isSelected) {
            // Add option to selected answers
            if (currentAnswers.isEmpty()) {
                selectedAnswers.set(currentQuestionIndex, option);
            } else {
                selectedAnswers.set(currentQuestionIndex, currentAnswers + ";" + option);
            }
        } else {
            // Remove option from selected answers
            String[] answers = currentAnswers.split(";");
            StringBuilder newAnswers = new StringBuilder();

            for (String answer : answers) {
                if (!answer.equals(option)) {
                    if (newAnswers.length() > 0) {
                        newAnswers.append(";");
                    }
                    newAnswers.append(answer);
                }
            }

            selectedAnswers.set(currentQuestionIndex, newAnswers.toString());
        }
    }

    private void goToPreviousQuestion() {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--;
            displayCurrentQuestion();
        }
    }

    private void goToNextQuestion() {
        // Validate that at least one option is selected
        if (selectedAnswers.get(currentQuestionIndex).isEmpty()) {
            Toast.makeText(this, "Please select at least one option", Toast.LENGTH_SHORT).show();
            return;
        }

        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            displayCurrentQuestion();
        } else {
            // Finish assessment
            finishAssessment();
        }
    }

    private void finishAssessment() {
        // Process assessment results
        ArrayList<String> allSelectedAnswers = new ArrayList<>();

        for (int i = 0; i < questions.size(); i++) {
            String answers = selectedAnswers.get(i);
            if (!answers.isEmpty()) {
                String[] answerArray = answers.split(";");
                for (String answer : answerArray) {
                    if (!answer.isEmpty()) {
                        // Extract just the title part before the pipe
                        String answerTitle = answer.split("\\|")[0];
                        allSelectedAnswers.add(answerTitle);
                    }
                }
            }
        }

        // Save results and navigate to results
        Intent intent = new Intent(AssessmentActivity.this, AssessmentResultsActivity.class);
        intent.putStringArrayListExtra("selected_answers", allSelectedAnswers);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        // Show confirmation dialog before exiting
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Exit Assessment")
                .setMessage("Are you sure you want to exit? Your progress will be lost.")
                .setPositiveButton("Exit", (dialog, which) -> {
                    super.onBackPressed();
                })
                .setNegativeButton("Continue", null)
                .show();
    }
}