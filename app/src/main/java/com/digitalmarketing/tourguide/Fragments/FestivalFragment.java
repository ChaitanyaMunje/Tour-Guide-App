package com.digitalmarketing.tourguide.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.digitalmarketing.tourguide.Adapter.FestivalAdapter;
import com.digitalmarketing.tourguide.Model.Festivals;
import com.digitalmarketing.tourguide.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FestivalFragment extends Fragment {


    public FestivalFragment() {
        // Required empty public constructor
    }

ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_festival, container, false);
      listView=view.findViewById(R.id.festival_listview);
        ArrayList<Festivals>festivalsArrayList=new ArrayList<Festivals>();
        festivalsArrayList.add(new Festivals(getResources().getString(R.string.fest1name),getResources().getString(R.string.fest1season),getResources().getString(R.string.fest1des),R.drawable.fest1));
        festivalsArrayList.add(new Festivals(getResources().getString(R.string.fest1name),getResources().getString(R.string.fest1season),getResources().getString(R.string.fest1des),R.drawable.fest2));
        festivalsArrayList.add(new Festivals(getResources().getString(R.string.fest1name),getResources().getString(R.string.fest1season),getResources().getString(R.string.fest1des),R.drawable.fest3));
        festivalsArrayList.add(new Festivals(getResources().getString(R.string.fest1name),getResources().getString(R.string.fest1season),getResources().getString(R.string.fest1des),R.drawable.fest4));

        FestivalAdapter festivalAdapter=new FestivalAdapter(getContext(),festivalsArrayList);
        listView.setAdapter(festivalAdapter);



        return view;
    }

}
