package com.digitalmarketing.tourguide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.digitalmarketing.tourguide.DetailsActivity;
import com.digitalmarketing.tourguide.Model.Hotels;
import com.digitalmarketing.tourguide.Model.TourSpots;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<TourSpots> {
    public TourAdapter(@NonNull Context context, ArrayList<TourSpots> tourSpots) {
        super(context, 0,tourSpots);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.tour_spot_item,parent,false);

        }
            final TourSpots tourSpots=getItem(position);
            TextView spotname=listitemView.findViewById(R.id.spot_name);
            TextView spotlocation=listitemView.findViewById(R.id.spotlocation);
            TextView spotrating=listitemView.findViewById(R.id.spot_rating);
            TextView spottime=listitemView.findViewById(R.id.spot_timings);
            ImageView spotimg=listitemView.findViewById(R.id.spot_img);
            spottime.setText(tourSpots.getSpotTimings());
            spotimg.setImageResource(tourSpots.getSpotImgId());
            spotname.setText(tourSpots.getSpotName());
            spotlocation.setText(tourSpots.getSpotLocation());
            spotrating.setText(tourSpots.getSpotRating());
            listitemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getContext(), DetailsActivity.class);
                    i.putExtra("spotname",tourSpots.getSpotName());
                    i.putExtra("spotdesc",tourSpots.getSpotDesc());
                    i.putExtra("spotfees",tourSpots.getSpotFees());
                    i.putExtra("spotimgid",tourSpots.getSpotImgId());
                    i.putExtra("spotlocation",tourSpots.getSpotLocation());
                    i.putExtra("spottime",tourSpots.getSpotTimings());
                    i.putExtra("spoturl",tourSpots.getSpotUrl());
                    getContext().startActivity(i);
                }
            });

        return listitemView;
    }
}
