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
import com.digitalmarketing.tourguide.Model.ReligiousPlaces;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;

public class ReligiousAdapter extends ArrayAdapter<ReligiousPlaces> {

    public ReligiousAdapter(@NonNull Context context, ArrayList<ReligiousPlaces> religiousPlacesArrayList) {
        super(context,0,religiousPlacesArrayList );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.tour_spot_item,parent,false);
        }
        final ReligiousPlaces religiousPlaces=getItem(position);
        TextView temple_name=listitemView.findViewById(R.id.spot_name);
        TextView temple_location=listitemView.findViewById(R.id.spotlocation);
        TextView temple_timing=listitemView.findViewById(R.id.spot_timings);
        ImageView temple_img=listitemView.findViewById(R.id.spot_img);
        TextView temple_rating=listitemView.findViewById(R.id.spot_rating);

        temple_name.setText(religiousPlaces.getTempleName());
        temple_location.setText(religiousPlaces.getTempleLocation());
        temple_timing.setText(religiousPlaces.getTempleTiming());
        temple_img.setImageResource(religiousPlaces.getTempleImgId());
        temple_rating.setText(religiousPlaces.getTrmpleGod());

        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), DetailsActivity.class);
                i.putExtra("spotname",religiousPlaces.getTempleName());
                i.putExtra("spotdesc",religiousPlaces.getTempleDesc());
                i.putExtra("spotimgid",religiousPlaces.getTempleImgId());
                i.putExtra("spotlocation",religiousPlaces.getTempleLocation());
                i.putExtra("spottime",religiousPlaces.getTempleTiming());
                getContext().startActivity(i);
            }
        });
        return listitemView;
    }
}
