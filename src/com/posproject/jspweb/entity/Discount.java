package com.posproject.jspweb.entity;

public class Discount {
	private String Id;
	private String Type;
	private String DiscountPrice;
	private String DiscountId;
	
	//??±?
	
	
	//λ³?? ?€?΄κ°? ??±?
	public Discount() {
		
	}
	
	
	//κΈ°λ³Έ ??±?
	public Discount(String Id,String Type,String DiscountPrice,String DiscountId) {
		this.Id = Id;
		this.Type = Type;
		this.DiscountPrice = DiscountPrice;
		this.DiscountId = DiscountId;
	}

	//κ²ν°?Έ?°
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getDiscountPrice() {
		return DiscountPrice;
	}


	public void setDiscountPrice(String discountPrice) {
		DiscountPrice = discountPrice;
	}


	public String getDiscountId() {
		return DiscountId;
	}


	public void setDiscountId(String discountId) {
		DiscountId = discountId;
	}
	
	
	

	
}
