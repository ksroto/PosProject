
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Menu</title>
		<link href= "../CSS/style.css"  type="text/css" rel="stylesheet" />
		<script src="../js/Revenue.js"></script>
</head>
<body>
	<header id="header">
			<div class="top">
				<img src="../images/vpos_icon.png"  />
			
				<a href ="#" >
				<div class="topNav" id="close-btn">
					<img src="../images/main_close.png"  />
				</div> </a>
				
				<a href ="#" >
				<div class="topNav">
					<img src="../images/main_minimize.png"  />
				</div></a>
				
				<a href ="../Login/login.jsp" >
				<div class="topNav">
					<img src="../images/main_back.png"  />
				</div></a>
				
				<a href ="#" >
				<div class="topNav">
					<h5>Admin</h5> 
				</div> </a>
			</div>
		</header>
		
		<main>
			<div class="visual">
			</div>
			<div class="container">
			 
				<div class="chat" id="chat-Button">
					<a href ="https://open.kakao.com/o/s0u0Z7I" target="_blank">
						<img src="../images/main_talk.png"  />
					</a>
				</div>
				 
				 <div class="allbox">
				 
					<a href ="sale.jsp">
					<div class="box" >
						<span class=""><i></i></span>
						<img src="../images/main_computer.png"  />
						<h3>판매관리</h3>
					</div>
					</a>
					
					<a href ="members.jsp">
					<div class="box ">	
						<img src="../images/main_member.png" />
						<h3>회원관리</h3>
					</div>
					</a>
					
					<a href ="detail.jsp">
					<div class="box" >
					<img src="../images/main_level.png" />
					<h3>등급관리</h3>
					</div>
					</a>
					
					<a href ="select.jsp">
					<div class="box ">	
					<img src="../images/main_sales.png" />
					<h3>매출현황</h3>
					</div>
					</a>
					
					<a href ="information.jsp">
					<div class="box">	
					<img src="../images/main_information.png" />
					<h3>정보변경</h3>
					</div>
					</a>
				</div>
			</div>	
		</main>
		<footer>		
			<div class="footer">
			<img src="../images/vpos_icon.png"  />
				<div class="inf">
					<h5>
					회사정보
					주소: 서울특별시 마포구 월드컵북로 21, 2층 D반(서교동, 풍성빌딩) / 관리자메일: admin33@vpos.com 
					사업자 등록번호: 816-14-000286  / 통신 판매업 신고제: 2018-서울강서-0989 호  
					<p>
					상호: VPOS / 대표: 강신강   / 전화번호: 070-7676-4784 
					Copyright ⓒvpos.com 2018-2020 All Right Reserved. Contact admin@vpos.com for more information
					</h5>
				</div>
			</div>
		</footer>
</body>
</html>