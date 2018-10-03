package com.example.isas88.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TheatreAdapter extends ArrayAdapter<Theatre> {

    public TheatreAdapter(Activity context, ArrayList<Theatre> Theatre) {
        super(context, 0, Theatre);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate the custom list view layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_theatres, parent, false);
        }

        //get the current list items position to load
        Theatre currentTheatre = getItem(position);

        //load the Theatre name, address and description
        TextView TheatreName = (TextView) listItemView.findViewById(R.id.theatre_name);
        TheatreName.setText(currentTheatre.gettheatreName());

        TextView TheatreAddress= (TextView) listItemView.findViewById(R.id.theatre_address);
        TheatreAddress.setText(currentTheatre.gettheatreAddress());

        TextView TheatreDesc= (TextView) listItemView.findViewById(R.id.theatre_desc);
        TheatreDesc.setText(currentTheatre.gettheatreDesc());

        return listItemView;
    }


}
