package com.example.disha.utils;
import com.example.disha.models.Course;
import com.example.disha.models.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityDataManager {
    public List<University> getAllUniversities() {
        List<University> universities = new ArrayList<>();

        // ========================================
        // GOA UNIVERSITIES AND COLLEGES
        // ========================================

        // Goa University
        University goaUniversity = new University("Goa University", "Taleigao Plateau, Goa");
        goaUniversity.setType("Public State University");
        goaUniversity.setRating(4.1);
        goaUniversity.setWebsite("https://www.unigoa.ac.in");
        addGoaUniversityCourses(goaUniversity);
        universities.add(goaUniversity);

        // National Institute of Technology Goa
        University nitGoa = new University("National Institute of Technology Goa", "Farmagudi, Ponda, Goa");
        nitGoa.setType("Public Technical Institute");
        nitGoa.setRating(4.3);
        nitGoa.setWebsite("https://www.nitgoa.ac.in");
        addNITGoaCourses(nitGoa);
        universities.add(nitGoa);

        // Goa Institute of Management (GIM)
        University gim = new University("Goa Institute of Management", "Ribandar, Panaji, Goa");
        gim.setType("Private Management Institute");
        gim.setRating(4.2);
        gim.setWebsite("https://www.gim.ac.in");
        addGIMCourses(gim);
        universities.add(gim);

        // Goa Medical College
        University goaMedical = new University("Goa Medical College", "Bambolim, Goa");
        goaMedical.setType("Public Medical College");
        goaMedical.setRating(4.0);
        goaMedical.setWebsite("https://www.gmc.goa.gov.in");
        addGoaMedicalCourses(goaMedical);
        universities.add(goaMedical);

        // Goa College of Engineering
        University gec = new University("Goa College of Engineering", "Farmagudi, Ponda, Goa");
        gec.setType("Public Engineering College");
        gec.setRating(3.9);
        gec.setWebsite("https://www.gec.ac.in");
        addGECCourses(gec);
        universities.add(gec);

        // Don Bosco College of Engineering
        University donBosco = new University("Don Bosco College of Engineering", "Fatorda, Margao, Goa");
        donBosco.setType("Private Engineering College");
        donBosco.setRating(3.8);
        donBosco.setWebsite("https://www.donboscogoa.ac.in");
        addDonBoscoCourses(donBosco);
        universities.add(donBosco);

        // Padre Conceicao College of Engineering
        University padreConceicao = new University("Padre Conceicao College of Engineering", "Verna, Goa");
        padreConceicao.setType("Private Engineering College");
        padreConceicao.setRating(3.7);
        padreConceicao.setWebsite("https://www.padreconceicao.edu.in");
        addPadreCourses(padreConceicao);
        universities.add(padreConceicao);

        // Dhempe College of Arts and Science
        University dhempe = new University("Dhempe College of Arts and Science", "Miramar, Panaji, Goa");
        dhempe.setType("Private Arts & Science College");
        dhempe.setRating(3.8);
        dhempe.setWebsite("https://www.dhempecollege.edu.in");
        addDhempeCourses(dhempe);
        universities.add(dhempe);

        // Government College of Arts, Science and Commerce
        University govtCollege = new University("Government College of Arts, Science and Commerce", "Quepem, Goa");
        govtCollege.setType("Public College");
        govtCollege.setRating(3.7);
        govtCollege.setWebsite("https://www.gcascquepem.ac.in");
        addGeneralCourses(govtCollege);
        universities.add(govtCollege);

        // Goa College of Pharmacy
        University goaPharmacy = new University("Goa College of Pharmacy", "Panaji, Goa");
        goaPharmacy.setType("Public Pharmacy College");
        goaPharmacy.setRating(3.9);
        goaPharmacy.setWebsite("https://www.gcp.ac.in");
        addPharmacyCourses(goaPharmacy);
        universities.add(goaPharmacy);

        // Carmel College for Women
        University carmelCollege = new University("Carmel College for Women", "Nuvem, Goa");
        carmelCollege.setType("Private Women's College");
        carmelCollege.setRating(3.8);
        carmelCollege.setWebsite("https://www.carmelcollegegoa.edu.in");
        addGeneralCourses(carmelCollege);
        universities.add(carmelCollege);

        // Rosary College of Commerce and Arts
        University rosaryCollege = new University("Rosary College of Commerce and Arts", "Navelim, Goa");
        rosaryCollege.setType("Private College");
        rosaryCollege.setRating(3.6);
        rosaryCollege.setWebsite("https://www.rosary.edu.in");
        addCommerceArtsCourses(rosaryCollege);
        universities.add(rosaryCollege);

        // ========================================
        // TOP UNIVERSITIES OUTSIDE GOA
        // ========================================

        // IIT Mumbai
        University iitBombay = new University("Indian Institute of Technology Bombay", "Mumbai, Maharashtra");
        iitBombay.setType("Public Technical Institute");
        iitBombay.setRating(4.7);
        iitBombay.setWebsite("https://www.iitb.ac.in");
        addIITCourses(iitBombay);
        universities.add(iitBombay);

        // IIT Delhi
        University iitDelhi = new University("Indian Institute of Technology Delhi", "New Delhi");
        iitDelhi.setType("Public Technical Institute");
        iitDelhi.setRating(4.6);
        iitDelhi.setWebsite("https://www.iitd.ac.in");
        addIITCourses(iitDelhi);
        universities.add(iitDelhi);

        // IIT Madras
        University iitMadras = new University("Indian Institute of Technology Madras", "Chennai, Tamil Nadu");
        iitMadras.setType("Public Technical Institute");
        iitMadras.setRating(4.7);
        iitMadras.setWebsite("https://www.iitm.ac.in");
        addIITCourses(iitMadras);
        universities.add(iitMadras);

        // AIIMS Delhi
        University aiimsDelhi = new University("All India Institute of Medical Sciences", "New Delhi");
        aiimsDelhi.setType("Public Medical Institute");
        aiimsDelhi.setRating(4.8);
        aiimsDelhi.setWebsite("https://www.aiims.edu");
        addMedicalCourses(aiimsDelhi);
        universities.add(aiimsDelhi);

        // AIIMS Bhopal
        University aiimsBhopal = new University("AIIMS Bhopal", "Bhopal, Madhya Pradesh");
        aiimsBhopal.setType("Public Medical Institute");
        aiimsBhopal.setRating(4.5);
        aiimsBhopal.setWebsite("https://www.aiimsbhopal.edu.in");
        addMedicalCourses(aiimsBhopal);
        universities.add(aiimsBhopal);

        // IIM Ahmedabad
        University iimAhmedabad = new University("Indian Institute of Management Ahmedabad", "Ahmedabad, Gujarat");
        iimAhmedabad.setType("Public Business School");
        iimAhmedabad.setRating(4.7);
        iimAhmedabad.setWebsite("https://www.iima.ac.in");
        addBusinessCourses(iimAhmedabad);
        universities.add(iimAhmedabad);

        // IIM Bangalore
        University iimBangalore = new University("Indian Institute of Management Bangalore", "Bangalore, Karnataka");
        iimBangalore.setType("Public Business School");
        iimBangalore.setRating(4.7);
        iimBangalore.setWebsite("https://www.iimb.ac.in");
        addBusinessCourses(iimBangalore);
        universities.add(iimBangalore);

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
        bits.setType("Private Technical Institute");
        bits.setRating(4.6);
        bits.setWebsite("https://www.bits-pilani.ac.in");
        addIITCourses(bits);
        universities.add(bits);

        // Manipal Academy
        University manipal = new University("Manipal Academy of Higher Education", "Manipal, Karnataka");
        manipal.setType("Private University");
        manipal.setRating(4.3);
        manipal.setWebsite("https://www.manipal.edu");
        addGeneralCourses(manipal);
        addMedicalCourses(manipal);
        universities.add(manipal);

        // VIT Vellore
        University vit = new University("Vellore Institute of Technology", "Vellore, Tamil Nadu");
        vit.setType("Private Technical University");
        vit.setRating(4.4);
        vit.setWebsite("https://www.vit.ac.in");
        addIITCourses(vit);
        universities.add(vit);

        // Anna University
        University annaUniv = new University("Anna University", "Chennai, Tamil Nadu");
        annaUniv.setType("Public Technical University");
        annaUniv.setRating(4.2);
        annaUniv.setWebsite("https://www.annauniv.edu");
        addIITCourses(annaUniv);
        universities.add(annaUniv);

        // Symbiosis International University
        University symbiosis = new University("Symbiosis International University", "Pune, Maharashtra");
        symbiosis.setType("Private University");
        symbiosis.setRating(4.3);
        symbiosis.setWebsite("https://www.siu.edu.in");
        addBusinessCourses(symbiosis);
        addGeneralCourses(symbiosis);
        universities.add(symbiosis);

        return universities;
    }

    // ========================================
    // GOA-SPECIFIC COURSE METHODS
    // ========================================

    private void addGoaUniversityCourses(University university) {
        Course mca = new Course("MCA", "Master's", "2 years");
        mca.setDescription("Master of Computer Applications");
        mca.setEligibility("Bachelor's degree in relevant field");
        university.addCourse(mca);

        Course msc = new Course("MSc Computer Science", "Master's", "2 years");
        msc.setDescription("Master of Science in Computer Science");
        msc.setEligibility("BSc with Computer Science/Mathematics");
        university.addCourse(msc);

        Course mba = new Course("MBA", "Master's", "2 years");
        mba.setDescription("Master of Business Administration");
        mba.setEligibility("Bachelor's degree in any discipline");
        university.addCourse(mba);

        Course bsc = new Course("BSc", "Bachelor's", "3 years");
        bsc.setDescription("Bachelor of Science in various specializations");
        bsc.setEligibility("10+2 with Science");
        university.addCourse(bsc);

        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce");
        bcom.setEligibility("10+2 with Commerce");
        university.addCourse(bcom);

        Course ba = new Course("BA", "Bachelor's", "3 years");
        ba.setDescription("Bachelor of Arts in various subjects");
        ba.setEligibility("10+2 in any stream");
        university.addCourse(ba);
    }

    private void addNITGoaCourses(University university) {
        Course cse = new Course("Computer Science and Engineering", "B.Tech", "4 years");
        cse.setDescription("Comprehensive computer science and engineering program");
        cse.setEligibility("JEE Main qualified, 10+2 with PCM");
        university.addCourse(cse);

        Course ece = new Course("Electronics and Communication Engineering", "B.Tech", "4 years");
        ece.setDescription("Electronics and communication systems");
        ece.setEligibility("JEE Main qualified, 10+2 with PCM");
        university.addCourse(ece);

        Course me = new Course("Mechanical Engineering", "B.Tech", "4 years");
        me.setDescription("Design and manufacturing of mechanical systems");
        me.setEligibility("JEE Main qualified, 10+2 with PCM");
        university.addCourse(me);

        Course ce = new Course("Civil Engineering", "B.Tech", "4 years");
        ce.setDescription("Infrastructure and construction engineering");
        ce.setEligibility("JEE Main qualified, 10+2 with PCM");
        university.addCourse(ce);

        Course mtech = new Course("M.Tech", "Master's", "2 years");
        mtech.setDescription("Master of Technology in various specializations");
        mtech.setEligibility("B.Tech with GATE qualification");
        university.addCourse(mtech);
    }

    private void addGIMCourses(University university) {
        Course pgdm = new Course("PGDM", "Post Graduate Diploma", "2 years");
        pgdm.setDescription("Post Graduate Diploma in Management");
        pgdm.setEligibility("Bachelor's degree, CAT/XAT/GMAT qualified");
        university.addCourse(pgdm);

        Course pgdmBigData = new Course("PGDM Big Data Analytics", "Post Graduate Diploma", "2 years");
        pgdmBigData.setDescription("Specialization in Big Data and Business Analytics");
        pgdmBigData.setEligibility("Bachelor's degree, CAT/XAT/GMAT qualified");
        university.addCourse(pgdmBigData);

        Course mba = new Course("MBA", "Master's", "2 years");
        mba.setDescription("Master of Business Administration");
        mba.setEligibility("Bachelor's degree, CAT/XAT qualified");
        university.addCourse(mba);
    }

    private void addGoaMedicalCourses(University university) {
        Course mbbs = new Course("MBBS", "Bachelor's", "5.5 years");
        mbbs.setDescription("Undergraduate medical degree");
        mbbs.setEligibility("NEET qualified, 10+2 with PCB");
        university.addCourse(mbbs);

        Course md = new Course("MD", "Post Graduate", "3 years");
        md.setDescription("Doctor of Medicine - various specializations");
        md.setEligibility("MBBS, NEET PG qualified");
        university.addCourse(md);

        Course ms = new Course("MS", "Post Graduate", "3 years");
        ms.setDescription("Master of Surgery - various specializations");
        ms.setEligibility("MBBS, NEET PG qualified");
        university.addCourse(ms);

        Course bscNursing = new Course("BSc Nursing", "Bachelor's", "4 years");
        bscNursing.setDescription("Bachelor of Science in Nursing");
        bscNursing.setEligibility("10+2 with PCB");
        university.addCourse(bscNursing);
    }

    private void addGECCourses(University university) {
        Course cs = new Course("Computer Engineering", "B.E.", "4 years");
        cs.setDescription("Bachelor of Engineering in Computer Engineering");
        cs.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(cs);

        Course civil = new Course("Civil Engineering", "B.E.", "4 years");
        civil.setDescription("Bachelor of Engineering in Civil Engineering");
        civil.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(civil);

        Course mech = new Course("Mechanical Engineering", "B.E.", "4 years");
        mech.setDescription("Bachelor of Engineering in Mechanical Engineering");
        mech.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(mech);

        Course elect = new Course("Electrical Engineering", "B.E.", "4 years");
        elect.setDescription("Bachelor of Engineering in Electrical Engineering");
        elect.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(elect);

        Course mining = new Course("Mining Engineering", "B.E.", "4 years");
        mining.setDescription("Bachelor of Engineering in Mining Engineering");
        mining.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(mining);
    }

    private void addDonBoscoCourses(University university) {
        Course cse = new Course("Computer Science & Engineering", "B.E.", "4 years");
        cse.setDescription("Computer science and software engineering");
        cse.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(cse);

        Course ece = new Course("Electronics & Communication Engineering", "B.E.", "4 years");
        ece.setDescription("Electronics and communication technology");
        ece.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(ece);

        Course me = new Course("Mechanical Engineering", "B.E.", "4 years");
        me.setDescription("Mechanical systems and automation");
        me.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(me);

        Course ce = new Course("Civil Engineering", "B.E.", "4 years");
        ce.setDescription("Infrastructure and structural engineering");
        ce.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(ce);
    }

    private void addPadreCourses(University university) {
        Course cse = new Course("Computer Engineering", "B.E.", "4 years");
        cse.setDescription("Computer science and IT");
        cse.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(cse);

        Course ece = new Course("Electronics & Telecommunication Engineering", "B.E.", "4 years");
        ece.setDescription("Electronics and telecom systems");
        ece.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(ece);

        Course me = new Course("Mechanical Engineering", "B.E.", "4 years");
        me.setDescription("Mechanical design and manufacturing");
        me.setEligibility("JEE Main/State CET qualified, 10+2 with PCM");
        university.addCourse(me);
    }

    private void addDhempeCourses(University university) {
        Course bca = new Course("BCA", "Bachelor's", "3 years");
        bca.setDescription("Bachelor of Computer Applications");
        bca.setEligibility("10+2 in any stream");
        university.addCourse(bca);

        Course bsc = new Course("BSc", "Bachelor's", "3 years");
        bsc.setDescription("Bachelor of Science - various specializations");
        bsc.setEligibility("10+2 with Science");
        university.addCourse(bsc);

        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce");
        bcom.setEligibility("10+2 with Commerce");
        university.addCourse(bcom);

        Course ba = new Course("BA", "Bachelor's", "3 years");
        ba.setDescription("Bachelor of Arts - various subjects");
        ba.setEligibility("10+2 in any stream");
        university.addCourse(ba);
    }

    private void addPharmacyCourses(University university) {
        Course bpharm = new Course("B.Pharm", "Bachelor's", "4 years");
        bpharm.setDescription("Bachelor of Pharmacy");
        bpharm.setEligibility("10+2 with PCB/PCM");
        university.addCourse(bpharm);

        Course mpharm = new Course("M.Pharm", "Master's", "2 years");
        mpharm.setDescription("Master of Pharmacy");
        mpharm.setEligibility("B.Pharm");
        university.addCourse(mpharm);

        Course dpharm = new Course("D.Pharm", "Diploma", "2 years");
        dpharm.setDescription("Diploma in Pharmacy");
        dpharm.setEligibility("10+2 with PCB/PCM");
        university.addCourse(dpharm);
    }

    private void addCommerceArtsCourses(University university) {
        Course bcom = new Course("BCom", "Bachelor's", "3 years");
        bcom.setDescription("Bachelor of Commerce");
        bcom.setEligibility("10+2 with Commerce");
        university.addCourse(bcom);

        Course ba = new Course("BA", "Bachelor's", "3 years");
        ba.setDescription("Bachelor of Arts in various subjects");
        ba.setEligibility("10+2 in any stream");
        university.addCourse(ba);

        Course bba = new Course("BBA", "Bachelor's", "3 years");
        bba.setDescription("Bachelor of Business Administration");
        bba.setEligibility("10+2 in any stream");
        university.addCourse(bba);
    }

    // ========================================
    // NON-GOA UNIVERSITY COURSE METHODS
    // ========================================

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

        Course ce = new Course("Civil Engineering", "B.Tech", "4 years");
        ce.setDescription("Infrastructure and construction engineering");
        ce.setEligibility("JEE Advanced qualified");
        university.addCourse(ce);

        Course che = new Course("Chemical Engineering", "B.Tech", "4 years");
        che.setDescription("Process engineering and chemical manufacturing");
        che.setEligibility("JEE Advanced qualified");
        university.addCourse(che);
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

        Course bscNursing = new Course("BSc Nursing", "Bachelor's", "4 years");
        bscNursing.setDescription("Nursing and patient care");
        bscNursing.setEligibility("10+2 with PCB");
        university.addCourse(bscNursing);
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

        Course mbaFinance = new Course("MBA Finance", "Master's", "2 years");
        mbaFinance.setDescription("MBA with Finance specialization");
        mbaFinance.setEligibility("CAT/GMAT qualified");
        university.addCourse(mbaFinance);
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

        Course fashion = new Course("Fashion Design", "B.Des", "4 years");
        fashion.setDescription("Fashion and textile design");
        fashion.setEligibility("NID DAT qualified");
        university.addCourse(fashion);
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

        Course bca = new Course("BCA", "Bachelor's", "3 years");
        bca.setDescription("Bachelor of Computer Applications");
        bca.setEligibility("12th pass");
        university.addCourse(bca);
    }
}
