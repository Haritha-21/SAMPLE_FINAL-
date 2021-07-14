package com.example.loginbutterknife;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.userName)
    EditText userName;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.loginButton)
    Button loginButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Do not forget to call this
        ButterKnife.bind(this);


    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    @OnClick(R.id.loginButton)
    public void onClick()
    {
        String name = userName.getText().toString();
        String pass = password.getText().toString();

        Toast.makeText(this,"successfully registered",Toast.LENGTH_LONG)
                .show();

    }
}