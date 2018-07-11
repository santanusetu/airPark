package com.visahackathon.airpark.data.queueInsightModels;

import com.google.gson.annotations.SerializedName;

public class ResponseHeader{

	@SerializedName("numRecordsReturned")
	private String numRecordsReturned;

	@SerializedName("responseMessageId")
	private String responseMessageId;

	@SerializedName("requestMessageId")
	private String requestMessageId;

	@SerializedName("messageDateTime")
	private String messageDateTime;

	public void setNumRecordsReturned(String numRecordsReturned){
		this.numRecordsReturned = numRecordsReturned;
	}

	public String getNumRecordsReturned(){
		return numRecordsReturned;
	}

	public void setResponseMessageId(String responseMessageId){
		this.responseMessageId = responseMessageId;
	}

	public String getResponseMessageId(){
		return responseMessageId;
	}

	public void setRequestMessageId(String requestMessageId){
		this.requestMessageId = requestMessageId;
	}

	public String getRequestMessageId(){
		return requestMessageId;
	}

	public void setMessageDateTime(String messageDateTime){
		this.messageDateTime = messageDateTime;
	}

	public String getMessageDateTime(){
		return messageDateTime;
	}

	@Override
 	public String toString(){
		return 
			"ResponseHeader{" + 
			"numRecordsReturned = '" + numRecordsReturned + '\'' + 
			",responseMessageId = '" + responseMessageId + '\'' + 
			",requestMessageId = '" + requestMessageId + '\'' + 
			",messageDateTime = '" + messageDateTime + '\'' + 
			"}";
		}
}