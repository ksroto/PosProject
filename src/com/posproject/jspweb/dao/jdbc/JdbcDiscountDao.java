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
					//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, id); //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
					
					ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
					
					
					
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
		
		
		//list?óê answerisview Í∞íÏùÑ ???û•?ïòÍ∏? ?úÑ?ïú Ï§?Îπ?
		List<Discount> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
			PreparedStatement st = con.prepareStatement(sql);
			 //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
			
			//?ûêÎ£åÌòï ?ùºÏπòÏãú?Ç§Í∏? 
			Discount discount = null;
			
			while(rs.next())
			{
				discount = new Discount(
						rs.getString("id"),
						rs.getString("Type"),
						rs.getString("DiscountPrice"),
						rs.getString("DiscountId")
						);
				
				//list?óê Í∞??†∏?ò®Í∞? Ï∂îÍ?
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
		
		//list?óê Î∞òÌôò
		return list;
	}
}
