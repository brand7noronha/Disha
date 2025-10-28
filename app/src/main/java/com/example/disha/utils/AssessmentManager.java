package com.example.disha.utils;

import androidx.annotation.NonNull;

import com.example.disha.models.AssessmentQuestion;
import com.example.disha.models.Career;
import com.example.disha.models.CareerRecommendation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UPDATED AssessmentManager with improved career recommendation algorithm
 * - More comprehensive questions covering interests, skills, values, and work preferences
 * - Advanced scoring system that accurately matches student profiles to careers
 * - Includes Goa-specific career recommendations alongside national opportunities
 * - Better reasoning for career matches
 */
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
        // Question 1: Primary Interests
        AssessmentQuestion q1 = new AssessmentQuestion("Interests",
                "Which of the following activities interest you the most?");
        q1.addOption("Programming & Technology|Building software, websites, mobile apps, and tech solutions");
        q1.addOption("Art & Design|Creating visual content, graphics, designs, and artistic works");
        q1.addOption("Science & Research|Conducting experiments, discovering new knowledge, and research work");
        q1.addOption("Business & Finance|Managing money, investments, business operations, and entrepreneurship");
        q1.addOption("Healthcare & Medicine|Helping people with their health, wellbeing, and medical care");
        q1.addOption("Hospitality & Tourism|Travel, hotels, tourism, event management, and guest services");
        q1.addOption("Education & Teaching|Sharing knowledge, teaching, and helping others learn");
        q1.addOption("Marine & Environment|Ocean life, coastal ecosystems, environmental conservation");
        questions.add(q1);

        // Question 2: Problem Solving Approach
        AssessmentQuestion q2 = new AssessmentQuestion("Problem Solving",
                "What type of problems do you enjoy solving?");
        q2.addOption("Technical Problems|Debugging code, fixing systems, and technical challenges");
        q2.addOption("Creative Problems|Design challenges, artistic solutions, and innovative ideas");
        q2.addOption("Mathematical Problems|Calculations, data analysis, statistics, and logical puzzles");
        q2.addOption("People Problems|Conflict resolution, human relationships, and social issues");
        q2.addOption("Business Problems|Strategy, efficiency, organizational challenges, and growth");
        q2.addOption("Scientific Problems|Research questions, experimental challenges, and discoveries");
        q2.addOption("Practical Problems|Hands-on fixes, construction, and real-world applications");
        q2.addOption("Service Problems|Customer service, guest satisfaction, and hospitality challenges");
        questions.add(q2);

        // Question 3: Work Environment Preference
        AssessmentQuestion q3 = new AssessmentQuestion("Work Environment",
                "What type of work environment appeals to you most?");
        q3.addOption("Office Environment|Modern office with computers, meetings, and desk work");
        q3.addOption("Laboratory|Research lab with scientific equipment and experiments");
        q3.addOption("Creative Studio|Art studio, design space, or creative workshop");
        q3.addOption("Hospital/Clinic|Medical facilities helping patients and healthcare");
        q3.addOption("Classroom|Educational environment with students and teaching");
        q3.addOption("Hotel/Resort|Hospitality setting with guests, events, and services");
        q3.addOption("Outdoor/Field Work|Working outside, traveling, or coastal/marine areas");
        q3.addOption("Restaurant/Kitchen|Culinary environment, food preparation, and dining services");
        questions.add(q3);

        // Question 4: Skills You Possess or Want to Develop
        AssessmentQuestion q4 = new AssessmentQuestion("Skills",
                "Which skills do you possess or want to develop?");
        q4.addOption("Analytical Skills|Data analysis, critical thinking, and problem solving");
        q4.addOption("Communication Skills|Writing, speaking, presenting ideas, and languages");
        q4.addOption("Technical Skills|Programming, engineering, software, and technical expertise");
        q4.addOption("Creative Skills|Art, design, music, culinary arts, and creative expression");
        q4.addOption("Leadership Skills|Managing teams, leading projects, and decision making");
        q4.addOption("Research Skills|Investigation, experimentation, and scientific discovery");
        q4.addOption("Customer Service|Hospitality, guest relations, and people management");
        q4.addOption("Medical Skills|Patient care, medical knowledge, and healthcare expertise");
        questions.add(q4);

        // Question 5: Hobbies and Free Time Activities
        AssessmentQuestion q5 = new AssessmentQuestion("Hobbies",
                "What do you enjoy doing in your free time?");
        q5.addOption("Coding & Gaming|Programming projects, video games, and tech hobbies");
        q5.addOption("Art & Crafts|Drawing, painting, crafting, and creative projects");
        q5.addOption("Reading & Writing|Books, blogs, stories, and written content");
        q5.addOption("Sports & Fitness|Physical activities, exercise, swimming, and sports");
        q5.addOption("Music & Performance|Playing instruments, singing, performing, or DJing");
        q5.addOption("Cooking|Trying new recipes, experimenting with food, culinary exploration");
        q5.addOption("Travel & Photography|Exploring places, capturing moments, and adventures");
        q5.addOption("Volunteering|Helping others, community service, and social causes");
        q5.addOption("Nature & Outdoors|Beach visits, hiking, marine life, and environmental activities");
        questions.add(q5);

        // Question 6: Core Values
        AssessmentQuestion q6 = new AssessmentQuestion("Values",
                "What matters most to you in a career?");
        q6.addOption("Innovation|Creating new things, innovation, and pushing boundaries");
        q6.addOption("Helping Others|Making a positive impact on people's lives and society");
        q6.addOption("Financial Success|Earning good income, financial stability, and wealth");
        q6.addOption("Work-Life Balance|Time for family, personal interests, and flexible work");
        q6.addOption("Recognition|Being acknowledged for your achievements and expertise");
        q6.addOption("Continuous Learning|Always learning, growing professionally, and gaining knowledge");
        q6.addOption("Creativity & Expression|Artistic freedom, creative expression, and uniqueness");
        q6.addOption("Job Security|Stable job, long-term security, and steady career path");
        questions.add(q6);

        // Question 7: Learning Style
        AssessmentQuestion q7 = new AssessmentQuestion("Learning Style",
                "How do you prefer to learn new things?");
        q7.addOption("Hands-on Practice|Learning by doing, experimenting, and practical work");
        q7.addOption("Reading & Research|Learning through books, articles, and online resources");
        q7.addOption("Visual Learning|Learning through images, diagrams, videos, and demonstrations");
        q7.addOption("Discussion & Collaboration|Learning through talking with others and group work");
        q7.addOption("Structured Courses|Formal education, organized curriculum, and guided learning");
        q7.addOption("Trial & Error|Learning through mistakes, iteration, and experience");
        q7.addOption("Mentorship|Learning from experts, guidance, and one-on-one instruction");
        questions.add(q7);

        // Question 8: Future Goals
        AssessmentQuestion q8 = new AssessmentQuestion("Future Goals",
                "What are your long-term career aspirations?");
        q8.addOption("Start a Business|Be an entrepreneur and run your own company");
        q8.addOption("Become an Expert|Be a specialist in a specific field or domain");
        q8.addOption("Lead a Team|Manage people and lead large projects or organizations");
        q8.addOption("Make Discoveries|Contribute to scientific or technological breakthroughs");
        q8.addOption("Help Society|Make the world a better place through your work");
        q8.addOption("Creative Recognition|Be known for your creative or artistic work");
        q8.addOption("Travel & Explore|Work that involves travel, new places, and experiences");
        q8.addOption("Financial Freedom|Achieve financial independence and wealth");
        questions.add(q8);

        // Question 9: Subject Preferences
        AssessmentQuestion q9 = new AssessmentQuestion("Academic Interests",
                "Which academic subjects do you enjoy or excel in?");
        q9.addOption("Mathematics & Physics|Numbers, calculations, logic, and physical sciences");
        q9.addOption("Biology & Chemistry|Life sciences, medical sciences, and chemical reactions");
        q9.addOption("Computer Science|Programming, algorithms, software, and technology");
        q9.addOption("Commerce & Economics|Business, finance, accounting, and economics");
        q9.addOption("Languages & Literature|English, foreign languages, writing, and communication");
        q9.addOption("Arts & Humanities|History, psychology, sociology, and social sciences");
        q9.addOption("Home Science|Food, nutrition, hotel management, and culinary arts");
        q9.addOption("Environmental Science|Ecology, marine biology, and environmental studies");
        questions.add(q9);

        // Question 10: Work-Life Balance Preference
        AssessmentQuestion q10 = new AssessmentQuestion("Work Preferences",
                "What kind of work schedule appeals to you?");
        q10.addOption("Regular 9-5 Job|Traditional office hours with weekends off");
        q10.addOption("Flexible Hours|Work on your own schedule with flexibility");
        q10.addOption("Shift Work|Rotating shifts including evenings and weekends");
        q10.addOption("Project-Based|Intense work periods followed by breaks");
        q10.addOption("Freelance/Remote|Work from anywhere with independence");
        q10.addOption("Seasonal Work|Busy seasons alternating with quiet periods");
        questions.add(q10);
    }

    public List<CareerRecommendation> generateRecommendations(ArrayList<String> selectedAnswers) {
        // Initialize detailed scores for all career categories
        Map<String, CareerScore> categoryScores = new HashMap<>();

        // Initialize all career categories with their keywords
        initializeCategoryScores(categoryScores);

        // Score based on selected answers with weighted scoring
        for (int i = 0; i < selectedAnswers.size(); i++) {
            String answer = selectedAnswers.get(i);
            int questionWeight = getQuestionWeight(i);
            updateCategoryScores(answer, categoryScores, questionWeight);
        }

        // Generate career recommendations based on scores
        List<CareerRecommendation> recommendations = new ArrayList<>();

        // Convert map to list and sort by score
        List<Map.Entry<String, CareerScore>> sortedEntries = new ArrayList<>(categoryScores.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, CareerScore>>() {
            @Override
            public int compare(Map.Entry<String, CareerScore> o1, Map.Entry<String, CareerScore> o2) {
                return Integer.compare(o2.getValue().score, o1.getValue().score);
            }
        });

        // Create recommendations for top 5 careers with score > 0
        int count = 0;
        for (Map.Entry<String, CareerScore> entry : sortedEntries) {
            String category = entry.getKey();
            CareerScore careerScore = entry.getValue();

            if (careerScore.score > 0 && count < 5) {
                Career career = createCareerFromCategory(category);

                // Calculate match percentage (normalize to 100)
                double maxPossibleScore = selectedAnswers.size() * 3.0; // Max weight is 3
                double matchPercentage = Math.min((careerScore.score * 100.0) / maxPossibleScore, 100.0);

                // Ensure minimum 50% for top recommendations
                if (count == 0 && matchPercentage < 60) matchPercentage = 75.0;
                else if (count == 1 && matchPercentage < 50) matchPercentage = 65.0;
                else if (matchPercentage < 40) matchPercentage = 55.0;

                CareerRecommendation recommendation = new CareerRecommendation(career, matchPercentage);

                // Add specific match reasons
                for (String reason : careerScore.matchReasons) {
                    recommendation.addMatchReason(reason);
                }

                // Add generic reason if no specific reasons
                if (careerScore.matchReasons.isEmpty()) {
                    recommendation.addMatchReason("Your interests and skills align well with " + category);
                }

                recommendations.add(recommendation);
                count++;
            }
        }

        // If less than 3 recommendations, add some default popular careers
        if (recommendations.size() < 3) {
            addDefaultRecommendations(recommendations, selectedAnswers);
        }

        return recommendations;
    }

    private void initializeCategoryScores(Map<String, CareerScore> categoryScores) {
        // Technology careers
        categoryScores.put("Software Developer", new CareerScore());
        categoryScores.put("Data Scientist", new CareerScore());
        categoryScores.put("Cybersecurity Expert", new CareerScore());
        categoryScores.put("Web Developer", new CareerScore());
        categoryScores.put("UI/UX Designer", new CareerScore());

        // Healthcare careers
        categoryScores.put("Medical Doctor", new CareerScore());
        categoryScores.put("Dentist", new CareerScore());
        categoryScores.put("Nurse", new CareerScore());
        categoryScores.put("Pharmacist", new CareerScore());
        categoryScores.put("Physiotherapist", new CareerScore());

        // Business careers
        categoryScores.put("Business Analyst", new CareerScore());
        categoryScores.put("Marketing Manager", new CareerScore());
        categoryScores.put("Chartered Accountant", new CareerScore());
        categoryScores.put("Entrepreneur", new CareerScore());
        categoryScores.put("Financial Analyst", new CareerScore());

        // Goa-specific careers
        categoryScores.put("Hotel Manager", new CareerScore());
        categoryScores.put("Tourism Consultant", new CareerScore());
        categoryScores.put("Marine Biologist", new CareerScore());
        categoryScores.put("Chef", new CareerScore());
        categoryScores.put("Event Manager", new CareerScore());
        categoryScores.put("Mining Engineer", new CareerScore());
        categoryScores.put("Architect", new CareerScore());
        categoryScores.put("Environmental Scientist", new CareerScore());
        categoryScores.put("Portuguese Expert", new CareerScore());
        categoryScores.put("Fisheries Officer", new CareerScore());

        // Arts & Creative
        categoryScores.put("Graphic Designer", new CareerScore());
        categoryScores.put("Fashion Designer", new CareerScore());
        categoryScores.put("Content Writer", new CareerScore());
        categoryScores.put("Photographer", new CareerScore());

        // Engineering
        categoryScores.put("Mechanical Engineer", new CareerScore());
        categoryScores.put("Civil Engineer", new CareerScore());
        categoryScores.put("Electrical Engineer", new CareerScore());

        // Science & Research
        categoryScores.put("Research Scientist", new CareerScore());
        categoryScores.put("Biotechnologist", new CareerScore());

        // Education & Social
        categoryScores.put("Teacher", new CareerScore());
        categoryScores.put("Psychologist", new CareerScore());
        categoryScores.put("Social Worker", new CareerScore());

        // Law & Governance
        categoryScores.put("Lawyer", new CareerScore());
        categoryScores.put("Civil Servant", new CareerScore());
    }

    private int getQuestionWeight(int questionIndex) {
        // Questions 0-1 (Interests, Problem Solving) have highest weight
        if (questionIndex <= 1) return 3;
        // Questions 2-4 (Environment, Skills, Hobbies) have medium weight
        if (questionIndex <= 4) return 2;
        // Remaining questions have normal weight
        return 1;
    }

    private void updateCategoryScores(String answer, Map<String, CareerScore> categoryScores, int weight) {
        String lowerAnswer = answer.toLowerCase();

        // ===========================
        // TECHNOLOGY CAREER MATCHING
        // ===========================
        if (containsAny(lowerAnswer, "programming", "technology", "technical", "coding", "software",
                "computer science", "algorithms")) {
            addScore(categoryScores, "Software Developer", weight, "Strong interest in programming and technology");
            addScore(categoryScores, "Web Developer", weight - 1, "Interest in technology and development");
        }

        if (containsAny(lowerAnswer, "data analysis", "statistics", "mathematical", "analytics")) {
            addScore(categoryScores, "Data Scientist", weight, "Strong analytical and mathematical skills");
            addScore(categoryScores, "Business Analyst", weight - 1, "Analytical thinking ability");
        }

        if (containsAny(lowerAnswer, "security", "ethical", "technical problems", "debugging")) {
            addScore(categoryScores, "Cybersecurity Expert", weight, "Interest in security and technical problem solving");
        }

        if (containsAny(lowerAnswer, "design", "user", "visual", "creative studio", "art & design")) {
            addScore(categoryScores, "UI/UX Designer", weight, "Creative design skills and user focus");
            addScore(categoryScores, "Graphic Designer", weight, "Visual and creative abilities");
        }

        // ============================
        // HEALTHCARE CAREER MATCHING
        // ============================
        if (containsAny(lowerAnswer, "healthcare", "medicine", "hospital", "clinic", "medical",
                "helping others", "patient care")) {
            addScore(categoryScores, "Medical Doctor", weight, "Strong interest in healthcare and helping people");
            addScore(categoryScores, "Nurse", weight - 1, "Interest in patient care");
        }

        if (containsAny(lowerAnswer, "biology", "chemistry", "life sciences", "medical sciences")) {
            addScore(categoryScores, "Medical Doctor", weight, "Strong foundation in medical sciences");
            addScore(categoryScores, "Pharmacist", weight - 1, "Interest in biological sciences");
            addScore(categoryScores, "Biotechnologist", weight - 1, "Interest in life sciences");
        }

        if (containsAny(lowerAnswer, "dental", "teeth", "oral")) {
            addScore(categoryScores, "Dentist", weight, "Interest in dental care");
        }

        // ============================
        // BUSINESS CAREER MATCHING
        // ============================
        if (containsAny(lowerAnswer, "business", "finance", "financial", "commerce", "economics",
                "accounting", "investment")) {
            addScore(categoryScores, "Business Analyst", weight, "Interest in business and finance");
            addScore(categoryScores, "Chartered Accountant", weight, "Strong finance and commerce background");
            addScore(categoryScores, "Financial Analyst", weight, "Interest in financial analysis");
        }

        if (containsAny(lowerAnswer, "leadership", "lead a team", "managing", "entrepreneur",
                "start a business", "business problems")) {
            addScore(categoryScores, "Entrepreneur", weight, "Entrepreneurial mindset and leadership");
            addScore(categoryScores, "Marketing Manager", weight - 1, "Leadership and business skills");
        }

        if (containsAny(lowerAnswer, "marketing", "strategy", "customer", "business problems")) {
            addScore(categoryScores, "Marketing Manager", weight, "Interest in marketing and strategy");
        }

        // ======================================
        // GOA-SPECIFIC CAREER MATCHING
        // ======================================
        if (containsAny(lowerAnswer, "hospitality", "tourism", "hotel", "resort", "guest",
                "travel", "service problems", "customer service")) {
            addScore(categoryScores, "Hotel Manager", weight, "Strong interest in hospitality and tourism");
            addScore(categoryScores, "Tourism Consultant", weight, "Interest in travel and tourism");
            addScore(categoryScores, "Event Manager", weight - 1, "Service and customer management skills");
        }

        if (containsAny(lowerAnswer, "cooking", "culinary", "food", "restaurant", "kitchen",
                "home science", "recipes")) {
            addScore(categoryScores, "Chef", weight, "Passion for culinary arts and food");
        }

        if (containsAny(lowerAnswer, "marine", "ocean", "coastal", "beach", "fisheries",
                "environmental science", "outdoors", "nature")) {
            addScore(categoryScores, "Marine Biologist", weight, "Interest in marine life and coastal ecosystems");
            addScore(categoryScores, "Fisheries Officer", weight, "Interest in marine and fisheries sector");
            addScore(categoryScores, "Environmental Scientist", weight, "Interest in environment and nature");
        }

        if (containsAny(lowerAnswer, "event", "parties", "organizing", "coordination", "music & performance")) {
            addScore(categoryScores, "Event Manager", weight, "Interest in event planning and coordination");
        }

        if (containsAny(lowerAnswer, "mining", "mineral", "extraction")) {
            addScore(categoryScores, "Mining Engineer", weight, "Interest in mining sector");
        }

        if (containsAny(lowerAnswer, "architecture", "building", "design", "construction", "creative studio")) {
            addScore(categoryScores, "Architect", weight, "Interest in architectural design");
            addScore(categoryScores, "Civil Engineer", weight - 1, "Interest in construction and design");
        }

        if (containsAny(lowerAnswer, "environmental", "conservation", "ecology", "sustainability",
                "pollution", "nature & outdoors")) {
            addScore(categoryScores, "Environmental Scientist", weight, "Interest in environmental conservation");
        }

        if (containsAny(lowerAnswer, "portuguese", "language", "foreign", "translation")) {
            addScore(categoryScores, "Portuguese Expert", weight, "Interest in languages and translation");
        }

        // ============================
        // ARTS & CREATIVE MATCHING
        // ============================
        if (containsAny(lowerAnswer, "art", "graphic", "design", "visual", "creative",
                "drawing", "painting")) {
            addScore(categoryScores, "Graphic Designer", weight, "Strong creative and artistic abilities");
            addScore(categoryScores, "Fashion Designer", weight - 1, "Creative and design skills");
        }

        if (containsAny(lowerAnswer, "writing", "content", "blog", "communication", "reading & writing")) {
            addScore(categoryScores, "Content Writer", weight, "Strong writing and communication skills");
            addScore(categoryScores, "Teacher", weight - 1, "Communication and knowledge sharing");
        }

        if (containsAny(lowerAnswer, "photography", "camera", "visual", "travel & photography")) {
            addScore(categoryScores, "Photographer", weight, "Interest in photography and visual arts");
        }

        if (containsAny(lowerAnswer, "fashion", "clothing", "textiles", "style")) {
            addScore(categoryScores, "Fashion Designer", weight, "Interest in fashion and design");
        }

        // ============================
        // ENGINEERING CAREER MATCHING
        // ============================
        if (containsAny(lowerAnswer, "mechanical", "machines", "manufacturing", "automobile")) {
            addScore(categoryScores, "Mechanical Engineer", weight, "Interest in mechanical systems");
        }

        if (containsAny(lowerAnswer, "civil", "construction", "infrastructure", "building",
                "roads", "bridges")) {
            addScore(categoryScores, "Civil Engineer", weight, "Interest in civil engineering and construction");
        }

        if (containsAny(lowerAnswer, "electrical", "electronics", "circuits", "power")) {
            addScore(categoryScores, "Electrical Engineer", weight, "Interest in electrical systems");
        }

        if (containsAny(lowerAnswer, "hands-on", "practical", "trial & error", "outdoor",
                "field work", "experiments")) {
            addScore(categoryScores, "Mechanical Engineer", weight - 1, "Hands-on and practical approach");
            addScore(categoryScores, "Civil Engineer", weight - 1, "Interest in practical work");
        }

        // ============================
        // SCIENCE & RESEARCH MATCHING
        // ============================
        if (containsAny(lowerAnswer, "science", "research", "laboratory", "experiment",
                "discovery", "scientific", "investigation")) {
            addScore(categoryScores, "Research Scientist", weight, "Strong interest in scientific research");
            addScore(categoryScores, "Biotechnologist", weight - 1, "Interest in scientific work");
        }

        if (containsAny(lowerAnswer, "biotechnology", "genetics", "biotech", "biology")) {
            addScore(categoryScores, "Biotechnologist", weight, "Interest in biotechnology");
        }

        // ================================
        // EDUCATION & SOCIAL WORK MATCHING
        // ================================
        if (containsAny(lowerAnswer, "education", "teaching", "classroom", "learning",
                "knowledge", "students")) {
            addScore(categoryScores, "Teacher", weight, "Interest in education and teaching");
        }

        if (containsAny(lowerAnswer, "psychology", "counseling", "mental health", "helping",
                "empathy", "people problems")) {
            addScore(categoryScores, "Psychologist", weight, "Interest in psychology and counseling");
            addScore(categoryScores, "Social Worker", weight - 1, "Empathy and desire to help others");
        }

        if (containsAny(lowerAnswer, "volunteering", "social", "community", "help society",
                "social causes")) {
            addScore(categoryScores, "Social Worker", weight, "Strong social conscience and helping nature");
            addScore(categoryScores, "Psychologist", weight - 1, "Interest in helping people");
        }

        // ============================
        // LAW & GOVERNANCE MATCHING
        // ============================
        if (containsAny(lowerAnswer, "law", "legal", "justice", "advocate", "court")) {
            addScore(categoryScores, "Lawyer", weight, "Interest in law and justice");
        }

        if (containsAny(lowerAnswer, "government", "administration", "public service", "civil servant",
                "ias", "ips", "policy")) {
            addScore(categoryScores, "Civil Servant", weight, "Interest in public service and governance");
        }

        if (containsAny(lowerAnswer, "help society", "make the world", "social impact", "leadership")) {
            addScore(categoryScores, "Civil Servant", weight - 1, "Desire for social impact");
            addScore(categoryScores, "Social Worker", weight - 1, "Interest in helping society");
        }
    }

    // Helper method to check if string contains any of the keywords
    private boolean containsAny(String text, String... keywords) {
        for (String keyword : keywords) {
            if (text.contains(keyword.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    // Helper method to add score to a career category
    private void addScore(Map<String, CareerScore> scores, String category, int points, String reason) {
        if (scores.containsKey(category)) {
            CareerScore careerScore = scores.get(category);
            careerScore.score += points;
            if (!careerScore.matchReasons.contains(reason)) {
                careerScore.matchReasons.add(reason);
            }
        }
    }

    // Helper class to track career scores and reasons
    private static class CareerScore {
        int score = 0;
        List<String> matchReasons = new ArrayList<>();
    }

    private void addDefaultRecommendations(List<CareerRecommendation> recommendations,
                                           ArrayList<String> selectedAnswers) {
        // Add some default popular careers if we don't have enough recommendations
        if (recommendations.size() < 3) {
            Career defaultCareer = createCareerFromCategory("Software Developer");
            CareerRecommendation rec = new CareerRecommendation(defaultCareer, 50.0);
            rec.addMatchReason("High-demand career with excellent growth opportunities");
            recommendations.add(rec);
        }
    }

    private Career createCareerFromCategory(String category) {
        Career career = new Career();

        switch (category) {
            // ===========================
            // TECHNOLOGY CAREERS
            // ===========================
            case "Software Developer":
                career.setCareerName("Software Developer");
                career.setDescription("Design, develop, and maintain software applications and systems");
                career.setSalaryRange("₹6-25 LPA");
                career.setGrowthProspects("Excellent growth opportunities in IT industry with remote work options");
                career.getRequiredSkills().add("Programming");
                career.getRequiredSkills().add("Problem Solving");
                career.getRequiredSkills().add("Logical Thinking");
                career.getEducationPaths().add("Computer Science Engineering");
                career.getEducationPaths().add("Information Technology");
                career.getEducationPaths().add("BCA/MCA");
                break;

            case "Data Scientist":
                career.setCareerName("Data Scientist");
                career.setDescription("Analyze complex data and provide insights for business decisions using AI and ML");
                career.setSalaryRange("₹8-30 LPA");
                career.setGrowthProspects("Extremely high demand in analytics and AI field");
                career.getRequiredSkills().add("Statistics");
                career.getRequiredSkills().add("Machine Learning");
                career.getRequiredSkills().add("Programming");
                career.getEducationPaths().add("Data Science");
                career.getEducationPaths().add("Computer Science");
                career.getEducationPaths().add("Mathematics");
                break;

            case "Cybersecurity Expert":
                career.setCareerName("Cybersecurity Expert");
                career.setDescription("Protect organizations from cyber threats, hackers, and data breaches");
                career.setSalaryRange("₹7-28 LPA");
                career.setGrowthProspects("Rapidly growing field with severe talent shortage");
                career.getRequiredSkills().add("Network Security");
                career.getRequiredSkills().add("Ethical Hacking");
                career.getRequiredSkills().add("Risk Assessment");
                career.getEducationPaths().add("Computer Science");
                career.getEducationPaths().add("Cybersecurity");
                career.getEducationPaths().add("Information Security");
                break;

            case "Web Developer":
                career.setCareerName("Web Developer");
                career.setDescription("Build websites and web applications using modern technologies");
                career.setSalaryRange("₹4-18 LPA");
                career.setGrowthProspects("Strong demand with digital transformation across industries");
                career.getRequiredSkills().add("HTML/CSS/JavaScript");
                career.getRequiredSkills().add("Web Frameworks");
                career.getRequiredSkills().add("Problem Solving");
                career.getEducationPaths().add("Computer Science");
                career.getEducationPaths().add("Information Technology");
                career.getEducationPaths().add("Web Development");
                break;

            case "UI/UX Designer":
                career.setCareerName("UI/UX Designer");
                career.setDescription("Design user interfaces and experiences for digital products");
                career.setSalaryRange("₹4-18 LPA");
                career.setGrowthProspects("High demand in tech companies and startups");
                career.getRequiredSkills().add("User Research");
                career.getRequiredSkills().add("Prototyping");
                career.getRequiredSkills().add("Design Tools");
                career.getEducationPaths().add("Design");
                career.getEducationPaths().add("HCI");
                career.getEducationPaths().add("Graphic Design");
                break;

            // ===========================
            // HEALTHCARE CAREERS
            // ===========================
            case "Medical Doctor":
                career.setCareerName("Medical Doctor");
                career.setDescription("Diagnose and treat patients, promote health and prevent diseases");
                career.setSalaryRange("₹8-50 LPA");
                career.setGrowthProspects("High respect, job security, and excellent earning potential");
                career.getRequiredSkills().add("Medical Knowledge");
                career.getRequiredSkills().add("Empathy");
                career.getRequiredSkills().add("Communication");
                career.getEducationPaths().add("MBBS");
                career.getEducationPaths().add("MD");
                career.getEducationPaths().add("MS");
                break;

            case "Dentist":
                career.setCareerName("Dentist");
                career.setDescription("Diagnose and treat dental problems, perform oral surgeries");
                career.setSalaryRange("₹6-30 LPA");
                career.setGrowthProspects("Good income potential with option to start own practice");
                career.getRequiredSkills().add("Dental Knowledge");
                career.getRequiredSkills().add("Precision");
                career.getRequiredSkills().add("Patient Care");
                career.getEducationPaths().add("BDS");
                career.getEducationPaths().add("MDS");
                career.getEducationPaths().add("Dental Surgery");
                break;

            case "Nurse":
                career.setCareerName("Nurse");
                career.setDescription("Provide patient care and support in healthcare settings");
                career.setSalaryRange("₹3-10 LPA");
                career.setGrowthProspects("Steady demand in healthcare sector with opportunities abroad");
                career.getRequiredSkills().add("Patient Care");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Medical Knowledge");
                career.getEducationPaths().add("BSc Nursing");
                career.getEducationPaths().add("GNM");
                career.getEducationPaths().add("Post-Basic Nursing");
                break;

            case "Pharmacist":
                career.setCareerName("Pharmacist");
                career.setDescription("Dispense medications and counsel patients on proper drug usage");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Stable career with opportunities in retail and hospital settings");
                career.getRequiredSkills().add("Pharmaceutical Knowledge");
                career.getRequiredSkills().add("Attention to Detail");
                career.getRequiredSkills().add("Customer Service");
                career.getEducationPaths().add("B.Pharm");
                career.getEducationPaths().add("PharmD");
                career.getEducationPaths().add("M.Pharm");
                break;

            case "Physiotherapist":
                career.setCareerName("Physiotherapist");
                career.setDescription("Help patients recover from injuries and improve mobility through therapy");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Growing awareness and demand for physiotherapy services");
                career.getRequiredSkills().add("Therapeutic Knowledge");
                career.getRequiredSkills().add("Patient Assessment");
                career.getRequiredSkills().add("Communication");
                career.getEducationPaths().add("BPT");
                career.getEducationPaths().add("MPT");
                career.getEducationPaths().add("Physiotherapy");
                break;

            // ===========================
            // BUSINESS CAREERS
            // ===========================
            case "Business Analyst":
                career.setCareerName("Business Analyst");
                career.setDescription("Analyze business processes and recommend improvements using data");
                career.setSalaryRange("₹5-20 LPA");
                career.setGrowthProspects("Good corporate opportunities with path to management roles");
                career.getRequiredSkills().add("Analytical Thinking");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Business Acumen");
                career.getEducationPaths().add("MBA");
                career.getEducationPaths().add("BBA");
                career.getEducationPaths().add("Commerce");
                break;

            case "Marketing Manager":
                career.setCareerName("Marketing Manager");
                career.setDescription("Plan and execute marketing strategies for products and services");
                career.setSalaryRange("₹6-25 LPA");
                career.setGrowthProspects("Creative and dynamic field with excellent growth potential");
                career.getRequiredSkills().add("Marketing Strategy");
                career.getRequiredSkills().add("Leadership");
                career.getRequiredSkills().add("Creativity");
                career.getEducationPaths().add("MBA Marketing");
                career.getEducationPaths().add("BBA");
                career.getEducationPaths().add("Mass Communication");
                break;

            case "Chartered Accountant":
                career.setCareerName("Chartered Accountant (CA)");
                career.setDescription("Provide accounting, auditing, taxation, and financial advisory services");
                career.setSalaryRange("₹7-35 LPA");
                career.setGrowthProspects("Excellent career prospects with high earning potential");
                career.getRequiredSkills().add("Accounting");
                career.getRequiredSkills().add("Taxation");
                career.getRequiredSkills().add("Financial Analysis");
                career.getEducationPaths().add("CA");
                career.getEducationPaths().add("Commerce");
                career.getEducationPaths().add("BCom");
                break;

            case "Entrepreneur":
                career.setCareerName("Entrepreneur / Business Owner");
                career.setDescription("Start and run your own business, create innovative solutions");
                career.setSalaryRange("₹0-50+ LPA (Variable)");
                career.setGrowthProspects("Unlimited potential based on business success");
                career.getRequiredSkills().add("Leadership");
                career.getRequiredSkills().add("Risk Taking");
                career.getRequiredSkills().add("Business Planning");
                career.getEducationPaths().add("MBA");
                career.getEducationPaths().add("BBA");
                career.getEducationPaths().add("Any Field");
                break;

            case "Financial Analyst":
                career.setCareerName("Financial Analyst");
                career.setDescription("Analyze financial data and provide investment recommendations");
                career.setSalaryRange("₹5-20 LPA");
                career.setGrowthProspects("Strong demand in banking and financial services sector");
                career.getRequiredSkills().add("Financial Modeling");
                career.getRequiredSkills().add("Data Analysis");
                career.getRequiredSkills().add("Investment Knowledge");
                career.getEducationPaths().add("Finance");
                career.getEducationPaths().add("MBA Finance");
                career.getEducationPaths().add("BCom");
                break;

            // ======================================
            // GOA-SPECIFIC CAREERS
            // ======================================
            case "Hotel Manager":
                career.setCareerName("Hotel Manager");
                career.setDescription("Manage hotel operations in Goa's thriving tourism industry with 8M+ annual tourists");
                career.setSalaryRange("₹5-18 LPA");
                career.setGrowthProspects("Excellent growth with Goa's booming tourism - 12% annual growth expected");
                career.getRequiredSkills().add("Hospitality Management");
                career.getRequiredSkills().add("Customer Service");
                career.getRequiredSkills().add("Leadership");
                career.getEducationPaths().add("Hotel Management");
                career.getEducationPaths().add("Tourism & Hospitality Management");
                career.getEducationPaths().add("BBA Hospitality");
                break;

            case "Tourism Consultant":
                career.setCareerName("Tourism Consultant");
                career.setDescription("Plan tourism packages and guide tourists in Goa's vibrant tourism sector");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("High demand with growing domestic and international tourism in Goa");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Marketing");
                career.getRequiredSkills().add("Local Knowledge");
                career.getEducationPaths().add("Tourism Management");
                career.getEducationPaths().add("Travel & Tourism");
                career.getEducationPaths().add("Bachelor in Tourism Studies");
                break;

            case "Marine Biologist":
                career.setCareerName("Marine Biologist");
                career.setDescription("Study marine ecosystems on Goa's 105km coastline with institutes like NIO");
                career.setSalaryRange("₹4-15 LPA");
                career.setGrowthProspects("Stable career with research institutions in Goa");
                career.getRequiredSkills().add("Research Skills");
                career.getRequiredSkills().add("Scientific Analysis");
                career.getRequiredSkills().add("Environmental Knowledge");
                career.getEducationPaths().add("Marine Science");
                career.getEducationPaths().add("Fisheries Science");
                career.getEducationPaths().add("BSc Marine Biology");
                break;

            case "Chef":
                career.setCareerName("Chef / Culinary Expert");
                career.setDescription("Create delicious cuisines in Goa's restaurants, hotels, and beach shacks");
                career.setSalaryRange("₹3-15 LPA");
                career.setGrowthProspects("Excellent opportunities in Goa's hospitality sector");
                career.getRequiredSkills().add("Cooking Techniques");
                career.getRequiredSkills().add("Creativity");
                career.getRequiredSkills().add("Time Management");
                career.getEducationPaths().add("Culinary Arts");
                career.getEducationPaths().add("Hotel Management");
                career.getEducationPaths().add("Diploma in Culinary Arts");
                break;

            case "Event Manager":
                career.setCareerName("Event Manager");
                career.setDescription("Organize events, weddings, and festivals in Goa (100+ major events annually)");
                career.setSalaryRange("₹4-16 LPA");
                career.setGrowthProspects("Growing demand with Goa becoming India's event destination");
                career.getRequiredSkills().add("Event Planning");
                career.getRequiredSkills().add("Coordination");
                career.getRequiredSkills().add("Budgeting");
                career.getEducationPaths().add("Event Management");
                career.getEducationPaths().add("Hotel Management");
                career.getEducationPaths().add("MBA Marketing");
                break;

            case "Mining Engineer":
                career.setCareerName("Mining Engineer");
                career.setDescription("Plan and supervise mining operations in Goa's iron ore and manganese mines");
                career.setSalaryRange("₹5-18 LPA");
                career.setGrowthProspects("Steady demand in Goa's mining industry");
                career.getRequiredSkills().add("Engineering Knowledge");
                career.getRequiredSkills().add("Safety Management");
                career.getRequiredSkills().add("Project Planning");
                career.getEducationPaths().add("Mining Engineering");
                career.getEducationPaths().add("BE Mining");
                career.getEducationPaths().add("BTech Mining");
                break;

            case "Architect":
                career.setCareerName("Architect");
                career.setDescription("Design buildings preserving Goa's unique Portuguese-Indo architecture");
                career.setSalaryRange("₹4-20 LPA");
                career.setGrowthProspects("Good opportunities with Goa's real estate and heritage projects");
                career.getRequiredSkills().add("Design Skills");
                career.getRequiredSkills().add("Technical Drawing");
                career.getRequiredSkills().add("Creativity");
                career.getEducationPaths().add("Architecture");
                career.getEducationPaths().add("BArch");
                career.getEducationPaths().add("MArch");
                break;

            case "Environmental Scientist":
                career.setCareerName("Environmental Scientist");
                career.setDescription("Work on conservation and sustainability projects in coastal Goa");
                career.setSalaryRange("₹4-14 LPA");
                career.setGrowthProspects("Growing demand with focus on sustainable tourism");
                career.getRequiredSkills().add("Environmental Assessment");
                career.getRequiredSkills().add("Research");
                career.getRequiredSkills().add("Data Analysis");
                career.getEducationPaths().add("Environmental Science");
                career.getEducationPaths().add("BSc Environmental Science");
                career.getEducationPaths().add("MSc Environmental Management");
                break;

            case "Portuguese Expert":
                career.setCareerName("Portuguese Language Expert");
                career.setDescription("Teach Portuguese or work as translator leveraging Goa's 450-year heritage");
                career.setSalaryRange("₹3-10 LPA");
                career.setGrowthProspects("Unique niche with demand in tourism and education");
                career.getRequiredSkills().add("Language Proficiency");
                career.getRequiredSkills().add("Translation");
                career.getRequiredSkills().add("Communication");
                career.getEducationPaths().add("Portuguese Language & Culture");
                career.getEducationPaths().add("Foreign Languages");
                career.getEducationPaths().add("BA Languages");
                break;

            case "Fisheries Officer":
                career.setCareerName("Fisheries Officer");
                career.setDescription("Manage fisheries resources and support fishing communities in coastal Goa");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Stable government and private sector opportunities");
                career.getRequiredSkills().add("Fisheries Management");
                career.getRequiredSkills().add("Community Engagement");
                career.getRequiredSkills().add("Technical Knowledge");
                career.getEducationPaths().add("Fisheries Science");
                career.getEducationPaths().add("BSc Fisheries");
                career.getEducationPaths().add("Marine Science");
                break;

            // ===========================
            // ARTS & CREATIVE CAREERS
            // ===========================
            case "Graphic Designer":
                career.setCareerName("Graphic Designer");
                career.setDescription("Create visual concepts and designs for various media");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Growing digital media demand with remote work opportunities");
                career.getRequiredSkills().add("Creativity");
                career.getRequiredSkills().add("Design Software");
                career.getRequiredSkills().add("Visual Communication");
                career.getEducationPaths().add("Fine Arts");
                career.getEducationPaths().add("Graphic Design");
                career.getEducationPaths().add("Visual Communication");
                break;

            case "Fashion Designer":
                career.setCareerName("Fashion Designer");
                career.setDescription("Design clothing and accessories, create fashion collections");
                career.setSalaryRange("₹3-15 LPA");
                career.setGrowthProspects("Creative field with opportunities for entrepreneurship");
                career.getRequiredSkills().add("Design Creativity");
                career.getRequiredSkills().add("Sketching");
                career.getRequiredSkills().add("Fabric Knowledge");
                career.getEducationPaths().add("Fashion Design");
                career.getEducationPaths().add("Textile Design");
                career.getEducationPaths().add("Apparel Design");
                break;

            case "Content Writer":
                career.setCareerName("Content Writer / Copywriter");
                career.setDescription("Write engaging content for websites, blogs, and marketing materials");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("High demand with digital marketing boom");
                career.getRequiredSkills().add("Writing");
                career.getRequiredSkills().add("Creativity");
                career.getRequiredSkills().add("SEO Knowledge");
                career.getEducationPaths().add("Journalism");
                career.getEducationPaths().add("Mass Communication");
                career.getEducationPaths().add("English Literature");
                break;

            case "Photographer":
                career.setCareerName("Photographer / Videographer");
                career.setDescription("Capture moments through photography and videography");
                career.setSalaryRange("₹3-15 LPA");
                career.setGrowthProspects("Growing demand with social media and digital content boom");
                career.getRequiredSkills().add("Photography");
                career.getRequiredSkills().add("Editing");
                career.getRequiredSkills().add("Creativity");
                career.getEducationPaths().add("Photography");
                career.getEducationPaths().add("Visual Arts");
                career.getEducationPaths().add("Mass Communication");
                break;

            // ===========================
            // ENGINEERING CAREERS
            // ===========================
            case "Mechanical Engineer":
                career.setCareerName("Mechanical Engineer");
                career.setDescription("Design, develop, and test mechanical systems and machinery");
                career.setSalaryRange("₹4-15 LPA");
                career.setGrowthProspects("Steady demand in manufacturing and automotive industries");
                career.getRequiredSkills().add("Engineering Design");
                career.getRequiredSkills().add("CAD Software");
                career.getRequiredSkills().add("Problem Solving");
                career.getEducationPaths().add("Mechanical Engineering");
                career.getEducationPaths().add("BE Mechanical");
                career.getEducationPaths().add("BTech Mechanical");
                break;

            case "Civil Engineer":
                career.setCareerName("Civil Engineer");
                career.setDescription("Design and supervise construction of infrastructure projects");
                career.setSalaryRange("₹4-15 LPA");
                career.setGrowthProspects("Steady demand in construction and infrastructure development");
                career.getRequiredSkills().add("Technical Drawing");
                career.getRequiredSkills().add("Project Management");
                career.getRequiredSkills().add("Structural Analysis");
                career.getEducationPaths().add("Civil Engineering");
                career.getEducationPaths().add("BE Civil");
                career.getEducationPaths().add("BTech Civil");
                break;

            case "Electrical Engineer":
                career.setCareerName("Electrical Engineer");
                career.setDescription("Design and maintain electrical systems and equipment");
                career.setSalaryRange("₹4-16 LPA");
                career.setGrowthProspects("Good opportunities in power and electronics industries");
                career.getRequiredSkills().add("Circuit Design");
                career.getRequiredSkills().add("Electronics");
                career.getRequiredSkills().add("Problem Solving");
                career.getEducationPaths().add("Electrical Engineering");
                career.getEducationPaths().add("BE Electrical");
                career.getEducationPaths().add("BTech EEE");
                break;

            // ===========================
            // SCIENCE & RESEARCH CAREERS
            // ===========================
            case "Research Scientist":
                career.setCareerName("Research Scientist");
                career.setDescription("Conduct research to advance scientific knowledge");
                career.setSalaryRange("₹4-18 LPA");
                career.setGrowthProspects("Opportunities in research institutions and industry R&D");
                career.getRequiredSkills().add("Research Methods");
                career.getRequiredSkills().add("Critical Thinking");
                career.getRequiredSkills().add("Data Analysis");
                career.getEducationPaths().add("MSc");
                career.getEducationPaths().add("PhD");
                career.getEducationPaths().add("BSc");
                break;

            case "Biotechnologist":
                career.setCareerName("Biotechnologist");
                career.setDescription("Apply biological processes in healthcare, agriculture, and environment");
                career.setSalaryRange("₹4-15 LPA");
                career.setGrowthProspects("Growing field with applications in medicine and agriculture");
                career.getRequiredSkills().add("Laboratory Techniques");
                career.getRequiredSkills().add("Research Skills");
                career.getRequiredSkills().add("Data Analysis");
                career.getEducationPaths().add("Biotechnology");
                career.getEducationPaths().add("BSc Biotech");
                career.getEducationPaths().add("MSc Biotech");
                break;

            // ===========================
            // EDUCATION & SOCIAL WORK
            // ===========================
            case "Teacher":
                career.setCareerName("Teacher / Professor");
                career.setDescription("Educate students and shape future generations");
                career.setSalaryRange("₹3-15 LPA");
                career.setGrowthProspects("Stable career with social impact and job security");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Patience");
                career.getRequiredSkills().add("Subject Knowledge");
                career.getEducationPaths().add("B.Ed");
                career.getEducationPaths().add("M.Ed");
                career.getEducationPaths().add("Subject Degree + B.Ed");
                break;

            case "Psychologist":
                career.setCareerName("Psychologist / Counselor");
                career.setDescription("Help people deal with mental health and emotional challenges");
                career.setSalaryRange("₹3-12 LPA");
                career.setGrowthProspects("Growing awareness about mental health increasing demand");
                career.getRequiredSkills().add("Empathy");
                career.getRequiredSkills().add("Listening");
                career.getRequiredSkills().add("Counseling Techniques");
                career.getEducationPaths().add("Psychology");
                career.getEducationPaths().add("MA Psychology");
                career.getEducationPaths().add("Clinical Psychology");
                break;

            case "Social Worker":
                career.setCareerName("Social Worker");
                career.setDescription("Help communities overcome challenges and improve lives");
                career.setSalaryRange("₹2-8 LPA");
                career.setGrowthProspects("Meaningful work with social impact");
                career.getRequiredSkills().add("Empathy");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Counseling");
                career.getEducationPaths().add("Social Work");
                career.getEducationPaths().add("MSW");
                career.getEducationPaths().add("Sociology");
                break;

            // ===========================
            // LAW & GOVERNANCE
            // ===========================
            case "Lawyer":
                career.setCareerName("Lawyer / Advocate");
                career.setDescription("Represent clients in legal matters and argue cases in court");
                career.setSalaryRange("₹4-30 LPA");
                career.setGrowthProspects("Prestigious career with good earning potential");
                career.getRequiredSkills().add("Legal Knowledge");
                career.getRequiredSkills().add("Communication");
                career.getRequiredSkills().add("Critical Thinking");
                career.getEducationPaths().add("LLB");
                career.getEducationPaths().add("BA LLB");
                career.getEducationPaths().add("LLM");
                break;

            case "Civil Servant":
                career.setCareerName("Civil Servant (IAS/IPS/IFS)");
                career.setDescription("Serve the nation through administrative or foreign services");
                career.setSalaryRange("₹8-25 LPA");
                career.setGrowthProspects("Prestigious career with power to make societal impact");
                career.getRequiredSkills().add("Leadership");
                career.getRequiredSkills().add("Decision Making");
                career.getRequiredSkills().add("Public Administration");
                career.getEducationPaths().add("Any Graduation");
                career.getEducationPaths().add("Public Administration");
                career.getEducationPaths().add("Political Science");
                break;

            default:
                // Default fallback
                career.setCareerName("Software Developer");
                career.setDescription("Design, develop, and maintain software applications");
                career.setSalaryRange("₹6-25 LPA");
                career.setGrowthProspects("Excellent growth opportunities");
                career.getRequiredSkills().add("Programming");
                career.getRequiredSkills().add("Problem Solving");
                career.getEducationPaths().add("Computer Science");
                break;
        }

        return career;
    }
}
