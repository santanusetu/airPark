package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.SerializedName;

public class MerchantPhoneNumberItem{

	@SerializedName("number")
	private String number;

	@SerializedName("type")
	private String type;

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"MerchantPhoneNumberItem{" + 
			"number = '" + number + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}