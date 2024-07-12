package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Set the duration of the splash screen in milliseconds
    private static final int SPLASH_DURATION = 3000; // 3 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Use a Handler to post a delayed action for transitioning to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the splash screen duration
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }
}