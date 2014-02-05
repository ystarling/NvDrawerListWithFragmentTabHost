package com.example.nvdrawerlistexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragmentTab extends Fragment {

	
	View _view;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		_view = inflater.inflate(R.layout.profile_fragment, container, false);

	
		
		//set customer id to TextView
		((TextView) _view.findViewById(R.id.customerIdTextTv))
				.setText("873737736");
		//get customer name from JSON
		
		
		//set customer name to TextView
		((TextView) _view.findViewById(R.id.customerNameTextTv))
				.setText("Mr. Rahim");
		
		
		//set fathers name to text view
		((TextView) _view.findViewById(R.id.fathersNameTextTv))
		.setText("Aticul Islam");
		
		
		//set mothers name to text view
		((TextView) _view.findViewById(R.id.mothersNameTextTv))
		.setText("Ety Begum");
		
		
		//set DOB name to text view
		((TextView) _view.findViewById(R.id.dobTextTv))
		.setText("03-01-1980");
		
		

		return _view;
	}



	
}