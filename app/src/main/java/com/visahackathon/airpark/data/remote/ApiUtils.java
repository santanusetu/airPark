package com.visahackathon.airpark.data.remote;

public class ApiUtils {
    public static final String BASE_URL = "http://www.mocky.io/v2/";

    public static MLService getMLService() {
        return RetrofitClient.getClient(BASE_URL).create(MLService.class);
    }
}
