package com.posproject.jspweb.entity;

public class Seller {
	private String id;
	private String SellerId;
	
	//------------?��?��?��
	
	
	// ----------기본 ?��?��?��
	public Seller() {
		
	}

	//----------�??�� ?��?���? ?��?��?��
	
	public Seller(String id,String SellerId) {
		this.id = id;
		this.SellerId = SellerId;
	}
	//게터?��?��

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
