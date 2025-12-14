package com.example.simpleCV;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerPrefix;
    EditText editName, editAddress, editCity, editBirthday, editDegree, editPosition;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinnerPrefix = findViewById(R.id.spinnerPrefix);
        editName = findViewById(R.id.editName);
        editAddress = findViewById(R.id.editAddress);
        editCity = findViewById(R.id.editCity);
        editBirthday = findViewById(R.id.editBirthday);
        editDegree = findViewById(R.id.editDegree);
        editPosition = findViewById(R.id.editPosition);
        btnSubmit = findViewById(R.id.btnSubmit);


        String[] prefixes = {"Mr", "Ms", "Mrs"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_dropdown_item, prefixes
        );
        spinnerPrefix.setAdapter(adapter);
        editBirthday.setOnClickListener(v -> showDatePicker());
        btnSubmit.setOnClickListener(v -> showPopupDialog());
    }

    private void showDatePicker() {
        Calendar calendar = Calendar.getInstance();

        DatePickerDialog dialog = new DatePickerDialog(
                this,
                (view, year, month, day) -> {
                    String date = (month + 1) + "/" + day + "/" + year;
                    editBirthday.setText(date);
                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        );

        dialog.show();
    }

    private void showPopupDialog() {
        String prefix = spinnerPrefix.getSelectedItem().toString();
        String name = editName.getText().toString().trim();
        String position = editPosition.getText().toString().trim();

        String lastName = name.contains(",") ? name.split(",")[0].trim() : name;

        String message = "Good day! " + prefix + " " + lastName +
                ", thank you for applying with us.\nWe will notify you when you are qualified " +
                "in your preferred position as " + position + ".";

        new AlertDialog.Builder(this)
                .setTitle("Application Received")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }


}
