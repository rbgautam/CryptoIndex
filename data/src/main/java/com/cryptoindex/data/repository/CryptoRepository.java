package com.cryptoindex.data.repository;
import android.arch.lifecycle.LiveData;

import com.cryptoindex.data.models.CoinModel;

import java.util.List;

/**
 * Created by omrierez on 28.12.17.
 */

public interface CryptoRepository {

    LiveData<List<CoinModel>> getCryptoCoinsData();
    LiveData<String> getErrorStream();
    LiveData<Double> getTotalMarketCapStream();
    void fetchData();
    }
