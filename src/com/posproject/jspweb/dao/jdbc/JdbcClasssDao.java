package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.ClasssDao;
import com.posproject.jspweb.entity.Classs;

public class JdbcClasssDao implements ClasssDao {

	@Override
	public int insert(Classs classs) {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO Class (" + 
			 		"    id" + 
				 
			 		") VALUES("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, classs.getId());
				

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
		 String sql = "DELETE  Classs WHERE ID=?"; 
		
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
	public int update(Classs classs) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  admin SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, classs.getId());
				

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
	public Classs get(String id) {
		// TODO Auto-generated method stub
				 String sql = "SELECT * FROM classs WHERE ID=?";
				 Classs classs = null;
				 
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
							classs = new Classs(
									rs.getString("id")
				
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
				return classs;
			}
	

	@Override
	public List<Classs> getList() {
		// TODO Auto-generated method stub
String sql = "SELECT * FROM Classs";
		
		
		//list?�� answerisview 값을 ???��?���? ?��?�� �?�?
		List<Classs> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
			PreparedStatement st = con.prepareStatement(sql);
			 //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
			
			//?��료형 ?��치시?���? 
			Classs classs = null;
			
			while(rs.next())
			{
				classs = new Classs(
						rs.getString("id")
						
						);
				
				//list?�� �??��?���? 추�?
				list.add(classs);
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