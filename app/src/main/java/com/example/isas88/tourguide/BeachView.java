package com.example.isas88.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachView extends Fragment {

    //declare the variables needed
    ArrayList<Beach> beach = new ArrayList<Beach>();
    String beach_name;
    String beach_address;
    String beach_img1;
    String beach_img2;
    String beach_desc;

    public BeachView() {
        // empty public constructor
    }

    @Override
    //set title as Beaches
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.beaches);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the view with fragment layout created for beach
        View rootView = inflater.inflate(R.layout.beach_main, container, false);

        //populate the list of beaches with their attributes assigned

        //beach1
        beach_name      = getResources().getString(R.string.beach1);
        beach_address   = getResources().getString(R.string.beach1_add);
        beach_img1      = getResources().getString(R.string.beach1_img1);
        beach_img2      = getResources().getString(R.string.beach1_img2);
        beach_desc      = getResources().getString(R.string.beach1_desc);
        beach.add(new Beach(beach_name, beach_address, beach_img1, beach_img2, beach_desc));

        //beach2
        beach_name      = getResources().getString(R.string.beach2);
        beach_address   = getResources().getString(R.string.beach2_add);
        beach_img1      = getResources().getString(R.string.beach2_img1);
        beach_img2      = getResources().getString(R.string.beach2_img2);
        beach_desc      = getResources().getString(R.string.beach2_desc);
        beach.add(new Beach(beach_name, beach_address, beach_img1, beach_img2,beach_desc));

        //beach3
        beach_name      = getResources().getString(R.string.beach3);
        beach_address   = getResources().getString(R.string.beach3_add);
        beach_img1      = getResources().getString(R.string.beach3_img1);
        beach_img2      = getResources().getString(R.string.beach3_img2);
        beach_desc      = getResources().getString(R.string.beach3_desc);
        beach.add(new Beach(beach_name, beach_address, beach_img1, beach_img2,beach_desc));

        // set the Beachadapter with the created beach object to display its elements in a list
        BeachAdapter adapter= new BeachAdapter(getActivity(), beach);
        ListView beachView = (ListView) rootView.findViewById(android.R.id.list);
        beachView.setAdapter(adapter);

        return rootView;
    }
}
