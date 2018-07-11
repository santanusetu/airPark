package com.visahackathon.airpark;

import android.util.Log;

import com.visahackathon.airpark.data.queueInsightModels.ResponseQueue;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by santanuchakraborty on 7/11/18.
 */

public class ResponseQueueCallback implements Callback<ResponseQueue> {
    private List<String> queueWait;

    public ResponseQueueCallback(List<String> queueWait) {
        this.queueWait = queueWait;
    }

    @Override
    public void onResponse(Call<ResponseQueue> call, Response<ResponseQueue> response) {

        if(response.isSuccessful()){
            Log.d("RetrofitResponse", "@@@ response "+response.body());

            String waitTimeQueue = response.body().getResponseData().getMerchantList().get(0).getWaitTime();
            Log.d("RetrofitResponse", "@@@ waitTimeQueue "+waitTimeQueue);

            waitTimeQueue = ""+((Integer.parseInt(waitTimeQueue))/60);

            queueWait.add(waitTimeQueue);
        }else{
            Log.d("RetrofitResponse", "@@@ else "+response.body());
        }
    }

    @Override
    public void onFailure(Call<ResponseQueue> call, Throwable t) {
        Log.d("ParkingActivity", "error loading from API");

    }
}
