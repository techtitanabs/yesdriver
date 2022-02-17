package com.techtitan.yesdriver.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class S_Preference {
    private final SharedPreferences mSharedPreferences;
    private final SharedPreferences.Editor meditor;

    private static final String userId = "USER_ID";

    private static final String login_status = "ISLOGIN";
    private static final String first_name = "FIRST_NAME";
    private static final String email = "EMAIL";
    private static final String user_mobile = "MOBILE";

    private static final String selected_Delivery_Address = "ADDRESS_OBJECT";

    private static final String delivery_mobile = "DELIVERY_MOBILE";
    private static final String delivery_f_name = "DELIVERY_FIRST_NAME";
    private static final String delivery_l_name = "DELIVERY_LAST_NAME";
    private static final String delivery_email = "DELIVERY_EMAIL";
    private static final String delivery_city = "DELIVERY_CITY";
    private static final String delivery_state = "DELIVERY_STATE";
    private static final String delivery_pincode = "DELIVERY_PINCODE";
    private static final String delivery_address = "DELIVERY_ADDRESS";
    private static final String delivery_address_type = "DELIVERY_ADDRESS_TYPE";


    public static final String cartCount = "CART_COUNT";
    public static final String user_image = "USER_IMAGE";
    private static final String user_wallet = "USER_WALLET";
    private static final String referral_code = "REFERRAL_CODE";
    private static final String parent_referral_code = "PARENT_REFERRAL_CODE";

    @SuppressLint("CommitPrefEdits")
    public S_Preference(Context mContext) {

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        meditor = mSharedPreferences.edit();
    }

    ///////////////////////////LOGIN STATUS//////////////////////////////
    public void setLogin_status(boolean dlogin) {
        meditor.putBoolean(login_status, dlogin).commit();
    }

    public boolean getLogin_status() {
        return mSharedPreferences.getBoolean(login_status, false);
    }

    ///////////////////////////User Id//////////////////////////////
    public void setUserId(String uId) {
        meditor.putString(userId, uId).commit();
    }

    public String getUserId() {
        return mSharedPreferences.getString(userId, "");
    }

    ///////////////////////////NAME USER//////////////////////////////
    public void setUser_mobile(String mobile) {
        meditor.putString(user_mobile, mobile).commit();
    }

    public String getUser_mobile() {
        return mSharedPreferences.getString(user_mobile, "");
    }

    ///////////////////////////USER IMAGE//////////////////////////////
    public void setUser_image(String image) {
        meditor.putString(user_image, image).commit();
    }
    public String getUser_image() {
        return mSharedPreferences.getString(user_image, "");
    }

    ///////////////////////////WALLET AMOUNT//////////////////////////////
    public void setUser_wallet(String wallet) {
        meditor.putString(user_wallet, wallet).commit();
    }
    public String getUser_wallet() {
        return mSharedPreferences.getString(user_wallet, "");
    }


    ///////////////////////////REFERRAL CODE//////////////////////////////
    public void setReferral_code(String code) {
        meditor.putString(referral_code, code).commit();
    }
    public String getReferral_code() {
        return mSharedPreferences.getString(referral_code, "");
    }

    ///////////////////////////NAME USER//////////////////////////////
    public void setParent_referral_code(String code) {
        meditor.putString(parent_referral_code, code).commit();
    }

    public String getParent_referral_code() {
        return mSharedPreferences.getString(parent_referral_code, "");
    }

    ///////////////////////////FIRST USER//////////////////////////////
    public void setFirst_name(String f_name) {
        meditor.putString(first_name, f_name).commit();
    }

    public String getFirst_name() {
        return mSharedPreferences.getString(first_name, "");
    }

    ///////////////////////////EMAIL USER//////////////////////////////
    public void setEmail(String u_name) {
        meditor.putString(email, u_name).commit();
    }

    public String getEmail() {
        return mSharedPreferences.getString(email, "");
    }

    ///////////////////////////DELIVERY FIRST NAME//////////////////////////////
    public void setDelivery_f_name(String d_fname) {
        meditor.putString(delivery_f_name, d_fname).commit();
    }

    public String getDelivery_f_name() {
        return mSharedPreferences.getString(delivery_f_name, "");
    }

    ///////////////////////////DELIVERY LAST NAME//////////////////////////////
    public void setDelivery_l_name(String d_lname) {
        meditor.putString(delivery_l_name, d_lname).commit();
    }

    public String getDelivery_l_name() {
        return mSharedPreferences.getString(delivery_l_name, "");
    }

    ///////////////////////////DELIVERY MOBILE//////////////////////////////
    public void setDelivery_mobile(String d_mobile) {
        meditor.putString(delivery_mobile, d_mobile).commit();
    }

    public String getDelivery_mobile() {
        return mSharedPreferences.getString(delivery_mobile, "");
    }

    ///////////////////////////DELIVERY EMAIL//////////////////////////////
    public void setDelivery_email(String d_email) {
        meditor.putString(delivery_email, d_email).commit();
    }

    public String getDelivery_email() {
        return mSharedPreferences.getString(delivery_email, "");
    }

    ///////////////////////////DELIVERY ADDRESS TYPE//////////////////////////////
    public void setDelivery_address_type(String d_addressType) {
        meditor.putString(delivery_address_type, d_addressType).commit();
    }

    public String getDelivery_address_type() {
        return mSharedPreferences.getString(delivery_address_type, "");
    }

    ///////////////////////////DELIVERY ADDRESS//////////////////////////////
    public void setDelivery_address(String u_address) {
        meditor.putString(delivery_address, u_address).commit();
    }

    public String getDelivery_address() {
        return mSharedPreferences.getString(delivery_address, "");
    }

    ///////////////////////////DELIVERY STATE//////////////////////////////
    public void setDelivery_state(String u_state) {
        meditor.putString(delivery_state, u_state).commit();
    }

    public String getDelivery_state() {
        return mSharedPreferences.getString(delivery_state, "");
    }

    ///////////////////////////DELIVERY CITY //////////////////////////////
    public void setDelivery_city(String u_city) {
        meditor.putString(delivery_city, u_city).commit();
    }

    public String getDelivery_city() {
        return mSharedPreferences.getString(delivery_city, "");
    }

    ///////////////////////////DELIVERY PINCODE//////////////////////////////
    public void setDelivery_pincode(String u_pincode) {
        meditor.putString(delivery_pincode, u_pincode).commit();
    }

    public String getDelivery_pincode() {
        return mSharedPreferences.getString(delivery_pincode, "");
    }

    /////////////////////////// DELIVERY ADDRESS//////////////////////////////
    public void setSelected_Delivery_Address(String u_address) {
        meditor.putString(selected_Delivery_Address, u_address).commit();
    }

    public String getSelected_Delivery_Address() {
        return mSharedPreferences.getString(selected_Delivery_Address, "");
    }

    /////////////////////////// CARTCOUNT//////////////////////////////
    public void setCartCount(String c_count) {
        meditor.putString(cartCount, c_count).commit();
    }

    public String getCartCount() {
        return mSharedPreferences.getString(cartCount, "0");
    }


//    ///////////////////////////LOCALITY USER//////////////////////////////
//    public void setLocality(String u_name){
//        meditor.putString(locality,u_name).commit();
//    }
//    public String getLocality(){
//        return mSharedPreferences.getString(locality,"");
//    }
//    ///////////////////////////LANDMARK USER//////////////////////////////
//    public void setLandmark(String u_name){
//        meditor.putString(landmark,u_name).commit();
//    }
//    public String getLandmark(){
//        return mSharedPreferences.getString(landmark,"");
//    }
}
