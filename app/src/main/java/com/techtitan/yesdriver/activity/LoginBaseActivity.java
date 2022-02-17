package com.techtitan.yesdriver.activity;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;

public abstract class LoginBaseActivity extends AppCompatActivity {
    protected FrameLayout mainFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_logout);
    }
}
