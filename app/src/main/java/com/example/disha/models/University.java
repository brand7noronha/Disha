package com.example.disha.models;

import java.util.ArrayList;

public class University {

        private String universityId;
        private String name;
        private String location;
        private String type; // Public, Private, etc.
        private ArrayList<Course> courses;
        private double rating;
        private String website;
        private String admissionProcess;

        public University() {
            courses = new ArrayList<>();
        }

        public University(String name, String location) {
            this();
            this.name = name;
            this.location = location;
            this.universityId = generateUniversityId();
        }

        private String generateUniversityId() {
            return "UNI_" + name.replaceAll("\\s+", "_").toUpperCase();
        }

        // Getters and Setters
        public String getUniversityId() { return universityId; }
        public void setUniversityId(String universityId) { this.universityId = universityId; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public ArrayList<Course> getCourses() { return courses; }
        public void setCourses(ArrayList<Course> courses) { this.courses = courses; }

        public double getRating() { return rating; }
        public void setRating(double rating) { this.rating = rating; }

        public String getWebsite() { return website; }
        public void setWebsite(String website) { this.website = website; }

        public String getAdmissionProcess() { return admissionProcess; }
        public void setAdmissionProcess(String admissionProcess) { this.admissionProcess = admissionProcess; }

        public void addCourse(Course course) {
            courses.add(course);
        }
}
