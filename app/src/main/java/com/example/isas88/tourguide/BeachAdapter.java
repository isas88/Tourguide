package com.example.isas88.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BeachAdapter extends ArrayAdapter<Beach> {

    public BeachAdapter(Activity context, ArrayList<Beach> beach) {
        super(context, 0, beach);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate the custom list view layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_beach, parent, false);
        }

        //get the current list items position to load
        Beach currentBeach = getItem(position);

        //load the images using the name saved in drawable folder
        ImageView beachImage1= (ImageView) listItemView.findViewById(R.id.beach_image1);
        ImageView beachImage2= (ImageView) listItemView.findViewById(R.id.beach_image2);
        int albumID = listItemView.getResources().getIdentifier("com.example.isas88.tourguide:drawable/"
                + currentBeach.getBeachImage1(), null, null);
        beachImage1.setImageResource(albumID);

        albumID = listItemView.getResources().
                getIdentifier("com.example.isas88.tourguide:drawable/" + currentBeach.getBeachImage2(), null, null);
        beachImage2.setImageResource(albumID);

        //load the beach name, address and description
        TextView beachName = (TextView) listItemView.findViewById(R.id.beach_name);
        beachName.setText(currentBeach.getBeachName());

        TextView beachAddress= (TextView) listItemView.findViewById(R.id.beach_address);
        beachAddress.setText(currentBeach.getBeachAddress());

        TextView beachDesc= (TextView) listItemView.findViewById(R.id.beach_desc);
        beachDesc.setText(currentBeach.getBeachDesc());

        return listItemView;
    }


}
