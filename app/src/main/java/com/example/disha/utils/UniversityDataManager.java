package com.example.disha.utils;
import com.example.disha.models.Course;
import com.example.disha.models.University;

import java.util.ArrayList;
import java.util.List;
public class UniversityDataManager {
    public List<University> getAllUniversities() {
        List<University> universities = new ArrayList<>();

        // IIT Mumbai
        University iitBombay = new University("Indian Institute of Technology Bombay", "Mumbai, Maharashtra");
        iitBombay.setType("Public University");
        iitBombay.setRating(4.7);
        iitBombay.setWebsite("https://www.iitb.ac.in");
        addIITCourses(iitBombay);
        universities.add(iitBombay);

        // IIT Delhi
        University iitDelhi = new University("Indian Institute of Technology Delhi", "New Delhi");
        iitDelhi.setType("Public University");
        iitDelhi.setRating(4.6);
        iitDelhi.setWebsite("https://www.iitd.ac.in");
        addIITCourses(iitDelhi);
        universities.add(iitDelhi);

        // AIIMS
        University aiims = new University("All India Institute of Medical Sciences", "New Delhi");
        aiims.setType("Public Medical Institute");
        aiims.setRating(4.8);
        aiims.setWebsite("https://www.aiims.edu");
        addMedicalCourses(aiims);
        universities.add(aiims);

        // IIM Ahmedabad
        University iimAhmedabad = new University("Indian Institute of Management Ahmedabad", "Ahmedabad, Gujarat");
        iimAhmedabad.setType("Public Business School");
        iimAhmedabad.setRating(4.7);
        iimAhmedabad.setWebsite("https://www.iima.ac.in");
        addBusinessCourses(iimAhmedabad);
        universities.add(iimAhmedabad);

        // NID Ahmedabad
        University nid = new University("National Institute of Design", "Ahmedabad, Gujarat");
        nid.setType("Public Design Institute");
        nid.setRating(4.5);
        nid.setWebsite("https://www.nid.edu");
        addDesignCourses(nid);
        universities.add(nid);

        // Delhi University
        University du = new University("University of Delhi", "New Delhi");
        du.setType("Public University");
        du.setRating(4.4);
        du.setWebsite("https://www.du.ac.in");
        addGeneralCourses(du);
        universities.add(du);

        // Mumbai University
        University mumbaiU = new University("University of Mumbai", "Mumbai, Maharashtra");
        mumbaiU.setType("Public University");
        mumbaiU.setRating(4.2);
        mumbaiU.setWebsite("https://www.mu.ac.in");
        addGeneralCourses(mumbaiU);
        universities.add(mumbaiU);

        // BITS Pilani
        University bits = new University("BITS Pilani", "Pilani, Rajasthan");
        bits.setType("Private University");
        bits.setRating(4.6);
        bits.setWebsite("https://www.bits-pilani.ac.in");
        addIITCourses(bits);
        universities.add(bits);

        return universities;
    }

    private void addIITCourses(University university) {
        Course cs = new Course("Computer Science Engineering", "B.Tech", "4 years");
        cs.setDescription("Comprehensive computer science and engineering program");
        cs.setEligibility("JEE Advanced qualified");
        university.addCourse(cs);

        Course ee = new Course("Electrical Engineering", "B.Tech", "4 years");
        ee.setDescription("Study of electrical systems and electronics");
        ee.setEligibility("JEE Advanced qualified");
        university.addCourse(ee);

        Course me = new Course("Mechanical Engineering", "B.Tech", "4 years");
        me.setDescription("Design and manufacturing of mechanical systems");
        me.setEligibility("JEE Advanced qualified");
        university.addCourse(me);
    }

    private void addMedicalCourses(University university) {
        Course mbbs = new Course("MBBS", "Bachelor's", "5.5 years");
        mbbs.setDescription("Undergraduate medical degree");
        mbbs.setEligibility("NEET qualified");
        university.addCourse(mbbs);

        Course bds = new Course("BDS", "Bachelor's", "5 years");
        bds.setDescription("Dental surgery program");
        bds.setEligibility("NEET qualified");
        university.addCourse(bds);
    }

    private void addBusinessCourses(University university) {
        Course mba = new Course("MBA", "Master's", "2 years");
        mba.setDescription("Master of Business Administration");
        mba.setEligibility("CAT/GMAT qualified");
        university.addCourse(mba);

        Course pgdm = new Course("PGDM", "Post Graduate Diploma", "2 years");
        pgdm.setDescription("Post Graduate Diploma in Management");
        pgdm.setEligibility("CAT/GMAT qualified");
        university.addCourse(pgdm);
    }

    private void addDesignCourses(University university) {
        Course design = new Course("Product Design", "B.Des", "4 years");
        design.setDescription("Industrial and product design");
        design.setEligibility("NID DAT qualified");
        university.addCourse(design);

        Course graphic = new Course("Graphic Design", "B.Des", "4 years");
        graphic.setDescription("Visual communication design");
        graphic.setEligibility("NID DAT qualified");
        university.addCourse(graphic);
    }

    private void addGeneralCourses(University university) {
        Course bsc = new Course("BSc Computer Science", "Bachelor's", "3 years");
        bsc.setDescription("Bachelor of Science in Computer Science");
        bsc.setEligibility("12th pass with Science");
        university.addCourse(bsc);

        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce");
        bcom.setEligibility("12th pass with Commerce");
        university.addCourse(bcom);

        Course ba = new Course("BA", "Bachelor's", "3 years");
        ba.setDescription("Bachelor of Arts");
        ba.setEligibility("12th pass");
        university.addCourse(ba);
    }
}
