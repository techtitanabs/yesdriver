package com.techtitan.yesdriver.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.fragment.DriverProfileFragment;

public class DriverProfileActivity extends LoginBaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Fragment frg = new DriverProfileFragment();
            frg.setArguments(getIntent().getExtras());
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.mainlayout, frg).commit();
        }
    }
}
