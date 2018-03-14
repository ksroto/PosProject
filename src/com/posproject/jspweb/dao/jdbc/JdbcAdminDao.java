package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.AdminDao;
import com.posproject.jspweb.entity.Admin;

public class JdbcAdminDao implements   AdminDao{

	@Override
	public int insert(Admin admin) {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO admin (" + 
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
					
				
					st.setString(1, admin.getId());
					st.setString(2, admin.getPassword());

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
		 String sql = "DELETE  admin WHERE ID=?"; 
		
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
	public int update(Admin admin)
	{
		 String sql = "UPEATE  admin SET password (" + 
			 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, admin.getId());
					st.setString(2, admin.getPassword());

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
	public Admin get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM admin WHERE ID=?";
		Admin admin = null;
		 
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
					admin = new Admin(
							rs.getString("id"),
							rs.getString("password")
							
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
			
			
		
		return admin;
	}

	

	@Override
	public List<Admin> getList() {
		String sql = "SELECT * FROM Admin";
		
		
		//list?óê answerisview Í∞íÏùÑ ???û•?ïòÍ∏? ?úÑ?ïú Ï§?Îπ?
		List<Admin> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//ÏøºÎ¶¨Î¨∏ÏùÑ Î¨ºÏùå?ëúÎ°? ?Ñ§?†ï?ï†?ãú preparedstatement ?Ç¨?ö©
			PreparedStatement st = con.prepareStatement(sql);
			 //?ûêÎ£åÌòï?óê ?î∞?ùº?Ñú ?ûÖ?†•?êò?äî ?òï?ÉúÍ∞? ?ã¨?ùºÏß?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?Ç¨?ö©?ãú resultset?óê?Ñú sql ?Ç¨?ö© x
			
			//?ûêÎ£åÌòï ?ùºÏπòÏãú?Ç§Í∏? 
			Admin admin = null;
			
			while(rs.next())
			{
				admin = new Admin(
						rs.getString("id"),
						rs.getString("password")
						);
				
				//list?óê Í∞??†∏?ò®Í∞? Ï∂îÍ?
				list.add(admin);
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

	

