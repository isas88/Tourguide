package com.example.isas88.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallView extends Fragment {

    //declare the variables needed
    ArrayList<Mall> Mall = new ArrayList<Mall>();
    String Mall_name;
    String Mall_address;
    String Mall_desc;

    public MallView() {
        // empty public constructor
    }

    @Override
    //set title as Malles
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(R.string.malls);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflate the view with fragment layout created for Mall
        View rootView = inflater.inflate(R.layout.malls_main, container, false);

        //populate the list of Malls with their attributes assigned

        //Mall1
        Mall_name      = getResources().getString(R.string.mall1);
        Mall_address   = getResources().getString(R.string.mall1_add);
        Mall_desc      = getResources().getString(R.string.mall1_desc);
        Mall.add(new Mall(Mall_name, Mall_address, Mall_desc));

        //Mall2
        Mall_name      = getResources().getString(R.string.mall2);
        Mall_address   = getResources().getString(R.string.mall2_add);
        Mall_desc      = getResources().getString(R.string.mall2_desc);
        Mall.add(new Mall(Mall_name, Mall_address, Mall_desc));

        //Mall3
        Mall_name      = getResources().getString(R.string.mall3);
        Mall_address   = getResources().getString(R.string.mall3_add);
        Mall_desc      = getResources().getString(R.string.mall3_desc);
        Mall.add(new Mall(Mall_name, Mall_address, Mall_desc));

        //Mall4
        Mall_name      = getResources().getString(R.string.mall4);
        Mall_address   = getResources().getString(R.string.mall4_add);
        Mall_desc      = getResources().getString(R.string.mall4_desc);
        Mall.add(new Mall(Mall_name, Mall_address, Mall_desc));

        // set the Malladapter with the created Mall object to display its elements in a list
        MallAdapter adapter= new MallAdapter(getActivity(), Mall);
        ListView MallView = (ListView) rootView.findViewById(android.R.id.list);
        MallView.setAdapter(adapter);

        return rootView;
    }
}
