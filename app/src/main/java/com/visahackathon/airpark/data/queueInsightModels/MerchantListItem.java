package com.visahackathon.airpark.data.queueInsightModels;

import com.google.gson.annotations.SerializedName;

public class MerchantListItem{

	@SerializedName("zip")
	private String zip;

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("feedbackCorrelationID")
	private String feedbackCorrelationID;

	@SerializedName("name")
	private String name;

	@SerializedName("state")
	private String state;

	@SerializedName("waitTime")
	private String waitTime;

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setFeedbackCorrelationID(String feedbackCorrelationID){
		this.feedbackCorrelationID = feedbackCorrelationID;
	}

	public String getFeedbackCorrelationID(){
		return feedbackCorrelationID;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setWaitTime(String waitTime){
		this.waitTime = waitTime;
	}

	public String getWaitTime(){
		return waitTime;
	}

	@Override
 	public String toString(){
		return 
			"MerchantListItem{" + 
			"zip = '" + zip + '\'' + 
			",country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",feedbackCorrelationID = '" + feedbackCorrelationID + '\'' + 
			",name = '" + name + '\'' + 
			",state = '" + state + '\'' + 
			",waitTime = '" + waitTime + '\'' + 
			"}";
		}
}