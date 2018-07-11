package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MerchantLocatorService {

    @SerializedName("merchantLocatorServiceResponse")
    @Expose
    private MerchantLocatorServiceResponse merchantLocatorServiceResponse;

    public MerchantLocatorServiceResponse getMerchantLocatorServiceResponse() {
        return merchantLocatorServiceResponse;
    }

    public void setMerchantLocatorServiceResponse(MerchantLocatorServiceResponse merchantLocatorServiceResponse) {
        this.merchantLocatorServiceResponse = merchantLocatorServiceResponse;
    }

}
