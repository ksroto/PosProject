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
        // ����̹� �ε�
        String driver = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driver);
        
        // ������ Login
       String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
       
        String id = "c##vpos";
        String pw = "vksk";
        
        // ����
        Connection con = DriverManager.getConnection(url, "c##vpos","vksk");
        
         // sql ����
         // �� �������� LOGIN.jsp input�� �Է��� ������ ������ ��´�
         String Id= request.getParameter("input_id");
         String password= request.getParameter("input_password");
         
        Statement st = con.createStatement();
        // ���� �Է��� id�� pw ���� DB�ȿ� �ִ��� Ȯ���Ѵ�
        String sql = "SELECT * FROM SELLER_INFORMATION WHERE ID='" + Id + "' AND PASSWORD='" + password + "'";
        st.executeUpdate(sql);
        ResultSet rs = st.executeQuery(sql);
        
        // isLogin �� �α��� Ȯ�� ������ ���� ����
        Boolean isLogin = false;
        while(rs.next()) {
            // rs.next�� true ��� = ������ �ִ�
            isLogin = true;
        }
        
        // DB�� ���� ���� ������ �ִٸ�
        if(isLogin) {
            // ���� �α����� id�� pw�� session�� �����ϰ�
            session.setAttribute("id", Id); 
            session.setAttribute("password",password);
            // ù �������� ����������
            response.sendRedirect("login.jsp");    
        } else {
            // DB�� �������� ������ ���ٸ� ���â�� ����ش�
            %> <script> alert("�α��� ����"); history.go(-1); </script> <%            
        }
        
        
    } catch (Exception e) {       
        out.println("DB ���� ����");
    }
    %>
 
</body>
</html>
