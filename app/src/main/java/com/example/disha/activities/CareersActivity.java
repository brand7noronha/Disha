package com.example.disha.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.disha.R;
import com.example.disha.adapters.CareerAdapter;
import com.example.disha.models.Career;
import com.example.disha.utils.CareerDataManager;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class CareersActivity extends AppCompatActivity {
    private ImageView btnBack;
    private ImageView btnSearch;
    private MaterialCardView searchContainer;
    private EditText etSearch;
    private RecyclerView recyclerCareers;
    private Button btnAll, btnTechnology, btnHealthcare, btnBusiness, btnArts;

    private CareerAdapter adapter;
    private List<Career> allCareers;
    private List<Career> filteredCareers;
    private String currentCategory = "All";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers);

        initializeViews();
        loadCareers();
        setupRecyclerView();
        setClickListeners();
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.btn_back);
        btnSearch = findViewById(R.id.btn_search);
        searchContainer = findViewById(R.id.search_container);
        etSearch = findViewById(R.id.et_search);
        recyclerCareers = findViewById(R.id.recycler_careers);

        btnAll = findViewById(R.id.btn_all);
        btnTechnology = findViewById(R.id.btn_technology);
        btnHealthcare = findViewById(R.id.btn_healthcare);
        btnBusiness = findViewById(R.id.btn_business);
        btnArts = findViewById(R.id.btn_arts);
    }

    private void loadCareers() {
        CareerDataManager dataManager = new CareerDataManager();
        allCareers = dataManager.getAllCareers();
        filteredCareers = new ArrayList<>(allCareers);
    }

    private void setupRecyclerView() {
        adapter = new CareerAdapter(filteredCareers, this::onCareerClick);
        recyclerCareers.setLayoutManager(new LinearLayoutManager(this));
        recyclerCareers.setAdapter(adapter);
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> onBackPressed());

        btnSearch.setOnClickListener(v -> toggleSearch());

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterCareers(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        // Category buttons
        btnAll.setOnClickListener(v -> selectCategory("All"));
        btnTechnology.setOnClickListener(v -> selectCategory("Technology"));
        btnHealthcare.setOnClickListener(v -> selectCategory("Healthcare"));
        btnBusiness.setOnClickListener(v -> selectCategory("Business"));
        btnArts.setOnClickListener(v -> selectCategory("Arts"));

        // Set initial category
        selectCategory("All");
    }

    private void toggleSearch() {
        if (searchContainer.getVisibility() == View.VISIBLE) {
            searchContainer.setVisibility(View.GONE);
            etSearch.setText("");
        } else {
            searchContainer.setVisibility(View.VISIBLE);
            etSearch.requestFocus();
        }
    }

    private void selectCategory(String category) {
        currentCategory = category;

        // Reset all buttons
        resetCategoryButtons();

        // Highlight selected button
        Button selectedButton = getCategoryButton(category);
        if (selectedButton != null) {
            selectedButton.setBackgroundColor(getResources().getColor(R.color.primary_color));
            selectedButton.setTextColor(getResources().getColor(R.color.text_white));
        }

        // Filter careers by category
        filterByCategory(category);
    }

    private void resetCategoryButtons() {
        btnAll.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        btnAll.setTextColor(getResources().getColor(R.color.primary_color));

        btnTechnology.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        btnTechnology.setTextColor(getResources().getColor(R.color.primary_color));

        btnHealthcare.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        btnHealthcare.setTextColor(getResources().getColor(R.color.primary_color));

        btnBusiness.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        btnBusiness.setTextColor(getResources().getColor(R.color.primary_color));

        btnArts.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        btnArts.setTextColor(getResources().getColor(R.color.primary_color));
    }

    private Button getCategoryButton(String category) {
        switch (category) {
            case "All":
                return btnAll;
            case "Technology":
                return btnTechnology;
            case "Healthcare":
                return btnHealthcare;
            case "Business":
                return btnBusiness;
            case "Arts":
                return btnArts;
            default:
                return null;
        }
    }

    private void filterByCategory(String category) {
        filteredCareers.clear();

        if (category.equals("All")) {
            filteredCareers.addAll(allCareers);
        } else {
            for (Career career : allCareers) {
                // Check if career belongs to category (you'll need to add category field to Career model)
                if (career.getCareerName().toLowerCase().contains(category.toLowerCase()) ||
                        career.getDescription().toLowerCase().contains(category.toLowerCase())) {
                    filteredCareers.add(career);
                }
            }
        }

        adapter.notifyDataSetChanged();
    }

    private void filterCareers(String query) {
        filteredCareers.clear();

        if (query.isEmpty()) {
            filterByCategory(currentCategory);
            return;
        }

        String lowerQuery = query.toLowerCase();
        for (Career career : allCareers) {
            if (career.getCareerName().toLowerCase().contains(lowerQuery) ||
                    career.getDescription().toLowerCase().contains(lowerQuery)) {

                // Also check category filter
                if (currentCategory.equals("All") ||
                        career.getCareerName().toLowerCase().contains(currentCategory.toLowerCase()) ||
                        career.getDescription().toLowerCase().contains(currentCategory.toLowerCase())) {
                    filteredCareers.add(career);
                }
            }
        }

        adapter.notifyDataSetChanged();
    }

    private void onCareerClick(Career career) {
        Intent intent = new Intent(CareersActivity.this, CareerDetailsActivity.class);
        intent.putExtra("career_name", career.getCareerName());
        intent.putExtra("career_description", career.getDescription());
        intent.putExtra("salary_range", career.getSalaryRange());
        intent.putExtra("growth_prospects", career.getGrowthProspects());
        intent.putStringArrayListExtra("required_skills", career.getRequiredSkills());
        intent.putStringArrayListExtra("education_paths", career.getEducationPaths());
        startActivity(intent);
    }

}
