package com.example.christmasgreetingcard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        Button buttonGreeting = findViewById(R.id.buttonGreeting);

        // Set an OnClickListener to the button
        buttonGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display the Toast message
                Toast.makeText(MainActivity.this,
                        getString(R.string.toast_message),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
