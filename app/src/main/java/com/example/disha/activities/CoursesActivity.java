package com.example.disha.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.disha.R;
import com.example.disha.adapters.CourseAdapter;
import com.example.disha.models.Course;
import com.example.disha.utils.CourseDataManager;

import java.util.ArrayList;
import java.util.List;

public class CoursesActivity extends AppCompatActivity {
    private ImageView btnBack;
    private EditText etSearch;
    private RecyclerView recyclerCourses;

    private CourseAdapter adapter;
    private List<Course> allCourses;
    private List<Course> filteredCourses;
    private ArrayList<String> recommendedCareers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        initializeViews();
        getDataFromIntent();
        loadCourses();
        setupRecyclerView();
        setClickListeners();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        etSearch = findViewById(R.id.et_search);
        recyclerCourses = findViewById(R.id.recycler_courses);
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        recommendedCareers = intent.getStringArrayListExtra("recommended_careers");
    }

    private void loadCourses() {
        CourseDataManager dataManager = new CourseDataManager();
        allCourses = dataManager.getAllCourses();
        filteredCourses = new ArrayList<>(allCourses);
    }

    private void setupRecyclerView() {
        adapter = new CourseAdapter(filteredCourses, this::onCourseClick);
        recyclerCourses.setLayoutManager(new LinearLayoutManager(this));
        recyclerCourses.setAdapter(adapter);
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> onBackPressed());

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterCourses(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void filterCourses(String query) {
        filteredCourses.clear();

        if (query.isEmpty()) {
            filteredCourses.addAll(allCourses);
        } else {
            String lowerQuery = query.toLowerCase();
            for (Course course : allCourses) {
                if (course.getCourseName().toLowerCase().contains(lowerQuery) ||
                        course.getDegree().toLowerCase().contains(lowerQuery) ||
                        course.getDescription().toLowerCase().contains(lowerQuery)) {
                    filteredCourses.add(course);
                }
            }
        }

        adapter.notifyDataSetChanged();
    }

    private void onCourseClick(Course course) {
        Toast.makeText(this, "Selected: " + course.getCourseName(), Toast.LENGTH_SHORT).show();
    }

}
