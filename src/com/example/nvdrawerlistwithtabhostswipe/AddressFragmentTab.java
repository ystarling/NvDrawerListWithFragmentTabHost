package com.example.nvdrawerlistwithtabhostswipe;


import com.example.nvdrawerlistexample.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class AddressFragmentTab extends Fragment {

	

	View _view;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	_view = inflater.inflate(R.layout.address_fragment, container, false);

    	//set address1 to TextView
		((TextView) _view.findViewById(R.id.address1TextTv))
				.setText("Kazi Para, Mirpur");
		
		
		//set address2 to TextView
		((TextView) _view.findViewById(R.id.address2TextTv))
				.setText("Dhaka");
		
	
		//set city name to text view
		((TextView) _view.findViewById(R.id.cityTextTv))
		.setText("Dhaka");
		
		
	
		//set countery name to text view
		((TextView) _view.findViewById(R.id.countryTextTv))
		.setText("Bangladesh");


		//set mobile to text view
		((TextView) _view.findViewById(R.id.mobileNoTextTv))
		.setText("012017-985674");
		
    	
		
        return _view;
    }
    
    
}