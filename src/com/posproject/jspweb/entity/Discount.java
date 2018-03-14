package com.posproject.jspweb.entity;

public class Discount {
	private String Id;
	private String Type;
	private String DiscountPrice;
	private String DiscountId;
	
	//?Éù?Ñ±?ûê
	
	
	//Î≥??àò ?ì§?ñ¥Í∞? ?Éù?Ñ±?ûê
	public Discount() {
		
	}
	
	
	//Í∏∞Î≥∏ ?Éù?Ñ±?ûê
	public Discount(String Id,String Type,String DiscountPrice,String DiscountId) {
		this.Id = Id;
		this.Type = Type;
		this.DiscountPrice = DiscountPrice;
		this.DiscountId = DiscountId;
	}

	//Í≤åÌÑ∞?Ñ∏?Ñ∞
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
