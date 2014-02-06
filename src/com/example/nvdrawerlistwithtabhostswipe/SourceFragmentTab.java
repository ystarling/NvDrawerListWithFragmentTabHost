package com.example.nvdrawerlistwithtabhostswipe;


import com.example.nvdrawerlistexample.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SourceFragmentTab extends Fragment {

	View _view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		_view = inflater.inflate(R.layout.source_fragment, container, false);

		

		return _view;
	}



	
}