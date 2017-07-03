package com.example.lenovo.adg_;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Allan on 29-06-2017.
 */

public class FreeSlotFragementAdapter extends FragmentPagerAdapter {


    public FreeSlotFragementAdapter(FragmentManager fm) {
        //required constructor
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: MondayFrag mondayFrag = new MondayFrag();
                    return mondayFrag;
            case 1: TuesdayFrag tuesdayFrag = new TuesdayFrag();
                    return tuesdayFrag;
            case 2: WednesdayFrag wednesdayFrag = new WednesdayFrag();
                    return wednesdayFrag;
            case 3: ThursdayFrag thursdayFrag = new ThursdayFrag();
                    return thursdayFrag;
            case 4: FridayFrag fridayFrag = new FridayFrag();
                    return fridayFrag;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thursday";
            case 4: return "Friday";
        }
        return null;
    }
}
