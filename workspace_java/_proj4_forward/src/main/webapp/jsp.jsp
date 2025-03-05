<%-- 
	jsp 주석
	java로 번역조차 되지 않음
 --%>
<!-- 디렉티브 테그 -->
<!-- java로 변경되는 class에 대한 정보 -->
<%@ 
	page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    import="java.util.ArrayList"
%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립틀릿scriptlet -->
<%
// 여기는 java 땅입니다
System.out.println("java");

List list = new ArrayList();

%>

<%
for(int i=1; i<=9; i++){
%>
	<h1>
		<% out.write(""+i); %>
		<% out.println(""+i); %>
	</h1>
<%
}
%>

<%
	int a = 10;
	int b = 20;
	System.out.println("a : "+ a);
%>

<div><% out.print(a); %></div>
<div><%= a+1 %></div>

<%!
	// 선언문
	// 필드 선언
	String str = "글씨";
	// 메소드 선언
	String getStr(){
		return this.str;
	}
%>

<!--  <% getStr(); %>  -->
<%--  <% getStr(); %>  --%>


<%@ include file="header.jsp" %>

<!--
	jsp에 직접 text에 1234라는 값을 보내고
	jsp에서 html로 그 값을 출력하시오 
 -->
<%
	String text = request.getParameter("text");
// 	response.getWriter().println(text);
	out.print(text);
%>
<%= text %>
<%= request.getParameter("text") %>

<hr>
<!-- 액션태그 -->
<jsp:include page="header.jsp" >
	<jsp:param name="id" value="minsu"/>
</jsp:include>


<script>
	let a = '<%= a %>'
	let b = 30;
</script>
</body>
</html>