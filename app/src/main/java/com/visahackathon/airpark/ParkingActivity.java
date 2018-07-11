package com.visahackathon.airpark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gms.maps.model.LatLng;
import com.visahackathon.airpark.data.models.MerchantLocatorServiceResponse;
import com.visahackathon.airpark.data.remote.ApiUtils;
import com.visahackathon.airpark.data.remote.MLService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ParkingActivity extends AppCompatActivity {

    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode;

    //a list to store all the products
    List<Parking> parkingList = new ArrayList<>();

    //the recyclerview
    RecyclerView recyclerView;


    private MLService mService;
    ParkingAdapter mAdapter;

    String bodyMerchantLocatorService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        LatLng position = getIntent().getExtras().getParcelable("destLocation");
        CharSequence distanceAmount = getIntent().getExtras().getCharSequence("distanceAmount");
        Log.d("ParkingDetails", "@@@ position "+position+" "+distanceAmount.toString());


        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //retrofit merchant locator api call
        mService = ApiUtils.getMLService();


        mService.getMerchantLocatorDetails().enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                if(response.isSuccessful()) {
                    // mAdapter.updateAnswers(response.body().getItems());
                    Log.d("ParkingActivity", "@@@ posts loaded from API");
                    Log.d("RetrofitResponse", "@@@ response"+response.body());

                   // response.body().getResponse().get(0).getResponseValues().getVisaStoreName();
                    JsonNode node;
                    String str = response.body();
                    try {
                        node = objectMapper.readTree(str);
                        JsonNode data = node.get("merchantLocatorServiceResponse").get("response");
                        for(int i=0; i<data.size(); i++) {
                            JsonNode item = data.get(i).get("responseValues");
                            Parking parking = new Parking(item.get("visaMerchantName").textValue(), item.get("merchantStreetAddress").textValue(),
                                    item.get("distance").textValue(), "10", "3", R.drawable.parking);
                            parkingList.add(parking);
                        }
                        //creating recyclerview adapter
                        ParkingAdapter adapter = new ParkingAdapter(ParkingActivity.this, parkingList);

                        //setting adapter to recyclerview
                        recyclerView.setAdapter(adapter);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }else {
                    int statusCode  = response.code();
                    // handle request errors depending on status code
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                // showErrorMessage();
                Log.d("ParkingActivity", "error loading from API");

            }
        });

        //bodyMerchantLocatorService.getResponse().get(0).getResponseValues().getVisaStoreName();

        /*List<com.visahackathon.airpark.data.models.Response> response = bodyMerchantLocatorService.getResponse();

        List<String> merchantTitleList = new ArrayList<>();
        List<String> merchantAddress = new ArrayList<>();

        for(int i=0; i < response.size(); i++){
            merchantTitleList.add(bodyMerchantLocatorService.getResponse().get(i).getResponseValues().getVisaStoreName());
            merchantAddress.add(bodyMerchantLocatorService.getResponse().get(i).getResponseValues().getMerchantStreetAddress()
                    +" , "+ bodyMerchantLocatorService.getResponse().get(i).getResponseValues().getMerchantCity()
                    +" , "+bodyMerchantLocatorService.getResponse().get(i).getResponseValues().getMerchantState());

        }*/


        //initializing the productlist
        //parkingList = new ArrayList<Parking>();


         //Populating Data
        //adding some items to our list
      /*  parkingList.add(
                new Parking(
                        merchantTitleList.get(0),
                        merchantAddress.get(0),
                        "Distance : 1.84 km",
                        "WaitTime: 4.3 Minutes",
                        "Price : Free",
                        R.drawable.parking));

        parkingList.add(
                new Parking(
                        merchantTitleList.get(1),
                        merchantAddress.get(1),
                        "Distance : 1.84 km",
                        "WaitTime: 4.3 Minutes",
                        "Price : Free",
                        R.drawable.background));*/

        /*parkingList.add(
                new Parking(
                        "STARBUCKS",
                        "1509 S LAMAR BLVD STE 100, AUSTIN, TX ",
                        "Distance : 1.84 km",
                        "WaitTime: 4.3 Minutes",
                        "Price : Free",
                        R.drawable.parking));

        parkingList.add(
                new Parking(
                        "STARBUCKS",
                        "1509 S LAMAR BLVD STE 100, AUSTIN, TX ",
                        "Distance : 1.84 km",
                        "WaitTime: 4.3 Minutes",
                        "Price : Free",
                        R.drawable.parking));*/
    }



}