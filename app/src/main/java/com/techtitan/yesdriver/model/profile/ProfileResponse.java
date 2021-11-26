package com.techtitan.yesdriver.model.profile;

import com.google.gson.annotations.SerializedName;

public class ProfileResponse{

	@SerializedName("msg")
	private String msg;

	@SerializedName("data")
	private Data data;

	@SerializedName("status")
	private boolean status;

	public String getMsg(){
		return msg;
	}

	public Data getData(){
		return data;
	}

	public boolean isStatus(){
		return status;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}