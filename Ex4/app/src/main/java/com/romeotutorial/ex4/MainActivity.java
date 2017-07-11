package com.romeotutorial.ex4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ViewPager vpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpager = (ViewPager) findViewById(R.id.vPager);
        vpager.setAdapter(new setViewadapter(getSupportFragmentManager()));
    }

    public class setViewadapter extends FragmentPagerAdapter {
        public setViewadapter(FragmentManager fm) {
            super(fm);
        }

        @Override


        public Fragment getItem(int position) {
            if (position == 0) {
                return new unu();
            }
            if (position == 1) {
                return new doi();
            }
            if (position == 2) {
                return new trei();
            }
            if (position == 3) {
                return new patru();
            }
            if (position == 4) {
                return new cinci();
            }
            if (position == 5) {
                return new sase();
            }
            if (position == 6) {
                return new sapte();
            }
            if (position == 7) {
                return new opt();
            }
            if (position == 8) {
                return new noua();
            }
            if (position == 9) {
                return new zece();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 10;
        }
    }
}


