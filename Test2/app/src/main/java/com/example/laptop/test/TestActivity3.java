package com.example.laptop.test;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TestActivity3 extends android.support.v4.app.Fragment {

    int i=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_test3, container, false);

        MainActivity.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position==1){

                    Toast.makeText(rootView.getContext(),i+"",Toast.LENGTH_SHORT).show();
                    i++;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return rootView;
    }
    }






