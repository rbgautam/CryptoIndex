package com.cryptoindex.data.mappers;

import android.support.annotation.NonNull;

import com.cryptoindex.data.entities.CryptoCoinEntity;
import com.cryptoindex.data.models.CoinModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omrierez on 28.12.17.
 */

public class CryptoMapper extends ObjectMapper {
    private final String CRYPTO_URL_PATH =
            "https://s2.coinmarketcap.com/static/img/coins/64x64/%s.png?CMC_PRO_API_KEY=fcf33c3f-6f45-4d24-8cba-baea0a4c128c";

    public ArrayList<CryptoCoinEntity> mapJSONToEntity(String jsonStr) {
        ArrayList<CryptoCoinEntity> data = null;
        try {
            data = readValue(jsonStr, new TypeReference<ArrayList<CryptoCoinEntity>>() {
            });
        } catch (Exception e) {
        }
        return data;
    }
    @NonNull
    public List<CoinModel> mapEntityToModel(List<CryptoCoinEntity> data) {
        final ArrayList<CoinModel> listData = new ArrayList<>();
        CryptoCoinEntity entity;
        for (int i = 0; i < data.size(); i++) {
            entity = data.get(i);
            listData.add(new CoinModel(entity.getName(), entity.getSymbol(),
                    String.format(CRYPTO_URL_PATH, entity.getId()),entity.getPriceUsd(),
                    entity.get24hVolumeUsd(), Double.valueOf(entity.getMarketCapUsd())));
        }

        return listData;
    }

    public String mapEntitiesToString(List<CryptoCoinEntity> data) throws JsonProcessingException {
            return writeValueAsString(data);

    }
}
