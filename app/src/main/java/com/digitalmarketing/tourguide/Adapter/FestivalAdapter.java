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

import com.digitalmarketing.tourguide.Festivals_Activity;
import com.digitalmarketing.tourguide.Hotel_Details_Activity;
import com.digitalmarketing.tourguide.Model.Festivals;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;

public class FestivalAdapter extends ArrayAdapter<Festivals> {


    public FestivalAdapter(@NonNull Context context, ArrayList<Festivals> festivalsArrayList) {
        super(context, 0,festivalsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView=convertView;
        if (listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.festival_item,parent,false);

        }
        final Festivals festivals=getItem(position);
        TextView fest_name=listitemView.findViewById(R.id.festivalname);
        ImageView fest_img=listitemView.findViewById(R.id.festival_img);
        fest_name.setText(festivals.getFestivalname());
        fest_img.setImageResource(festivals.getFestivalimg());
        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), Festivals_Activity.class);
               i.putExtra("festname",festivals.getFestivalname());
               i.putExtra("festdesc",festivals.getFestivaldesc());
               i.putExtra("season",festivals.getFestivalseason());
               i.putExtra("imgid",festivals.getFestivalimg());
                getContext().startActivity(i);
            }
        });
        return listitemView;
    }
}
