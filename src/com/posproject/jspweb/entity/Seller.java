package com.posproject.jspweb.entity;

public class Seller {
	private String id;
	private String SellerId;
	
	//------------?Éù?Ñ±?ûê
	
	
	// ----------Í∏∞Î≥∏ ?Éù?Ñ±?ûê
	public Seller() {
		
	}

	//----------Î≥??àò ?ì§?ñ¥Í∞? ?Éù?Ñ±?ûê
	
	public Seller(String id,String SellerId) {
		this.id = id;
		this.SellerId = SellerId;
	}
	//Í≤åÌÑ∞?Ñ∏?Ñ∞

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSellerId() {
		return SellerId;
	}

	public void setSellerId(String sellerId) {
		SellerId = sellerId;
	}
	

}
