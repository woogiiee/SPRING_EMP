<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
		<table border="1" align="center">
	
		<tr>
			<td>사번</td>
			<td>사원명</td>
			<td>직급</td>
			<td>관리번호</td>
			<td>고용일</td>
			<td>월급</td>
			<td>커미션</td>
			<td>부서번호</td>
		</tr>
	
		<c:forEach var="dto" items="${emps}">
		<tr>
			<td>${dto.empno}</td>
			<td>${dto.ename}</td>
			<td>${dto.job}</td>
			<td>${dto.mgr}</td>
			<td>${dto.hiredate}</td>
			<td>${dto.sal}</td>
			<td>${dto.comm}</td>
			<td>${dto.deptno}</td>
		</tr>
		</c:forEach> 

	</table>
	
	
</body>
</html>