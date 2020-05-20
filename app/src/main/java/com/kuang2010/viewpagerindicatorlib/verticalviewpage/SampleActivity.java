package com.kuang2010.viewpagerindicatorlib.verticalviewpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kuang2010.indicatorlibrary.DirectionalViewPager;
import com.kuang2010.viewpagerindicatorlib.R;

import androidx.fragment.app.FragmentActivity;

/**
 * 垂直和水平方向的Viewpage
 */
public class SampleActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direct_view_pager);

        //Set up the pager
        final DirectionalViewPager pager = (DirectionalViewPager)findViewById(R.id.pager);
        pager.setAdapter(new TestFragmentAdapter(getSupportFragmentManager()));
        pager.setOrientation(DirectionalViewPager.VERTICAL);

        //Bind to control buttons
        ((Button)findViewById(R.id.horizontal)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setOrientation(DirectionalViewPager.HORIZONTAL);
            }
        });
        ((Button)findViewById(R.id.vertical)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setOrientation(DirectionalViewPager.VERTICAL);
            }
        });
    }
}
