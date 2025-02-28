<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date date = new Date();
%>
<%= new Date() %><br>
<fmt:formatDate 
	value="<%= new Date() %>"
	pattern="yyyy년 MM월 dd일 a HH:mm:ss.SSS" />
</body>
</html>