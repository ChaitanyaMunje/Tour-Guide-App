package com.digitalmarketing.tourguide.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.digitalmarketing.tourguide.Fragments.FestivalFragment;
import com.digitalmarketing.tourguide.Fragments.HotelsFragment;
import com.digitalmarketing.tourguide.Fragments.ParkFragment;
import com.digitalmarketing.tourguide.Fragments.ReligiousPlaceFragment;
import com.digitalmarketing.tourguide.Fragments.TourFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if (position==0){
            fragment=new TourFragment();
        }
        else if (position==1){
            fragment=new HotelsFragment();
        }
        else if (position==2){
            fragment=new ParkFragment();
        }
        else if (position==3){
            fragment=new ReligiousPlaceFragment();
        }
        else if (position==4){
            fragment=new FestivalFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0){
            title="Tour";
        }
        else if (position==1){
            title="Hotels";
        }
        else if (position==2){
            title="Parks";
        }
        else if(position==3){
            title="Religious Places";
        }
        else if (position==4){
            title="Festivals";
        }
        return title;
    }
}
