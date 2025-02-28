<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("a", 10);
	request.setAttribute("b", "abc");
	
	int a1 = (int)request.getAttribute("a");
	System.out.println("a : "+ a1);
	
	List list = new ArrayList();
	request.setAttribute("list", list);
%>

<%= a1 %>
request.getAttribute("b") : [<%= request.getAttribute("b") %>] <br>
\${b} : [${ b }]<br>
\${ 지역변수 a1 } : [${ a1 }]<br>
\${ null } : [${ null }]<br>

\${10 + 1} : ${10 + 1}<br>
\${"10"+1 } : ${"10"+1 } : el은 계산할때 문자를 숫자로 바꿔서 계산하다<br>
<%-- \${ "a"+1 } : ${ "a"+1 } --%>
\${a+5 } : ${a+5 }<br>
\${c+5 } : ${c+5 }<br>
\${null*5 } : ${null*5 } : null은 계산할때 0으로 계산한다<br>

\${a/5 } : ${a/5 }<br>
\${a div 5 } : ${a div 5 }<br>

\${a%5 } : ${a%5 }<br>
\${a mod 5 } : ${a mod 5 }<br>

\${ a == 10 } : ${ a == 10 }<br>
\${ a != 10 } : ${ a != 10 }<br>

\${ a eq 10 } : ${ a eq 10 }<br>
\${ a ne 10 } : ${ a ne 10 } not equal<br>

\${ a > 10 } : ${ a > 10 }<br>
\${ a >= 10 } : ${ a >= 10 }<br>
\${ a < 10 } : ${ a < 10 }<br>
\${ a <= 10 } : ${ a <= 10 }<br>

\${ a gt 10 } : ${ a gt 10 }  &nbsp; &gt; &lt;  <br>
\${ a ge 10 } : ${ a ge 10 }<br>
\${ a lt 10 } : ${ a lt 10 }<br>
\${ a le 10 } : ${ a le 10 }<br>

\${ (100 > 10) && (50 < 60) } : ${ (100 > 10) && (50 < 60) }<br>
\${ (100 > 10) and (50 < 60) } : ${ (100 > 10) and (50 < 60) }<br>

\${ (100 > 10) || (50 < 60) } : ${ (100 > 10) || (50 < 60) }<br>
\${ (100 > 10) or (50 < 60) } : ${ (100 > 10) or (50 < 60) }<br>

\${(100 > 10) eq "true"} : ${(100 > 10) eq "true"}<br>

\${ !(100 > 10) } : ${ !(100 > 10) }<br>
\${ not(100 > 10) } : ${ not(100 > 10) }<br>

\${empty c } : ${empty c }<br>
\${empty null } : ${empty null }<br>
\${empty "" } : ${empty "" }<br>
\${empty list } : ${empty list } 비어있어도 empty가 true<br>

[<%= request.getParameter("text") %>]<br>
\${param.text } : [${param.text }]<br>
\${paramValues.text } : [${paramValues.text }]<br>
\${paramValues.text[0] } : [${paramValues.text[0] }]<br>
\${paramValues.text[10] } : [${paramValues.text[10] }] 배열 범위를 벗어나도 예외발생하지 않음<br>
</body>
</html>