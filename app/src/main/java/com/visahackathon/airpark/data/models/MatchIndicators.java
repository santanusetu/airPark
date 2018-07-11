package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.SerializedName;

public class MatchIndicators{

	@SerializedName("merchantCountryCode")
	private String merchantCountryCode;

	@SerializedName("merchantName")
	private String merchantName;

	public void setMerchantCountryCode(String merchantCountryCode){
		this.merchantCountryCode = merchantCountryCode;
	}

	public String getMerchantCountryCode(){
		return merchantCountryCode;
	}

	public void setMerchantName(String merchantName){
		this.merchantName = merchantName;
	}

	public String getMerchantName(){
		return merchantName;
	}

	@Override
 	public String toString(){
		return 
			"MatchIndicators{" + 
			"merchantCountryCode = '" + merchantCountryCode + '\'' + 
			",merchantName = '" + merchantName + '\'' + 
			"}";
		}
}