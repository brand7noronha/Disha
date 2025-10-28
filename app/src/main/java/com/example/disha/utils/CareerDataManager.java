package com.example.disha.utils;

import com.example.disha.models.Career;

import java.util.ArrayList;
import java.util.List;

/**
 * UPDATED CareerDataManager with Goa-specific careers and comprehensive career options
 * Includes careers aligned with Goa's tourism, hospitality, marine, and tech sectors
 * Also maintains national-level career opportunities
 */
public class CareerDataManager {

    public List<Career> getAllCareers() {
        List<Career> careers = new ArrayList<>();

        // ====================
        // GOA-SPECIFIC CAREERS
        // ====================

        // 1. Hotel Manager (Goa Tourism Industry)
        Career hotelManager = new Career("Hotel Manager",
                "Manage hotel operations, guest services, and staff in Goa's thriving hospitality sector. " +
                        "With 8M+ tourists annually, Goa has 1000+ hotels and resorts offering excellent career opportunities.");
        hotelManager.setSalaryRange("₹5-18 LPA");
        hotelManager.setGrowthProspects("Excellent growth with Goa's booming tourism industry - expected to grow 12% annually");
        hotelManager.getRequiredSkills().add("Hospitality Management");
        hotelManager.getRequiredSkills().add("Customer Service");
        hotelManager.getRequiredSkills().add("Leadership");
        hotelManager.getRequiredSkills().add("Problem Solving");
        hotelManager.getEducationPaths().add("Hotel Management");
        hotelManager.getEducationPaths().add("Tourism & Hospitality Management");
        hotelManager.getEducationPaths().add("BBA Hospitality");
        careers.add(hotelManager);

        // 2. Tourism Consultant
        Career tourismConsultant = new Career("Tourism Consultant",
                "Plan tourism packages, guide tourists, and promote Goa's attractions. Work with travel agencies, " +
                        "tour operators, or start your own tourism business in Goa.");
        tourismConsultant.setSalaryRange("₹3-12 LPA");
        tourismConsultant.setGrowthProspects("High demand with growing domestic and international tourism in Goa");
        tourismConsultant.getRequiredSkills().add("Communication");
        tourismConsultant.getRequiredSkills().add("Marketing");
        tourismConsultant.getRequiredSkills().add("Local Knowledge");
        tourismConsultant.getRequiredSkills().add("Customer Relations");
        tourismConsultant.getEducationPaths().add("Tourism Management");
        tourismConsultant.getEducationPaths().add("Travel & Tourism");
        tourismConsultant.getEducationPaths().add("Bachelor in Tourism Studies");
        careers.add(tourismConsultant);

        // 3. Marine Biologist (Goa's Coastal Advantage)
        Career marineBiologist = new Career("Marine Biologist",
                "Study marine ecosystems, conduct research on Goa's 105km coastline, and work with institutes like " +
                        "NIO Goa (National Institute of Oceanography). Contribute to marine conservation and fisheries.");
        marineBiologist.setSalaryRange("₹4-15 LPA");
        marineBiologist.setGrowthProspects("Stable career with research institutions and environmental organizations in Goa");
        marineBiologist.getRequiredSkills().add("Research Skills");
        marineBiologist.getRequiredSkills().add("Scientific Analysis");
        marineBiologist.getRequiredSkills().add("Environmental Knowledge");
        marineBiologist.getRequiredSkills().add("Data Collection");
        marineBiologist.getEducationPaths().add("Marine Science");
        marineBiologist.getEducationPaths().add("Fisheries Science");
        marineBiologist.getEducationPaths().add("BSc Marine Biology");
        careers.add(marineBiologist);

        // 4. Chef/Culinary Expert
        Career chef = new Career("Chef / Culinary Expert",
                "Create delicious cuisines in Goa's restaurants, hotels, beach shacks, and resorts. " +
                        "Specialize in Goan, Continental, or International cuisine in Goa's vibrant food scene.");
        chef.setSalaryRange("₹3-15 LPA");
        chef.setGrowthProspects("Excellent opportunities in Goa's hospitality sector with potential to start own restaurant");
        chef.getRequiredSkills().add("Cooking Techniques");
        chef.getRequiredSkills().add("Creativity");
        chef.getRequiredSkills().add("Time Management");
        chef.getRequiredSkills().add("Food Safety");
        chef.getEducationPaths().add("Culinary Arts");
        chef.getEducationPaths().add("Hotel Management");
        chef.getEducationPaths().add("Diploma in Culinary Arts");
        careers.add(chef);

        // 5. Event Manager (Goa's Event Hub)
        Career eventManager = new Career("Event Manager",
                "Organize weddings, corporate events, music festivals, and beach parties in Goa. " +
                        "Goa hosts 100+ major events annually including Sunburn Festival, beach weddings, and corporate conferences.");
        eventManager.setSalaryRange("₹4-16 LPA");
        eventManager.setGrowthProspects("Growing demand with Goa becoming India's event destination");
        eventManager.getRequiredSkills().add("Event Planning");
        eventManager.getRequiredSkills().add("Coordination");
        eventManager.getRequiredSkills().add("Budgeting");
        eventManager.getRequiredSkills().add("Networking");
        eventManager.getEducationPaths().add("Event Management");
        eventManager.getEducationPaths().add("Hotel Management");
        eventManager.getEducationPaths().add("MBA Marketing");
        careers.add(eventManager);

        // 6. Mining Engineer (Goa's Mining Sector)
        Career miningEngineer = new Career("Mining Engineer",
                "Plan and supervise mining operations in Goa's iron ore and manganese mines. " +
                        "Work with mining companies and contribute to sustainable mining practices.");
        miningEngineer.setSalaryRange("₹5-18 LPA");
        miningEngineer.setGrowthProspects("Steady demand in Goa's mining industry with focus on sustainable practices");
        miningEngineer.getRequiredSkills().add("Engineering Knowledge");
        miningEngineer.getRequiredSkills().add("Safety Management");
        miningEngineer.getRequiredSkills().add("Project Planning");
        miningEngineer.getRequiredSkills().add("Environmental Awareness");
        miningEngineer.getEducationPaths().add("Mining Engineering");
        miningEngineer.getEducationPaths().add("BE Mining");
        miningEngineer.getEducationPaths().add("BTech Mining");
        careers.add(miningEngineer);

        // 7. Architect (Goa's Portuguese Architecture)
        Career architect = new Career("Architect",
                "Design buildings preserving Goa's unique Portuguese-Indo architecture. " +
                        "Work on residential, commercial, and heritage restoration projects in Goa's growing construction sector.");
        architect.setSalaryRange("₹4-20 LPA");
        architect.setGrowthProspects("Good opportunities with Goa's real estate and heritage preservation projects");
        architect.getRequiredSkills().add("Design Skills");
        architect.getRequiredSkills().add("Technical Drawing");
        architect.getRequiredSkills().add("Creativity");
        architect.getRequiredSkills().add("3D Modeling");
        architect.getEducationPaths().add("Architecture");
        architect.getEducationPaths().add("BArch");
        architect.getEducationPaths().add("MArch");
        careers.add(architect);

        // 8. Environmental Scientist (Coastal Conservation)
        Career environmentalScientist = new Career("Environmental Scientist",
                "Work on environmental conservation, coastal zone management, and sustainability projects. " +
                        "Address challenges like waste management, pollution control, and eco-tourism in Goa.");
        environmentalScientist.setSalaryRange("₹4-14 LPA");
        environmentalScientist.setGrowthProspects("Growing demand with focus on sustainable tourism and environmental protection");
        environmentalScientist.getRequiredSkills().add("Environmental Assessment");
        environmentalScientist.getRequiredSkills().add("Research");
        environmentalScientist.getRequiredSkills().add("Data Analysis");
        environmentalScientist.getRequiredSkills().add("Policy Knowledge");
        environmentalScientist.getEducationPaths().add("Environmental Science");
        environmentalScientist.getEducationPaths().add("BSc Environmental Science");
        environmentalScientist.getEducationPaths().add("MSc Environmental Management");
        careers.add(environmentalScientist);

        // 9. Portuguese Language Expert
        Career portugueseExpert = new Career("Portuguese Language Expert",
                "Teach Portuguese, work as translator/interpreter, or guide heritage tours. " +
                        "Leverage Goa's 450-year Portuguese heritage and growing interest in the language.");
        portugueseExpert.setSalaryRange("₹3-10 LPA");
        portugueseExpert.setGrowthProspects("Unique niche with demand in tourism, education, and translation services");
        portugueseExpert.getRequiredSkills().add("Language Proficiency");
        portugueseExpert.getRequiredSkills().add("Translation");
        portugueseExpert.getRequiredSkills().add("Communication");
        portugueseExpert.getRequiredSkills().add("Cultural Knowledge");
        portugueseExpert.getEducationPaths().add("Portuguese Language & Culture");
        portugueseExpert.getEducationPaths().add("Foreign Languages");
        portugueseExpert.getEducationPaths().add("BA Languages");
        careers.add(portugueseExpert);

        // 10. Fisheries Officer
        Career fisheriesOfficer = new Career("Fisheries Officer",
                "Manage fisheries resources, support fishing communities, and promote sustainable fishing practices. " +
                        "Work with government departments, cooperatives, or marine research institutes in coastal Goa.");
        fisheriesOfficer.setSalaryRange("₹3-12 LPA");
        fisheriesOfficer.setGrowthProspects("Stable government and private sector opportunities in coastal regions");
        fisheriesOfficer.getRequiredSkills().add("Fisheries Management");
        fisheriesOfficer.getRequiredSkills().add("Community Engagement");
        fisheriesOfficer.getRequiredSkills().add("Technical Knowledge");
        fisheriesOfficer.getRequiredSkills().add("Administration");
        fisheriesOfficer.getEducationPaths().add("Fisheries Science");
        fisheriesOfficer.getEducationPaths().add("BSc Fisheries");
        fisheriesOfficer.getEducationPaths().add("Marine Science");
        careers.add(fisheriesOfficer);

        // =============================
        // TECHNOLOGY CAREERS (National)
        // =============================

        Career softwareDeveloper = new Career("Software Developer",
                "Design, develop, and maintain software applications and systems. Work with top IT companies or " +
                        "startups, or freelance. High demand globally and in India's growing tech hubs.");
        softwareDeveloper.setSalaryRange("₹6-25 LPA");
        softwareDeveloper.setGrowthProspects("Excellent growth in IT industry with remote work opportunities");
        softwareDeveloper.getRequiredSkills().add("Programming");
        softwareDeveloper.getRequiredSkills().add("Problem Solving");
        softwareDeveloper.getRequiredSkills().add("Logical Thinking");
        softwareDeveloper.getRequiredSkills().add("Software Design");
        softwareDeveloper.getEducationPaths().add("Computer Science");
        softwareDeveloper.getEducationPaths().add("Information Technology");
        softwareDeveloper.getEducationPaths().add("Software Engineering");
        careers.add(softwareDeveloper);

        Career dataScientist = new Career("Data Scientist",
                "Analyze complex data and provide insights for business decisions. Use machine learning, statistics, " +
                        "and AI to solve real-world problems. One of the most in-demand careers globally.");
        dataScientist.setSalaryRange("₹8-30 LPA");
        dataScientist.setGrowthProspects("Extremely high demand in analytics and AI field");
        dataScientist.getRequiredSkills().add("Statistics");
        dataScientist.getRequiredSkills().add("Machine Learning");
        dataScientist.getRequiredSkills().add("Programming");
        dataScientist.getRequiredSkills().add("Data Visualization");
        dataScientist.getEducationPaths().add("Data Science");
        dataScientist.getEducationPaths().add("Mathematics");
        dataScientist.getEducationPaths().add("Computer Science");
        careers.add(dataScientist);

        Career cyberSecurityExpert = new Career("Cybersecurity Expert",
                "Protect organizations from cyber threats, hackers, and data breaches. " +
                        "Design security systems and respond to security incidents. Critical role in digital age.");
        cyberSecurityExpert.setSalaryRange("₹7-28 LPA");
        cyberSecurityExpert.setGrowthProspects("Rapidly growing field with severe talent shortage");
        cyberSecurityExpert.getRequiredSkills().add("Network Security");
        cyberSecurityExpert.getRequiredSkills().add("Ethical Hacking");
        cyberSecurityExpert.getRequiredSkills().add("Risk Assessment");
        cyberSecurityExpert.getRequiredSkills().add("Problem Solving");
        cyberSecurityExpert.getEducationPaths().add("Computer Science");
        cyberSecurityExpert.getEducationPaths().add("Cybersecurity");
        cyberSecurityExpert.getEducationPaths().add("Information Security");
        careers.add(cyberSecurityExpert);

        Career webDeveloper = new Career("Web Developer",
                "Build websites and web applications using modern technologies. " +
                        "Work as frontend, backend, or full-stack developer for companies or as freelancer.");
        webDeveloper.setSalaryRange("₹4-18 LPA");
        webDeveloper.setGrowthProspects("Strong demand with digital transformation across industries");
        webDeveloper.getRequiredSkills().add("HTML/CSS/JavaScript");
        webDeveloper.getRequiredSkills().add("Web Frameworks");
        webDeveloper.getRequiredSkills().add("Database Management");
        webDeveloper.getRequiredSkills().add("Problem Solving");
        webDeveloper.getEducationPaths().add("Computer Science");
        webDeveloper.getEducationPaths().add("Information Technology");
        webDeveloper.getEducationPaths().add("Web Development");
        careers.add(webDeveloper);

        Career uiuxDesigner = new Career("UI/UX Designer",
                "Design user interfaces and experiences for digital products. Create intuitive, " +
                        "beautiful apps and websites that users love. Blend creativity with user research.");
        uiuxDesigner.setSalaryRange("₹4-18 LPA");
        uiuxDesigner.setGrowthProspects("High demand in tech companies and startups");
        uiuxDesigner.getRequiredSkills().add("User Research");
        uiuxDesigner.getRequiredSkills().add("Prototyping");
        uiuxDesigner.getRequiredSkills().add("Design Tools");
        uiuxDesigner.getRequiredSkills().add("Empathy");
        uiuxDesigner.getEducationPaths().add("Design");
        uiuxDesigner.getEducationPaths().add("HCI");
        uiuxDesigner.getEducationPaths().add("Graphic Design");
        careers.add(uiuxDesigner);

        // ============================
        // HEALTHCARE CAREERS (National)
        // ============================

        Career medicalDoctor = new Career("Medical Doctor",
                "Diagnose and treat patients, promote health and prevent diseases. " +
                        "Work in hospitals, clinics, or start your own practice. One of the most respected professions.");
        medicalDoctor.setSalaryRange("₹8-50 LPA");
        medicalDoctor.setGrowthProspects("High respect, job security, and excellent earning potential");
        medicalDoctor.getRequiredSkills().add("Medical Knowledge");
        medicalDoctor.getRequiredSkills().add("Empathy");
        medicalDoctor.getRequiredSkills().add("Communication");
        medicalDoctor.getRequiredSkills().add("Decision Making");
        medicalDoctor.getEducationPaths().add("MBBS");
        medicalDoctor.getEducationPaths().add("MD");
        medicalDoctor.getEducationPaths().add("MS");
        careers.add(medicalDoctor);

        Career dentist = new Career("Dentist",
                "Diagnose and treat dental problems, perform oral surgeries, and promote dental health. " +
                        "Run your own dental clinic or work in hospitals and dental care centers.");
        dentist.setSalaryRange("₹6-30 LPA");
        dentist.setGrowthProspects("Good income potential with option to start own practice");
        dentist.getRequiredSkills().add("Dental Knowledge");
        dentist.getRequiredSkills().add("Precision");
        dentist.getRequiredSkills().add("Patient Care");
        dentist.getRequiredSkills().add("Communication");
        dentist.getEducationPaths().add("BDS");
        dentist.getEducationPaths().add("MDS");
        dentist.getEducationPaths().add("Dental Surgery");
        careers.add(dentist);

        Career nurse = new Career("Nurse",
                "Provide patient care and support in healthcare settings. " +
                        "Critical role in hospitals, clinics, and healthcare facilities with high demand.");
        nurse.setSalaryRange("₹3-10 LPA");
        nurse.setGrowthProspects("Steady demand in healthcare sector with opportunities abroad");
        nurse.getRequiredSkills().add("Patient Care");
        nurse.getRequiredSkills().add("Communication");
        nurse.getRequiredSkills().add("Medical Knowledge");
        nurse.getRequiredSkills().add("Empathy");
        nurse.getEducationPaths().add("BSc Nursing");
        nurse.getEducationPaths().add("GNM");
        nurse.getEducationPaths().add("Post-Basic Nursing");
        careers.add(nurse);

        Career pharmacist = new Career("Pharmacist",
                "Dispense medications, counsel patients on proper drug usage, and manage pharmacy operations. " +
                        "Work in hospitals, retail pharmacies, or pharmaceutical companies.");
        pharmacist.setSalaryRange("₹3-12 LPA");
        pharmacist.setGrowthProspects("Stable career with opportunities in retail and hospital settings");
        pharmacist.getRequiredSkills().add("Pharmaceutical Knowledge");
        pharmacist.getRequiredSkills().add("Attention to Detail");
        pharmacist.getRequiredSkills().add("Customer Service");
        pharmacist.getRequiredSkills().add("Communication");
        pharmacist.getEducationPaths().add("B.Pharm");
        pharmacist.getEducationPaths().add("PharmD");
        pharmacist.getEducationPaths().add("M.Pharm");
        careers.add(pharmacist);

        Career physiotherapist = new Career("Physiotherapist",
                "Help patients recover from injuries, manage pain, and improve mobility through physical therapy. " +
                        "Work in hospitals, sports teams, or start your own physiotherapy clinic.");
        physiotherapist.setSalaryRange("₹3-12 LPA");
        physiotherapist.setGrowthProspects("Growing awareness and demand for physiotherapy services");
        physiotherapist.getRequiredSkills().add("Therapeutic Knowledge");
        physiotherapist.getRequiredSkills().add("Patient Assessment");
        physiotherapist.getRequiredSkills().add("Communication");
        physiotherapist.getRequiredSkills().add("Empathy");
        physiotherapist.getEducationPaths().add("BPT");
        physiotherapist.getEducationPaths().add("MPT");
        physiotherapist.getEducationPaths().add("Physiotherapy");
        careers.add(physiotherapist);

        // ===========================
        // BUSINESS CAREERS (National)
        // ===========================

        Career businessAnalyst = new Career("Business Analyst",
                "Analyze business processes and recommend improvements using data and technology. " +
                        "Bridge gap between business needs and IT solutions in corporate environments.");
        businessAnalyst.setSalaryRange("₹5-20 LPA");
        businessAnalyst.setGrowthProspects("Good corporate opportunities with path to management roles");
        businessAnalyst.getRequiredSkills().add("Analytical Thinking");
        businessAnalyst.getRequiredSkills().add("Communication");
        businessAnalyst.getRequiredSkills().add("Business Acumen");
        businessAnalyst.getRequiredSkills().add("Data Analysis");
        businessAnalyst.getEducationPaths().add("MBA");
        businessAnalyst.getEducationPaths().add("BBA");
        businessAnalyst.getEducationPaths().add("Commerce");
        careers.add(businessAnalyst);

        Career marketingManager = new Career("Marketing Manager",
                "Plan and execute marketing strategies for products and services. " +
                        "Drive brand awareness, customer acquisition, and sales through creative campaigns.");
        marketingManager.setSalaryRange("₹6-25 LPA");
        marketingManager.setGrowthProspects("Creative and dynamic field with excellent growth potential");
        marketingManager.getRequiredSkills().add("Marketing Strategy");
        marketingManager.getRequiredSkills().add("Leadership");
        marketingManager.getRequiredSkills().add("Creativity");
        marketingManager.getRequiredSkills().add("Digital Marketing");
        marketingManager.getEducationPaths().add("MBA Marketing");
        marketingManager.getEducationPaths().add("BBA");
        marketingManager.getEducationPaths().add("Mass Communication");
        careers.add(marketingManager);

        Career charteredAccountant = new Career("Chartered Accountant (CA)",
                "Provide accounting, auditing, taxation, and financial advisory services. " +
                        "One of the most prestigious and lucrative careers in finance and commerce.");
        charteredAccountant.setSalaryRange("₹7-35 LPA");
        charteredAccountant.setGrowthProspects("Excellent career prospects with high earning potential");
        charteredAccountant.getRequiredSkills().add("Accounting");
        charteredAccountant.getRequiredSkills().add("Taxation");
        charteredAccountant.getRequiredSkills().add("Financial Analysis");
        charteredAccountant.getRequiredSkills().add("Attention to Detail");
        charteredAccountant.getEducationPaths().add("CA");
        charteredAccountant.getEducationPaths().add("Commerce");
        charteredAccountant.getEducationPaths().add("BCom");
        careers.add(charteredAccountant);

        Career entrepreneur = new Career("Entrepreneur / Business Owner",
                "Start and run your own business, create innovative solutions, and be your own boss. " +
                        "High risk but potential for unlimited growth and financial independence.");
        entrepreneur.setSalaryRange("₹0-50+ LPA (Variable)");
        entrepreneur.setGrowthProspects("Unlimited potential based on business success");
        entrepreneur.getRequiredSkills().add("Leadership");
        entrepreneur.getRequiredSkills().add("Risk Taking");
        entrepreneur.getRequiredSkills().add("Business Planning");
        entrepreneur.getRequiredSkills().add("Innovation");
        entrepreneur.getEducationPaths().add("MBA");
        entrepreneur.getEducationPaths().add("BBA");
        entrepreneur.getEducationPaths().add("Any Field");
        careers.add(entrepreneur);

        Career financialAnalyst = new Career("Financial Analyst",
                "Analyze financial data, create reports, and provide investment recommendations. " +
                        "Work with banks, investment firms, corporations, or financial advisory companies.");
        financialAnalyst.setSalaryRange("₹5-20 LPA");
        financialAnalyst.setGrowthProspects("Strong demand in banking and financial services sector");
        financialAnalyst.getRequiredSkills().add("Financial Modeling");
        financialAnalyst.getRequiredSkills().add("Data Analysis");
        financialAnalyst.getRequiredSkills().add("Investment Knowledge");
        financialAnalyst.getRequiredSkills().add("Communication");
        financialAnalyst.getEducationPaths().add("Finance");
        financialAnalyst.getEducationPaths().add("MBA Finance");
        financialAnalyst.getEducationPaths().add("BCom");
        careers.add(financialAnalyst);

        // ======================
        // ARTS & CREATIVE CAREERS
        // ======================

        Career graphicDesigner = new Career("Graphic Designer",
                "Create visual concepts and designs for various media including print, digital, and advertising. " +
                        "Work with agencies, companies, or as freelancer.");
        graphicDesigner.setSalaryRange("₹3-12 LPA");
        graphicDesigner.setGrowthProspects("Growing digital media demand with remote work opportunities");
        graphicDesigner.getRequiredSkills().add("Creativity");
        graphicDesigner.getRequiredSkills().add("Design Software");
        graphicDesigner.getRequiredSkills().add("Visual Communication");
        graphicDesigner.getRequiredSkills().add("Typography");
        graphicDesigner.getEducationPaths().add("Fine Arts");
        graphicDesigner.getEducationPaths().add("Graphic Design");
        graphicDesigner.getEducationPaths().add("Visual Communication");
        careers.add(graphicDesigner);

        Career fashionDesigner = new Career("Fashion Designer",
                "Design clothing, accessories, and footwear. Create fashion collections and stay ahead of trends. " +
                        "Work with fashion houses, boutiques, or start your own fashion brand.");
        fashionDesigner.setSalaryRange("₹3-15 LPA");
        fashionDesigner.setGrowthProspects("Creative field with opportunities for entrepreneurship");
        fashionDesigner.getRequiredSkills().add("Design Creativity");
        fashionDesigner.getRequiredSkills().add("Sketching");
        fashionDesigner.getRequiredSkills().add("Fabric Knowledge");
        fashionDesigner.getRequiredSkills().add("Trend Analysis");
        fashionDesigner.getEducationPaths().add("Fashion Design");
        fashionDesigner.getEducationPaths().add("Textile Design");
        fashionDesigner.getEducationPaths().add("Apparel Design");
        careers.add(fashionDesigner);

        Career contentWriter = new Career("Content Writer / Copywriter",
                "Write engaging content for websites, blogs, marketing materials, and social media. " +
                        "Work with agencies, companies, or as freelance writer with flexible work options.");
        contentWriter.setSalaryRange("₹3-12 LPA");
        contentWriter.setGrowthProspects("High demand with digital marketing boom and remote work options");
        contentWriter.getRequiredSkills().add("Writing");
        contentWriter.getRequiredSkills().add("Creativity");
        contentWriter.getRequiredSkills().add("SEO Knowledge");
        contentWriter.getRequiredSkills().add("Research");
        contentWriter.getEducationPaths().add("Journalism");
        contentWriter.getEducationPaths().add("Mass Communication");
        contentWriter.getEducationPaths().add("English Literature");
        careers.add(contentWriter);

        Career photographer = new Career("Photographer / Videographer",
                "Capture moments through photography and videography for events, media, advertising, or art. " +
                        "Work independently, with studios, or media houses.");
        photographer.setSalaryRange("₹3-15 LPA");
        photographer.setGrowthProspects("Growing demand with social media and digital content boom");
        photographer.getRequiredSkills().add("Photography");
        photographer.getRequiredSkills().add("Editing");
        photographer.getRequiredSkills().add("Creativity");
        photographer.getRequiredSkills().add("Technical Skills");
        photographer.getEducationPaths().add("Photography");
        photographer.getEducationPaths().add("Visual Arts");
        photographer.getEducationPaths().add("Mass Communication");
        careers.add(photographer);

        // ==========================
        // ENGINEERING CAREERS
        // ==========================

        Career mechanicalEngineer = new Career("Mechanical Engineer",
                "Design, develop, and test mechanical systems and machinery. " +
                        "Work in manufacturing, automotive, aerospace, or energy sectors.");
        mechanicalEngineer.setSalaryRange("₹4-15 LPA");
        mechanicalEngineer.setGrowthProspects("Steady demand in manufacturing and automotive industries");
        mechanicalEngineer.getRequiredSkills().add("Engineering Design");
        mechanicalEngineer.getRequiredSkills().add("CAD Software");
        mechanicalEngineer.getRequiredSkills().add("Problem Solving");
        mechanicalEngineer.getRequiredSkills().add("Technical Knowledge");
        mechanicalEngineer.getEducationPaths().add("Mechanical Engineering");
        mechanicalEngineer.getEducationPaths().add("BE Mechanical");
        mechanicalEngineer.getEducationPaths().add("BTech Mechanical");
        careers.add(mechanicalEngineer);

        Career civilEngineer = new Career("Civil Engineer",
                "Design and supervise construction of infrastructure projects like buildings, roads, bridges, and dams. " +
                        "Work with construction companies, government, or consultancy firms.");
        civilEngineer.setSalaryRange("₹4-15 LPA");
        civilEngineer.setGrowthProspects("Steady demand in construction and infrastructure development");
        civilEngineer.getRequiredSkills().add("Technical Drawing");
        civilEngineer.getRequiredSkills().add("Project Management");
        civilEngineer.getRequiredSkills().add("Structural Analysis");
        civilEngineer.getRequiredSkills().add("Problem Solving");
        civilEngineer.getEducationPaths().add("Civil Engineering");
        civilEngineer.getEducationPaths().add("BE Civil");
        civilEngineer.getEducationPaths().add("BTech Civil");
        careers.add(civilEngineer);

        Career electricalEngineer = new Career("Electrical Engineer",
                "Design, develop, and maintain electrical systems and equipment. " +
                        "Work in power generation, electronics, telecommunications, or automation sectors.");
        electricalEngineer.setSalaryRange("₹4-16 LPA");
        electricalEngineer.setGrowthProspects("Good opportunities in power and electronics industries");
        electricalEngineer.getRequiredSkills().add("Circuit Design");
        electricalEngineer.getRequiredSkills().add("Electronics");
        electricalEngineer.getRequiredSkills().add("Problem Solving");
        electricalEngineer.getRequiredSkills().add("Technical Knowledge");
        electricalEngineer.getEducationPaths().add("Electrical Engineering");
        electricalEngineer.getEducationPaths().add("BE Electrical");
        electricalEngineer.getEducationPaths().add("BTech EEE");
        careers.add(electricalEngineer);

        // ==========================
        // SCIENCE & RESEARCH CAREERS
        // ==========================

        Career researchScientist = new Career("Research Scientist",
                "Conduct research and experiments to advance scientific knowledge in physics, chemistry, biology, or other fields. " +
                        "Work with research institutions, universities, or R&D departments.");
        researchScientist.setSalaryRange("₹4-18 LPA");
        researchScientist.setGrowthProspects("Opportunities in research institutions and industry R&D");
        researchScientist.getRequiredSkills().add("Research Methods");
        researchScientist.getRequiredSkills().add("Critical Thinking");
        researchScientist.getRequiredSkills().add("Data Analysis");
        researchScientist.getRequiredSkills().add("Scientific Writing");
        researchScientist.getEducationPaths().add("MSc");
        researchScientist.getEducationPaths().add("PhD");
        researchScientist.getEducationPaths().add("BSc");
        careers.add(researchScientist);

        Career biotechnologist = new Career("Biotechnologist",
                "Apply biological processes to develop products and technologies in healthcare, agriculture, and environment. " +
                        "Work in pharmaceutical companies, research labs, or biotech startups.");
        biotechnologist.setSalaryRange("₹4-15 LPA");
        biotechnologist.setGrowthProspects("Growing field with applications in medicine and agriculture");
        biotechnologist.getRequiredSkills().add("Laboratory Techniques");
        biotechnologist.getRequiredSkills().add("Research Skills");
        biotechnologist.getRequiredSkills().add("Data Analysis");
        biotechnologist.getRequiredSkills().add("Scientific Knowledge");
        biotechnologist.getEducationPaths().add("Biotechnology");
        biotechnologist.getEducationPaths().add("BSc Biotech");
        biotechnologist.getEducationPaths().add("MSc Biotech");
        careers.add(biotechnologist);

        // ==========================
        // EDUCATION & SOCIAL WORK
        // ==========================

        Career teacher = new Career("Teacher / Professor",
                "Educate students and contribute to knowledge development at schools, colleges, or universities. " +
                        "Shape future generations and make lasting impact on society.");
        teacher.setSalaryRange("₹3-15 LPA");
        teacher.setGrowthProspects("Stable career with social impact and job security");
        teacher.getRequiredSkills().add("Communication");
        teacher.getRequiredSkills().add("Patience");
        teacher.getRequiredSkills().add("Subject Knowledge");
        teacher.getRequiredSkills().add("Teaching Methods");
        teacher.getEducationPaths().add("B.Ed");
        teacher.getEducationPaths().add("M.Ed");
        teacher.getEducationPaths().add("Subject Degree + B.Ed");
        careers.add(teacher);

        Career psychologist = new Career("Psychologist / Counselor",
                "Help people deal with mental health issues, emotional problems, and life challenges. " +
                        "Work in hospitals, schools, corporate settings, or private practice.");
        psychologist.setSalaryRange("₹3-12 LPA");
        psychologist.setGrowthProspects("Growing awareness about mental health increasing demand");
        psychologist.getRequiredSkills().add("Empathy");
        psychologist.getRequiredSkills().add("Listening");
        psychologist.getRequiredSkills().add("Counseling Techniques");
        psychologist.getRequiredSkills().add("Communication");
        psychologist.getEducationPaths().add("Psychology");
        psychologist.getEducationPaths().add("MA Psychology");
        psychologist.getEducationPaths().add("Clinical Psychology");
        careers.add(psychologist);

        Career socialWorker = new Career("Social Worker",
                "Help individuals and communities overcome challenges and improve their lives. " +
                        "Work with NGOs, government, or community organizations to create social impact.");
        socialWorker.setSalaryRange("₹2-8 LPA");
        socialWorker.setGrowthProspects("Meaningful work with social impact and personal satisfaction");
        socialWorker.getRequiredSkills().add("Empathy");
        socialWorker.getRequiredSkills().add("Communication");
        socialWorker.getRequiredSkills().add("Counseling");
        socialWorker.getRequiredSkills().add("Community Work");
        socialWorker.getEducationPaths().add("Social Work");
        socialWorker.getEducationPaths().add("MSW");
        socialWorker.getEducationPaths().add("Sociology");
        careers.add(socialWorker);

        // ==========================
        // LAW & GOVERNANCE CAREERS
        // ==========================

        Career lawyer = new Career("Lawyer / Advocate",
                "Represent clients in legal matters, provide legal advice, and argue cases in court. " +
                        "Practice independently or work with law firms in various specializations.");
        lawyer.setSalaryRange("₹4-30 LPA");
        lawyer.setGrowthProspects("Prestigious career with good earning potential for successful lawyers");
        lawyer.getRequiredSkills().add("Legal Knowledge");
        lawyer.getRequiredSkills().add("Communication");
        lawyer.getRequiredSkills().add("Critical Thinking");
        lawyer.getRequiredSkills().add("Research");
        lawyer.getEducationPaths().add("LLB");
        lawyer.getEducationPaths().add("BA LLB");
        lawyer.getEducationPaths().add("LLM");
        careers.add(lawyer);

        Career civilServant = new Career("Civil Servant (IAS/IPS/IFS)",
                "Serve the nation through administrative, police, or foreign services. " +
                        "Implement government policies, maintain law and order, and drive social change.");
        civilServant.setSalaryRange("₹8-25 LPA");
        civilServant.setGrowthProspects("Prestigious career with power to make societal impact and job security");
        civilServant.getRequiredSkills().add("Leadership");
        civilServant.getRequiredSkills().add("Decision Making");
        civilServant.getRequiredSkills().add("Public Administration");
        civilServant.getRequiredSkills().add("Communication");
        civilServant.getEducationPaths().add("Any Graduation");
        civilServant.getEducationPaths().add("Public Administration");
        civilServant.getEducationPaths().add("Political Science");
        careers.add(civilServant);

        return careers;
    }
}
