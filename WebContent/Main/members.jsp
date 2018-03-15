<%@page import="com.posproject.jspweb.dao.jdbc.JdbcMemberDao"%>
<%@page import="com.posproject.jspweb.dao.MemberDao"%>
<%@page import="com.posproject.jspweb.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
  <%
  
  Member aa = new Member();
  Member bb = new Member();
  
  MemberDao member = new JdbcMemberDao(); 
  aa= member.get("b"); 
  bb = member.get("a");
  
  System.out.println(aa.getName());
  %>
  
  <%--  
  <%
	  Member aa = new Member("b","ksr",55,"a","a","a");
	  
	  MemberDao member = new JdbcMemberDao(); 
	  member.insert(aa);
  %> --%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보</title>
		<link href= "../CSS/style3.css"  type="text/css" rel="stylesheet" />
</head>
<body>
	<header class="header">

<img src = "../images/Logo.png">

<div class="box">
<div class = " box-b"><a href = ""  ><img  class = "img-1"src = "../images/close.png" > </a></div>
</div>

<div class="box">
<div class = " box-b"><a href = ""><img class = "img-1" src = "../images/small.png" > </a></div>
</div>

<div class="box">
<div class = " box-b"><a href = "menu.jsp" ><img class = "img-1" src = "../images/back .png" > </a></div>
</div>

<div class="box">
<div class = "box-c"><a href = "" >Admin</a></div>
</div>

</header>
<!-- ------------------------------------------------------------------------ -->

<main>

<div class = "left-top">
</div>
<div class="box3">
</div>
<div>

<p class = "member-1"> <img class = "img-hm" src = "../images/human.png"> 회원 관리 </p>
</div>

<div class="box1">
		<table   class = "member-box">
						<tr class = "member-tr">
							<td> </td>
							<td>이름</td>
							<td>등 급</td>
							<td>전화 번호</td>
							<td>현재 쿠폰</td>
						</tr>
						<tr>
							<td class = "mamber-td">1</td>
							<td><%=aa.getName() %></td>
							<td><%=aa.getRankId() %></td>
							<td><%=aa.getTel() %></td>
							<td><%=aa.getNumberOfCoupon() %></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">2</td>
							<td><%=bb.getName() %></td>
							<td><%=bb.getRankId() %></td>
							<td><%=bb.getTel() %></td>
							<td><%=bb.getNumberOfCoupon() %></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">3</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">4</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">5</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">6</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">7</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">8</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">9</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							
						</tr>
						<tr>
							<td class = "mamber-td">10</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
			
		</table>
					
				<div class = "box-select">
					
					<div>	
					<button class="select">  <!-- 우측하단 버튼 -->
						정보 수정
					</button>
					</div>
					
					<div>	
					<button class="select1"> <!--  우측하단 버튼 -->
						정보 삭제
					</button>	
					</div>
					
						<div>	
					<button class="select2"> <!--  우측하단 버튼 -->
						회원 검색
					</button>	
					</div>
					
				</div>
	   
</div>	


</main>
<!--footer-------------------------------------  -->
<footer id = "footer">
	<img src = "../images/Logo.png">
		<div class="root-container">
				회사정보
               주소: 서울특별시 마포구 월드컵북로 21, 2층 D반(서교동, 풍성빌딩) / 관리자메일: admin33@vpos.com<br> 
               사업자 등록번호: 816-14-000286  / 통신 판매업 신고제: 2018-서울강서-0989 호  <br>
             
               상호: VPOS / 대표: 강신강   / 전화번호: 070-7676-4784<br> 
               Copyright ⓒvpos.com 2018-2020 All Right Reserved. Contact admin@vpos.com for more information
		</div>
</footer>
</body>
</html>