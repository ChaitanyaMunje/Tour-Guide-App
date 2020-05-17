package com.digitalmarketing.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.digitalmarketing.tourguide.Adapter.HotelsAdapter;
import com.digitalmarketing.tourguide.Model.Hotels;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview= inflater.inflate(R.layout.fragment_hotels, container, false);
        ArrayList<Hotels>hotels=new ArrayList<Hotels>();
        hotels.add(new Hotels(getResources().getString(R.string.hotel1),getResources().getString(R.string.hotel1rate),R.drawable.fourseas,getResources().getString(R.string.hotel1price),getResources().getString(R.string.hotel1url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel2),getResources().getString(R.string.hotel2rate),R.drawable.hotel2,getResources().getString(R.string.hotel2price),getResources().getString(R.string.hotel2url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel3),getResources().getString(R.string.hotel3rate),R.drawable.hotel3,getResources().getString(R.string.hotel3price),getResources().getString(R.string.hotel3url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel4),getResources().getString(R.string.hotel4rate),R.drawable.hotel4,getResources().getString(R.string.hotel4price),getResources().getString(R.string.hotel4url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel5),getResources().getString(R.string.hotel5rate),R.drawable.hotel5,getResources().getString(R.string.hotel5price),getResources().getString(R.string.hotel5url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel6),getResources().getString(R.string.hotel6rate),R.drawable.hotel6,getResources().getString(R.string.hotel6price),getResources().getString(R.string.hotel6url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel7),getResources().getString(R.string.hotel7rate),R.drawable.hotel7,getResources().getString(R.string.hotel7price),getResources().getString(R.string.hotel7url)));
        hotels.add(new Hotels(getResources().getString(R.string.hotel8),getResources().getString(R.string.hotel8rate),R.drawable.hotel8,getResources().getString(R.string.hotel8price),getResources().getString(R.string.hotel8url)));

        GridView gridView=rootview.findViewById(R.id.gridview);

        HotelsAdapter hotelsAdapter=new HotelsAdapter(getContext(),hotels);

        gridView.setAdapter(hotelsAdapter);




        return rootview;
    }

}
