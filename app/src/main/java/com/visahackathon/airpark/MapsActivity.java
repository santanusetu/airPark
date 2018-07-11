package com.visahackathon.airpark;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.util.Log;
import android.widget.Toast;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener {

    PlaceAutocompleteFragment placeAutoComplete;
    private GoogleMap mMap;
    String placeName;

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
                placeName = place.getName().toString();

                LatLng latLng = place.getLatLng();
                Marker marker = mMap.addMarker(new MarkerOptions()
                        .position(latLng)
                        .title(place.getName().toString()));

                mMap.addCircle(new CircleOptions()
                        .center(latLng)
                        .radius(150)
                        .fillColor(Color.argb(10, 0, 50, 240))
                        .strokeColor(Color.argb(50, 0, 50, 240))
                        .strokeWidth(2))
                        .setZIndex(1);

                marker.showInfoWindow();
                mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));


                PolylineOptions line=
                        new PolylineOptions().add(new LatLng(30.42888, -97.755782),
                                latLng)
                                .width(15).color(Color.RED);

                mMap.addPolyline(line);

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


    /**
     * FUnction to call when the map is ready for displaying the info
     * @param googleMap
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // and move the map's camera to the same location.
        LatLng austin = new LatLng(30.42888, -97.755782);

        Marker marker = googleMap.addMarker(new MarkerOptions()
                .position(austin)
                .title(getString(R.string.initial_location))
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("cara", 180, 180))));

        googleMap.addCircle(new CircleOptions()
                .center(austin)
                .radius(150)
                .fillColor(Color.argb(10, 0, 50, 240))
                .strokeColor(Color.argb(50, 0, 50, 240))
                .strokeWidth(2))
                .setZIndex(1);

        marker.showInfoWindow();
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(austin));
        //.icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("your drawable name",72,64))));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            Log.d("Marker", "@@@@ Return " );
            return;
        }

        mMap.setMyLocationEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        Log.d("Marker", "@@@@ Marker clicked " );
        mMap.setOnMarkerClickListener(this);

        mMap.getUiSettings().setScrollGesturesEnabled(true);

    }


    /**
     * Function to convert drawable into bitmap to enable custom marker
     * @param drawableName
     * @param width
     * @param height
     * @return
     */
    public Bitmap resizeBitmap(String drawableName, int width, int height) {
        Bitmap imageBitmap = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(drawableName, "drawable", getPackageName()));
        return Bitmap.createScaledBitmap(imageBitmap, width, height, false);
    }


    /**
     * FUnction to capture marker click event
     * @param marker
     * @return
     */
    @Override
    public boolean onMarkerClick(final Marker marker) {

        Log.d("Marker", "Marker clicked " + marker.getTitle());
        String title = marker.getTitle();

        if (getString(R.string.initial_location).equals(title)) {
            // show dialog
            Log.d("marker", "@@@ Do whatever you want funky stuff");

        } else if (placeName.equals(title)) {
            // do thing for events
            Log.d("marker", "@@@ Destination marker clicked");

            new MaterialDialog.Builder(this)
                    .title(R.string.marker_dialog_title)
                    .content(R.string.marker_dialog_content)
                    .positiveText(R.string.marker_dialog_agree)
                    .negativeText(R.string.marker_dialog_disagree)
                    .inputType(InputType.TYPE_CLASS_NUMBER)
                    .input(R.string.input_hint, R.string.input_prefill, new MaterialDialog.InputCallback() {
                        @Override
                        public void onInput(MaterialDialog dialog, CharSequence input) {
                            // Do something
                            Log.d("Builder", "@@@ marker clicked "+input);
                            LatLng position = marker.getPosition();
                            Intent intent = new Intent(MapsActivity.this, ParkingActivity.class);
                            intent.putExtra("destLocation", position);
                            intent.putExtra("distanceAmount", input);
                            startActivity(intent);
                        }
                    }).show();

            //Alert dialog for user preference selection
            /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want us to find nearby parking for you?")
                    .setCancelable(true)
                    .setNegativeButton("Not Now", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            dialogInterface.dismiss();
                        }
                    })
                    .setPositiveButton("Yes Please", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //do things

                            LatLng position = marker.getPosition();
                            Intent intent = new Intent(MapsActivity.this, ParkingDetailsActivity.class);
                            intent.putExtra("destLocation", position);
                            startActivity(intent);

                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();*/


        } else {
            // do thing for nearby places
            Log.d("Marker", "@@@ In else " + marker.getTitle());
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
