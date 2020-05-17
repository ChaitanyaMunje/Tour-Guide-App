package com.digitalmarketing.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.digitalmarketing.tourguide.Adapter.ParkAdapter;
import com.digitalmarketing.tourguide.Model.Park;
import com.digitalmarketing.tourguide.Model.TourSpots;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }

ListView  listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_park, container, false);
        listView=view.findViewById(R.id.listview);
        ArrayList<Park>parkArrayList=new ArrayList<Park>();
        parkArrayList.add(new Park(R.drawable.priyadarshni,getResources().getString(R.string.priya),getResources().getString(R.string.priyatime),getResources().getString(R.string.priyalocation),getResources().getString(R.string.priyarating),getResources().getString(R.string.priyadesc)));
        parkArrayList.add(new Park(R.drawable.sanjaygandhipark,getResources().getString(R.string.sanjaypark),getResources().getString(R.string.sanjaytime),getResources().getString(R.string.sanjaylocation),getResources().getString(R.string.sanjayrating),getResources().getString(R.string.sanjaydesc)));
        parkArrayList.add(new Park(R.drawable.shivajipark,getResources().getString(R.string.shivajipark),getResources().getString(R.string.shivajitime),getResources().getString(R.string.shivajilocation),getResources().getString(R.string.shivajirating),getResources().getString(R.string.shivajides)));
        ParkAdapter parkAdapter=new ParkAdapter(getContext(),parkArrayList);
        listView.setAdapter(parkAdapter);





        return view;

    }

}
