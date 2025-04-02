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
		<tr>
		    <th>ename</th>
		    <td><input type="text" id="ename"></td>
		</tr>
		<tr>
		    <th>sal</th>
		    <td><input type="text" id="sal"></td>
		</tr>
		<tr>
		    <th>comm</th>
		    <td><input type="text" id="comm"></td>
		</tr>
		<tr>
		    <th>hiredate</th>
		    <td><input type="date" id="hiredate"></td>
		</tr>
		<tr>
		    <th>mgr</th>
		    <td><input type="text" id="mgr"></td>
		</tr>
	</table>
	<input type="submit" id="join" value="등록하기">

<script>
// 	const empno = '${dto.empno}'
	document.querySelector("#join").addEventListener("click", function(event){
		event.preventDefault();

		let param = {
			ename: document.querySelector("#ename").value,
			sal: document.querySelector("#sal").value,
			comm: document.querySelector("#comm").value,
			hiredate: document.querySelector("#hiredate").value,
			mgr: document.querySelector("#mgr").value,
		}
		console.log(param.ename.trim().length)
		if(param.ename.trim().length == 0){
			alert('이름은 필수입니다')
		}
		else if(param.mgr.trim().length == 0){
			alert('mgr은 필수입니다')
		}
		else if( isNaN(param.mgr) ){
			alert('mgr은 숫자만 적어주세요')
		}

		fetch('joinEmp' ,{
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body : JSON.stringify( param )
		}).then(function(resp){
			return resp.json()
		}).then( (data)=>{
			console.log(data)
		} ).catch( (err)=>{
			console.error('ERROR joinEmp fetch', err)
		})
		
	})

</script>
</body>
</html>