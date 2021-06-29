package com.example.lottiefirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_name=findViewById(R.id.edittxtname);
        final EditText edit_position =findViewById(R.id.edittxtposition);
        Button btn= findViewById(R.id.btn_submit);
        DAOEmployee dao= new DAOEmployee();
        btn.setOnClickListener(v ->
        {
          /* Employee emp=new Employee(edit_name.getText().toString(),edit_position.getText().toString());
           dao.add(emp).addOnSuccessListener(suc->{
               Toast.makeText(this,"Record is inserted",Toast.LENGTH_SHORT).show();

           }).addOnFailureListener(er->{
               Toast.makeText(this,""+er.getMessage(),Toast.LENGTH_SHORT).show();
           });*/
           /* HashMap<String,Object> hashMap = new HashMap<>();
            hashMap.put("name",edit_name.getText().toString());
            hashMap.put("position",edit_position.getText().toString());
            dao.update("-McrM0SSBlQzRJsDpTMZ",hashMap).addOnSuccessListener(suc->{
                Toast.makeText(this,"Record is updated",Toast.LENGTH_SHORT).show();

            }).addOnFailureListener(er->{
                Toast.makeText(this,""+er.getMessage(),Toast.LENGTH_SHORT).show();
            });*/
            dao.remove("-McrM0SSBlQzRJsDpTMZ").addOnSuccessListener(suc->{
                Toast.makeText(this,"Record is removed",Toast.LENGTH_SHORT).show();

            }).addOnFailureListener(er->{
                Toast.makeText(this,""+er.getMessage(),Toast.LENGTH_SHORT).show();
            });
        });
    }
}