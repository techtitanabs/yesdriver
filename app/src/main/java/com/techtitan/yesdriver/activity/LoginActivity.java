package com.techtitan.yesdriver.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.model.login.Data;
import com.techtitan.yesdriver.model.login.LoginResponse;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;
import com.techtitan.yesdriver.util.Logger;
import com.techtitan.yesdriver.util.NetworkCheck;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    ApiInterface apiInterface = RestExecutor.postApiClient().create(ApiInterface.class);

    EditText mobile_ed, password_ed;
    MaterialButton login_btn;
    String mobile_txt, password_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mobile_ed = findViewById(R.id.mobile_ed);
        password_ed = findViewById(R.id.password_ed);
        login_btn = findViewById(R.id.login_btn);

        validationCheck();

    }

    private void validationCheck() {
        mobile_txt = mobile_ed.getText().toString();
        password_txt = password_ed.getText().toString();

        if (mobile_txt.isEmpty()){
            mobile_ed.setError(getResources().getString(R.string.empty_field));
            return;
        }
        if (password_txt.isEmpty()){
            password_ed.setError(getResources().getString(R.string.empty_field));
            return;
        }
        if (NetworkCheck.isNetworkAvailable(this)) {
            startLoginCall();
        }
        else{
            Logger.toasterror(this,getResources().getString(R.string.no_internet));
        }
    }

    private void startLoginCall() {
        Call<LoginResponse> responseCall = apiInterface.call_login(mobile_txt, password_txt);
        responseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful() && response.body() != null){
                    LoginResponse result = response.body();
                    if (result.isStatus() != null && result.isStatus() && result.getData() != null){
                        if (result.getMsg().equalsIgnoreCase("Login success")) {
//                            Data data = result.getData();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }else {
                            Logger.toasterror(getApplicationContext(),result.getMsg());
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Logger.toasterror(getApplicationContext(),"Error = "+t.getMessage());
            }
        });
    }
}