package com.techtitan.yesdriver.model.login;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("zip")
	private String zip;

	@SerializedName("driver_id")
	private String driverId;

	@SerializedName("account_type")
	private String accountType;

	@SerializedName("aadhar_front")
	private String aadharFront;

	@SerializedName("address")
	private String address;

	@SerializedName("city")
	private String city;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("rc_image")
	private String rcImage;

	@SerializedName("alternate_mobile")
	private String alternateMobile;

	@SerializedName("driving_licence_front")
	private String drivingLicenceFront;

	@SerializedName("account_no")
	private String accountNo;

	@SerializedName("driving_licence_back")
	private String drivingLicenceBack;

	@SerializedName("aadhar_back")
	private String aadharBack;

	@SerializedName("driver_name")
	private String driverName;

	@SerializedName("ifsc_code")
	private String ifscCode;

	@SerializedName("account_holder")
	private String accountHolder;

	@SerializedName("branch_name")
	private String branchName;

	@SerializedName("bank_name")
	private String bankName;

	@SerializedName("state")
	private String state;

	@SerializedName("email")
	private String email;

	@SerializedName("driver_image")
	private String driverImage;

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setDriverId(String driverId){
		this.driverId = driverId;
	}

	public String getDriverId(){
		return driverId;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType(){
		return accountType;
	}

	public void setAadharFront(String aadharFront){
		this.aadharFront = aadharFront;
	}

	public String getAadharFront(){
		return aadharFront;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setRcImage(String rcImage){
		this.rcImage = rcImage;
	}

	public String getRcImage(){
		return rcImage;
	}

	public void setAlternateMobile(String alternateMobile){
		this.alternateMobile = alternateMobile;
	}

	public String getAlternateMobile(){
		return alternateMobile;
	}

	public void setDrivingLicenceFront(String drivingLicenceFront){
		this.drivingLicenceFront = drivingLicenceFront;
	}

	public String getDrivingLicenceFront(){
		return drivingLicenceFront;
	}

	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}

	public String getAccountNo(){
		return accountNo;
	}

	public void setDrivingLicenceBack(String drivingLicenceBack){
		this.drivingLicenceBack = drivingLicenceBack;
	}

	public String getDrivingLicenceBack(){
		return drivingLicenceBack;
	}

	public void setAadharBack(String aadharBack){
		this.aadharBack = aadharBack;
	}

	public String getAadharBack(){
		return aadharBack;
	}

	public void setDriverName(String driverName){
		this.driverName = driverName;
	}

	public String getDriverName(){
		return driverName;
	}

	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}

	public String getIfscCode(){
		return ifscCode;
	}

	public void setAccountHolder(String accountHolder){
		this.accountHolder = accountHolder;
	}

	public String getAccountHolder(){
		return accountHolder;
	}

	public void setBranchName(String branchName){
		this.branchName = branchName;
	}

	public String getBranchName(){
		return branchName;
	}

	public void setBankName(String bankName){
		this.bankName = bankName;
	}

	public String getBankName(){
		return bankName;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setDriverImage(String driverImage){
		this.driverImage = driverImage;
	}

	public String getDriverImage(){
		return driverImage;
	}
}