package com.digitalmarketing.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Hotel_Details_Activity extends AppCompatActivity {

    TextView hotelname,hotelrating,hotelprice;
    ImageView hotelimg;
    Button bookbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel__details_);
        hotelname=findViewById(R.id.hotelname);
        hotelimg=findViewById(R.id.hotelimage);
        hotelrating=findViewById(R.id.rating);
        hotelprice=findViewById(R.id.price);
        bookbtn=findViewById(R.id.bookhotel);
        androidx.appcompat.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        String name=getIntent().getStringExtra("name");
        String rating=getIntent().getStringExtra("rating");
        String price=getIntent().getStringExtra("price");
        final String url=getIntent().getStringExtra("url");
        int imgid=getIntent().getIntExtra("imgid",0);
        hotelname.setText(name);
        hotelrating.setText(rating);
        hotelprice.setText(price);
        hotelimg.setImageResource(imgid);
        bookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse(url);
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

    }
}
