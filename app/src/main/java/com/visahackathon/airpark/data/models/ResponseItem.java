package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.SerializedName;

public class ResponseItem{

	@SerializedName("matchScore")
	private String matchScore;

	@SerializedName("matchIndicators")
	private MatchIndicators matchIndicators;

	@SerializedName("responseValues")
	private ResponseValues responseValues;

	public void setMatchScore(String matchScore){
		this.matchScore = matchScore;
	}

	public String getMatchScore(){
		return matchScore;
	}

	public void setMatchIndicators(MatchIndicators matchIndicators){
		this.matchIndicators = matchIndicators;
	}

	public MatchIndicators getMatchIndicators(){
		return matchIndicators;
	}

	public void setResponseValues(ResponseValues responseValues){
		this.responseValues = responseValues;
	}

	public ResponseValues getResponseValues(){
		return responseValues;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"matchScore = '" + matchScore + '\'' + 
			",matchIndicators = '" + matchIndicators + '\'' + 
			",responseValues = '" + responseValues + '\'' + 
			"}";
		}
}