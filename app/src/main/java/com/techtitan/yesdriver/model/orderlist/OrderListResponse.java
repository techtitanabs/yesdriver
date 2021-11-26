package com.techtitan.yesdriver.model.orderlist;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class OrderListResponse{

	@SerializedName("returned_order")
	private List<ReturnedOrderItem> returnedOrder;

	@SerializedName("shipped_order")
	private List<ShippedOrderItem> shippedOrder;

	@SerializedName("delivered_order")
	private List<DeliveredOrderItem> deliveredOrder;

	@SerializedName("assigned_order")
	private List<AssignedOrderItem> assignedOrder;

	@SerializedName("cancel_order")
	private List<CancelOrderItem> cancelOrder;

	@SerializedName("status")
	private Boolean status;

	public void setReturnedOrder(List<ReturnedOrderItem> returnedOrder){
		this.returnedOrder = returnedOrder;
	}

	public List<ReturnedOrderItem> getReturnedOrder(){
		return returnedOrder;
	}

	public void setShippedOrder(List<ShippedOrderItem> shippedOrder){
		this.shippedOrder = shippedOrder;
	}

	public List<ShippedOrderItem> getShippedOrder(){
		return shippedOrder;
	}

	public void setDeliveredOrder(List<DeliveredOrderItem> deliveredOrder){
		this.deliveredOrder = deliveredOrder;
	}

	public List<DeliveredOrderItem> getDeliveredOrder(){
		return deliveredOrder;
	}

	public void setAssignedOrder(List<AssignedOrderItem> assignedOrder){
		this.assignedOrder = assignedOrder;
	}

	public List<AssignedOrderItem> getAssignedOrder(){
		return assignedOrder;
	}

	public void setCancelOrder(List<CancelOrderItem> cancelOrder){
		this.cancelOrder = cancelOrder;
	}

	public List<CancelOrderItem> getCancelOrder(){
		return cancelOrder;
	}

	public void setStatus(Boolean status){
		this.status = status;
	}

	public Boolean isStatus(){
		return status;
	}
}