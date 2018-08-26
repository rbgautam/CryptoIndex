package com.forgeinnovations.cryptoindex.screens;


import com.cryptoindex.data.models.CoinModel;

import java.util.List;


/**
 * Created by omrierez on 23.11.17.
 */

public interface MainScreen {

    void updateData(List<CoinModel> data);
    void setError(String msg);
}
