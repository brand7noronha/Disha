package com.example.disha.models;

import java.util.ArrayList;

public class CareerRecommendation {
    private Career career;
    private double matchPercentage;
    private ArrayList<String> matchReasons;
    private ArrayList<Course> recommendedCourses;
    private ArrayList<University> recommendedUniversities;

    public CareerRecommendation() {
        matchReasons = new ArrayList<>();
        recommendedCourses = new ArrayList<>();
        recommendedUniversities = new ArrayList<>();
    }

    public CareerRecommendation(Career career, double matchPercentage) {
        this();
        this.career = career;
        this.matchPercentage = matchPercentage;
    }

    // Getters and Setters
    public Career getCareer() { return career; }
    public void setCareer(Career career) { this.career = career; }

    public double getMatchPercentage() { return matchPercentage; }
    public void setMatchPercentage(double matchPercentage) { this.matchPercentage = matchPercentage; }

    public ArrayList<String> getMatchReasons() { return matchReasons; }
    public void setMatchReasons(ArrayList<String> matchReasons) { this.matchReasons = matchReasons; }

    public ArrayList<Course> getRecommendedCourses() { return recommendedCourses; }
    public void setRecommendedCourses(ArrayList<Course> recommendedCourses) { this.recommendedCourses = recommendedCourses; }

    public ArrayList<University> getRecommendedUniversities() { return recommendedUniversities; }
    public void setRecommendedUniversities(ArrayList<University> recommendedUniversities) { this.recommendedUniversities = recommendedUniversities; }

    public void addMatchReason(String reason) {
        matchReasons.add(reason);
    }
}
