package com.example.lenovo.adg_;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Lenovo on 22-06-2017.
 */

public class myFragmentPagerAdapter extends FragmentPagerAdapter {


    public myFragmentPagerAdapter(FragmentManager fm) {
        //required constructor
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: CompletedFrag completedFrag = new CompletedFrag();
                    return completedFrag;
            case 1: PendingFrag pendingFrag = new PendingFrag();
                    return pendingFrag;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Completed";
            case 1: return "Pending";
        }
        return null;
    }
}
