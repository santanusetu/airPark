package com.visahackathon.airpark.data.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseValues{

	@SerializedName("visaEnterpriseName")
	private String visaEnterpriseName;

	@SerializedName("merchantPhoneNumber")
	private List<MerchantPhoneNumberItem> merchantPhoneNumber;

	@SerializedName("lastTranDateRange")
	private String lastTranDateRange;

	@SerializedName("merchantCountryCode")
	private String merchantCountryCode;

	@SerializedName("merchantCity")
	private String merchantCity;

	@SerializedName("distance")
	private String distance;

	@SerializedName("locationAddressLongitude")
	private String locationAddressLongitude;

	@SerializedName("paymentAcceptanceMethod")
	private List<String> paymentAcceptanceMethod;

	@SerializedName("merchantCategoryCodeDesc")
	private List<String> merchantCategoryCodeDesc;

	@SerializedName("firstTranDateRange")
	private String firstTranDateRange;

	@SerializedName("merchantState")
	private String merchantState;

	@SerializedName("terminalType")
	private List<String> terminalType;

	@SerializedName("visaStoreName")
	private String visaStoreName;

	@SerializedName("visaMerchantId")
	private String visaMerchantId;

	@SerializedName("primaryMerchantCategoryCode")
	private String primaryMerchantCategoryCode;

	@SerializedName("locationAddressLatitude")
	private String locationAddressLatitude;

	@SerializedName("merchantPostalCode")
	private String merchantPostalCode;

	@SerializedName("merchantCategoryCode")
	private List<String> merchantCategoryCode;

	@SerializedName("visaStoreId")
	private String visaStoreId;

	@SerializedName("merchantStreetAddress")
	private String merchantStreetAddress;

	@SerializedName("visaMerchantName")
	private String visaMerchantName;

	@SerializedName("merchantUrl")
	private List<String> merchantUrl;

	public void setVisaEnterpriseName(String visaEnterpriseName){
		this.visaEnterpriseName = visaEnterpriseName;
	}

	public String getVisaEnterpriseName(){
		return visaEnterpriseName;
	}

	public void setMerchantPhoneNumber(List<MerchantPhoneNumberItem> merchantPhoneNumber){
		this.merchantPhoneNumber = merchantPhoneNumber;
	}

	public List<MerchantPhoneNumberItem> getMerchantPhoneNumber(){
		return merchantPhoneNumber;
	}

	public void setLastTranDateRange(String lastTranDateRange){
		this.lastTranDateRange = lastTranDateRange;
	}

	public String getLastTranDateRange(){
		return lastTranDateRange;
	}

	public void setMerchantCountryCode(String merchantCountryCode){
		this.merchantCountryCode = merchantCountryCode;
	}

	public String getMerchantCountryCode(){
		return merchantCountryCode;
	}

	public void setMerchantCity(String merchantCity){
		this.merchantCity = merchantCity;
	}

	public String getMerchantCity(){
		return merchantCity;
	}

	public void setDistance(String distance){
		this.distance = distance;
	}

	public String getDistance(){
		return distance;
	}

	public void setLocationAddressLongitude(String locationAddressLongitude){
		this.locationAddressLongitude = locationAddressLongitude;
	}

	public String getLocationAddressLongitude(){
		return locationAddressLongitude;
	}

	public void setPaymentAcceptanceMethod(List<String> paymentAcceptanceMethod){
		this.paymentAcceptanceMethod = paymentAcceptanceMethod;
	}

	public List<String> getPaymentAcceptanceMethod(){
		return paymentAcceptanceMethod;
	}

	public void setMerchantCategoryCodeDesc(List<String> merchantCategoryCodeDesc){
		this.merchantCategoryCodeDesc = merchantCategoryCodeDesc;
	}

	public List<String> getMerchantCategoryCodeDesc(){
		return merchantCategoryCodeDesc;
	}

	public void setFirstTranDateRange(String firstTranDateRange){
		this.firstTranDateRange = firstTranDateRange;
	}

	public String getFirstTranDateRange(){
		return firstTranDateRange;
	}

	public void setMerchantState(String merchantState){
		this.merchantState = merchantState;
	}

	public String getMerchantState(){
		return merchantState;
	}

	public void setTerminalType(List<String> terminalType){
		this.terminalType = terminalType;
	}

	public List<String> getTerminalType(){
		return terminalType;
	}

	public void setVisaStoreName(String visaStoreName){
		this.visaStoreName = visaStoreName;
	}

	public String getVisaStoreName(){
		return visaStoreName;
	}

	public void setVisaMerchantId(String visaMerchantId){
		this.visaMerchantId = visaMerchantId;
	}

	public String getVisaMerchantId(){
		return visaMerchantId;
	}

	public void setPrimaryMerchantCategoryCode(String primaryMerchantCategoryCode){
		this.primaryMerchantCategoryCode = primaryMerchantCategoryCode;
	}

	public String getPrimaryMerchantCategoryCode(){
		return primaryMerchantCategoryCode;
	}

	public void setLocationAddressLatitude(String locationAddressLatitude){
		this.locationAddressLatitude = locationAddressLatitude;
	}

	public String getLocationAddressLatitude(){
		return locationAddressLatitude;
	}

	public void setMerchantPostalCode(String merchantPostalCode){
		this.merchantPostalCode = merchantPostalCode;
	}

	public String getMerchantPostalCode(){
		return merchantPostalCode;
	}

	public void setMerchantCategoryCode(List<String> merchantCategoryCode){
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public List<String> getMerchantCategoryCode(){
		return merchantCategoryCode;
	}

	public void setVisaStoreId(String visaStoreId){
		this.visaStoreId = visaStoreId;
	}

	public String getVisaStoreId(){
		return visaStoreId;
	}

	public void setMerchantStreetAddress(String merchantStreetAddress){
		this.merchantStreetAddress = merchantStreetAddress;
	}

	public String getMerchantStreetAddress(){
		return merchantStreetAddress;
	}

	public void setVisaMerchantName(String visaMerchantName){
		this.visaMerchantName = visaMerchantName;
	}

	public String getVisaMerchantName(){
		return visaMerchantName;
	}

	public void setMerchantUrl(List<String> merchantUrl){
		this.merchantUrl = merchantUrl;
	}

	public List<String> getMerchantUrl(){
		return merchantUrl;
	}

	@Override
 	public String toString(){
		return 
			"ResponseValues{" + 
			"visaEnterpriseName = '" + visaEnterpriseName + '\'' + 
			",merchantPhoneNumber = '" + merchantPhoneNumber + '\'' + 
			",lastTranDateRange = '" + lastTranDateRange + '\'' + 
			",merchantCountryCode = '" + merchantCountryCode + '\'' + 
			",merchantCity = '" + merchantCity + '\'' + 
			",distance = '" + distance + '\'' + 
			",locationAddressLongitude = '" + locationAddressLongitude + '\'' + 
			",paymentAcceptanceMethod = '" + paymentAcceptanceMethod + '\'' + 
			",merchantCategoryCodeDesc = '" + merchantCategoryCodeDesc + '\'' + 
			",firstTranDateRange = '" + firstTranDateRange + '\'' + 
			",merchantState = '" + merchantState + '\'' + 
			",terminalType = '" + terminalType + '\'' + 
			",visaStoreName = '" + visaStoreName + '\'' + 
			",visaMerchantId = '" + visaMerchantId + '\'' + 
			",primaryMerchantCategoryCode = '" + primaryMerchantCategoryCode + '\'' + 
			",locationAddressLatitude = '" + locationAddressLatitude + '\'' + 
			",merchantPostalCode = '" + merchantPostalCode + '\'' + 
			",merchantCategoryCode = '" + merchantCategoryCode + '\'' + 
			",visaStoreId = '" + visaStoreId + '\'' + 
			",merchantStreetAddress = '" + merchantStreetAddress + '\'' + 
			",visaMerchantName = '" + visaMerchantName + '\'' + 
			",merchantUrl = '" + merchantUrl + '\'' + 
			"}";
		}
}