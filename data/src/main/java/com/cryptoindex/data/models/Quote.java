package com.cryptoindex.data.models;

import com.squareup.moshi.Json;

public class Quote {

    @Json(name = "USD")
    private USD uSD;

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
        this.uSD = uSD;
    }

}