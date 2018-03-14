package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.DiscountDao;
import com.posproject.jspweb.entity.Discount;

public class JdbcDiscountDao implements DiscountDao {

	@Override
	public int insert(Discount discount) {
		
			 String sql = "INSERT INTO answer (" + 
				 		"    id," + 
				 		"    Type," + 
				 		"    DiscountPrice," +
				 		"    DiscountId" + 				 		
				 		
				 		") VALUES("
				 		+ "?,?,?,?)";
				 System.out.println("D");
				 int result = 0;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						
						String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
						Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
						PreparedStatement st = con.prepareStatement(sql);
						
						//st.setString(1, answeris.getId());
						st.setString(1, discount.getId());
						st.setString(2, discount.getType());
						st.setString(3, discount.getDiscountPrice());
						st.setString(4, discount.getDiscountId());
						
										
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
				 String sql = "DELETE  discount WHERE ID=?"; 
					
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
	public int update(Discount discount) {
		// TODO Auto-generated method stub
				 String sql = "UPEATE  Answer SET password (" + 
						 	
					 		") VALUES ("
					 		+ "?)";
					 
					 int result = 0;
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							
							String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
							Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
							PreparedStatement st = con.prepareStatement(sql);
							
						
							st.setString(1, discount.getId());
							st.setString(2, discount.getType());
							st.setString(3, discount.getDiscountPrice());
							st.setString(4, discount.getDiscountId());

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
	public Discount get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM answer WHERE ID=?";
		 Discount discount = null;
			 
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
						discount = new Discount(
								rs.getString("id"),
								rs.getString("Type"),
								rs.getString("DiscountPrice"),
								rs.getString("DiscountId")
								
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
			return discount;
	}

	@Override
	public List<Discount> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Discount";
		
		
		//list?�� answerisview 값을 ???��?���? ?��?�� �?�?
		List<Discount> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
			PreparedStatement st = con.prepareStatement(sql);
			 //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
			
			//?��료형 ?��치시?���? 
			Discount discount = null;
			
			while(rs.next())
			{
				discount = new Discount(
						rs.getString("id"),
						rs.getString("Type"),
						rs.getString("DiscountPrice"),
						rs.getString("DiscountId")
						);
				
				//list?�� �??��?���? 추�?
				list.add(discount);
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
