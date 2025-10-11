package com.example.disha.models;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private String degree; // Bachelor's, Master's, PhD, etc.
    private String duration;
    private ArrayList<String> relatedCareers;
    private String eligibility;
    private String fees;
    private String description;
    private ArrayList<String> subjects;

    public Course() {
        relatedCareers = new ArrayList<>();
        subjects = new ArrayList<>();
    }

    public Course(String courseName, String degree, String duration) {
        this();
        this.courseName = courseName;
        this.degree = degree;
        this.duration = duration;
        this.courseId = generateCourseId();
    }

    private String generateCourseId() {
        return "CRS_" + courseName.replaceAll("\\s+", "_").toUpperCase();
    }

    // Getters and Setters
    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public ArrayList<String> getRelatedCareers() { return relatedCareers; }
    public void setRelatedCareers(ArrayList<String> relatedCareers) { this.relatedCareers = relatedCareers; }

    public String getEligibility() { return eligibility; }
    public void setEligibility(String eligibility) { this.eligibility = eligibility; }

    public String getFees() { return fees; }
    public void setFees(String fees) { this.fees = fees; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<String> getSubjects() { return subjects; }
    public void setSubjects(ArrayList<String> subjects) { this.subjects = subjects; }

}
