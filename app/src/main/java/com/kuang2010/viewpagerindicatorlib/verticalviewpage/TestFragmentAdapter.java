package com.kuang2010.viewpagerindicatorlib.verticalviewpage;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class TestFragmentAdapter extends FragmentPagerAdapter {
	protected static final String[] CONTENT = new String[] { "This", "Is Is", "A A A", "Test", };

	public TestFragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return TestFragment.newInstance(CONTENT[position]);
	}

	@Override
	public int getCount() {
		return CONTENT.length;
	}
}