package com.romeotutorial.ex5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    FragmentPagerAdapter adapterViewPager;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager =  findViewById(R.id.pager);
        adapterViewPager = new SampleAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapterViewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {

                Toast.makeText(MainActivity.this,"Selected page position: " + position,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    static class SampleAdapter extends FragmentPagerAdapter {
        private final static int NUM_ITEMS = 3;

        public SampleAdapter(FragmentManager fm) {
            super(fm);

        }
        public int getCount() {
            return NUM_ITEMS;
        }

        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return MyFragment1.newInstance(0,"Pagina # 1");
                case 1:
                    return MyFragment2.newInstance(1,"Pagina # 2");
                case 2:
                    return MyFragment3.newInstance(2,"Pagina # 3");
                default:
                    return null;
            }

        }
        public String getPageTitle(int position) {
            return "Pagina " + (position+1);
        }
    }

}
