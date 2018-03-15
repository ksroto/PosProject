<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>매출 현황_일</title>
		<link href= "../CSS/style.css"  type="text/css" rel="stylesheet" />
		<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
		<script  src="../js/Revenue.js"></script>	
		<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
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
				
				<a href ="select.jsp" >
				<div class="topNav">
					<img src="../images/main_back.png"  />
				</div></a>
				
				<a href ="#" >
				<div class="topNav">
					<h5>Admin</h5> 
				</div> </a>
			</div>
			
		</header>
		

		
		<main id="main">
		
			<div class="visual">
			</div>
			
			<button id="downloadbutton">
					<img src="../images/down.png"  />   다운로드 
				</button>
			
			
			<!-- 모달창 -->
			<div id="modal">
			    <h3> 다운로드  </h3>
			    <p> 데이터를 다운로드 하시겠습니까? </p>
			    <button id="confirm_button">확인</button>
			    <button id="close_button">취소</button>
			</div>
			
			<div class="payment">			
				<a href="revenue2_day.jsp"><button class="btn btn3">일 </button></a>
				<a href="revenue2_month.jsp"><button class="btn btn7">월</button></a>
				<a href="revenue2_year.jsp"><button class="btn btn2">년</button></a>
			</div>

	<section>
			  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th> 품 목 </th>
          <th> 수 량 </th>
          <th> 결 제 금 액 </th>
          <th> 할 인 금 액 </th>
          <th> 결 제 시 간 </th>
          <th> 결 제 방 법 </th>
        </tr>
      </thead>
    </table>
  </div>
  <div class="tbl-content">
    <table cellpadding="0" cellspacing="0" border="0">
      <tbody>
        <tr>
          <td>아메리카노</td>
          <td>1</td>
          <td>1500</td>
          <td>500</td>
          <td>1000</td>
          <td>2018-01-30 18:48</td>
        </tr>  
        <tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr><tr>
          <td></td>
          <td> </td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </tbody>
    </table>
  </div>
  </section>
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