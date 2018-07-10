package com.visahackathon.airpark;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    PlaceAutocompleteFragment placeAutoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);


        placeAutoComplete = (PlaceAutocompleteFragment) getFragmentManager().findFragmentById(R.id.place_autocomplete);
        placeAutoComplete.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {

                Log.d("Maps", "Place selected: " + place.getName());
                LatLng latLng = place.getLatLng();
                mMap.addMarker(new MarkerOptions().position(latLng).title("Destination"));
                mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
            }

            @Override
            public void onError(Status status) {
                Log.d("Maps", "An error occurred: " + status);
            }
        });


        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // and move the map's camera to the same location.
        LatLng austin = new LatLng(30.42888, -97.755782);

        googleMap.addMarker(new MarkerOptions().position(austin).title("You")
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("cara",180,240))));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(austin));

        //.icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("your drawable name",72,64))));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }
        mMap.setMyLocationEnabled(true);

        mMap.setOnMarkerClickListener(this);
    }



    public Bitmap resizeBitmap(String drawableName, int width, int height){
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(),getResources().getIdentifier(drawableName, "drawable", getPackageName()));
        return Bitmap.createScaledBitmap(imageBitmap, width, height, false);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        Log.d("Marker", "Marker clicked " + marker.getTitle());

        String title = marker.getTitle();
        if ("You".equals(title)) {
            // show dialog
            Log.d("marker", "Do whatever you want funky stuff");

        } else if ("Destination".equals(title)) {
            // do thing for events
            Log.d("marker", "Destination marker clicked");

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want us to find nearby parking for you?")
                    .setCancelable(true)
                    .setNegativeButton("Not Now", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            dialogInterface.dismiss();
                        }
                    })
                    .setPositiveButton("Yes Please", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //do things

                            Intent intent = new Intent(MapsActivity.this, ParkingDetailsActivity.class);
                            startActivity(intent);

                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();


        } else {
            // do thing for nearby places
        }

        return false;
    }

    /*public void onMapSearch(View view) {
        EditText locationSearch = (EditText) findViewById(R.id.editText);
        String location = locationSearch.getText().toString();
        List<Address> addressList = null;

        if (location != null || !location.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);

            } catch (IOException e) {
                e.printStackTrace();
            }

            Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Destination"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }
    }*/

}
