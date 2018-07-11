package com.visahackathon.airpark.data.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("matchIndicators")
    @Expose
    private MatchIndicators matchIndicators;
    @SerializedName("matchScore")
    @Expose
    private String matchScore;
    @SerializedName("responseValues")
    @Expose
    private ResponseValues responseValues;

    public MatchIndicators getMatchIndicators() {
        return matchIndicators;
    }

    public void setMatchIndicators(MatchIndicators matchIndicators) {
        this.matchIndicators = matchIndicators;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    public ResponseValues getResponseValues() {
        return responseValues;
    }

    public void setResponseValues(ResponseValues responseValues) {
        this.responseValues = responseValues;
    }

}