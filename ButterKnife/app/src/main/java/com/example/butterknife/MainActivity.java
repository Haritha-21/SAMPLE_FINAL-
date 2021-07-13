package com.example.butterknife;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.OnTouch;

public class MainActivity extends AppCompatActivity {
    private  static  final String TAG ="MainActivity";

    @BindView(R.id.textview)
    TextView textView;

    @BindViews({R.id.firstnametextview,R.id.lastnametextview})
    List<TextView> nameTextView;

    @BindString(R.string.my_string)
    String myString;

    @BindView(R.id.imageview)
    ImageView imageView;

    @BindDrawable(R.drawable.android)
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        textView.setText("hlooooooo");

        textView.setText(myString);

        imageView.setImageDrawable(drawable);

        for (TextView  textView:nameTextView){
           Log.e(TAG,"onCreate" + textView.getText());
        }

        //textView=findViewById(R.id.textview);
       // textView.setText("hloooooo");
    }


    @OnClick(R.id.button)
    void  buttonClick() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
    }
    @OnLongClick(R.id.button)
    void onLongClick(){
        Toast.makeText(this, "On Long Clicked", Toast.LENGTH_SHORT).show();
    }

    @OnTouch({R.id.textview,R.id.firstnametextview})
    void OnTouch(){
        Toast.makeText(this, "On touch", Toast.LENGTH_SHORT).show();
    }

}