package com.posproject.jspweb.entity;

import java.util.Date;

public class SellerInformation {
   private String id;
   private String StoreName; 
   private String Password; 
   private int Period;    
   private String AdminId;
   
   //------------?��?��?��
   
   
   // ----------기본 ?��?��?��
   public SellerInformation() {
      
   }

   //----------�??�� ?��?���? ?��?��?��
   
   public SellerInformation(String id,String StoreName,String Password,int Period,String AdminId) {
      this.id = id;
      this.StoreName = StoreName;
      this.Password = Password;
      this.Period = Period;      
      this.AdminId = AdminId;
   }
   
   //게터?��?��
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }
   
   public String getStoreName() {
      return StoreName;
   }

   public void setStoreName(String storeName) {
      StoreName = storeName;
   }

   public String getPassword() {
      return Password;
   }

   public void setPassword(String password) {
      Password = password;
   }

   public int getPeriod() {
      return Period;
   }

   public void setPeriod(int period) {
      Period = period;
   }

   public String getAdminId() {
      return AdminId;
   }

   public void setAdminId(String adminId) {
      AdminId = adminId;
   }

   

}