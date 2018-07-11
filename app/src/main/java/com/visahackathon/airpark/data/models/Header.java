package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.SerializedName;

public class Header{

	@SerializedName("numRecordsReturned")
	private int numRecordsReturned;

	@SerializedName("startIndex")
	private String startIndex;

	@SerializedName("numRecordsMatched")
	private int numRecordsMatched;

	@SerializedName("responseMessageId")
	private String responseMessageId;

	@SerializedName("endIndex")
	private String endIndex;

	@SerializedName("requestMessageId")
	private String requestMessageId;

	@SerializedName("messageDateTime")
	private String messageDateTime;

	public void setNumRecordsReturned(int numRecordsReturned){
		this.numRecordsReturned = numRecordsReturned;
	}

	public int getNumRecordsReturned(){
		return numRecordsReturned;
	}

	public void setStartIndex(String startIndex){
		this.startIndex = startIndex;
	}

	public String getStartIndex(){
		return startIndex;
	}

	public void setNumRecordsMatched(int numRecordsMatched){
		this.numRecordsMatched = numRecordsMatched;
	}

	public int getNumRecordsMatched(){
		return numRecordsMatched;
	}

	public void setResponseMessageId(String responseMessageId){
		this.responseMessageId = responseMessageId;
	}

	public String getResponseMessageId(){
		return responseMessageId;
	}

	public void setEndIndex(String endIndex){
		this.endIndex = endIndex;
	}

	public String getEndIndex(){
		return endIndex;
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
			"Header{" + 
			"numRecordsReturned = '" + numRecordsReturned + '\'' + 
			",startIndex = '" + startIndex + '\'' + 
			",numRecordsMatched = '" + numRecordsMatched + '\'' + 
			",responseMessageId = '" + responseMessageId + '\'' + 
			",endIndex = '" + endIndex + '\'' + 
			",requestMessageId = '" + requestMessageId + '\'' + 
			",messageDateTime = '" + messageDateTime + '\'' + 
			"}";
		}
}