package com.example.oliverng.newhome;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public SectionPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new OneFragment();
            case 1:
                return new OneFragment();
            case 2:
                return new OneFragment();
            case 3:
                return new TwoFragment();
            case 4:
                return new TwoFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return mContext.getString(R.string.title_section3).toUpperCase(l);
            case 3:
                return mContext.getString(R.string.title_section4).toUpperCase(l);
            case 4:
                return mContext.getString(R.string.title_section5).toUpperCase(l);
        }
        return null;
    }

    public int getIcon(int position){
        switch(position){
            case 0:
                return R.mipmap.ic_launcher;
            case 1:
                return R.mipmap.ic_launcher;
        }
        return R.mipmap.ic_launcher;
    }
}
