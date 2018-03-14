package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.SalesDao;
import com.posproject.jspweb.entity.Sales;



public class JdbcSalesDao implements SalesDao{

	@Override
	public int insert(Sales sales) {
		 String sql = "INSERT INTO Sales (" + 
			 		"    id," + 
			 		"    ProductName," + 
			 		"    Price," +
			 		"    Time," + 
			 		"    Payment," + 
			 		"    PointCheck" +
			 		"    TimeId" +
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?,?,?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Salesis.getId());
					st.setString(1, sales.getId());
					st.setString(2, sales.getProductName());
					st.setString(3, sales.getPrice());
					st.setString(4, sales.getTime());
					st.setString(5, sales.getPayment());
					st.setString(6, sales.getPointCheck());
					st.setString(7, sales.getTimeId());
									
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
		 String sql = "DELETE  Sales WHERE ID=?"; 
			
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
	public int update(Sales sales) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  Sales SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, sales.getId());
					st.setString(2, sales.getProductName());
					st.setString(3, sales.getPrice());
					st.setString(4, sales.getTime());
					st.setString(5, sales.getPayment());
					st.setString(6, sales.getPointCheck());
					st.setString(7, sales.getTimeId());

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
	public Sales get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Sales WHERE ID=?";
		 Sales sales = null;
			 
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
						sales = new Sales(
								rs.getString("id"),
								rs.getString("ProductName"),
								rs.getString("Price"),
								rs.getString("Time"),
								rs.getString("Payment"),
								rs.getString("PointCheck"),
								rs.getString("TimeId")
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
			return sales;
	}

	@Override
	public List<Sales> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Sales";
		
		
		//list?óê Salesisview Í∞íÏùÑ ???û•?ïòÍ∏? ?úÑ?ïú Ï§?Îπ?
		List<Sales> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
			PreparedStatement st = con.prepareStatement(sql);
			 //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
			
			//?ûêÎ£åÌòï ?ùºÏπòÏãú?Ç§Í∏? 
			Sales sales = null;
			
			while(rs.next())
			{
				sales = new Sales(
						rs.getString("id"),
						rs.getString("ProductName"),
						rs.getString("Price"),
						rs.getString("Time"),
						rs.getString("Payment"),
						rs.getString("PointCheck"),
						rs.getString("TimeId")
						);
				
				//list?óê Í∞??†∏?ò®Í∞? Ï∂îÍ?
				list.add(sales);
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