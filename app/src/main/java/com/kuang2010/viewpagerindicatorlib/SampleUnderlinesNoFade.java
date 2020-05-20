package com.kuang2010.viewpagerindicatorlib;

import android.os.Bundle;

import com.kuang2010.indicatorlibrary.UnderlinePageIndicator;

import androidx.viewpager.widget.ViewPager;

public class SampleUnderlinesNoFade extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_underlines);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        UnderlinePageIndicator indicator = (UnderlinePageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        indicator.setFades(false);
        mIndicator = indicator;
    }
}