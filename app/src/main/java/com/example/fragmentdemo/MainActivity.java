package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new PagerDemoAdapter());
    }

    private class PagerDemoAdapter extends FragmentPagerAdapter {

        public PagerDemoAdapter() {
            super(getSupportFragmentManager());
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new TextViewFragment();
                case 1:
                    return new EditTextFragment();
                default:
                    return new ButtonFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}