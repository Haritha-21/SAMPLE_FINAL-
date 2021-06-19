package com.example.rootcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int view = R.layout.activity_main;
    TextView rootFinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
        rootFinder = findViewById(R.id.rootFinder);
        executeShellCommand("su");
    }

    private void executeShellCommand(String su) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(su);
            rootFinder.setText("It is rooted device");
            Toast.makeText(MainActivity.this, "It is rooted device", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            rootFinder.setText("It is not rooted device");
        } finally {
            if (process!= null) {
                try {
                    process.destroy();
                } catch (Exception e) { }
            }
        }
    }
}
