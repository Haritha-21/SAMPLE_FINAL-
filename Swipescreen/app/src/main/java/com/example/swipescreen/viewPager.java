package com.example.swipescreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPager  extends FragmentPagerAdapter {

        // creation of constructor of viewPager class
        public viewPager(FragmentManager fm, int behaviour) {
            super(fm, behaviour);
        }


        @Override

        // create the getItem method of
        // FragmentPagerAdapter class
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new Fragment1();    // Fragment1 is the name of first blank fragment,
                // you can replace its name with your created fragment name
                case 1:
                    return new Fragment2();    // Fragment2 is the name of second blank fragment,
                // you can replace its name with your created fragment name
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
