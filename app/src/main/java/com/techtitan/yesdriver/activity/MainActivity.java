package com.techtitan.yesdriver.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface = RestExecutor.postApiClient().create(ApiInterface.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}