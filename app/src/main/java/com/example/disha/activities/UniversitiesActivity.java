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
import com.example.disha.adapters.UniversityAdapter;
import com.example.disha.models.University;
import com.example.disha.utils.UniversityDataManager;

import java.util.ArrayList;
import java.util.List;

public class UniversitiesActivity extends AppCompatActivity {
    private ImageView btnBack;
    private ImageView btnFilter;
    private EditText etSearch;
    private RecyclerView recyclerUniversities;

    private UniversityAdapter adapter;
    private List<University> allUniversities;
    private List<University> filteredUniversities;
    private ArrayList<String> educationPaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universities);

        initializeViews();
        getDataFromIntent();
        loadUniversities();
        setupRecyclerView();
        setClickListeners();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        btnFilter = findViewById(R.id.btn_filter);
        etSearch = findViewById(R.id.et_search);
        recyclerUniversities = findViewById(R.id.recycler_universities);
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        educationPaths = intent.getStringArrayListExtra("education_paths");
    }

    private void loadUniversities() {
        UniversityDataManager dataManager = new UniversityDataManager();
        allUniversities = dataManager.getAllUniversities();
        filteredUniversities = new ArrayList<>(allUniversities);
    }

    private void setupRecyclerView() {
        adapter = new UniversityAdapter(filteredUniversities, this::onUniversityClick);
        recyclerUniversities.setLayoutManager(new LinearLayoutManager(this));
        recyclerUniversities.setAdapter(adapter);
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> onBackPressed());

        btnFilter.setOnClickListener(v -> showFilterDialog());

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterUniversities(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void filterUniversities(String query) {
        filteredUniversities.clear();

        if (query.isEmpty()) {
            filteredUniversities.addAll(allUniversities);
        } else {
            String lowerQuery = query.toLowerCase();
            for (University university : allUniversities) {
                if (university.getName().toLowerCase().contains(lowerQuery) ||
                        university.getLocation().toLowerCase().contains(lowerQuery)) {
                    filteredUniversities.add(university);
                }
            }
        }

        adapter.notifyDataSetChanged();
    }

    private void showFilterDialog() {
        // TODO: Implement filter dialog for location, type, rating, etc.
        Toast.makeText(this, "Filter functionality coming soon", Toast.LENGTH_SHORT).show();
    }

    private void onUniversityClick(University university) {
        // TODO: Navigate to university details
        Toast.makeText(this, "Clicked: " + university.getName(), Toast.LENGTH_SHORT).show();
    }
}
