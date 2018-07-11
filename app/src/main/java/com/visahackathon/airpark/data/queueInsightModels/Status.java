package com.visahackathon.airpark.data.queueInsightModels;

import com.google.gson.annotations.SerializedName;

public class Status{

	@SerializedName("statusDescription")
	private String statusDescription;

	@SerializedName("statusCode")
	private String statusCode;

	public void setStatusDescription(String statusDescription){
		this.statusDescription = statusDescription;
	}

	public String getStatusDescription(){
		return statusDescription;
	}

	public void setStatusCode(String statusCode){
		this.statusCode = statusCode;
	}

	public String getStatusCode(){
		return statusCode;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"statusDescription = '" + statusDescription + '\'' + 
			",statusCode = '" + statusCode + '\'' + 
			"}";
		}
}