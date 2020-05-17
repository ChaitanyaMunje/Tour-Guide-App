package com.digitalmarketing.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.digitalmarketing.tourguide.Adapter.TourAdapter;
import com.digitalmarketing.tourguide.Model.Hotels;
import com.digitalmarketing.tourguide.Model.TourSpots;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TourFragment extends Fragment {


    public TourFragment() {
        // Required empty public constructor
    }

     ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_tour, container, false);
        listView=root.findViewById(R.id.listview);
        ArrayList<TourSpots>tourSpots=new ArrayList<TourSpots>();
        tourSpots.add(new TourSpots(getResources().getString(R.string.gatewayofindia),getResources().getString(R.string.gatetime),getResources().getString(R.string.gatelocation),getString(R.string.gatedesc),R.drawable.gatewayofindia,getResources().getString(R.string.gatefees),getResources().getString(R.string.gaterating),getResources().getString(R.string.gateurl)));
        tourSpots.add(new TourSpots(getResources().getString(R.string.cst),getResources().getString(R.string.csttime),getResources().getString(R.string.cstlocation),getString(R.string.cstdesc),R.drawable.cstmumbai,getResources().getString(R.string.cstfees),getResources().getString(R.string.cstrating),getResources().getString(R.string.csturl)));
        tourSpots.add(new TourSpots(getResources().getString(R.string.filmcity),getResources().getString(R.string.filmtime),getResources().getString(R.string.filmlocation),getString(R.string.filmdesc),R.drawable.goregaonfilmcity,getResources().getString(R.string.filmfees),getResources().getString(R.string.filmrating),getResources().getString(R.string.filmurl)));
        tourSpots.add(new TourSpots(getResources().getString(R.string.juhu),getResources().getString(R.string.juhutime),getResources().getString(R.string.juhulocation),getString(R.string.juhudesc),R.drawable.juhubeach,getResources().getString(R.string.juhufees),getResources().getString(R.string.juhurating),getResources().getString(R.string.juhuurl)));
        tourSpots.add(new TourSpots(getResources().getString(R.string.plake),getResources().getString(R.string.ptime),getResources().getString(R.string.plocation),getString(R.string.pdesc),R.drawable.powailake,getResources().getString(R.string.pfees),getResources().getString(R.string.prating),getResources().getString(R.string.purl)));
        tourSpots.add(new TourSpots(getResources().getString(R.string.worli),getResources().getString(R.string.worlitime),getResources().getString(R.string.worlilocation),getString(R.string.worlidesc),R.drawable.worliseaface,getResources().getString(R.string.worlifees),getResources().getString(R.string.worlirating),getResources().getString(R.string.worliurl)));

        TourAdapter tourAdapter=new TourAdapter(getContext(),tourSpots);
        listView.setAdapter(tourAdapter);

        return root;

    }

}
