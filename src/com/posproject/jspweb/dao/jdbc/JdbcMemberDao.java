package com.posproject.jspweb.dao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.MemberDao;
import com.posproject.jspweb.entity.Member;



public class JdbcMemberDao implements MemberDao{

	@Override
	public int insert(Member member) {
		 String sql = "INSERT INTO Member (" + 
			 		"    id," + 
			 		"    Name," + 
			 		"    Number_Of_Coupon," +
			 		"    Tel," + 
			 		"    Rank_Id," + 
			 		"    Member_Id" +
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?,?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Memberis.getId());
					st.setString(1, member.getId());
					st.setString(2, member.getName());
					st.setInt(3, member.getNumberOfCoupon());
					st.setString(4, member.getTel());
					st.setString(5, member.getRankId());
					st.setString(6, member.getMemberId());
									
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
		 String sql = "DELETE  member WHERE ID=?"; 
			
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
	public int update(Member Member) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  Member SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, Member.getId());
					st.setString(2, Member.getName());
					st.setInt(3, Member.getNumberOfCoupon());
					st.setString(4, Member.getTel());
					st.setString(5, Member.getRankId());
					st.setString(6, Member.getMemberId());

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
	public Member get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Member WHERE ID=?";
		 Member member = null;
			 
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
						member = new Member(
								rs.getString("id"),
								rs.getString("Name"),
								rs.getInt("Number_Of_Coupon"),
								rs.getString("Tel"),
								rs.getString("Rank_Id"),
								rs.getString("Member_Id")
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
			return member;
	}

	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Member";
		
		
		//list?�� Memberisview 값을 ???��?���? ?��?�� �?�?
		List<Member> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
			PreparedStatement st = con.prepareStatement(sql);
			 //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
			
			//?��료형 ?��치시?���? 
			Member member = null;
			
			while(rs.next())
			{
				member = new Member(
						rs.getString("id"),
						rs.getString("Name"),
						rs.getInt("Number_Of_Coupon"),
						rs.getString("Tel"),
						rs.getString("Rank_Id"),
						rs.getString("Member_Id")
						);
				
				//list?�� �??��?���? 추�?
				list.add(member);
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