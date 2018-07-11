package com.visahackathon.airpark.data.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MerchantLocatorServiceResponse{

	@SerializedName("response")
	private List<ResponseItem> response;

	@SerializedName("header")
	private Header header;

	@SerializedName("status")
	private Status status;

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}

	public void setHeader(Header header){
		this.header = header;
	}

	public Header getHeader(){
		return header;
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
			"MerchantLocatorServiceResponse{" + 
			"response = '" + response + '\'' + 
			",header = '" + header + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}