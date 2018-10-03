package com.example.isas88.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TheatreView extends Fragment {

    //declare the variables needed
    ArrayList<Theatre> Theatre = new ArrayList<Theatre>();
    String Theatre_name;
    String Theatre_address;
    String Theatre_desc;

    public TheatreView() {
        // empty public constructor
    }

    @Override
    //set title as Theatre
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.theatres);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the view with fragment layout created for Theatre
        View rootView = inflater.inflate(R.layout.theatres_main, container, false);

        //populate the list of Theatres with their attributes assigned

        //Theatre1
        Theatre_name      = getResources().getString(R.string.theatre1);
        Theatre_address   = getResources().getString(R.string.theatre1_add);
        Theatre_desc      = getResources().getString(R.string.theatre1_desc);
        Theatre.add(new Theatre(Theatre_name, Theatre_address, Theatre_desc));

        //Theatre2
        Theatre_name      = getResources().getString(R.string.theatre2);
        Theatre_address   = getResources().getString(R.string.theatre2_add);
        Theatre_desc      = getResources().getString(R.string.theatre2_desc);
        Theatre.add(new Theatre(Theatre_name, Theatre_address, Theatre_desc));

        //Theatre3
        Theatre_name      = getResources().getString(R.string.theatre3);
        Theatre_address   = getResources().getString(R.string.theatre3_add);
        Theatre_desc      = getResources().getString(R.string.theatre3_desc);
        Theatre.add(new Theatre(Theatre_name, Theatre_address, Theatre_desc));

        //Theatre4
        Theatre_name      = getResources().getString(R.string.theatre4);
        Theatre_address   = getResources().getString(R.string.theatre4_add);
        Theatre_desc      = getResources().getString(R.string.theatre4_desc);
        Theatre.add(new Theatre(Theatre_name, Theatre_address, Theatre_desc));

        // set the Theatreadapter with the created Theatre object to display its elements in a list
        TheatreAdapter adapter= new TheatreAdapter(getActivity(), Theatre);
        ListView TheatreView = (ListView) rootView.findViewById(android.R.id.list);
        TheatreView.setAdapter(adapter);

        return rootView;
    }
}
