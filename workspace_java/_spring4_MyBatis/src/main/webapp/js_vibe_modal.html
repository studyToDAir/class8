<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<thead>
        <tr>
            <th>empno</th>
            <th>ename</th>
        </tr>
    </thead>
    <tbody>
    	<c:if test="${ not empty list }">
	        <c:forEach var="dto" items="${list}" varStatus="loop">
	            <tr>
	                <td>${dto.empno}</td>
	                <td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
	            </tr>
	        </c:forEach>
    	</c:if>
    	<c:if test="${ empty list }">
    		<tr>
    			<td colspan=2>조회 내용이 없습니다</td>
    		</tr>
    	</c:if>
    
    </tbody>
</table>

<button type="button" id="btn">진동</button>
<div id='view'></div>

<style>
	#popup {
		border: 1px solid red;
		width: 100px;
		height: 200px;
		
		position: absolute;
		top: 50px;
		left: 300px;
		
		box-shadow: 0 4px 10px rgba(0,0,0,0.4);
	}
	#popup .title {
		background: blue;
		color: white;
	}
	#popup .title:hover {
/* 		cursor: all-scroll; */
		cursor: grab;
	}
	#popup .title:active {
/* 		cursor: all-scroll; */
		cursor: grabbing;
	}
	
	#popup .content {
		background: white;
	}
	
	#dim {
		position: absolute;
		top: 0;
		left: 0;
		
		width: 100vw;
		height: 100vh;
/* 		background: rgba(172,172,172,0.3); */
		background: rgba(255,255,255,0.3);
/* 		backdrop-filter: blur(2px); */
	}
</style>
<div id='dim'>
	<div id='popup'>
		<div class='title'>
			제목
		</div>
		<div class='content'>
			내용<br>
			내용
		</div>
	</div>
</div>


<script>
	document.querySelector('#btn').addEventListener('click', ()=>{
// 		navigator.vibrate(500) //ms
		if(navigator.vibrate){
			navigator.vibrate([300,100,500,100,300]) //ms, 진동, 쉬기, 진동...
		} else {
			alert('navigator.vibrate 없음')
		}
	})
	
	if(screen.orientation){
		screen.orientation.addEventListener('change', ()=>{
			document.querySelector('#view').innerHTML = `
				type: \${screen.orientation.type}<br>
				angle: \${screen.orientation.angle}<br>
				orientation: \${window.orientation}
			`
		})


	} else {
		alert('방향 지원 안함')
	}
	
	
	/*
		타이틀에서 왼쪽 버튼을 누르면
		- 왼쪽 버튼이 눌렸 다는걸 저장
		타이틀에서 왼쪽 버튼을 떼면
		- 왼쪽 버튼이 떨어졌 다는걸 저장
		
		마우스 최초 눌렀을 때
		- 그때 마우스 위치 값 저장
	*/
	let isDragable = false;
	let offsetX = 0;
	let offsetY = 0;
	
	document.querySelector('.title').addEventListener('mousedown', (event)=>{
		isDragable = true;
		
		document.querySelector('#view').innerHTML = `
			x: \${event.clientX}<br>
			y: \${event.clientY}<br>
		`
		
		offsetX = event.clientX
		offsetY = event.clientY
	})
	document.querySelector('.title').addEventListener('mouseup', ()=>{
		isDragable = false;
	})
	document.querySelector('.title').addEventListener('mousemove', (event)=>{
		if(isDragable){
			let diff_X = event.clientX - offsetX
			let diff_Y = event.clientY - offsetY
			
			let popup = document.querySelector('#popup')
			
// 			console.log( popup.style.top )
			console.log( popup.offsetTop )
			
			popup.style.top = (popup.offsetTop + diff_Y)+'px'
			popup.style.left = (popup.offsetLeft + diff_X)+'px'
			
			offsetX = event.clientX
			offsetY = event.clientY
		}
	})
	
</script>

</body>
</html>