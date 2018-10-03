package com.example.isas88.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    public RestaurantAdapter(Activity context, ArrayList<Restaurant> Restaurant) {
        super(context, 0, Restaurant);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate the custom list view layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_restaurants, parent, false);
        }

        //get the current list items position to load
        Restaurant currentRestaurant = getItem(position);

        //load the Restaurant name, address and description
        TextView RestaurantName = (TextView) listItemView.findViewById(R.id.restaurant_name);
        RestaurantName.setText(currentRestaurant.getrestaurantName());

        TextView RestaurantAddress= (TextView) listItemView.findViewById(R.id.restaurant_address);
        RestaurantAddress.setText(currentRestaurant.getrestaurantAddress());

        TextView RestaurantDesc= (TextView) listItemView.findViewById(R.id.restaurant_desc);
        RestaurantDesc.setText(currentRestaurant.getrestaurantDesc());

        return listItemView;
    }


}
