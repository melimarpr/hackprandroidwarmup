package com.mmarquez.designdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mmarquez.desingdemo.activities.R;

public class ColorFragment extends Fragment {

	private View block;
	private Spinner spinner;
	private String[] colors = new String[]{"Grey", "Blue", "Black", "White", "Red","Green"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//Get View from inflater
		View view = inflater.inflate(R.layout.fragment_color, container, false);
		
		this.spinner = (Spinner) view.findViewById(R.id.spinner_color_frag);
		this.block =  view.findViewById(R.id.block_color);
	
		this.spinner.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, colors));
		this.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View view,
					int pos, long id) {
				changeColor(spinner.getSelectedItem().toString());
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				//NoOp
				
			}
		});
		return view;
	}

	private void changeColor(String string) {
		if(string.equals("Grey")){
			block.setBackgroundResource(R.color.hackpr_grey);
		}
		else if(string.equals("Blue")){
			block.setBackgroundResource(android.R.color.holo_blue_light);
			
		}
		else if(string.equals("Black")){
			block.setBackgroundResource(android.R.color.black);
		}
		else if(string.equals("White")){
			block.setBackgroundResource(android.R.color.white);
		}
		else if(string.equals("Red")){
			block.setBackgroundResource(android.R.color.holo_red_light);
		}
		else if(string.equals("Green")){
			block.setBackgroundResource(android.R.color.holo_green_light);
		}
		
	}
	
}
