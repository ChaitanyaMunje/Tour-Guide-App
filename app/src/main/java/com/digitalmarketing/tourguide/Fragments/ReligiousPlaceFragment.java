package com.digitalmarketing.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.digitalmarketing.tourguide.Adapter.ReligiousAdapter;
import com.digitalmarketing.tourguide.Model.ReligiousPlaces;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReligiousPlaceFragment extends Fragment {


    public ReligiousPlaceFragment() {
        // Required empty public constructor
    }

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_religious_place, container, false);
        listView=view.findViewById(R.id.listview);
        ArrayList<ReligiousPlaces>religiousPlacesArrayList=new ArrayList<ReligiousPlaces>();
        religiousPlacesArrayList.add(new ReligiousPlaces(getResources().getString(R.string.temple),getResources().getString(R.string.templetime),getResources().getString(R.string.templelocation),R.drawable.babulnathtemple,getResources().getString(R.string.templedesc),getResources().getString(R.string.templegod)));
        religiousPlacesArrayList.add(new ReligiousPlaces(getResources().getString(R.string.dargah),getResources().getString(R.string.dargahtime),getResources().getString(R.string.dargahlocation),R.drawable.hajiali,getResources().getString(R.string.dargahdesc),getResources().getString(R.string.dargahgod)));
        religiousPlacesArrayList.add(new ReligiousPlaces(getResources().getString(R.string.mahalakshmi),getResources().getString(R.string.mahalakshmitime),getResources().getString(R.string.mahalakshmilocation),R.drawable.mahalakshmitemple,getResources().getString(R.string.mahalakshmides),getResources().getString(R.string.mahalakshmigod)));
        religiousPlacesArrayList.add(new ReligiousPlaces(getResources().getString(R.string.ganpati),getResources().getString(R.string.ganpatitime),getResources().getString(R.string.ganpatilocation),R.drawable.siddhivanayak,getResources().getString(R.string.ganpatidesc),getResources().getString(R.string.ganpatigod)));
        religiousPlacesArrayList.add(new ReligiousPlaces(getResources().getString(R.string.swami),getResources().getString(R.string.swamitime),getResources().getString(R.string.swamilocation),R.drawable.swaminarayanmumbai,getResources().getString(R.string.swamidesc),getResources().getString(R.string.swamigod)));
        ReligiousAdapter religiousAdapter=new ReligiousAdapter(getContext(),religiousPlacesArrayList);
        listView.setAdapter(religiousAdapter);


        return view;
    }

}
