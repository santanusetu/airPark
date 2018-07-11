package com.visahackathon.airpark.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MerchantLocatorServiceResponse {

    @SerializedName("header")
    @Expose
    private Header header;

    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    @SerializedName("status")
    @Expose
    private Status status;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
