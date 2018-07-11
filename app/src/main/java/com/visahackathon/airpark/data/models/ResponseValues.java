package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseValues {

    @SerializedName("visaMerchantName")
    @Expose
    private String visaMerchantName;

    @SerializedName("visaStoreName")
    @Expose
    private String visaStoreName;

    @SerializedName("locationAddressLatitude")
    @Expose
    private String locationAddressLatitude;

    @SerializedName("locationAddressLongitude")
    @Expose
    private String locationAddressLongitude;

    @SerializedName("visaStoreId")
    @Expose
    private String visaStoreId;

    @SerializedName("visaMerchantId")
    @Expose
    private String visaMerchantId;

    @SerializedName("merchantUrl")
    @Expose
    private List<String> merchantUrl = null;

    @SerializedName("merchantCategoryCodeDesc")
    @Expose
    private List<String> merchantCategoryCodeDesc = null;

    @SerializedName("visaEnterpriseName")
    @Expose
    private String visaEnterpriseName;

    @SerializedName("primaryMerchantCategoryCode")
    @Expose
    private String primaryMerchantCategoryCode;

    @SerializedName("merchantCountryCode")
    @Expose
    private String merchantCountryCode;

    @SerializedName("merchantStreetAddress")
    @Expose
    private String merchantStreetAddress;

    @SerializedName("merchantState")
    @Expose
    private String merchantState;

    @SerializedName("merchantPostalCode")
    @Expose
    private String merchantPostalCode;

    @SerializedName("merchantCity")
    @Expose
    private String merchantCity;

    @SerializedName("paymentAcceptanceMethod")
    @Expose
    private List<String> paymentAcceptanceMethod = null;

    @SerializedName("terminalType")
    @Expose
    private List<String> terminalType = null;

    @SerializedName("firstTranDateRange")
    @Expose
    private String firstTranDateRange;

    @SerializedName("lastTranDateRange")
    @Expose
    private String lastTranDateRange;

    @SerializedName("merchantCategoryCode")
    @Expose
    private List<String> merchantCategoryCode = null;

    @SerializedName("merchantPhoneNumber")
    @Expose
    private List<MerchantPhoneNumber> merchantPhoneNumber = null;

    @SerializedName("distance")
    @Expose
    private String distance;

    public String getVisaMerchantName() {
        return visaMerchantName;
    }

    public void setVisaMerchantName(String visaMerchantName) {
        this.visaMerchantName = visaMerchantName;
    }

    public String getVisaStoreName() {
        return visaStoreName;
    }

    public void setVisaStoreName(String visaStoreName) {
        this.visaStoreName = visaStoreName;
    }

    public String getLocationAddressLatitude() {
        return locationAddressLatitude;
    }

    public void setLocationAddressLatitude(String locationAddressLatitude) {
        this.locationAddressLatitude = locationAddressLatitude;
    }

    public String getLocationAddressLongitude() {
        return locationAddressLongitude;
    }

    public void setLocationAddressLongitude(String locationAddressLongitude) {
        this.locationAddressLongitude = locationAddressLongitude;
    }

    public String getVisaStoreId() {
        return visaStoreId;
    }

    public void setVisaStoreId(String visaStoreId) {
        this.visaStoreId = visaStoreId;
    }

    public String getVisaMerchantId() {
        return visaMerchantId;
    }

    public void setVisaMerchantId(String visaMerchantId) {
        this.visaMerchantId = visaMerchantId;
    }

    public List<String> getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(List<String> merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    public List<String> getMerchantCategoryCodeDesc() {
        return merchantCategoryCodeDesc;
    }

    public void setMerchantCategoryCodeDesc(List<String> merchantCategoryCodeDesc) {
        this.merchantCategoryCodeDesc = merchantCategoryCodeDesc;
    }

    public String getVisaEnterpriseName() {
        return visaEnterpriseName;
    }

    public void setVisaEnterpriseName(String visaEnterpriseName) {
        this.visaEnterpriseName = visaEnterpriseName;
    }

    public String getPrimaryMerchantCategoryCode() {
        return primaryMerchantCategoryCode;
    }

    public void setPrimaryMerchantCategoryCode(String primaryMerchantCategoryCode) {
        this.primaryMerchantCategoryCode = primaryMerchantCategoryCode;
    }

    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    public void setMerchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
    }

    public String getMerchantStreetAddress() {
        return merchantStreetAddress;
    }

    public void setMerchantStreetAddress(String merchantStreetAddress) {
        this.merchantStreetAddress = merchantStreetAddress;
    }

    public String getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    public String getMerchantPostalCode() {
        return merchantPostalCode;
    }

    public void setMerchantPostalCode(String merchantPostalCode) {
        this.merchantPostalCode = merchantPostalCode;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public List<String> getPaymentAcceptanceMethod() {
        return paymentAcceptanceMethod;
    }

    public void setPaymentAcceptanceMethod(List<String> paymentAcceptanceMethod) {
        this.paymentAcceptanceMethod = paymentAcceptanceMethod;
    }

    public List<String> getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(List<String> terminalType) {
        this.terminalType = terminalType;
    }

    public String getFirstTranDateRange() {
        return firstTranDateRange;
    }

    public void setFirstTranDateRange(String firstTranDateRange) {
        this.firstTranDateRange = firstTranDateRange;
    }

    public String getLastTranDateRange() {
        return lastTranDateRange;
    }

    public void setLastTranDateRange(String lastTranDateRange) {
        this.lastTranDateRange = lastTranDateRange;
    }

    public List<String> getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(List<String> merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public List<MerchantPhoneNumber> getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(List<MerchantPhoneNumber> merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

}
