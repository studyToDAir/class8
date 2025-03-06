<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO서비스</title>
</head>
<body>
<form method="post" action="todo">
	할일 : <input type="text" name="todo">
	<input type="submit" value="추가">
</form>

<hr>

<table border=1>
<tbody id="content"></tbody>
</table>

<script>
	drawList()
	function drawList(){
		
		const xhr = new XMLHttpRequest()
		xhr.open('get', 'json')
		xhr.send()
		xhr.onload = function(){
			console.log(xhr.responseText)
			
			const list = JSON.parse(xhr.responseText)
			console.log( list )
			
			const content = document.querySelector('#content')
			for(let dto of list){
				const tr = document.createElement('tr')
				
				let html = ``
				html += `<form method="post" action="todo">`
				html += `	<td><input type="checkbox" name="done" value="Y"></td>`
				html += `	<td>`
				html += `		<input type="hidden" value="\${ dto.todo_id }" name="todo_id">`
				html += `		\${ dto.todo_id }`
				html += `	</td>`
				html += `	<td>`
				html += `		\${ dto.todo }`
				html += `	</td>`
				html += `	<td>\${dto.create_date }</td>`
				html += `	<td>\${dto.modify_date }</td>`
				html += `	<td>\${dto.done }</td>`
				html += `	<td>`
				html += `		<input type="hidden" name="command" value="update">`
				html += `		<input type="submit" value="수정">`
				html += `	</td>`
				html += `</form>`
				tr.innerHTML = html
				
				content.append(tr)
			}
		}
		
	}

</script>
</body>
</html>