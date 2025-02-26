<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<button id="doGet">doGet</button>
	<button id="doPost">doPost</button>
	
	<script>
		document.querySelector("#doGet").addEventListener("click", function(){
			ajax();
		});
		document.querySelector("#doPost").addEventListener("click", function(){
			ajax('post');
		});
		
		function ajax(method){
			if(!method) method = "get";
			
			let url = "req"
			if(method == 'get'){
				url += "?num1=123&num2=abc"
			}
			
			const xhr = new XMLHttpRequest();
			xhr.open(method, url);
			
			if(method == 'get'){
				xhr.send();
			} else {
				xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
				xhr.send("num1=123&num2=abc");
			}
			
			xhr.onload = function(){
				console.log( xhr.responseText )
				
				try{
					const json = JSON.parse(xhr.responseText)
					console.log(json)
				} catch (e){
					console.log(e)
				}
			}
		}
	</script>
</body>
</html>