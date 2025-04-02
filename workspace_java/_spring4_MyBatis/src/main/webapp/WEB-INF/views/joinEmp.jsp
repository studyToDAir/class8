<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
			if(data == 1){
				location.href = 'emp'
			} else {
				alert('가입에 실패했습니다')
			}
		} ).catch( (err)=>{
			console.error('ERROR joinEmp fetch', err)
		})
		
	})
	function promise(){

		let a = 10
		setTimeout( function(){
			a = 20
		}, 1000 )
		console.log(a) // 10
		// 20이 출력되게 하려면?
		
		// Promise는 resolve()또는 reject()가 실행될때 까지 기다려준다
		new Promise( function(resolve, reject) {
			setTimeout( function(){
				if(a == 10){
					a = 20
					resolve(a)
				} else {
					reject('ERRRRRR')
				}
			}, 1000 )
		})
		console.log(1) // 먼저 실행 되버림
		p.then( function(data){
			console.log(data)
		} )
		p.catch( function(data){
			console.log(data)
		} )
	}
	
	async function async_await(){
		let p1 = await new Promise( function(resolve, reject) {
			setTimeout( function(){
				if(a == 10){
					a = 20
					resolve(a)
				} else {
					reject('ERRRRRR')
				}
			}, 1000 )
		})
		
		
		let p2 =  new Promise( function(resolve, reject) {
			setTimeout( function(){
				if(a == 10){
					a = 20
					resolve(a)
				} else {
					reject('ERRRRRR')
				}
			}, 2000 )
		})
		// 위에꺼 끝날때 까지 기다렸다가
		// 이거 실행함
		console.log(1)
	}
	

</script>
</body>
</html>