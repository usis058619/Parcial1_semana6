package com.example.parcial_semana6.Controls;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerController extends FragmentPagerAdapter {
    //****** tabs number*****
    int tabNum;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.tabNum = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //*** Chose what fragment to show*******//////
        switch (position) {
            case 0:
                return new Contacts();

            case 1:
                return new Email();

            case 2:
                return new Messages();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        //****** returns the tab nomber************///
        return tabNum;
    }
}
