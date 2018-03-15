package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.SellerInformationDao;
import com.posproject.jspweb.entity.SellerInformation;

public class JdbcSellerInformationDao  implements SellerInformationDao {

   @Override
   public int insert(SellerInformation sellerInformation) {
       String sql = "INSERT INTO seller_Information (" + 
                "    id," + 
                "    Store_Name," + 
                "    Password," + 
                "    Period," +
                "    Admin_Id" + 
                
                ") VALUES("
                + "?,?,?,?,?)";
      
          int result = 0;
            try {
               Class.forName("oracle.jdbc.driver.OracleDriver");
               
               String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
               Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
               PreparedStatement st = con.prepareStatement(sql);
               
               //st.setString(1, SellerInformationis.getId());
               st.setString(1, sellerInformation.getId());
               st.setString(2, sellerInformation.getStoreName());
               st.setString(3, sellerInformation.getPassword());
               st.setInt(4, sellerInformation.getPeriod());               
               st.setString(5, sellerInformation.getAdminId());
                           
               result = st.executeUpdate();
               
               st.close();
               con.close(); 
               
            } catch (ClassNotFoundException e) 
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } catch (SQLException e) 
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            } 
            


         return result;
   }

   @Override
   public int delete(String id) {
      // TODO Auto-generated method stub
       String sql = "DELETE  sellerInformation WHERE ID=?"; 
         
       int result = 0;
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
            Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
            PreparedStatement st = con.prepareStatement(sql);
            
         
            st.setString(1, id);
            

            result = st.executeUpdate();
            
            st.close();
            con.close(); 
            
         } catch (ClassNotFoundException e) 
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (SQLException e) 
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } 

      return result;
   }

   @Override
   public int update(SellerInformation sellerInformation) {
      // TODO Auto-generated method stub
             String sql = "UPEATE  SellerInformation SET password (" + 
                      
                      ") VALUES ("
                      + "?)";
                
                int result = 0;
                  try {
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                     
                     String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
                     Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
                     PreparedStatement st = con.prepareStatement(sql);
                     
                  
                     st.setString(1, sellerInformation.getId());
                     st.setString(2, sellerInformation.getStoreName());
                     st.setString(3, sellerInformation.getPassword());
                     st.setInt(4, sellerInformation.getPeriod());               
                     st.setString(5, sellerInformation.getAdminId());
                     
                     result = st.executeUpdate();
                     
                     st.close();
                     con.close(); 
                     
                  } catch (ClassNotFoundException e) 
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } catch (SQLException e) 
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } 

               return result;
         }

   @Override
   public SellerInformation get(String id) {
      // TODO Auto-generated method stub
             String sql = "SELECT * FROM Seller_Information WHERE ID=?";
             SellerInformation sellerInformation = null;
                
                  try {
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                     
                     String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
                     Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
                     //쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
                     PreparedStatement st = con.prepareStatement(sql);
                     st.setString(1, id); //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
                     
                     ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
                     
                     
                     
                     if(rs.next())
                     {
                        sellerInformation = new SellerInformation(
                              rs.getString("id"),
                              rs.getString("Store_Name"),
                              rs.getString("Password"),
                              rs.getInt("Period"),                              
                              rs.getString("Admin_Id")
                              );
                     }
                     
                     rs.close();
                     st.close();
                     con.close(); 
                     
                  } catch (ClassNotFoundException e) 
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } catch (SQLException e) 
                  {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
                  } 
               return sellerInformation;
         }

   

   @Override
   public List<SellerInformation> getList() {
      // TODO Auto-generated method stub
      String sql = "SELECT * FROM Seller_Information";
         
         
         //list?�� answerisview 값을 ???��?���? ?��?�� �?�?
         List<SellerInformation> list = new ArrayList<>();
         
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
            Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
            //쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
            PreparedStatement st = con.prepareStatement(sql);
             //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
            
            
            ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
            
            //?��료형 ?��치시?���? 
            SellerInformation sellerInformation = null;
            
            while(rs.next())
            {
               sellerInformation = new SellerInformation(
                     rs.getString("id"),
                     rs.getString("Store_Name"),
                     rs.getString("Password"),
                     rs.getInt("Period"),                              
                     rs.getString("Admin_Id")
                     );
               
               //list?�� �??��?���? 추�?
               list.add(sellerInformation);
            }
         
            
         
            rs.close();
            st.close();
            con.close(); 
            
         } catch (ClassNotFoundException e) 
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } catch (SQLException e) 
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         } 
         
         //list?�� 반환
         return list;
      }

   }