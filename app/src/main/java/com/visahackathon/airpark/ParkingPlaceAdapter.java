package com.visahackathon.airpark;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ParkingPlaceAdapter extends ArrayAdapter<ParkingPlace> {

    private Context mContext;
    private List<ParkingPlace> parkingPlaceList = new ArrayList<>();

    public ParkingPlaceAdapter(@NonNull Context context, ArrayList<ParkingPlace> list) {
        super(context, 0 , list);
        mContext = context;
        parkingPlaceList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        ParkingPlace currentPlace = parkingPlaceList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentPlace.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(currentPlace.getmName());

        TextView release = (TextView) listItem.findViewById(R.id.textView_release);
        release.setText(currentPlace.getmLocation());

        return listItem;
    }
}