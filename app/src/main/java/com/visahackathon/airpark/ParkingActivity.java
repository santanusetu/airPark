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
import com.visahackathon.airpark.data.queueInsightModels.ResponseQueue;
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
    com.visahackathon.airpark.data.models.Response bodyResponseMerchant;

    //a list to store all the products
    List<Parking> parkingList;

    ResponseQueue bodyResponseQueue;

    //the recyclerview
    RecyclerView recyclerView;

    ArrayList<String> queueWait;
    ArrayList<Integer> queueWaitInt;

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

        queueWait = new ArrayList<>();
//        queueWaitInt = new ArrayList<>();

        ResponseQueueCallback callback = new ResponseQueueCallback(queueWait);
        mService.getQueueInsight("5b4590d52f00007e00420c62").enqueue(callback);
        mService.getQueueInsight("5b45912c2f00005400420c63").enqueue(callback);
        mService.getQueueInsight("5b4591612f00004900420c65").enqueue(callback);
        mService.getQueueInsight("5b4591ad2f00007e00420c66").enqueue(callback);
        mService.getQueueInsight("5b4591ef2f00007000420c67").enqueue(callback);

        /*for(int i=0;i <5;i++){
            queueWaitInt.add(Integer.parseInt(queueWait.get(i))/60);
        }*/



        Log.i("Test", "mService "+mService.toString());
        //merchant locator api
        mService.getMerchantLocatorDetails().enqueue(new Callback<com.visahackathon.airpark.data.models.Response>() {
            @Override
            public void onResponse(Call<com.visahackathon.airpark.data.models.Response> call, Response<com.visahackathon.airpark.data.models.Response> response) {
                if(response.isSuccessful()){

                    bodyResponseMerchant = response.body();
                    Log.d("RetrofitResponse", "@@@ response "+response.body());

                    String merchantCountryCode = response.body().getMerchantLocatorServiceResponse().getResponse().get(0).getMatchScore();
                    String visaStoreName = response.body().getMerchantLocatorServiceResponse().getResponse().get(0).getResponseValues().getVisaStoreName();
                    Log.d("RetrofitResponse", "@@@ merchantCountryCode "+merchantCountryCode +" "+visaStoreName);

                    populateData();

                }else{
                    Log.d("RetrofitResponse", "@@@ else "+response.body());
                }
            }



            private void populateData() {
                parkingList = new ArrayList<Parking>();

                List<String> merchantTitleList = new ArrayList<>();
                List<String> merchantAddress = new ArrayList<>();
                List<String> merchantDistance = new ArrayList<>();

                for(int i=0; i < 5; i++){

                    merchantTitleList.add(bodyResponseMerchant.getMerchantLocatorServiceResponse().getResponse().get(i).getResponseValues().getVisaMerchantName());
                    merchantAddress.add(bodyResponseMerchant.getMerchantLocatorServiceResponse().getResponse().get(i).getResponseValues().getMerchantStreetAddress()
                            +" , "+ bodyResponseMerchant.getMerchantLocatorServiceResponse().getResponse().get(i).getResponseValues().getMerchantCity()
                            +" , "+ bodyResponseMerchant.getMerchantLocatorServiceResponse().getResponse().get(i).getResponseValues().getMerchantState());

                    merchantDistance.add(bodyResponseMerchant.getMerchantLocatorServiceResponse().getResponse().get(i).getResponseValues().getDistance());


                    parkingList.add(
                            new Parking(
                                    merchantTitleList.get(i),
                                    merchantAddress.get(i),
                                    "Distance "+merchantDistance.get(i),
                                    "WaitTime: "+queueWait.get(i) +" Minutes",
                                    "$3",
                                     R.drawable.parking));
                }

                //creating recyclerview adapter
                ParkingAdapter adapter = new ParkingAdapter(ParkingActivity.this, parkingList);

                //setting adapter to recyclerview
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<com.visahackathon.airpark.data.models.Response> call, Throwable t) {
                Log.d("ParkingActivity", "error loading from API");
            }
        });

        //bodyMerchantLocatorService.getResponse().get(0).getResponseValues().getVisaStoreName();





        //initializing the productlist
       // parkingList = new ArrayList<Parking>();


         //Populating Data
        //adding some items to our list
       /* parkingList.add(
                new Parking(
                        merchantTitleList.get(0),
                        merchantAddress.get(0),
                        "Distance : 1.84 km",
                        "WaitTime: 4.3 Minutes",
                        "Price : Free",
                        R.drawable.parking));

        parkingList.add(
                new Parking(
                        merchantTitleList.get(0),
                        merchantAddress.get(0),
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
                        R.drawable.parking));

        //creating recyclerview adapter
        ParkingAdapter adapter = new ParkingAdapter(this, parkingList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);*/
    }



}