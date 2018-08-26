package com.cryptoindex.data.repository.datasource;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.cryptoindex.data.entities.CryptoCoinEntity;
import com.cryptoindex.data.mappers.CryptoMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omrierez on 28.12.17.
 */

public class RemoteDataSource implements DataSource<List<CryptoCoinEntity>> {
    private static final String TAG = RemoteDataSource.class.getSimpleName();
    public final String ENDPOINT_FETCH_CRYPTO_DATA = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?start=1&limit=100&CMC_PRO_API_KEY=fcf33c3f-6f45-4d24-8cba-baea0a4c128c&convert=USD";//https://api.coinmarketcap.com/v1/ticker/?limit=100";
    private final RequestQueue mQueue;
    private final CryptoMapper mObjMapper;
    private final MutableLiveData<String> mError=new MutableLiveData<>();
    private final MutableLiveData<List<CryptoCoinEntity>> mDataApi=new MutableLiveData<>();
    public RemoteDataSource(Context appContext,CryptoMapper objMapper) {
        mQueue = Volley.newRequestQueue(appContext);
        mObjMapper=objMapper;
    }

    @Override
    public LiveData<List<CryptoCoinEntity>> getDataStream() {
        return mDataApi;
    }

    @Override
    public LiveData<String> getErrorStream() {
        return mError;
    }

    public void fetch() {
        final JsonArrayRequest jsonObjReq =
                new JsonArrayRequest(ENDPOINT_FETCH_CRYPTO_DATA,
                        response -> {
                            Log.d(TAG, "Thread->" +
                                    Thread.currentThread().getName()+"\tGot some network response");
                            final ArrayList<CryptoCoinEntity> data = mObjMapper.mapJSONToEntity(response.toString());
                            mDataApi.setValue(data);
                        },
                        error -> {
                            Log.d(TAG, "Thread->" +
                                    Thread.currentThread().getName()+"\tGot network error");
                            mError.setValue(error.toString());
                        });
        mQueue.add(jsonObjReq);
    }



}
