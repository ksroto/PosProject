package com.posproject.jspweb.entity;

public class Answer {
	private String id;
	private String StoreName; 
	private String Title; 
	private String Contents; 
	private String SellerId;
	
	//------------생성자
	
	
	// ----------기본 생성자
	public Answer() {
		
	}

	//----------변수 들어간 생성자
	
	public Answer(String id,String StoreName,String Title,String Contents,String SellerId) {
		this.id = id;
		this.StoreName = StoreName;
		this.Title = Title;
		this.Contents = Contents;
		this.SellerId = SellerId;
	}
	
	
	//게터세터
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStoreName() {
		return StoreName;
	}
	public void setStoreName(String StoreName) {
		StoreName = StoreName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public String getSellerId() {
		return SellerId;
	}
	public void setSellerId(String SellerId) {
		SellerId = SellerId;
	} 
	
}
