package com.example.databindingfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingfragment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sText= binding.etInput.getText().toString().trim();
                if (!sText.equals("")){
                    binding.tvOutput.setText(sText);
                }else {
                    Toast.makeText(getApplicationContext(),"please enter text",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Fragment fragment= new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();
    }
}