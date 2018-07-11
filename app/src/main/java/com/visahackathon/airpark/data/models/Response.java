package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("merchantLocatorServiceResponse")
	private MerchantLocatorServiceResponse merchantLocatorServiceResponse;

	public void setMerchantLocatorServiceResponse(MerchantLocatorServiceResponse merchantLocatorServiceResponse){
		this.merchantLocatorServiceResponse = merchantLocatorServiceResponse;
	}

	public MerchantLocatorServiceResponse getMerchantLocatorServiceResponse(){
		return merchantLocatorServiceResponse;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"merchantLocatorServiceResponse = '" + merchantLocatorServiceResponse + '\'' + 
			"}";
		}
}