package com.example.android.miwokstdmenu;

/**
 * Created by David on 9/26/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MiwokFragmentPageAdapter extends FragmentPagerAdapter {

    public MiwokFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new ColorFragment();
        } else if (position ==2) {
            return new FamilyFragment();
        } else {
            return new PhraseFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return ("numbers");
            case 1:
                return ("family");
            case 2:
                return ("colors");
            default:
                return ("phrases");
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
