package com.posproject.jspweb.entity;

public class AskAnswer {
	private String Id;

	//-------??±?
	
	//-------κΈ°λ³Έ??±?
	public AskAnswer() {
		
	}
	
	//---------λ³?? ?€?΄κ°? ??±?
	public AskAnswer(String Id ) {
		this.Id = Id;
	}
	
	
	//κ²ν°?Έ?°
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
		
}
