package com.posproject.jspweb.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.posproject.jspweb.dao.RankDao;
import com.posproject.jspweb.entity.Rank;


public class JdbcRankDao implements RankDao {

	@Override
	public int insert(Rank rank) {
		 String sql = "INSERT INTO Rank (" + 
			 		"    id," + 
			 		"    RankRange," + 
			 		"    Benefit," +
			 		"    Ranks," + 
			 		"    RankId" + 
			 		
			 		") VALUES("
			 		+ "?,?,?,?,?)";
			 System.out.println("D");
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
					//st.setString(1, Rankis.getId());
					st.setString(1, rank.getId());
					st.setString(2, rank.getRankRange());
					st.setString(3, rank.getBenefit());
					st.setString(4, rank.getRanks());
					st.setString(5, rank.getRankId());
									
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
		 String sql = "DELETE  Rank WHERE ID=?"; 
			
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
	public int update(Rank rank) {
		// TODO Auto-generated method stub
		 String sql = "UPEATE  Rank SET password (" + 
				 	
			 		") VALUES ("
			 		+ "?)";
			 
			 int result = 0;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
					Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
					PreparedStatement st = con.prepareStatement(sql);
					
				
					st.setString(1, rank.getId());
					st.setString(2, rank.getRankRange());
					st.setString(3, rank.getBenefit());
					st.setString(4, rank.getRanks());
					st.setString(5, rank.getRankId());

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
	public Rank get(String id) {
		// TODO Auto-generated method stub
		 String sql = "SELECT * FROM Rank WHERE ID=?";
		 Rank rank = null;
			 
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
						rank = new Rank(
								rs.getString("id"),
								rs.getString("RankRange"),
								rs.getString("Benefit"),
								rs.getString("Ranks"),
								rs.getString("RankId")
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
			return rank;
	}

	@Override
	public List<Rank> getList() {
		// TODO Auto-generated method stub
	String sql = "SELECT * FROM Rank";
		
		
		//list?�� Rankisview 값을 ???��?���? ?��?�� �?�?
		List<Rank> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
			//쿼리문을 물음?���? ?��?��?��?�� preparedstatement ?��?��
			PreparedStatement st = con.prepareStatement(sql);
			 //?��료형?�� ?��?��?�� ?��?��?��?�� ?��?���? ?��?���?
			
			
			ResultSet rs = st.executeQuery(); //prepared ?��?��?�� resultset?��?�� sql ?��?�� x
			
			//?��료형 ?��치시?���? 
			Rank rank = null;
			
			while(rs.next())
			{
				rank = new Rank(
						rs.getString("id"),
						rs.getString("RankRange"),
						rs.getString("Benefit"),
						rs.getString("Ranks"),
						rs.getString("RankId")
						);
				
				//list?�� �??��?���? 추�?
				list.add(rank);
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
