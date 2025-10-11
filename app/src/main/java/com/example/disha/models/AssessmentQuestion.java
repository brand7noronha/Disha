package com.example.disha.models;

import java.util.ArrayList;

public class AssessmentQuestion {
    private String questionId;
    private String category;
    private String questionText;
    private ArrayList<String> options;
    private boolean isMultipleChoice;

    public AssessmentQuestion() {
        options = new ArrayList<>();
        isMultipleChoice = true; // Default to multiple choice
    }

    public AssessmentQuestion(String category, String questionText) {
        this();
        this.category = category;
        this.questionText = questionText;
        this.questionId = generateQuestionId();
    }

    private String generateQuestionId() {
        return "Q_" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public void setMultipleChoice(boolean multipleChoice) {
        isMultipleChoice = multipleChoice;
    }

    public void addOption(String option) {
        options.add(option);
    }
}
