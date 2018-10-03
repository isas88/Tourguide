package com.example.isas88.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantView extends Fragment {

    //declare the variables needed
    ArrayList<Restaurant> Restaurant = new ArrayList<Restaurant>();
    String Restaurant_name;
    String Restaurant_address;
    String Restaurant_desc;

    public RestaurantView() {
        // empty public constructor
    }

    @Override
    //set title as Restaurantes
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.restaurants);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the view with fragment layout created for Restaurant
        View rootView = inflater.inflate(R.layout.restaurants_main, container, false);

        //populate the list of Restaurants with their attributes assigned

        //Restaurant1
        Restaurant_name      = getResources().getString(R.string.restaurant1);
        Restaurant_address   = getResources().getString(R.string.restaurant1_add);
        Restaurant_desc      = getResources().getString(R.string.restaurant1_desc);
        Restaurant.add(new Restaurant(Restaurant_name, Restaurant_address, Restaurant_desc));

        //Restaurant2
        Restaurant_name      = getResources().getString(R.string.restaurant2);
        Restaurant_address   = getResources().getString(R.string.restaurant2_add);
        Restaurant_desc      = getResources().getString(R.string.restaurant2_desc);
        Restaurant.add(new Restaurant(Restaurant_name, Restaurant_address, Restaurant_desc));

        //Restaurant3
        Restaurant_name      = getResources().getString(R.string.restaurant3);
        Restaurant_address   = getResources().getString(R.string.restaurant3_add);
        Restaurant_desc      = getResources().getString(R.string.restaurant3_desc);
        Restaurant.add(new Restaurant(Restaurant_name, Restaurant_address, Restaurant_desc));

        //Restaurant4
        Restaurant_name      = getResources().getString(R.string.restaurant4);
        Restaurant_address   = getResources().getString(R.string.restaurant4_add);
        Restaurant_desc      = getResources().getString(R.string.restaurant4_desc);
        Restaurant.add(new Restaurant(Restaurant_name, Restaurant_address, Restaurant_desc));

        // set the Restaurantadapter with the created Restaurant object to display its elements in a list
        RestaurantAdapter adapter= new RestaurantAdapter(getActivity(), Restaurant);
        ListView RestaurantView = (ListView) rootView.findViewById(android.R.id.list);
        RestaurantView.setAdapter(adapter);

        return rootView;
    }
}
