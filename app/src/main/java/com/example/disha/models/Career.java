package com.example.disha.models;

import java.util.ArrayList;

public class Career {
    private String careerId;
    private String careerName;
    private String description;
    private ArrayList<String> requiredSkills;
    private ArrayList<String> relatedInterests;
    private ArrayList<String> relatedHobbies;
    private String salaryRange;
    private String growthProspects;
    private ArrayList<String> educationPaths;

    public Career() {
        requiredSkills = new ArrayList<>();
        relatedInterests = new ArrayList<>();
        relatedHobbies = new ArrayList<>();
        educationPaths = new ArrayList<>();
    }

    public Career(String careerName, String description) {
        this();
        this.careerName = careerName;
        this.description = description;
        this.careerId = generateCareerId();
    }

    private String generateCareerId() {
        return "CAR_" + careerName.replaceAll("\\s+", "_").toUpperCase();
    }

    // Getters and Setters
    public String getCareerId() { return careerId; }
    public void setCareerId(String careerId) { this.careerId = careerId; }

    public String getCareerName() { return careerName; }
    public void setCareerName(String careerName) { this.careerName = careerName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<String> getRequiredSkills() { return requiredSkills; }
    public void setRequiredSkills(ArrayList<String> requiredSkills) { this.requiredSkills = requiredSkills; }

    public ArrayList<String> getRelatedInterests() { return relatedInterests; }
    public void setRelatedInterests(ArrayList<String> relatedInterests) { this.relatedInterests = relatedInterests; }

    public ArrayList<String> getRelatedHobbies() { return relatedHobbies; }
    public void setRelatedHobbies(ArrayList<String> relatedHobbies) { this.relatedHobbies = relatedHobbies; }

    public String getSalaryRange() { return salaryRange; }
    public void setSalaryRange(String salaryRange) { this.salaryRange = salaryRange; }

    public String getGrowthProspects() { return growthProspects; }
    public void setGrowthProspects(String growthProspects) { this.growthProspects = growthProspects; }

    public ArrayList<String> getEducationPaths() { return educationPaths; }
    public void setEducationPaths(ArrayList<String> educationPaths) { this.educationPaths = educationPaths; }
}

