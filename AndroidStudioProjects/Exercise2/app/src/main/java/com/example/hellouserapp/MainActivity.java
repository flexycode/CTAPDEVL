package com.example.hellouserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private Button btnGreet;
    private TextView tvGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML views to Java
        etName = findViewById(R.id.etName);
        btnGreet = findViewById(R.id.btnGreet);
        tvGreeting = findViewById(R.id.tvGreeting);

        // Set click listener for button
        btnGreet.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                if (name.isEmpty()) {
                    tvGreeting.setText("Please enter your name.");
                } else {
                    String message = "Hello, " + name + "! Welcome to Android Development.";
                    tvGreeting.setText(message);
                }
            }
        });
    }
}


/**
 * Optional Challenge for Toast Message Implementation
 * To display a Toast instead of updating the TextView when no name is entered, modify the onClick method:
 * Don't forget to add the import at the top:
 * import android.widget.Toast;
 */

/* 
btnGreet.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name = etName.getText().toString().trim();
        
        if (name.isEmpty()) {
            // Show Toast message if no name is entered
            Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
        } else {
            // Display greeting in TextView if name is provided
            String greeting = "Hello, " + name + "! Welcome to Android Development.";
            tvGreeting.setText(greeting);
        }
    }
});
*/

