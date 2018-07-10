package com.visahackathon.airpark;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class ParkingDetailsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ParkingPlaceAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_details);

        listView = (ListView) findViewById(R.id.parking_place_list);

        LatLng position = getIntent().getExtras().getParcelable("destLocation");
        Log.d("ParkingDetails", "@@@ position "+position);

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);


        ArrayList<ParkingPlace> parkingPlaceList = new ArrayList<>();
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Research Blvd" , "2013", 10));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "SWSX" , "2017", 20));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "East 6th Street" , "2016", 30));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Austin Chaiwala" , "2014", 40));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Lady Bird Lake" , "1999", 50));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Austin Cedar Park" , "1975", 60));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Pluggerville" , "2011", 90));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Taco cabana" , "2016", 100));
        parkingPlaceList.add(new ParkingPlace(R.drawable.cara, "Zilker Park" , "2011", 150));

        mAdapter = new ParkingPlaceAdapter(this,parkingPlaceList);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ParkingPlace selectedParkingPlace = mAdapter.getItem(position);
        MerchantInfoDialog dialog = new MerchantInfoDialog();
        dialog.setParkingPlace(selectedParkingPlace);
        dialog.show(getSupportFragmentManager(), "MerchantInfoDialog");
    }
}
