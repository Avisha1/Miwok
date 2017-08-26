package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by avishai on 8/26/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new PhrasesFragment();
            case 2:
                return new ColorsFragment();
            default:
                return new FamilyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
