package com.example.disha.utils;

import com.example.disha.models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDataManager {

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();

        // ========================================
        // GOA-ORIENTED COURSES
        // ========================================

        // Tourism and Hospitality Management (Highly relevant for Goa)
        Course tourism = new Course("Tourism and Hospitality Management", "Bachelor's", "3 years");
        tourism.setDescription("Comprehensive program covering hotel management, tourism operations, and hospitality services - ideal for Goa's tourism industry");
        tourism.setEligibility("10+2 in any stream");
        tourism.setFees("₹1-4 Lakhs per year");
        tourism.getRelatedCareers().add("Hotel Manager");
        tourism.getRelatedCareers().add("Tourism Executive");
        tourism.getRelatedCareers().add("Event Manager");
        courses.add(tourism);

        // Hotel Management (Goa-focused)
        Course hotelMgmt = new Course("Hotel Management", "Bachelor's", "3-4 years");
        hotelMgmt.setDescription("Specialized training in hotel operations, catering, and hospitality services - excellent career prospects in Goa");
        hotelMgmt.setEligibility("10+2 in any stream");
        hotelMgmt.setFees("₹2-6 Lakhs per year");
        hotelMgmt.getRelatedCareers().add("Hotel Manager");
        hotelMgmt.getRelatedCareers().add("Restaurant Manager");
        hotelMgmt.getRelatedCareers().add("Food & Beverage Manager");
        courses.add(hotelMgmt);

        // Marine Science (Coastal Goa specific)
        Course marineScience = new Course("Marine Science", "BSc", "3 years");
        marineScience.setDescription("Study of marine ecosystems, oceanography, and coastal management - leveraging Goa's coastal location");
        marineScience.setEligibility("10+2 with PCB/PCM");
        marineScience.setFees("₹50,000-2 Lakhs per year");
        marineScience.getRelatedCareers().add("Marine Biologist");
        marineScience.getRelatedCareers().add("Oceanographer");
        marineScience.getRelatedCareers().add("Environmental Consultant");
        courses.add(marineScience);

        // Fisheries Science (Goa fishing industry)
        Course fisheries = new Course("Fisheries Science", "BSc", "4 years");
        fisheries.setDescription("Study of fish biology, aquaculture, and fisheries management - supporting Goa's fishing industry");
        fisheries.setEligibility("10+2 with PCB");
        fisheries.setFees("₹30,000-1.5 Lakhs per year");
        fisheries.getRelatedCareers().add("Fisheries Officer");
        fisheries.getRelatedCareers().add("Aquaculture Manager");
        fisheries.getRelatedCareers().add("Marine Biologist");
        courses.add(fisheries);

        // Mining Engineering (Goa's mining sector)
        Course mining = new Course("Mining Engineering", "B.E./B.Tech", "4 years");
        mining.setDescription("Study of mining operations, mineral extraction, and mine management - relevant to Goa's mining industry");
        mining.setEligibility("10+2 with PCM, JEE Main/State CET");
        mining.setFees("₹1-5 Lakhs per year");
        mining.getRelatedCareers().add("Mining Engineer");
        mining.getRelatedCareers().add("Mine Manager");
        mining.getRelatedCareers().add("Geologist");
        courses.add(mining);

        // Environmental Science (Conservation in Goa)
        Course environmental = new Course("Environmental Science", "BSc/MSc", "3-5 years");
        environmental.setDescription("Focus on environmental conservation, sustainability, and ecosystem management - crucial for preserving Goa's natural beauty");
        environmental.setEligibility("10+2 with Science for BSc, BSc for MSc");
        environmental.setFees("₹40,000-2 Lakhs per year");
        environmental.getRelatedCareers().add("Environmental Consultant");
        environmental.getRelatedCareers().add("Conservation Scientist");
        environmental.getRelatedCareers().add("Sustainability Manager");
        courses.add(environmental);

        // Culinary Arts (Goa's food culture)
        Course culinary = new Course("Culinary Arts", "Diploma/Bachelor's", "1-3 years");
        culinary.setDescription("Professional cooking, food presentation, and restaurant management - tapping into Goa's rich culinary heritage");
        culinary.setEligibility("10+2 in any stream");
        culinary.setFees("₹2-5 Lakhs per year");
        culinary.getRelatedCareers().add("Chef");
        culinary.getRelatedCareers().add("Restaurant Owner");
        culinary.getRelatedCareers().add("Food Consultant");
        courses.add(culinary);

        // Portuguese Language & Culture (Goa's heritage)
        Course portuguese = new Course("Portuguese Language & Culture", "Certificate/Diploma", "6 months - 2 years");
        portuguese.setDescription("Learn Portuguese language and culture - valuable for Goa's heritage tourism and international connections");
        portuguese.setEligibility("10+2 in any stream");
        portuguese.setFees("₹20,000-1 Lakh total");
        portuguese.getRelatedCareers().add("Translator");
        portuguese.getRelatedCareers().add("Tour Guide");
        portuguese.getRelatedCareers().add("Language Teacher");
        courses.add(portuguese);

        // Architecture (Goa's unique architectural heritage)
        Course architecture = new Course("Architecture", "B.Arch", "5 years");
        architecture.setDescription("Study of building design and planning - incorporating Goa's Indo-Portuguese architectural heritage");
        architecture.setEligibility("10+2 with PCM, NATA qualified");
        architecture.setFees("₹2-8 Lakhs per year");
        architecture.getRelatedCareers().add("Architect");
        architecture.getRelatedCareers().add("Urban Planner");
        architecture.getRelatedCareers().add("Heritage Conservation Specialist");
        courses.add(architecture);

        // Event Management (Goa's events & entertainment)
        Course eventMgmt = new Course("Event Management", "Bachelor's/Diploma", "1-3 years");
        eventMgmt.setDescription("Planning and executing events, conferences, and entertainment - ideal for Goa's vibrant event scene");
        eventMgmt.setEligibility("10+2 in any stream");
        eventMgmt.setFees("₹1-4 Lakhs per year");
        eventMgmt.getRelatedCareers().add("Event Manager");
        eventMgmt.getRelatedCareers().add("Wedding Planner");
        eventMgmt.getRelatedCareers().add("Entertainment Coordinator");
        courses.add(eventMgmt);

        // ========================================
        // ENGINEERING COURSES (Available in Goa & Outside)
        // ========================================

        // Computer Science Engineering
        Course cs = new Course("Computer Science Engineering", "B.Tech", "4 years");
        cs.setDescription("Study of computation, algorithms, and software development - high demand across India");
        cs.setEligibility("10+2 with PCM, JEE Main qualified");
        cs.setFees("₹2-10 Lakhs per year");
        cs.getRelatedCareers().add("Software Developer");
        cs.getRelatedCareers().add("Data Scientist");
        cs.getRelatedCareers().add("AI Engineer");
        courses.add(cs);

        // Information Technology
        Course it = new Course("Information Technology", "B.Tech", "4 years");
        it.setDescription("Focus on information systems and technology management");
        it.setEligibility("10+2 with PCM, JEE Main qualified");
        it.setFees("₹2-8 Lakhs per year");
        it.getRelatedCareers().add("IT Consultant");
        it.getRelatedCareers().add("System Administrator");
        it.getRelatedCareers().add("Network Engineer");
        courses.add(it);

        // Electronics and Communication Engineering
        Course ece = new Course("Electronics and Communication Engineering", "B.Tech", "4 years");
        ece.setDescription("Study of electronic devices, circuits, and communication systems");
        ece.setEligibility("10+2 with PCM, JEE Main qualified");
        ece.setFees("₹2-8 Lakhs per year");
        ece.getRelatedCareers().add("Electronics Engineer");
        ece.getRelatedCareers().add("Telecom Engineer");
        ece.getRelatedCareers().add("Hardware Engineer");
        courses.add(ece);

        // Mechanical Engineering
        Course mechanical = new Course("Mechanical Engineering", "B.Tech", "4 years");
        mechanical.setDescription("Design, manufacturing, and maintenance of mechanical systems");
        mechanical.setEligibility("10+2 with PCM, JEE Main qualified");
        mechanical.setFees("₹2-8 Lakhs per year");
        mechanical.getRelatedCareers().add("Mechanical Engineer");
        mechanical.getRelatedCareers().add("Automotive Engineer");
        mechanical.getRelatedCareers().add("Manufacturing Engineer");
        courses.add(mechanical);

        // Civil Engineering
        Course civil = new Course("Civil Engineering", "B.Tech", "4 years");
        civil.setDescription("Design and construction of infrastructure and buildings");
        civil.setEligibility("10+2 with PCM, JEE Main qualified");
        civil.setFees("₹2-7 Lakhs per year");
        civil.getRelatedCareers().add("Civil Engineer");
        civil.getRelatedCareers().add("Construction Manager");
        civil.getRelatedCareers().add("Structural Engineer");
        courses.add(civil);

        // Electrical Engineering
        Course electrical = new Course("Electrical Engineering", "B.Tech", "4 years");
        electrical.setDescription("Study of electrical systems, power generation, and distribution");
        electrical.setEligibility("10+2 with PCM, JEE Main qualified");
        electrical.setFees("₹2-8 Lakhs per year");
        electrical.getRelatedCareers().add("Electrical Engineer");
        electrical.getRelatedCareers().add("Power Systems Engineer");
        electrical.getRelatedCareers().add("Control Systems Engineer");
        courses.add(electrical);

        // ========================================
        // MEDICAL COURSES
        // ========================================

        // MBBS
        Course mbbs = new Course("MBBS", "Bachelor's", "5.5 years");
        mbbs.setDescription("Undergraduate medical degree for becoming a doctor");
        mbbs.setEligibility("10+2 with PCB, NEET qualified");
        mbbs.setFees("₹5-25 Lakhs total (Govt to Private)");
        mbbs.getRelatedCareers().add("Doctor");
        mbbs.getRelatedCareers().add("Surgeon");
        mbbs.getRelatedCareers().add("Medical Researcher");
        courses.add(mbbs);

        // BDS (Dental)
        Course bds = new Course("BDS", "Bachelor's", "5 years");
        bds.setDescription("Bachelor of Dental Surgery for dental care professionals");
        bds.setEligibility("10+2 with PCB, NEET qualified");
        bds.setFees("₹3-15 Lakhs total");
        bds.getRelatedCareers().add("Dentist");
        bds.getRelatedCareers().add("Orthodontist");
        bds.getRelatedCareers().add("Dental Surgeon");
        courses.add(bds);

        // BSc Nursing
        Course nursing = new Course("BSc Nursing", "Bachelor's", "4 years");
        nursing.setDescription("Professional nursing program for patient care");
        nursing.setEligibility("10+2 with PCB");
        nursing.setFees("₹1-5 Lakhs per year");
        nursing.getRelatedCareers().add("Registered Nurse");
        nursing.getRelatedCareers().add("Nurse Practitioner");
        nursing.getRelatedCareers().add("Healthcare Administrator");
        courses.add(nursing);

        // Pharmacy
        Course pharmacy = new Course("B.Pharm", "Bachelor's", "4 years");
        pharmacy.setDescription("Bachelor of Pharmacy for pharmaceutical professionals");
        pharmacy.setEligibility("10+2 with PCB/PCM");
        pharmacy.setFees("₹1-5 Lakhs per year");
        pharmacy.getRelatedCareers().add("Pharmacist");
        pharmacy.getRelatedCareers().add("Drug Inspector");
        pharmacy.getRelatedCareers().add("Medical Representative");
        courses.add(pharmacy);

        // ========================================
        // BUSINESS & MANAGEMENT COURSES
        // ========================================

        // MBA
        Course mba = new Course("MBA", "Master's", "2 years");
        mba.setDescription("Master of Business Administration for management careers");
        mba.setEligibility("Bachelor's degree, CAT/MAT/GMAT");
        mba.setFees("₹10-25 Lakhs total");
        mba.getRelatedCareers().add("Business Manager");
        mba.getRelatedCareers().add("Marketing Manager");
        mba.getRelatedCareers().add("Financial Analyst");
        courses.add(mba);

        // BBA
        Course bba = new Course("BBA", "Bachelor's", "3 years");
        bba.setDescription("Bachelor of Business Administration for business fundamentals");
        bba.setEligibility("10+2 in any stream");
        bba.setFees("₹2-6 Lakhs per year");
        bba.getRelatedCareers().add("Business Analyst");
        bba.getRelatedCareers().add("Marketing Executive");
        bba.getRelatedCareers().add("HR Manager");
        courses.add(bba);

        // BCom
        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce for accounting and finance");
        bcom.setEligibility("10+2 with Commerce/Maths");
        bcom.setFees("₹20,000-1 Lakh per year");
        bcom.getRelatedCareers().add("Accountant");
        bcom.getRelatedCareers().add("Financial Advisor");
        bcom.getRelatedCareers().add("Tax Consultant");
        courses.add(bcom);

        // CA (Chartered Accountancy)
        Course ca = new Course("CA", "Professional", "4-5 years");
        ca.setDescription("Chartered Accountancy - premier finance and accounting qualification");
        ca.setEligibility("10+2 with Commerce");
        ca.setFees("₹2-3 Lakhs total");
        ca.getRelatedCareers().add("Chartered Accountant");
        ca.getRelatedCareers().add("Financial Consultant");
        ca.getRelatedCareers().add("Auditor");
        courses.add(ca);

        // ========================================
        // DESIGN & CREATIVE COURSES
        // ========================================

        // Graphic Design
        Course design = new Course("Graphic Design", "B.Des", "4 years");
        design.setDescription("Visual communication and design principles");
        design.setEligibility("10+2 in any stream, Design entrance exam");
        design.setFees("₹3-8 Lakhs per year");
        design.getRelatedCareers().add("Graphic Designer");
        design.getRelatedCareers().add("UI/UX Designer");
        design.getRelatedCareers().add("Art Director");
        courses.add(design);

        // Fashion Design
        Course fashion = new Course("Fashion Design", "B.Des", "4 years");
        fashion.setDescription("Fashion design, textiles, and garment technology");
        fashion.setEligibility("10+2 in any stream");
        fashion.setFees("₹2-8 Lakhs per year");
        fashion.getRelatedCareers().add("Fashion Designer");
        fashion.getRelatedCareers().add("Textile Designer");
        fashion.getRelatedCareers().add("Fashion Consultant");
        courses.add(fashion);

        // Fine Arts
        Course fineArts = new Course("Fine Arts", "BFA", "4 years");
        fineArts.setDescription("Bachelor of Fine Arts in painting, sculpture, and visual arts");
        fineArts.setEligibility("10+2 in any stream");
        fineArts.setFees("₹50,000-3 Lakhs per year");
        fineArts.getRelatedCareers().add("Artist");
        fineArts.getRelatedCareers().add("Art Teacher");
        fineArts.getRelatedCareers().add("Gallery Curator");
        courses.add(fineArts);

        // ========================================
        // SCIENCE COURSES
        // ========================================

        // BSc Computer Science
        Course bsc = new Course("BSc Computer Science", "Bachelor's", "3 years");
        bsc.setDescription("Bachelor of Science in Computer Science");
        bsc.setEligibility("10+2 with PCM");
        bsc.setFees("₹1-3 Lakhs per year");
        bsc.getRelatedCareers().add("Software Developer");
        bsc.getRelatedCareers().add("Data Analyst");
        bsc.getRelatedCareers().add("System Analyst");
        courses.add(bsc);

        // BSc Physics
        Course bscPhysics = new Course("BSc Physics", "Bachelor's", "3 years");
        bscPhysics.setDescription("Study of physical sciences and phenomena");
        bscPhysics.setEligibility("10+2 with PCM");
        bscPhysics.setFees("₹50,000-2 Lakhs per year");
        bscPhysics.getRelatedCareers().add("Physicist");
        bscPhysics.getRelatedCareers().add("Research Scientist");
        bscPhysics.getRelatedCareers().add("Teacher");
        courses.add(bscPhysics);

        // BSc Mathematics
        Course bscMaths = new Course("BSc Mathematics", "Bachelor's", "3 years");
        bscMaths.setDescription("Advanced mathematics and its applications");
        bscMaths.setEligibility("10+2 with Maths");
        bscMaths.setFees("₹40,000-2 Lakhs per year");
        bscMaths.getRelatedCareers().add("Data Scientist");
        bscMaths.getRelatedCareers().add("Statistician");
        bscMaths.getRelatedCareers().add("Actuary");
        courses.add(bscMaths);

        // Biotechnology
        Course biotech = new Course("Biotechnology", "BSc/B.Tech", "3-4 years");
        biotech.setDescription("Application of biology in technology and industry");
        biotech.setEligibility("10+2 with PCB/PCM");
        biotech.setFees("₹1-5 Lakhs per year");
        biotech.getRelatedCareers().add("Biotechnologist");
        biotech.getRelatedCareers().add("Research Scientist");
        biotech.getRelatedCareers().add("Quality Control Analyst");
        courses.add(biotech);

        // ========================================
        // ARTS & HUMANITIES COURSES
        // ========================================

        // BA Psychology
        Course ba = new Course("BA Psychology", "Bachelor's", "3 years");
        ba.setDescription("Study of human behavior and mental processes");
        ba.setEligibility("10+2 in any stream");
        ba.setFees("₹30,000-1.5 Lakhs per year");
        ba.getRelatedCareers().add("Psychologist");
        ba.getRelatedCareers().add("Counselor");
        ba.getRelatedCareers().add("HR Professional");
        courses.add(ba);

        // Journalism & Mass Communication
        Course journalism = new Course("Journalism & Mass Communication", "Bachelor's", "3 years");
        journalism.setDescription("Study of media, journalism, and communication");
        journalism.setEligibility("10+2 in any stream");
        journalism.setFees("₹1-4 Lakhs per year");
        journalism.getRelatedCareers().add("Journalist");
        journalism.getRelatedCareers().add("Content Writer");
        journalism.getRelatedCareers().add("Media Manager");
        courses.add(journalism);

        // Law
        Course law = new Course("LLB", "Bachelor's", "3-5 years");
        law.setDescription("Bachelor of Laws for legal professionals");
        law.setEligibility("10+2 for 5-year integrated, Graduation for 3-year");
        law.setFees("₹1-5 Lakhs per year");
        law.getRelatedCareers().add("Lawyer");
        law.getRelatedCareers().add("Legal Advisor");
        law.getRelatedCareers().add("Judge");
        courses.add(law);

        // ========================================
        // COMPUTER & IT COURSES
        // ========================================

        // BCA
        Course bca = new Course("BCA", "Bachelor's", "3 years");
        bca.setDescription("Bachelor of Computer Applications - programming and IT");
        bca.setEligibility("10+2 with Maths");
        bca.setFees("₹1-3 Lakhs per year");
        bca.getRelatedCareers().add("Software Developer");
        bca.getRelatedCareers().add("Web Developer");
        bca.getRelatedCareers().add("System Administrator");
        courses.add(bca);

        // MCA
        Course mca = new Course("MCA", "Master's", "2 years");
        mca.setDescription("Master of Computer Applications - advanced programming and software development");
        mca.setEligibility("Bachelor's degree with Maths");
        mca.setFees("₹1.5-5 Lakhs per year");
        mca.getRelatedCareers().add("Software Engineer");
        mca.getRelatedCareers().add("System Analyst");
        mca.getRelatedCareers().add("IT Manager");
        courses.add(mca);

        // Data Science
        Course dataScience = new Course("Data Science", "Bachelor's/Master's", "3-4 years");
        dataScience.setDescription("Advanced analytics, machine learning, and big data");
        dataScience.setEligibility("10+2 with Maths for UG, Bachelor's for PG");
        dataScience.setFees("₹2-8 Lakhs per year");
        dataScience.getRelatedCareers().add("Data Scientist");
        dataScience.getRelatedCareers().add("ML Engineer");
        dataScience.getRelatedCareers().add("Data Analyst");
        courses.add(dataScience);

        return courses;
    }
}
