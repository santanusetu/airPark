package com.visahackathon.airpark.data.queueInsightModels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseData{

	@SerializedName("kind")
	private String kind;

	@SerializedName("merchantList")
	private List<MerchantListItem> merchantList;

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setMerchantList(List<MerchantListItem> merchantList){
		this.merchantList = merchantList;
	}

	public List<MerchantListItem> getMerchantList(){
		return merchantList;
	}

	@Override
 	public String toString(){
		return 
			"ResponseData{" + 
			"kind = '" + kind + '\'' + 
			",merchantList = '" + merchantList + '\'' + 
			"}";
		}
}