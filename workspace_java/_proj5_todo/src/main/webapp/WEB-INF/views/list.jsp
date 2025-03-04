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

<c:forEach var="dto" items="${resultList}">
	<tr>
	<form method="post" action="todo">
		<td><input type="checkbox" name="done" value="Y"></td>
		<td>
			<input type="hidden" value="${ dto.todo_id }" name="todo_id">
			${ dto.todo_id }
		</td>
		<td>
<%-- 			<input type="text" value="${ dto.todo }" name="todo"> --%>
			${ dto.todo }
		</td>
		<td>${dto.create_date }</td>
		<td>${dto.modify_date }</td>
		<td>${dto.done }</td>
		<td>
			<input type="hidden" name="command" value="update">
			<input type="submit" value="수정">
		</td>
	</form>
	</tr>
</c:forEach>

</table>


</body>
</html>