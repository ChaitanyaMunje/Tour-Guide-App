package com.digitalmarketing.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Festivals_Activity extends AppCompatActivity {

    TextView festname,festseason,festdesc;
    ImageView festimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festivals_);
        festname=findViewById(R.id.festname);
        festseason=findViewById(R.id.festseason);
        festdesc=findViewById(R.id.festdesc);
        festimg=findViewById(R.id.festival_img);
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        String fesname=getIntent().getStringExtra("festname");
        String fesseason=getIntent().getStringExtra("season");
        String fesdesc=getIntent().getStringExtra("festdesc");
        int imgid=getIntent().getIntExtra("imgid",0);
        festname.setText(fesname);
        festseason.setText(fesseason);
        festdesc.setText(fesdesc);
        festimg.setImageResource(imgid);


    }
}
