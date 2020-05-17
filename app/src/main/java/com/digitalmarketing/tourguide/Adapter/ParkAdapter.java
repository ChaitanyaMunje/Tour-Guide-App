package com.digitalmarketing.tourguide.Adapter;

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
import com.digitalmarketing.tourguide.Model.Park;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;

public class ParkAdapter extends ArrayAdapter<Park> {
    public ParkAdapter(@NonNull Context context, ArrayList<Park> parkArrayList) {
        super(context,0 ,parkArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.tour_spot_item,parent,false);

        }
        final Park park=getItem(position);
        TextView spotname=listitemView.findViewById(R.id.spot_name);
        TextView spotlocation=listitemView.findViewById(R.id.spotlocation);
        TextView spotrating=listitemView.findViewById(R.id.spot_rating);
        ImageView spotimg=listitemView.findViewById(R.id.spot_img);
        spotimg.setImageResource(park.getParkImgId());
        spotname.setText(park.getParkName());
        spotlocation.setText(park.getParkLocation());
        spotrating.setText(park.getParkRating());

        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), DetailsActivity.class);
                i.putExtra("spotname",park.getParkName());
                i.putExtra("spotdesc",park.getParkDesc());
                i.putExtra("spotimgid",park.getParkImgId());
                i.putExtra("spotlocation",park.getParkLocation());
                i.putExtra("spottime",park.getParkTiming());
                getContext().startActivity(i);
            }
        });
        return listitemView;
    }
}
