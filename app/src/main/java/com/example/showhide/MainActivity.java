package com.example.showhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    public void show(View v){

        textView.setVisibility(View.VISIBLE);
    }
    public void hide(View v){

        textView.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView  textView = findViewById(R.id.textViewThang);
    }
}
