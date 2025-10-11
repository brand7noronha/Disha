package com.example.disha.models;

import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private int age;
    private String currentEducation;
    private ArrayList<String> hobbies;
    private ArrayList<String> interests;
    private ArrayList<String> skills;

    public Student() {
        hobbies = new ArrayList<>();
        interests = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public Student(String name, String email, int age) {
        this();
        this.name = name;
        this.email = email;
        this.age = age;
        this.studentId = generateStudentId();
    }

    private String generateStudentId() {
        return "STU_" + System.currentTimeMillis();
    }

    // Getters and Setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCurrentEducation() { return currentEducation; }
    public void setCurrentEducation(String currentEducation) { this.currentEducation = currentEducation; }

    public ArrayList<String> getHobbies() { return hobbies; }
    public void setHobbies(ArrayList<String> hobbies) { this.hobbies = hobbies; }

    public ArrayList<String> getInterests() { return interests; }
    public void setInterests(ArrayList<String> interests) { this.interests = interests; }

    public ArrayList<String> getSkills() { return skills; }
    public void setSkills(ArrayList<String> skills) { this.skills = skills; }

    public void addHobby(String hobby) {
        if (!hobbies.contains(hobby)) {
            hobbies.add(hobby);
        }
    }

    public void addInterest(String interest) {
        if (!interests.contains(interest)) {
            interests.add(interest);
        }
    }

    public void addSkill(String skill) {
        if (!skills.contains(skill)) {
            skills.add(skill);
        }
    }
}
