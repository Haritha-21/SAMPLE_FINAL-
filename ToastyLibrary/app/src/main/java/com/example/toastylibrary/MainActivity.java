package com.example.toastylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    private Button success,error,warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        success=findViewById(R.id.btn1);
        error=findViewById(R.id.btn2);
        warning=findViewById(R.id.btn3);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity.this,"Success",Toasty.LENGTH_SHORT).show();
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this,"Error",Toasty.LENGTH_SHORT).show();
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(MainActivity.this,"Warning message",Toasty.LENGTH_SHORT).show();
            }
        });
    }
}