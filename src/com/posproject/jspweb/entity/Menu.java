package com.posproject.jspweb.entity;


	public class Menu {
		private String id;
		private String Name; 
		private int Price; 
		private String MenuId; 
		private String DivisionId;
		
		//------------?Éù?Ñ±?ûê
		
		
		// ----------Í∏∞Î≥∏ ?Éù?Ñ±?ûê
		public Menu() {
			
		}

		//----------Î≥??àò ?ì§?ñ¥Í∞? ?Éù?Ñ±?ûê
		
		public Menu(String id,String Name,int Price,String MenuId,String DivisionId) {
			this.id = id;
			this.Name = Name;
			this.Price = Price;
			this.MenuId = MenuId;
			this.DivisionId = DivisionId;
		}
		//Í≤åÌÑ∞?Ñ∏?Ñ∞

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getPrice() {
			return Price;
		}

		public void setPrice(int price) {
			Price = price;
		}

		public String getMenuId() {
			return MenuId;
		}

		public void setMenuId(String menuId) {
			MenuId = menuId;
		}

		public String getDivisionId() {
			return DivisionId;
		}

		public void setDivisionId(String divisionId) {
			DivisionId = divisionId;
		}
		
}
