package com.techtitan.yesdriver.model.order;

import com.google.gson.annotations.SerializedName;

public class OrderStatusResponse{

	@SerializedName("msg")
	private String msg;

	@SerializedName("status")
	private Boolean status;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setStatus(Boolean status){
		this.status = status;
	}

	public Boolean isStatus(){
		return status;
	}
}