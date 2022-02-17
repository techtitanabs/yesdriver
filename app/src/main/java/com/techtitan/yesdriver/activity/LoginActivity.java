package com.techtitan.yesdriver.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.model.login.Data;
import com.techtitan.yesdriver.model.login.LoginResponse;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;
import com.techtitan.yesdriver.util.Logger;
import com.techtitan.yesdriver.util.NetworkCheck;
import com.techtitan.yesdriver.util.S_Preference;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    ApiInterface apiInterface = RestExecutor.postApiClient().create(ApiInterface.class);
    private Button login;
    private ImageView btn_back;

    ProgressBar progressBar;
    private TextView signup, forgetpassword;
    private EditText ed_password, ed_username;
    private String auth_id, password;
    private Activity activity;
    private static final String EMAIL = "email";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_back = findViewById(R.id.btn_back);
        progressBar = findViewById(R.id.progressBar);
        login = findViewById(R.id.login);
        signup= findViewById(R.id.signup);
        forgetpassword = findViewById(R.id.forgetpassword);
        ed_password = findViewById(R.id.ed_password);
        ed_username = findViewById(R.id.ed_username);
        showProgress(false);


        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, MainActivity.class);
                startActivity(intent);
                activity.finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });

    }
    private void btn_Active_Status(boolean isActive){
        login.setEnabled(isActive);
        login.setClickable(isActive);
    }
    private void showProgress(boolean isStatus){
        btn_Active_Status(!isStatus);
        if (isStatus){
            progressBar.setVisibility(View.VISIBLE);
        }else {
            progressBar.setVisibility(View.GONE);
        }
    }

    private void validation() {
        password = ed_password.getText().toString();
        auth_id = ed_username.getText().toString();
        if (auth_id.isEmpty()){
            ed_username.setError("Username is empty");
            return;
        }
        if (password.isEmpty()){
            ed_password.setError("Password is empty");
            return;
        }
        startLoginCall();
    }

    private void startLoginCall() {
        showProgress(true);
        Call<LoginResponse> responseCall = apiInterface.call_login(auth_id, password);
        responseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                showProgress(false);
                if (response.isSuccessful() && response.body() != null){
                    LoginResponse result = response.body();
                    if (result.isStatus() != null && result.isStatus() && result.getData() != null){
                        if (result.getMsg().equalsIgnoreCase("Login success")) {
                            new S_Preference(getApplicationContext()).setUserId(result.getData().getDriverId());
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
                showProgress(false);
                Logger.toasterror(getApplicationContext(),"Error = "+t.getMessage());
            }
        });
    }
}