package com.visahackathon.airpark;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkingDetailsActivity extends AppCompatActivity {

    private ListView listView;
    private ParkingPlaceAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_details);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.parking_place_list);

        ArrayList<ParkingPlace> parkingPlaceList = new ArrayList<>();
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "ResearCh Blvd" , "2013"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "SWSX" , "2017"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "East 6th Street" , "2016"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Austin Chaiwala" , "2014"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Lady Bird Lake" , "1999"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Austin Cedar Park" , "1975"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Pluggerville" , "2011"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Taco cabana" , "2016"));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Zilker Park" , "2011"));

        mAdapter = new ParkingPlaceAdapter(this,parkingPlaceList);
        listView.setAdapter(mAdapter);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
