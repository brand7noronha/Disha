package com.example.disha.utils;

import com.example.disha.models.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDataManager {

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();

        // Engineering Courses
        Course cs = new Course("Computer Science Engineering", "B.Tech", "4 years");
        cs.setDescription("Study of computation, algorithms, and software development");
        cs.setEligibility("10+2 with PCM, JEE Main qualified");
        cs.setFees("₹2-10 Lakhs per year");
        courses.add(cs);

        Course it = new Course("Information Technology", "B.Tech", "4 years");
        it.setDescription("Focus on information systems and technology management");
        it.setEligibility("10+2 with PCM, JEE Main qualified");
        it.setFees("₹2-8 Lakhs per year");
        courses.add(it);

        // Medical Courses
        Course mbbs = new Course("MBBS", "Bachelor's", "5.5 years");
        mbbs.setDescription("Undergraduate medical degree for becoming a doctor");
        mbbs.setEligibility("10+2 with PCB, NEET qualified");
        mbbs.setFees("₹5-25 Lakhs total");
        courses.add(mbbs);

        // Business Courses
        Course mba = new Course("MBA", "Master's", "2 years");
        mba.setDescription("Master of Business Administration for management careers");
        mba.setEligibility("Bachelor's degree, CAT/MAT/GMAT");
        mba.setFees("₹10-25 Lakhs total");
        courses.add(mba);

        Course bba = new Course("BBA", "Bachelor's", "3 years");
        bba.setDescription("Bachelor of Business Administration for business fundamentals");
        bba.setEligibility("10+2 in any stream");
        bba.setFees("₹2-6 Lakhs per year");
        courses.add(bba);

        // Design Courses
        Course design = new Course("Graphic Design", "B.Des", "4 years");
        design.setDescription("Visual communication and design principles");
        design.setEligibility("10+2 in any stream, Design entrance exam");
        design.setFees("₹3-8 Lakhs per year");
        courses.add(design);

        // Science Courses
        Course bsc = new Course("BSc Computer Science", "Bachelor's", "3 years");
        bsc.setDescription("Bachelor of Science in Computer Science");
        bsc.setEligibility("10+2 with PCM");
        bsc.setFees("₹1-3 Lakhs per year");
        courses.add(bsc);

        Course bscPhysics = new Course("BSc Physics", "Bachelor's", "3 years");
        bscPhysics.setDescription("Study of physical sciences and phenomena");
        bscPhysics.setEligibility("10+2 with PCM");
        bscPhysics.setFees("₹50,000-2 Lakhs per year");
        courses.add(bscPhysics);

        // Arts Courses
        Course ba = new Course("BA Psychology", "Bachelor's", "3 years");
        ba.setDescription("Study of human behavior and mental processes");
        ba.setEligibility("10+2 in any stream");
        ba.setFees("₹30,000-1.5 Lakhs per year");
        courses.add(ba);

        // Commerce Courses
        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce for accounting and finance");
        bcom.setEligibility("10+2 with Commerce/Maths");
        bcom.setFees("₹20,000-1 Lakh per year");
        courses.add(bcom);

        return courses;
    }
}