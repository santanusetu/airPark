package com.visahackathon.airpark.data.remote;

import com.visahackathon.airpark.data.models.Response;
import com.visahackathon.airpark.data.queueInsightModels.ResponseQueue;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MLService {

    @GET("5b4590252f00007700420c60")
    Call<Response> getMerchantLocatorDetails();

    @GET("{apiId}")
    Call<ResponseQueue> getQueueInsight(@Path("apiId") String apiId);

}