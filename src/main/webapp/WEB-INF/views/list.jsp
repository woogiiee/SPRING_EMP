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
			<td>���</td>
			<td>�����</td>
			<td>����</td>
			<td>������ȣ</td>
			<td>�����</td>
			<td>����</td>
			<td>Ŀ�̼�</td>
			<td>�μ���ȣ</td>
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