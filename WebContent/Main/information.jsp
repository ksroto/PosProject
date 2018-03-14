<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>정보 변경</title>
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
					</div>
				</a>   
				
				<a href ="#" >
					<div class="topNav">
						<img src="../images/main_minimize.png"  />
					</div>
				</a>
				
				<a href ="menu.jsp" >
					<div class="topNav">
						<img src="../images/main_back.png"  />
					</div>
				</a>
				
				<a href ="../Login/login.jsp" >
					<div class="topNav">
						<h5>Admin</h5> 
					</div>
				</a>
			</div>
		</header>
		
		<main>
			<div class="visual">
			</div>
		  
		    <div class="alter">
		    <img src="../images/main_information.png">
		                정 보 변 경
		    </div>
			<div class="contact">
				<form id="form1" method="post" enctype="multipart/form-data">
					<div class="profile">
						<input id="photo-file-button" type="file" name="file" class="hidden"/>
						<img id="photo" src="../images/puppy.jpg"  />
						<input class="btn-text btn-default" type="button" id="photo-button" value="이미지변경" />
					</div>
				</form>
				
		     	<form id="form">
			      <legend>   </legend>
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <input type="text" placeholder="비밀번호" id="pw"/>
			      </fieldset>
			      
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <input type="text" placeholder="새 비밀번호" id="new-pw"/>
			      </fieldset>
			      
			      <fieldset>
			        <label aria-hidden="true"></label>
			        <textarea placeholder="새 비밀번호 확인" id="check-pw"></textarea>
			      </fieldset>
			      
	
			        <a href ="menu.jsp" >
			        	<button type="button" id="btn-submit">확 인</button>
			        </a>
			    </form>
		    </div>
		</main>
		
		<script>
		window.addEventListener("load",function()
		{
			 var photoButton = document.querySelector("#photo-button");
	         var photoFileButton = document.querySelector("#photo-file-button");
	         var photo = document.querySelector("#photo");	         

	         photoButton.onclick = function(e)
	         {
	                var evt = new MouseEvent("click",
	                {
	                    view: window,
	                    bubbles: true,
	                    cancelable: true
	                });
	                
	                photoFileButton.dispatchEvent(evt);
	          };
	            
	            photoFileButton.onchange= function(e)
	            {
	                var file = photoFileButton.files[0];

	                var info = "name:" +file.name;
	                info += "size:" +file.size;
	                info += "type:" +file.type;

	                /*여기 다시 한번 더 확인하기
	                var typeParts = file.files.split("/");
	                
	                if(typeParts[0] != "image")
	                    alert("지원되는 이미지 파일의 형식이 아닙니다.");
	                */
	                
	                var reader = new FileReader();
	                reader.onload = function(evt)
	                {
	                    photo.src = evt.target.result;
	                };

	                reader.readAsDataURL(file);
	            };
		});		
		</script>
	
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
					</p>
				</h5>
			</div>
		</div>
	</footer>
</body>
</html>