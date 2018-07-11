package com.visahackathon.airpark;


public class Parking {
    private String merchantTitle;
    private String merchantAddress;
    private String merchantDistance;
    private String waitTime;
    private String price;
    private int image;

    public Parking(String merchantTitle, String merchantAddress, String merchantDistance, String waitTime, String price, int image) {
        this.merchantTitle = merchantTitle;
        this.merchantAddress = merchantAddress;
        this.merchantDistance =  merchantDistance;
        this.waitTime = waitTime;
        this.price = price;
        this.image = image;
    }

    public String getMerchantTitle() {
        return merchantTitle;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public String getMerchantDistance() {
        return merchantDistance;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}