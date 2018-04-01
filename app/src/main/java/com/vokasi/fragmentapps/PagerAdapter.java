package com.vokasi.fragmentapps;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Lenovo100 on 21/03/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numOfTabs; //parameter yang membawa jumlah tabs

    private String[] tabTitles = new String[]{"CHAT","STATUS","CALLS"};

    public PagerAdapter(FragmentManager fm, int NumOfTabs){
        super(fm);
        this.numOfTabs=NumOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) { //menentukan urutan fragment yang muncul
        switch(position){
            case 0: return new BlankFragment();
            case 1: return new SecondFragment();
            case 2: return new ThirdFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
