package com.techtitan.yesdriver.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.techtitan.yesdriver.R;
import com.techtitan.yesdriver.model.profile.Data;
import com.techtitan.yesdriver.model.profile.ProfileResponse;
import com.techtitan.yesdriver.network.ApiInterface;
import com.techtitan.yesdriver.network.RestExecutor;
import com.techtitan.yesdriver.util.GlideImage;
import com.techtitan.yesdriver.util.S_Preference;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DriverProfileFragment extends Fragment {
    ApiInterface apiInterface = RestExecutor.postApiClient().create(ApiInterface.class);
    ProgressBar progressBar;
    private Activity activity;
    private TextView nametxt, txt_contact, txt_email, txt_address, txt_city, txt_state,
            txt_zip, txt_alternate_number, txt_bank_name, txt_account_no, txt_branch_name,
            txt_ifsc, txt_acc_holder, txt_acc_type;
    private ImageView dl_front, dl_back, aadhaar_front, aadhaar_back, rc, driverImage;

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        activity = getActivity();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.driver_detail_fragment, container, false);
        setfindviewbyid(view);
        getDetailFromServer();

        return view;
    }

    private void showProgress(boolean isStart) {
        if (isStart){
            progressBar.setVisibility(View.VISIBLE);
        }else {
            progressBar.setVisibility(View.GONE);
        }
    }

    private void getDetailFromServer() {
        showProgress(true);
        String driverId = new S_Preference(activity).getUserId();
        Call<ProfileResponse> responseCall = apiInterface.call_driver_profile(driverId);
        responseCall.enqueue(new Callback<ProfileResponse>() {
            @Override
            public void onResponse(Call<ProfileResponse> call, Response<ProfileResponse> response) {
                showProgress(false);
                if (response.isSuccessful() && response.body() != null){
                    ProfileResponse profileResponse = response.body();
                    if (profileResponse.isStatus()){
                        Data data = profileResponse.getData();
                        GlideImage.glide_img_load(activity,data.getDriverImage(),driverImage,R.mipmap.ic_logo);
                        GlideImage.glide_img_load(activity,data.getAadharFront(),aadhaar_back,R.mipmap.ic_logo);
                        GlideImage.glide_img_load(activity,data.getAadharBack(),aadhaar_back,R.mipmap.ic_logo);
                        GlideImage.glide_img_load(activity,data.getDrivingLicenceFront(),dl_front,R.mipmap.ic_logo);
                        GlideImage.glide_img_load(activity,data.getDrivingLicenceBack(),dl_back,R.mipmap.ic_logo);
                        GlideImage.glide_img_load(activity,data.getRcImage(),rc,R.mipmap.ic_logo);

                        nametxt.setText(data.getDriverName());
                        txt_contact.setText(data.getMobile());
                        txt_email.setText(data.getEmail());
                        txt_address.setText(data.getAddress());
                        txt_city.setText(data.getCity());
                        txt_state.setText(data.getState());
                        txt_zip.setText(data.getZip());
                        txt_alternate_number.setText(data.getAlternateMobile());
                        txt_bank_name.setText(data.getBankName());
                        txt_account_no.setText(data.getAccountNo());
                        txt_branch_name.setText(data.getBranchName());
                        txt_ifsc.setText(data.getIfscCode());
                        txt_acc_holder.setText(data.getAccountHolder());
                        txt_acc_type.setText(data.getAccountType());
                    }
                }
            }

            @Override
            public void onFailure(Call<ProfileResponse> call, Throwable t) {
                showProgress(false);
            }
        });
    }

    private void setfindviewbyid(View v) {
        nametxt = v.findViewById(R.id.nametxt);
        txt_contact = v.findViewById(R.id.txt_contact);
        txt_email = v.findViewById(R.id.txt_email);
        txt_address = v.findViewById(R.id.txt_address);
        txt_city = v.findViewById(R.id.txt_city);
        txt_state = v.findViewById(R.id.txt_state);
        txt_zip = v.findViewById(R.id.txt_zip);
        txt_alternate_number = v.findViewById(R.id.txt_alternate_number);
        txt_bank_name = v.findViewById(R.id.txt_bank_name);
        txt_account_no = v.findViewById(R.id.txt_account_no);
        txt_branch_name = v.findViewById(R.id.txt_branch_name);
        txt_ifsc = v.findViewById(R.id.txt_ifsc);
        txt_acc_holder = v.findViewById(R.id.txt_acc_holder);
        txt_acc_type = v.findViewById(R.id.txt_acc_type);
        dl_front = v.findViewById(R.id.dl_front);
        dl_back = v.findViewById(R.id.dl_back);
        aadhaar_front = v.findViewById(R.id.aadhaar_front);
        aadhaar_back = v.findViewById(R.id.aadhaar_back);
        rc = v.findViewById(R.id.rc);
        driverImage = v.findViewById(R.id.driverImage);
        progressBar = v.findViewById(R.id.progressBar);
    }
}
