package com.posproject.jspweb.entity;

public class Division {
	private String id;
	
	
	//------------?��?��?��
	
	
	// ----------기본 ?��?��?��
	public Division() {
		
	}

	//----------�??�� ?��?���? ?��?��?��
	
	public Division(String id) {
		this.id = id;	
	}
	//게터?��?��

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
