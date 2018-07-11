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

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        LatLng position = getIntent().getExtras().getParcelable("destLocation");
        CharSequence distanceAmount = getIntent().getExtras().getCharSequence("distanceAmount");
        Log.d("ParkingDetails", "@@@ position "+position+" "+distanceAmount.toString());





        listView = (ListView) findViewById(R.id.parking_place_list);


        ArrayList<ParkingPlace> parkingPlaceList = new ArrayList<>();
        parkingPlaceList.add(new ParkingPlace(R.drawable.backicon, "Name" , "Address", "4 km", 10));
        parkingPlaceList.add(new ParkingPlace(R.drawable.backicon, "Name" , "Address", "4 km", 10));
        parkingPlaceList.add(new ParkingPlace(R.drawable.backicon, "Name" , "Address", "4 km", 10));
        parkingPlaceList.add(new ParkingPlace(R.drawable.backicon, "Name" , "Address", "4 km", 10));



        mAdapter = new ParkingPlaceAdapter(this,parkingPlaceList);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ParkingPlace selectedParkingPlace = mAdapter.getItem(position);
        MerchantInfoDialog dialog = new MerchantInfoDialog();
        dialog.setParkingPlace(selectedParkingPlace);
        dialog.show(getSupportFragmentManager(), "MerchantInfoDialog");
    }
}
