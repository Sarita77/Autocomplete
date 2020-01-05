package com.example.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinCountry;
    private AutoCompleteTextView autoCompleteTextView;
    private String[] language = {"C", "C++", ".NET", "ioS", "Android", "ASP.NET", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinCountry = findViewById(R.id.spinCountry);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String countries[] = {"Nepal", "India", "China", "UK", "US"};
        ArrayAdapter adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                countries
        );
        spinCountry.setAdapter(adapter);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.select_dialog_item,
                language
        );

        autoCompleteTextView.setAdapter(stringArrayAdapter);
        autoCompleteTextView.setThreshold(1); //start working from first character
    }
}



