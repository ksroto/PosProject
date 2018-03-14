package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.AnswerDao;
import com.posproject.jspweb.entity.Answer;



public class JdbcAnswerDao implements AnswerDao{

	
	@Override
	public int insert(Answer answer) {
		 String sql = "INSERT INTO answer (" + 
			 		"    id," + 
			 		"    Store_Name," + 
			 		"    Title," +
			 		"    Contents," + 
			 		"    Seller_Id" + 
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?)";
			 System.out.println("D");
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, answeris.getId());
					st.setString(1, answer.getId());
					st.setString(2, answer.getStoreName());
					st.setString(3, answer.getTitle());
					st.setString(4, answer.getContents());
					st.setString(5, answer.getSellerId());
									
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
		 String sql = "DELETE  answer WHERE ID=?"; 
			
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
	public int update(Answer answer) {
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
					
				
					st.setString(1, answer.getId());
					st.setString(2, answer.getStoreName());
					st.setString(3, answer.getTitle());
					st.setString(4, answer.getContents());
					st.setString(5, answer.getSellerId());

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
	public Answer get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM answer WHERE ID=?";
		 Answer answer = null;
			 
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					//�������� ����ǥ�� �����ҽ� preparedstatement ���
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, id); //�ڷ����� ���� �ԷµǴ� ���°� �޶���
					
					ResultSet rs = st.executeQuery(); //prepared ���� resultset���� sql ��� x
					
					
					
					if(rs.next())
					{
						answer = new Answer(
								rs.getString("id"),
								rs.getString("StoreName"),
								rs.getString("Title"),
								rs.getString("Contents"),
								rs.getString("SellerId")
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
			return answer;
	}

	@Override
	public List<Answer> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Answer";
		
		
		//list�� answerisview ���� �����ϱ� ���� �غ�
		List<Answer> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//�������� ����ǥ�� �����ҽ� preparedstatement ���
			PreparedStatement st = con.prepareStatement(sql);
			 //�ڷ����� ���� �ԷµǴ� ���°� �޶���
			
			
			ResultSet rs = st.executeQuery(); //prepared ���� resultset���� sql ��� x
			
			//�ڷ��� ��ġ��Ű�� 
			Answer answer = null;
			
			while(rs.next())
			{
				answer = new Answer(
						rs.getString("id"),
						rs.getString("StoreName"),
						rs.getString("Title"),
						rs.getString("Contents"),
						rs.getString("SellerId")
						);
				
				//list�� �����°� �߰�
				list.add(answer);
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
		
		//list�� ��ȯ
		return list;
	}
}
