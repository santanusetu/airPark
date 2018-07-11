package com.visahackathon.airpark.data.queueInsightModels;

import com.google.gson.annotations.SerializedName;

public class ResponseQueue{

	@SerializedName("responseHeader")
	private ResponseHeader responseHeader;

	@SerializedName("responseData")
	private ResponseData responseData;

	@SerializedName("status")
	private Status status;

	public void setResponseHeader(ResponseHeader responseHeader){
		this.responseHeader = responseHeader;
	}

	public ResponseHeader getResponseHeader(){
		return responseHeader;
	}

	public void setResponseData(ResponseData responseData){
		this.responseData = responseData;
	}

	public ResponseData getResponseData(){
		return responseData;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseQueue{" + 
			"responseHeader = '" + responseHeader + '\'' + 
			",responseData = '" + responseData + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}