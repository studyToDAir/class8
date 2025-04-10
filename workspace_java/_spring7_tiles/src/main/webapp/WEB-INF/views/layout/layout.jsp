<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.side {
		border: 1px solid red;
		display: inline-block;
		width: 20%;
	}
	.content {
		border: 1px solid red;
		display: inline-block;
		width: 78%;
		vertical-align: top;
	}
</style>
</head>
<body>
<%--
	<%@ import 
	<jsp:include page=""
 --%>

	<!-- header -->
	<div>
<!-- 		헤더 -->
		<tiles:insertAttribute name="header" />
	</div>
	<!-- main -->
	<div class="main">
		<!-- side -->
		<div class="side">
<!-- 			사이드<br>메뉴 -->
			<tiles:insertAttribute name="side" />
		</div>
		<!-- content -->
		<div class="content">
<!-- 			컨텐츠 -->
			<tiles:insertAttribute name="content" />
		</div>
	</div>
	<!-- footer -->
	<div>
<!-- 		푸터 -->
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>