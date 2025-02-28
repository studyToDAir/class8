<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 10;
// 	pageContext, request, session, application
	pageContext.setAttribute("a1", a);

	int b = 20;
%>
\${ a } : ${ a }<br>
\${ a1 } : ${ a1 }<br>

<c:set var="b1" value="<%= b %>" scope="page"></c:set>
<%-- <input type="text" value="<%= b %>"> --%>
\${ b1 } : ${ b1 }<br>

<c:set var="id" value="idid" scope="page"></c:set>
<c:set var="id2" value="${id }"></c:set>
<%
	System.out.println( pageContext.getAttribute("id2") );
%>

<c:set var="game" value="LOL" scope="page"></c:set>
<c:set var="game" value="Overwatch" scope="request"></c:set>
<c:set var="game" value="SuddenAttack" scope="session"></c:set>
<c:set var="game" value="LostArk" scope="application"></c:set>
기본적으로 el은 page, request, session, application 순으로 찾음 없으면 null
${game }<br>
pageScope : ${ pageScope.game }<br>
requestScope : ${ requestScope.game }<br>
sessionScope : ${ sessionScope.game }<br>
applicationScope : ${ applicationScope.game }<br>
<hr>
<c:if test="true">
	<strong>항상 참</strong><br>
</c:if>

<c:if test="${game eq 'LOL' }">
	<strong>LOL</strong><br>
</c:if>
${requestScope.game}
<c:if test="${requestScope.game ne 'LOL' }">
	<strong>LOL이 아님니다</strong><br>
</c:if>
<c:if test="${not(game eq 'LOL') }">
	<strong>LOL</strong><br>
</c:if>

<c:choose>
	<c:when test="${game eq 'LOL' }">
		롤 유저
	</c:when>
	<c:when test="${game eq 'Overwatch' }">
		옵치 유저
	</c:when>
	<c:otherwise>
		게임 좀 하자
	</c:otherwise>
</c:choose>
<hr>
<%
	List list = new ArrayList();
	for(int i=0; i<4; i++){
		Map map = new HashMap();
		map.put("사번", 100 + (i*i) );
		map.put("이름", "이름"+i);
		map.put("나이", 20+i);
		
		list.add(map);
	}
%>
<c:forEach var="emp" items="<%= list %>">
</c:forEach>

<c:set var="list2" value="<%= list %>" />
<c:forEach var="emp" items="${list2 }">
	${emp.사번}<br>
	${emp["이름"]}<br>
	${emp.나이}<br>
	<br>
</c:forEach>
<c:forEach var="i" begin="0" end="10">
	i : ${ i } <br>
</c:forEach>
step<br>
<c:forEach var="i" begin="0" end="10" step="3">
	i : ${ i } <br>
</c:forEach>
<c:forEach var="i" begin="0" end="10" step="3" varStatus="loop">
	i : ${ i }
	<c:if test="${ not loop.last }">
	,
	</c:if>
	 <br>
	loop.index : ${loop.index }<br>
	loop.count : ${loop.count}<br>
	loop.first : ${loop.first}<br>
	loop.last : ${loop.last }<br>
</c:forEach>
items랑 begin, end 같이 사용 가능<br>
end가 items 개수보다 커도 items 만큼만 돌고 오류 없음<br>
<c:forEach var="map" items="${list2 }" begin="0" end="10" step="3">
	${map }<br>
</c:forEach>
<hr>
param.name : ${param.name }<br>
<a href="/jstl.jsp?name=한글">jstl.jsp?name=한글</a>

<c:url var="url2" value="/jstl.jsp">
	<c:param name="name" value="한글" />
</c:url>
<a href="${url2 }">url2</a>
<br>
c:url을 사용하는 이유<br>
1. 영어나 숫자 외의 한글이나 특수문자를 encode 해줌<br>
2. context path 자동 추가 (/_proj4_forward)<br>
3. 쿠키 금지일때 ;jsessionid= 을 자동으로 붙여줌
<hr>
<c:set var="hack" value="<strong>abc</strong><script>alert(1)</script>" />
${hack }님 환영합니다<br>
<c:out value="${hack }" /><br>
c:out을 사용하는 이유<br>
특수문자를 치환해서 문자 그 자체로 출력하게 해줌
즉. innerText처럼 나오게
& &amp;
</body>
</html>





