package com.cryptoindex.data.models;

import com.squareup.moshi.Json;

public class USD {

    @Json(name = "price")
    private Double price;
    @Json(name = "volume_24h")
    private Double volume24h;
    @Json(name = "percent_change_1h")
    private Double percentChange1h;
    @Json(name = "percent_change_24h")
    private Double percentChange24h;
    @Json(name = "percent_change_7d")
    private Double percentChange7d;
    @Json(name = "market_cap")
    private Double marketCap;
    @Json(name = "last_updated")
    private String lastUpdated;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(Double volume24h) {
        this.volume24h = volume24h;
    }

    public Double getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(Double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public Double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(Double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public Double getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(Double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public Double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}