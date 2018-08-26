package com.cryptoindex.data.models;

import java.util.List;
import com.squareup.moshi.Json;

public class CoinApiResponse {

    @Json(name = "status")
    private Status status;
    @Json(name = "data")
    private List<Datum> data = null;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}