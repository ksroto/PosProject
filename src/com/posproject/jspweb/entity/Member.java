package com.posproject.jspweb.entity;

public class Member {
	private String id;
	private String name; 
	private int numberOfCoupon; 
	private String tel; 
	private String rankId; 
	private String memberId;
	
	//------------------------?Éù?Ñ±?ûê
	
	
		// ----------Í∏∞Î≥∏ ?Éù?Ñ±?ûê
		public Member() {
			
		}
		
		//----------Î≥??àò ?ì§?ñ¥Í∞? ?Éù?Ñ±?ûê
		public Member( String id, String name, int numberOfCoupon, String tel, String rankId, String memberId ) {
			this.id = id;
			this.name = name;
			this.numberOfCoupon = numberOfCoupon;
			this.tel = tel;
			this.rankId = rankId;
			this.memberId = memberId;		
		}
	
	
	
	
		//Í≤åÌÑ∞?Ñ∏?Ñ∞
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfCoupon() {
		return numberOfCoupon;
	}
	public void setNumberOfCoupon(int numberOfCoupon) {
		this.numberOfCoupon = numberOfCoupon;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRankId() {
		return rankId;
	}
	public void setRankId(String rankId) {
		this.rankId = rankId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
}
