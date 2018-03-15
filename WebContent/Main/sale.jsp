<%@page import="com.posproject.jspweb.dao.jdbc.JdbcMenuDao"%>
<%@page import="com.posproject.jspweb.dao.MenuDao"%>
<%@page import="com.posproject.jspweb.entity.Menu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
  <%
  
  Menu aa = new Menu();
  Menu bb = new Menu();
  
  MenuDao menu = new JdbcMenuDao(); 
  aa= menu.get("a"); 
  bb = menu.get("b"); 
  System.out.println(aa.getName());
  %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pos-main</title>
		<link href= "../CSS/style2.css"  type="text/css" rel="stylesheet" />
	<script src="../js/Revenue.js"></script>
</head>
<body>
	<div class="wrapper">
		
		<header>
			<div id="v-logo">
				<div><img class="v-logo-img"src="../images/vpos_icon.png"/></div>
			</div>
			<nav id="topNav">
				<ul>
					<li><a href="#" class="lh-65">admin</a></li>
					<li><a href="menu.jsp"><img src="../images//main_back.png"/></a></li>
					<li><a href="#"><img src="../images/main_minimize.png"/></a></li>
					<li><a href="#"><img src="../images/main_close.png"/></a></li>
				</ul>
			</nav>
			
		</header>
	
		<div class="top-sub"></div>
		<div class="content_box">
		
		
		<div style="float:left">
			<div class="menu_list">
				<table class="menu-list-t">
				<colgroup>
					<col="15%">
					<col="10%">
					<col="7%">
					<col="15%">
					<col="10%">
					<col="7%">					
				</colgroup>
				    <thead>
				    <tr>
				        <th scope="cols">상품명칭</th>
				        <th scope="cols">판매단가</th>
				        <th scope="cols">수량</th>
				        <th scope="cols">판매금액</th>
				        <th scope="cols">할인금액</th>
				        <th scope="cols">구분</th>
				    </tr>
				    </thead>
				    <tbody>
				    <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				    <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				    <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				      <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				      <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				      <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				      <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				           <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				           <tr class="even">
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>
				       <tr>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				        <td>1</td>
				    </tr>		    
				    </tbody>
				</table>
				
				<div class="calculate-left">
				<form class="take" >
					<label class="label-sm-gray">총매출액</label>
					<input class=""  type="text" name="">
				</form>
				
				<form class="take">
					<label class="label-sm-gray">매출할인</label>
					<input class=""  type="text" name="">
				</form>
				
				<form class="take">
					<label class="label-sm-gray">받은금액</label>
					<input class=""  type="text" name="">
				</form>
			</div>
			
			<div class="calculate-right">
				<form>
					<input class="take2"  type="text" name="">
				</form>
				
				<form>
					<input class="take2"  type="text" name="">
				</form>
			</div>
			
			<div class="messege-box" >
				<form class="messege-form" >
					<label><span>messege :</span></label>
					<input class="m-text-box"  type="text" name="" placeholder="메세지를 입력하삼">
				</form>
			</div>
			
		</div>
			
		<!-- -----------------------messege------------------------------------------------ -->
			
			
		
			
		<!-- ------------------------messege----------------------------------------------- -->	
		</div>
		
		<!-- -----------------------메뉴 목록창------------------------------------------ -->
		<div style="float:right">
		<div class="details" >
		
			<div class="menu_table">
				<div class="coffe-menu">
					<button type="button" class="" ><%=aa.getName() %><P></p><%=aa.getPrice()%>원</button>
					<button type="button" class=""><%=bb.getName() %><P></p><%=bb.getPrice() %>원</button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
			</div>
				<div class="coffe-menu">
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
				</div>
			
				<div class="shake-menu">
					<button type="button" class="">아이스티<br>2000원</button>
					<button type="button" class="">망고스무디<br>2500원</button>
					<button type="button" class="">버블티<br>3000원</button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
				</div>
				<div class="shake-menu">
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
				</div>
				
				<div class="dessert-menu">
				<button type="button" class="">티라미수<br>4500원</button>
					<button type="button" class="">딸기케이크<br>4500원</button>
					<button type="button" class="">머랭쿠키<br>1500원</button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>					
				</div>
				
				<div class="dessert-menu">					
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
					<button type="button" class=""></button>
				</div>
				
				<div class="other-menu">
					<button type="button" class="">Hot<br>0원</button>
					<button type="button" class="">Cold<br>0원</button>
					<button type="button" class="">Take out<br>-500원</button>
					<button type="button" class="">샷추가<br>500원</button>
					<button type="button" class="">시럽추가<br>500원</button>				
				</div>

							
			</div>
			
			
   			
		
<!-- 키패드-------------------------------------------------------------------------- -->		
					
		<div class="container">
			<div class="calculator-container" style="width: 530px;float: right;">
			  <div class="display">   
			    <p></p>
			  </div>
			
			  <div class="key-pad">
			    <div class="first-row">
			  
			    </div>
			    <div class="second-row">
			      <button id="7">7</button>
			      <button id="8">8</button>
			      <button id="9">9</button>
			      <button id="divide">Bs</button>
			    </div>
			    <div class="third-row">
			      <button id="4">4</button>
			      <button id="5">5</button>
			      <button id="6">6</button>
			      <button id="times">Cls</button>
			    </div>
			    <div class="fourth-row">
			      <button id="1">1</button>
			      <button id="2">2</button>
			      <button id="3">3</button>
			      <button id="minus">Ent</button>
			    </div>
			    <div class="fifth-row">
			      <button id="0">0</button>
			      <button id="period">00</button>
			      <button id="equals">000</button>
			      <button id="plus"></button>
			    </div>
			  </div>
			</div>
		
			<div class="menu-btn">
   				<button class="sm-btn" id>메뉴취소</button>
   				<button type="button" class="sm-btn">쿠폰적립</button>
   				<button type="button"  class="sm-btn">할     인</button>
   				<button type="button"  class="sm-btn">메뉴추가</button>
   				<button type="button"  class="sm-btn" >메뉴삭제</button>
   				<button type="button" class="sm-btn">회원등록</button>
   				<button type="button" class="m-btn">현금결제</button>
   				<button type="button" class="m-btn">카드결제</button>   				
   			</div>
   			
   
			
			
<!------------------------ 메뉴버튼 끝 --------------------------------------->
			

			</div>
	
		
		
		
		<footer></footer>
	</div>
</body>
</html>