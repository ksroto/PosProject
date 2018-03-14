package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.SellerDao;
import com.posproject.jspweb.entity.Seller;


public class JdbcSellerDao implements SellerDao  {

	@Override
	public int insert(Seller seller) {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO Seller (" + 
			 		"    id," + 
			 		"   password" + 
			 	
			 		") VALUES("
			 		+ "?,?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, seller.getId());
					st.setString(2, seller.getSellerId());

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
		 String sql = "DELETE  Seller WHERE ID=?"; 
		
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
	public int update(Seller seller)
	{
		 String sql = "UPEATE  Seller SET password (" + 
			 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, seller.getId());
					st.setString(2, seller.getSellerId());

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
	public Seller get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Seller WHERE ID=?";
		Seller seller = null;
		 
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
					seller = new Seller(
							rs.getString("id"),
							rs.getString("sellseId")
							
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
			
			
		
		return seller;
	}

	

	@Override
	public List<Seller> getList() {
		String sql = "SELECT * FROM Seller";
		
		
		//list?óê answerisview Í∞íÏùÑ ???û•?ïòÍ∏? ?úÑ?ïú Ï§?Îπ?
		List<Seller> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
			PreparedStatement st = con.prepareStatement(sql);
			 //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
			
			//?ûêÎ£åÌòï ?ùºÏπòÏãú?Ç§Í∏? 
			Seller seller = null;
			
			while(rs.next())
			{
				seller = new Seller(
						rs.getString("id"),
						rs.getString("sellseId")
						);
				
				//list?óê Í∞??†∏?ò®Í∞? Ï∂îÍ?
				list.add(seller);
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
