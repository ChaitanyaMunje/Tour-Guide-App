package com.digitalmarketing.tourguide.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.digitalmarketing.tourguide.DetailsActivity;
import com.digitalmarketing.tourguide.Hotel_Details_Activity;
import com.digitalmarketing.tourguide.Model.Hotels;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;

public class HotelsAdapter extends ArrayAdapter<Hotels> {

    public HotelsAdapter(Context context, ArrayList<Hotels> hotels){
        super(context,0,hotels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.hotel_item,parent,false);

        }
        final Hotels hotels=getItem(position);
        TextView hotel_name=listitemView.findViewById(R.id.hotel_name);
        TextView hotel_rating=listitemView.findViewById(R.id.hotel_rating);
        TextView txt_price=listitemView.findViewById(R.id.txt_price);
        ImageView hotelimg=listitemView.findViewById(R.id.hotel_img);
        hotel_name.setText(hotels.getHotelName());
        hotel_rating.setText(hotels.getRating());
        txt_price.setText(hotels.getPrice());
        hotelimg.setImageResource(hotels.getImgId());

        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), Hotel_Details_Activity.class);
                i.putExtra("name",hotels.getHotelName());
                i.putExtra("rating",hotels.getRating());
                i.putExtra("url",hotels.getHotelUrl());
                i.putExtra("price",hotels.getPrice());
                i.putExtra("imgid",hotels.getImgId());
                getContext().startActivity(i);
            }
        });
        return listitemView;

    }
}
