package com.techtitan.yesdriver.model.orderlist;

import com.google.gson.annotations.SerializedName;

public class DeliveredOrderItem{

	@SerializedName("product_id")
	private String productId;

	@SerializedName("qty")
	private String qty;

	@SerializedName("variant_value1")
	private String variantValue1;

	@SerializedName("variant_value2")
	private String variantValue2;

	@SerializedName("id")
	private String id;

	@SerializedName("product_price")
	private String productPrice;

	@SerializedName("order_id")
	private String orderId;

	@SerializedName("product_name")
	private String productName;

	@SerializedName("offer_price")
	private String offerPrice;

	public void setProductId(String productId){
		this.productId = productId;
	}

	public String getProductId(){
		return productId;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public String getQty(){
		return qty;
	}

	public void setVariantValue1(String variantValue1){
		this.variantValue1 = variantValue1;
	}

	public String getVariantValue1(){
		return variantValue1;
	}

	public void setVariantValue2(String variantValue2){
		this.variantValue2 = variantValue2;
	}

	public String getVariantValue2(){
		return variantValue2;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setProductPrice(String productPrice){
		this.productPrice = productPrice;
	}

	public String getProductPrice(){
		return productPrice;
	}

	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}

	public void setOfferPrice(String offerPrice){
		this.offerPrice = offerPrice;
	}

	public String getOfferPrice(){
		return offerPrice;
	}
}