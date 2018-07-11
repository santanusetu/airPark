package com.visahackathon.airpark.data.remote;


import com.visahackathon.airpark.data.models.MerchantLocatorServiceResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MLService {

    @GET("5b4590252f00007700420c60")
    Call<String> getMerchantLocatorDetails();

   /* @GET("5b4590252f00007700420c60")
    Call<MerchantLocatorServiceResponse> getMerchantLocatorDetails();*/

    //@GET("/v2/5b44e92c2f00008100420aea")
    //Call<MerchantLocatorServiceResponse> getAnswers(@Query("tagged") String tags);
}