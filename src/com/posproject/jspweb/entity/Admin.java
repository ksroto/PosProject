package com.posproject.jspweb.entity;

public class Admin {
	private String id;
	private String Password;
	
	//------------생성자
	
	
	// ----------기본 생성자
	public Admin() {
		
	}

	//----------변수 들어간 생성자
	
	public Admin(String id,String Password) {
		this.id = id;
		this.Password = Password;
	}
	
	
	//게터세터
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	} 
	
	
}
