package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.AskDao;
import com.posproject.jspweb.entity.Ask;

public class JdbcAskDao implements AskDao {

	@Override
	public int insert(Ask ask) {
		
			 String sql = "INSERT INTO ask (" + 
				 		"    id," + 
				 		"    Title," + 
				 		"    Contents," +
				 		"    Seller_Id" + 				 		
				 		
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
						st.setString(1, ask.getId());
						st.setString(2, ask.getTitle());
						st.setString(3, ask.getContents());
						st.setString(4, ask.getSellerId());
						
										
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
				 String sql = "DELETE  Ask WHERE ID=?"; 
					
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
	public int update(Ask ask) {
		// TODO Auto-generated method stub
				 String sql = "UPEATE  ask SET password (" + 
						 	
					 		") VALUES ("
					 		+ "?)";
					 
					 int result = 0;
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							
							String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
							Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
							PreparedStatement st = con.prepareStatement(sql);
							
						
							st.setString(1, ask.getId());
							st.setString(2, ask.getTitle());
							st.setString(3, ask.getContents());
							st.setString(4, ask.getSellerId());

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
	public Ask get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM ask WHERE ID=?";
		 Ask ask = null;
			 
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
						ask = new Ask(
								rs.getString("id"),
								rs.getString("Title"),
								rs.getString("Contents"),
								rs.getString("Seller_Id")
								
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
			return ask;
	}

	@Override
	public List<Ask> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Ask";
		
		
		//list?óê answerisview Í∞íÏùÑ ???û•?ïòÍ∏? ?úÑ?ïú Ï§?Îπ?
		List<Ask> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
			PreparedStatement st = con.prepareStatement(sql);
			 //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
			
			//?ûêÎ£åÌòï ?ùºÏπòÏãú?Ç§Í∏? 
			Ask ask = null;
			
			while(rs.next())
			{
				ask = new Ask(
						rs.getString("id"),
						rs.getString("Title"),
						rs.getString("Contents"),
						rs.getString("SellerId")
						
						);
				
				//list?óê Í∞??†∏?ò®Í∞? Ï∂îÍ?
				list.add(ask);
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
