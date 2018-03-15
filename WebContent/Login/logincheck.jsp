<%@ page language="java" 
    contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.sql.*"%>
<%
    request.setCharacterEncoding("euc-kr");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
			<title>Insert title here</title>
			<link href= "../CSS/login.css"  type="text/css" rel="stylesheet" />
	</head>
	<body>
 <%
    try {
        // 드라이버 로딩
        String driver = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        
        // 관리자 Login
       String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
       
        String id = "c##vpos";
        String pw = "vksk";
        
        // 연결
        Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
        
         // sql 구사
         // 전 페이지인 LOGIN.jsp input에 입력한 값들을 변수에 담는다
         String Id= request.getParameter("input_id");
         String password= request.getParameter("input_password");
         
        Statement st = con.createStatement();
        // 내가 입려한 id와 pw 값이 DB안에 있는지 확인한다
        String sql = "SELECT * FROM SELLER_INFORMATION WHERE ID='" + Id + "' AND PASSWORD='" + password + "'";
        st.executeUpdate(sql);
        ResultSet rs = st.executeQuery(sql);
        
        // isLogin 은 로그인 확인 유무를 위한 변수
        Boolean isLogin = false;
        while(rs.next()) {
            // rs.next가 true 라면 = 정보가 있다
            isLogin = true;
        }
        
        // DB에 내가 적은 정보가 있다면
        if(isLogin) {
            // 지금 로그인할 id와 pw를 session에 저장하고
            session.setAttribute("id", Id); 
            session.setAttribute("password",password);
            // 첫 페이지로 돌려보낸다
            response.sendRedirect("login.jsp");    
        } else {
            // DB에 내가적은 정보가 없다면 경고창을 띄워준다
            %> <script> alert("로그인 실패"); history.go(-1); </script> <%            
        }
        
        
    } catch (Exception e) {       
        out.println("DB 연동 실패");
    }
    %>
 
</body>
</html>
