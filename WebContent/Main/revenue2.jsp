<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>매출 현황</title>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
		<link href= "../CSS/style.css"  type="text/css" rel="stylesheet" />
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
		<link href= "../CSS/cal.css"  type="text/css" rel="stylesheet" />

		<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
		<script  src="../js/Revenue.js"></script>	
</head>
<body>
      <header id="header">
         <div class="top">
            <img src="../images/vpos_icon.png"  />
         
            <a href ="#" >
            <div class="topNav" id="close-btn">
               <img src="../images/main_close.png" />
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
             <p> 다운 받을 데이터가 없습니다. </p>
             <button id="confirm_button">확인</button>
             <button id="close_button">취소</button>
         </div>
         
         <div class="payment">         
            <a href="revenue2_day.jsp"><button class="btn btn1">일 </button></a>
            <a href="revenue2_month.jsp"><button class="btn btn7">월</button></a>
            <a href="revenue2_year.jsp"><button class="btn btn2">년</button></a>
            </div>
            
            <!-- 달력  -->
            <div class="container">
               <div class="bx--form-item" style="width: 400px; position: absolute; top: 200px;left: 250px;">
                     <div data-date-picker data-date-picker-type="range" class="bx--date-picker bx--date-picker--range" style="width: 300px;">
                        <div class="bx--date-picker-container">
                           
                           <input type="text" id="date-picker-1" class="bx--date-picker__input" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="mm/dd/yyyy"
                              data-date-picker-input-from />
                           <div class="bx--form-requirement">
                              Invalid date format.
                           </div>
                        </div>
                        <div class="bx--date-picker-container">
                           
                           <input type="text" id="date-picker-2" class="bx--date-picker__input" pattern="\d{1,2}/\d{1,2}/\d{4}" placeholder="mm/dd/yyyy"
                              data-date-picker-input-to />
                           <div class="bx--form-requirement">
                              Invalid date format.
                           </div>
                        </div>
                        <svg data-date-picker-icon class="bx--date-picker__icon" width="17" height="19" viewBox="0 0 17 19">
                           <path d="M12 0h2v2.7h-2zM3 0h2v2.7H3z" />
                           <path d="M0 2v17h17V2H0zm15 15H2V7h13v10z" />
                           <path d="M9.9 15H8.6v-3.9H7.1v-.9c.9 0 1.7-.3 1.8-1.2h1v6z" />
                        </svg>
                     </div>
                  </div>
               </div>
                 <script src='https://unpkg.com/carbon-components@latest/scripts/carbon-components.js'></script>   
         

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