package com.example.isas88.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MallAdapter extends ArrayAdapter<Mall> {

    public MallAdapter(Activity context, ArrayList<Mall> Mall) {
        super(context, 0, Mall);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate the custom list view layout
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_malls, parent, false);
        }

        //get the current list items position to load
        Mall currentMall = getItem(position);

        //load the Mall name, address and description
        TextView MallName = (TextView) listItemView.findViewById(R.id.mall_name);
        MallName.setText(currentMall.getmallName());

        TextView MallAddress= (TextView) listItemView.findViewById(R.id.mall_address);
        MallAddress.setText(currentMall.getmallAddress());

        TextView MallDesc= (TextView) listItemView.findViewById(R.id.mall_desc);
        MallDesc.setText(currentMall.getmallDesc());

        return listItemView;
    }


}
