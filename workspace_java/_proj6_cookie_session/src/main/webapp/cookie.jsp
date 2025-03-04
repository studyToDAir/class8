<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.hide {
		display: none;
	}
</style>

</head>
<body>
<div style="border: 1px solid red;">
	공지사항<br>
	<input type="checkbox" id="pop"> 10초 동안 보이지 않기
</div>

<script>
	document.querySelector("#pop").addEventListener("click", function(event){
		let checked = event.target.checked
		if(checked){
			// 10초 뒤 설정
			const now = new Date();
			const after = now.getSeconds() + 10;
			now.setSeconds(after)
			console.log(now.toGMTString())
			
			// js로 쿠키 설정
			document.cookie = "show=true;expires="+ now.toGMTString();
			// 세션 쿠키 설정
			document.cookie = "show2=true2"
		}
	})
	
	
	// 쿠키 보는 법
	console.log(document.cookie)
	// name=value2; name2=%ED%95%9C+%EA%B8%80; show=true
	const cookies = document.cookie.split("; ")
	for(let i=0; i<cookies.length; i++){
		const c = cookies[i].split("=")
		const name = c[0]
		const value = c[1]
		
		if(name == "show" && value == "true"){
			document.querySelector("div").classList.add("hide")
		}
	}
	
</script>
</body>
</html>