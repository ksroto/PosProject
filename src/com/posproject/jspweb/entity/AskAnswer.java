package com.posproject.jspweb.entity;

public class AskAnswer {
	private String Id;

	//-------?��?��?��
	
	//-------기본?��?��?��
	public AskAnswer() {
		
	}
	
	//---------�??�� ?��?���? ?��?��?��
	public AskAnswer(String Id ) {
		this.Id = Id;
	}
	
	
	//게터?��?��
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
		
}
