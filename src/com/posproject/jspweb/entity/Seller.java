package com.posproject.jspweb.entity;

public class Seller {
	private String id;
	private String SellerId;
	
	//------------??±?
	
	
	// ----------κΈ°λ³Έ ??±?
	public Seller() {
		
	}

	//----------λ³?? ?€?΄κ°? ??±?
	
	public Seller(String id,String SellerId) {
		this.id = id;
		this.SellerId = SellerId;
	}
	//κ²ν°?Έ?°

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
