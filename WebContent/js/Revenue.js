window.addEventListener("load", function () 
{
	var DownButton = document.getElementById("downloadbutton");
	var ConfirmButton = document.getElementById("confirm_button");
	var CloseButton = document.getElementById("close_button");
	
	DownButton.onclick = function() {
      
		modal.style.display = "block";
    };
    
    // 엑셀로 다운받도록하기
    ConfirmButton.onclick = function(){
    	
    }
    
    // 창 닫기
    CloseButton.onclick = function() {
    	modal.style.display = "none";
    };
});


// 종료창
window.addEventListener("load", function () 
{
	var CloseBtn = document.getElementById("close-btn");
	
	CloseBtn.onclick = function() {
	      
		window.open("about:blank","_self").close();
    };
		});
