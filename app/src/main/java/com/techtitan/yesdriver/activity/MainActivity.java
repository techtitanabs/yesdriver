package com.techtitan.yesdriver.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DriverProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}