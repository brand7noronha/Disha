package com.example.disha.utils;

import com.example.disha.models.Career;

import java.util.ArrayList;
import java.util.List;

public class CareerDataManager {
    public List<Career> getAllCareers() {
        List<Career> careers = new ArrayList<>();

        // Technology Careers
        Career career1 = new Career("Software Developer",
                "Design, develop, and maintain software applications and systems");
        career1.setSalaryRange("₹6-25 LPA");
        career1.setGrowthProspects("Excellent growth in IT industry");
        career1.getRequiredSkills().add("Programming");
        career1.getRequiredSkills().add("Problem Solving");
        career1.getEducationPaths().add("Computer Science");
        career1.getEducationPaths().add("Information Technology");
        careers.add(career1);

        Career career2 = new Career("Data Scientist",
                "Analyze complex data and provide insights for business decisions");
        career2.setSalaryRange("₹8-30 LPA");
        career2.setGrowthProspects("High demand in analytics field");
        career2.getRequiredSkills().add("Statistics");
        career2.getRequiredSkills().add("Machine Learning");
        career2.getEducationPaths().add("Data Science");
        career2.getEducationPaths().add("Mathematics");
        careers.add(career2);

        // Healthcare Careers
        Career career3 = new Career("Medical Doctor",
                "Diagnose and treat patients, promote health and prevent diseases");
        career3.setSalaryRange("₹8-50 LPA");
        career3.setGrowthProspects("High respect and job security");
        career3.getRequiredSkills().add("Medical Knowledge");
        career3.getRequiredSkills().add("Empathy");
        career3.getEducationPaths().add("MBBS");
        career3.getEducationPaths().add("MD/MS");
        careers.add(career3);

        Career career4 = new Career("Nurse",
                "Provide patient care and support in healthcare settings");
        career4.setSalaryRange("₹3-10 LPA");
        career4.setGrowthProspects("Steady demand in healthcare");
        career4.getRequiredSkills().add("Patient Care");
        career4.getRequiredSkills().add("Communication");
        career4.getEducationPaths().add("BSc Nursing");
        career4.getEducationPaths().add("GNM");
        careers.add(career4);

        // Business Careers
        Career career5 = new Career("Business Analyst",
                "Analyze business processes and recommend improvements");
        career5.setSalaryRange("₹5-20 LPA");
        career5.setGrowthProspects("Good corporate opportunities");
        career5.getRequiredSkills().add("Analytical Thinking");
        career5.getRequiredSkills().add("Communication");
        career5.getEducationPaths().add("MBA");
        career5.getEducationPaths().add("BBA");
        careers.add(career5);

        Career career6 = new Career("Marketing Manager",
                "Plan and execute marketing strategies for products and services");
        career6.setSalaryRange("₹6-25 LPA");
        career6.setGrowthProspects("Creative and dynamic field");
        career6.getRequiredSkills().add("Marketing Strategy");
        career6.getRequiredSkills().add("Leadership");
        career6.getEducationPaths().add("MBA Marketing");
        career6.getEducationPaths().add("BBA");
        careers.add(career6);

        // Arts Careers
        Career career7 = new Career("Graphic Designer",
                "Create visual concepts and designs for various media");
        career7.setSalaryRange("₹3-12 LPA");
        career7.setGrowthProspects("Growing digital media demand");
        career7.getRequiredSkills().add("Creativity");
        career7.getRequiredSkills().add("Design Software");
        career7.getEducationPaths().add("Fine Arts");
        career7.getEducationPaths().add("Graphic Design");
        careers.add(career7);

        Career career8 = new Career("UI/UX Designer",
                "Design user interfaces and experiences for digital products");
        career8.setSalaryRange("₹4-18 LPA");
        career8.setGrowthProspects("High demand in tech companies");
        career8.getRequiredSkills().add("User Research");
        career8.getRequiredSkills().add("Prototyping");
        career8.getEducationPaths().add("Design");
        career8.getEducationPaths().add("HCI");
        careers.add(career8);

        return careers;
    }
}
