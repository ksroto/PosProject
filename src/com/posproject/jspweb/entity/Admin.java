package com.posproject.jspweb.entity;

public class Admin {
	private String id;
	private String Password;
	
	//------------������
	
	
	// ----------�⺻ ������
	public Admin() {
		
	}

	//----------���� �� ������
	
	public Admin(String id,String Password) {
		this.id = id;
		this.Password = Password;
	}
	
	
	//���ͼ���
	
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
