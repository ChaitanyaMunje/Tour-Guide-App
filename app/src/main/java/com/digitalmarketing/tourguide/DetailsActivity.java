package com.digitalmarketing.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class DetailsActivity extends AppCompatActivity {
String spotname,spotdesc,spottime,spoturl,spotfees,spotlocation;
int spotimgid;
TextView name,location,time,desc;
ImageView spotimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        spotname=getIntent().getStringExtra("spotname");
        spotdesc=getIntent().getStringExtra("spotdesc");
        spottime=getIntent().getStringExtra("spottime");
        spoturl=getIntent().getStringExtra("spoturl");
        spotfees=getIntent().getStringExtra("spotfees");
        spotlocation=getIntent().getStringExtra("spotlocation");
        spotimgid=getIntent().getIntExtra("spotimgid",0);
        name=findViewById(R.id.spotname);
        location=findViewById(R.id.location);
        time=findViewById(R.id.time);
        desc=findViewById(R.id.spotdesc);
        spotimg=findViewById(R.id.image);
        name.setText(spotname);
        location.setText(spotlocation);
        time.setText(spottime);
        desc.setText(spotdesc);
        spotimg.setImageResource(spotimgid);




    }
}
