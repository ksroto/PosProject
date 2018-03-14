package com.posproject.jspweb.entity;

public class AskAnswer {
	private String Id;

	//-------?ƒ?„±?
	
	//-------ê¸°ë³¸?ƒ?„±?
	public AskAnswer() {
		
	}
	
	//---------ë³??ˆ˜ ?“¤?–´ê°? ?ƒ?„±?
	public AskAnswer(String Id ) {
		this.Id = Id;
	}
	
	
	//ê²Œí„°?„¸?„°
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
		
}
