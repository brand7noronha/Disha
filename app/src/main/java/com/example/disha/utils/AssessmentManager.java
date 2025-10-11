package com.example.disha.utils;

import androidx.annotation.NonNull;

import com.example.disha.models.AssessmentQuestion;
import com.example.disha.models.Career;
import com.example.disha.models.CareerRecommendation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssessmentManager {
    private List<AssessmentQuestion> questions;
    private Map<String, Integer> interestScores;

    public AssessmentManager() {
        questions = new ArrayList<>();
        interestScores = new HashMap<>();
        initializeQuestions();
    }

    public List<AssessmentQuestion> generateAssessmentQuestions() {
        return questions;
    }

    private void initializeQuestions() {
        // Question 1: Interests
        AssessmentQuestion q1 = getAssessmentQuestion();
        questions.add(q1);

        // Question 2: Problem Solving
        AssessmentQuestion q2 = getQ2();
        questions.add(q2);

        // Question 3: Work Environment
        AssessmentQuestion q3 = getQ3();
        questions.add(q3);

        // Question 4: Skills
        AssessmentQuestion q4 = getQ4();
        questions.add(q4);

        // Question 5: Hobbies
        AssessmentQuestion q5 = getQ5();
        questions.add(q5);

        // Question 6: Values
        AssessmentQuestion q6 = getQ6();
        questions.add(q6);

        // Question 7: Learning Style
        AssessmentQuestion q7 = getQ7();
        questions.add(q7);

        // Question 8: Future Goals
        AssessmentQuestion q8 = getQ8();
        questions.add(q8);
    }

    @NonNull
    private static AssessmentQuestion getQ8() {
        AssessmentQuestion q8 = new AssessmentQuestion("Future Goals",
                "What are your long-term career aspirations?");
        q8.addOption("Start a Business|Be an entrepreneur and run your own company");
        q8.addOption("Become an Expert|Be a specialist in a specific field");
        q8.addOption("Lead a Team|Manage people and lead large projects");
        q8.addOption("Make Discoveries|Contribute to scientific or technological breakthroughs");
        q8.addOption("Help Society|Make the world a better place through your work");
        q8.addOption("Creative Recognition|Be known for your creative or artistic work");
        return q8;
    }

    @NonNull
    private static AssessmentQuestion getQ7() {
        AssessmentQuestion q7 = new AssessmentQuestion("Learning Style",
                "How do you prefer to learn new things?");
        q7.addOption("Hands-on Practice|Learning by doing and experimenting");
        q7.addOption("Reading & Research|Learning through books and online resources");
        q7.addOption("Visual Learning|Learning through images, diagrams, and videos");
        q7.addOption("Discussion & Collaboration|Learning through talking with others");
        q7.addOption("Structured Courses|Formal education and organized curriculum");
        q7.addOption("Trial & Error|Learning through mistakes and iteration");
        return q7;
    }

    @NonNull
    private static AssessmentQuestion getQ6() {
        AssessmentQuestion q6 = new AssessmentQuestion("Values",
                "What matters most to you in a career?");
        q6.addOption("Innovation|Creating new things and pushing boundaries");
        q6.addOption("Helping Others|Making a positive impact on people's lives");
        q6.addOption("Financial Success|Earning a good income and financial stability");
        q6.addOption("Work-Life Balance|Having time for family and personal interests");
        q6.addOption("Recognition|Being acknowledged for your achievements");
        q6.addOption("Continuous Learning|Always learning and growing professionally");
        return q6;
    }

    @NonNull
    private static AssessmentQuestion getQ5() {
        AssessmentQuestion q5 = new AssessmentQuestion("Hobbies",
                "What do you enjoy doing in your free time?");
        q5.addOption("Coding & Gaming|Programming projects, video games, and tech hobbies");
        q5.addOption("Art & Crafts|Drawing, painting, crafting, and creative projects");
        q5.addOption("Reading & Writing|Books, blogs, stories, and written content");
        q5.addOption("Sports & Fitness|Physical activities, exercise, and sports");
        q5.addOption("Music & Performance|Playing instruments, singing, or performing");
        q5.addOption("Volunteering|Helping others and community service");
        return q5;
    }

    @NonNull
    private static AssessmentQuestion getQ4() {
        AssessmentQuestion q4 = new AssessmentQuestion("Skills",
                "Which skills do you possess or want to develop?");
        q4.addOption("Analytical Skills|Data analysis, critical thinking, and problem solving");
        q4.addOption("Communication Skills|Writing, speaking, and presenting ideas");
        q4.addOption("Technical Skills|Programming, engineering, and technical expertise");
        q4.addOption("Creative Skills|Art, design, music, and creative expression");
        q4.addOption("Leadership Skills|Managing teams and leading projects");
        q4.addOption("Research Skills|Investigation, experimentation, and discovery");
        return q4;
    }

    @NonNull
    private static AssessmentQuestion getQ3() {
        AssessmentQuestion q3 = new AssessmentQuestion("Work Environment",
                "What type of work environment do you prefer?");
        q3.addOption("Office Environment|Traditional office setting with computers and desks");
        q3.addOption("Laboratory|Research lab with scientific equipment and experiments");
        q3.addOption("Creative Studio|Art studio, design space, or creative workshop");
        q3.addOption("Hospital/Clinic|Medical facilities helping patients");
        q3.addOption("Classroom|Educational environment with students");
        q3.addOption("Outdoor/Field Work|Working outside or traveling to different locations");
        return q3;
    }

    @NonNull
    private static AssessmentQuestion getQ2() {
        AssessmentQuestion q2 = new AssessmentQuestion("Problem Solving",
                "What type of problems do you enjoy solving?");
        q2.addOption("Technical Problems|Debugging code, fixing systems, and technical issues");
        q2.addOption("Creative Problems|Design challenges and artistic solutions");
        q2.addOption("Mathematical Problems|Calculations, data analysis, and logical puzzles");
        q2.addOption("People Problems|Conflict resolution and human relationship issues");
        q2.addOption("Business Problems|Strategy, efficiency, and organizational challenges");
        q2.addOption("Scientific Problems|Research questions and experimental challenges");
        return q2;
    }

    @NonNull
    private static AssessmentQuestion getAssessmentQuestion() {
        AssessmentQuestion q1 = new AssessmentQuestion("Interests",
                "Which of the following activities interest you the most?");
        q1.addOption("Programming & Technology|Building software, websites, and mobile apps");
        q1.addOption("Art & Design|Creating visual content, graphics, and artistic works");
        q1.addOption("Science & Research|Conducting experiments and discovering new knowledge");
        q1.addOption("Business & Finance|Managing money, investments, and business operations");
        q1.addOption("Healthcare & Medicine|Helping people with their health and wellbeing");
        q1.addOption("Education & Teaching|Sharing knowledge and helping others learn");
        return q1;
    }

    public List<CareerRecommendation> generateRecommendations(ArrayList<String> selectedAnswers) {
        // Initialize scores for different career categories
        Map<String, Integer> categoryScores = new HashMap<>();
        categoryScores.put("Technology", 0);
        categoryScores.put("Healthcare", 0);
        categoryScores.put("Business", 0);
        categoryScores.put("Education", 0);
        categoryScores.put("Science", 0);
        categoryScores.put("Arts", 0);
        categoryScores.put("Engineering", 0);
        categoryScores.put("Social Work", 0);

        // Score based on selected answers
        for (String answer : selectedAnswers) {
            updateCategoryScores(answer, categoryScores);
        }

        // Generate career recommendations based on scores
        List<CareerRecommendation> recommendations = new ArrayList<>();

        // Sort categories by score and create recommendations
        categoryScores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5) // Top 5 categories
                .forEach(entry -> {
                    String category = entry.getKey();
                    int score = entry.getValue();

                    if (score > 0) {
                        Career career = createCareerFromCategory(category);
                        double matchPercentage = Math.min((score * 100.0) / selectedAnswers.size(), 100.0);

                        CareerRecommendation recommendation = new CareerRecommendation(career, matchPercentage);
                        recommendation.addMatchReason("Strong interest alignment with " + category.toLowerCase());
                        recommendations.add(recommendation);
                    }
                });

        return recommendations;
    }

    private void updateCategoryScores(String answer, Map<String, Integer> categoryScores) {
        // Technology-related answers
        if (answer.toLowerCase().contains("programming") ||
                answer.toLowerCase().contains("technology") ||
                answer.toLowerCase().contains("technical") ||
                answer.toLowerCase().contains("coding")) {
            categoryScores.put("Technology", categoryScores.get("Technology") + 2);
        }

        // Healthcare-related answers
        if (answer.toLowerCase().contains("healthcare") ||
                answer.toLowerCase().contains("medicine") ||
                answer.toLowerCase().contains("hospital") ||
                answer.toLowerCase().contains("helping others")) {
            categoryScores.put("Healthcare", categoryScores.get("Healthcare") + 2);
        }

        // Business-related answers
        if (answer.toLowerCase().contains("business") ||
                answer.toLowerCase().contains("finance") ||
                answer.toLowerCase().contains("financial") ||
                answer.toLowerCase().contains("leadership") ||
                answer.toLowerCase().contains("start a business")) {
            categoryScores.put("Business", categoryScores.get("Business") + 2);
        }

        // Education-related answers
        if (answer.toLowerCase().contains("education") ||
                answer.toLowerCase().contains("teaching") ||
                answer.toLowerCase().contains("classroom") ||
                answer.toLowerCase().contains("discussion")) {
            categoryScores.put("Education", categoryScores.get("Education") + 2);
        }

        // Science-related answers
        if (answer.toLowerCase().contains("science") ||
                answer.toLowerCase().contains("research") ||
                answer.toLowerCase().contains("laboratory") ||
                answer.toLowerCase().contains("mathematical") ||
                answer.toLowerCase().contains("discoveries")) {
            categoryScores.put("Science", categoryScores.get("Science") + 2);
        }

        // Arts-related answers
        if (answer.toLowerCase().contains("art") ||
                answer.toLowerCase().contains("design") ||
                answer.toLowerCase().contains("creative") ||
                answer.toLowerCase().contains("music") ||
                answer.toLowerCase().contains("crafts")) {
            categoryScores.put("Arts", categoryScores.get("Arts") + 2);
        }

        // Engineering-related answers
        if (answer.toLowerCase().contains("engineering") ||
                answer.toLowerCase().contains("hands-on") ||
                answer.toLowerCase().contains("outdoor")) {
            categoryScores.put("Engineering", categoryScores.get("Engineering") + 2);
        }

        // Social Work-related answers
        if (answer.toLowerCase().contains("volunteering") ||
                answer.toLowerCase().contains("help society") ||
                answer.toLowerCase().contains("people problems")) {
            categoryScores.put("Social Work", categoryScores.get("Social Work") + 2);
        }
    }

    private Career createCareerFromCategory(String category) {
        Career career = new Career();

        switch (category) {
            case "Technology":
                career.setCareerName("Software Developer");
                career.setDescription("Design, develop, and maintain software applications and systems");
                career.setSalaryRange("₹6-25 LPA");
                career.setGrowthProspects("Excellent growth opportunities in IT industry");
                career.getRequiredSkills().add("Programming");
                career.getRequiredSkills().add("Problem Solving");
                career.getRequiredSkills().add("Logical Thinking");
                career.getEducationPaths().add("Computer Science Engineering");
                career.getEducationPaths().add("Information Technology");
                career.getEducationPaths().add("Software Engineering");
                break;

            case "Healthcare":
                career.setCareerName("Medical Doctor");
                career.setDescription("Diagnose and treat patients, promote health and prevent diseases");
                career.setSalaryRange("₹8-50 LPA");
                career.setGrowthProspects("High demand and respect in society");
                career.getRequiredSkills().add("Empathy");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Medical Knowledge");
                career.getEducationPaths().add("MBBS");
                career.getEducationPaths().add("BDS");
                career.getEducationPaths().add("BAMS");
                break;

            case "Business":
                career.setCareerName("Business Analyst");
                career.setDescription("Analyze business processes and recommend improvements");
                career.setSalaryRange("₹5-20 LPA");
                career.setGrowthProspects("Good advancement opportunities in corporate world");
                career.getRequiredSkills().add("Analytical Thinking");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Business Acumen");
                career.getEducationPaths().add("MBA");
                career.getEducationPaths().add("BBA");
                career.getEducationPaths().add("Commerce");
                break;

            case "Education":
                career.setCareerName("Teacher/Professor");
                career.setDescription("Educate students and contribute to knowledge development");
                career.setSalaryRange("₹3-15 LPA");
                career.setGrowthProspects("Stable career with social impact");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Patience");
                career.getRequiredSkills().add("Subject Knowledge");
                career.getEducationPaths().add("B.Ed");
                career.getEducationPaths().add("M.Ed");
                career.getEducationPaths().add("PhD");
                break;

            case "Science":
                career.setCareerName("Research Scientist");
                career.setDescription("Conduct research and experiments to advance scientific knowledge");
                career.setSalaryRange("₹4-18 LPA");
                career.setGrowthProspects("Opportunities in research institutions and industry");
                career.getRequiredSkills().add("Research Methods");
                career.getRequiredSkills().add("Critical Thinking");
                career.getRequiredSkills().add("Data Analysis");
                career.getEducationPaths().add("MSc");
                career.getEducationPaths().add("PhD");
                career.getEducationPaths().add("BSc");
                break;

            case "Arts":
                career.setCareerName("Graphic Designer");
                career.setDescription("Create visual concepts and designs for various media");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Growing demand in digital media industry");
                career.getRequiredSkills().add("Creativity");
                career.getRequiredSkills().add("Design Software");
                career.getRequiredSkills().add("Visual Communication");
                career.getEducationPaths().add("Fine Arts");
                career.getEducationPaths().add("Graphic Design");
                career.getEducationPaths().add("Visual Arts");
                break;

            case "Engineering":
                career.setCareerName("Civil Engineer");
                career.setDescription("Design and supervise construction of infrastructure projects");
                career.setSalaryRange("₹4-15 LPA");
                career.setGrowthProspects("Steady demand in construction and infrastructure");
                career.getRequiredSkills().add("Technical Drawing");
                career.getRequiredSkills().add("Project Management");
                career.getRequiredSkills().add("Problem Solving");
                career.getEducationPaths().add("Civil Engineering");
                career.getEducationPaths().add("Structural Engineering");
                career.getEducationPaths().add("Construction Management");
                break;

            case "Social Work":
                career.setCareerName("Social Worker");
                career.setDescription("Help individuals and communities overcome challenges");
                career.setSalaryRange("₹2-8 LPA");
                career.setGrowthProspects("Meaningful work with social impact");
                career.getRequiredSkills().add("Empathy");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Counseling");
                career.getEducationPaths().add("Social Work");
                career.getEducationPaths().add("Psychology");
                career.getEducationPaths().add("Sociology");
                break;
        }

        return career;
    }
}