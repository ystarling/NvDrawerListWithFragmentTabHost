package com.example.nvdrawerlistexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// This class is the 3rd fragment in my ViewPager, 
// to which I wanted to add 2 tabs....
public class TransactionFragmentTabHost extends Fragment {
	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mTabHost = new FragmentTabHost(getActivity());

		mTabHost.setup(getActivity(), getChildFragmentManager(),
				R.layout.tab_fragment);

	
		mTabHost.addTab(mTabHost.newTabSpec("Tab1").setIndicator("Src"),
				SourceFragmentTab.class, null);

	
		mTabHost.addTab(mTabHost.newTabSpec("Tab2").setIndicator("Dest"),
				DestinationFragmentTab.class, null);

		
		
		mTabHost.addTab(mTabHost.newTabSpec("Tab3").setIndicator("Tx"),
				TransferFragmentTab.class, null);
		

		return mTabHost;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mTabHost = null;
	}
}