package com.techtitan.yesdriver.network;

import com.techtitan.yesdriver.model.login.LoginResponse;
import com.techtitan.yesdriver.model.order.OrderStatusResponse;
import com.techtitan.yesdriver.model.orderlist.OrderListResponse;
import com.techtitan.yesdriver.model.profile.ProfileResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("driver-order-list")
    Call<OrderListResponse> call_orderList(
            @Field("driver_id") String driver_id
    );

    @FormUrlEncoded
    @POST("driver-login")
    Call<LoginResponse> call_login(
            @Field("mobile") String mobile,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("driver-profile")
    Call<ProfileResponse> call_driver_profile(
            @Field("driver_id") String driver_id
    );

    @FormUrlEncoded
    @POST("change-order-status")
    Call<OrderStatusResponse> call_order_status_response(
            @Field("order_id") String order_id
    );
}
