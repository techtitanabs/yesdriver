package com.techtitan.yesdriver.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestExecutor {
    public static String home_url= ConstantValues.BASE_URl+"";
    public static String user_login_url= ConstantValues.BASE_URl+"user-login";

    public static Retrofit postApiClient(){
        Retrofit retrofit = null;
        retrofit = new Retrofit.Builder()
                .baseUrl(ConstantValues.BASE_URl)
                .client(getclient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    private static OkHttpClient getclient(){

        return new OkHttpClient.Builder()
                .addInterceptor( new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS).build();
    }

}
