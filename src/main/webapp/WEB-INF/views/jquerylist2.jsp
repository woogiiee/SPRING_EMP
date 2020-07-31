<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

	function makeList(){
		var htmls="";
		
		$("#list_table").html("");//자식 태그 가져오는 구문
		//자바스크립트 안에 JSTL문법이 들어 갔음
		$("<tr>",{
			html :  "<td>"+"사원번호"+"</td>"+//컬럼명들
			 		"<td>"+"이름"+"</td>"+
			 		"<td>"+"직책"+"</td>"+
			 		"<td>"+"담당사수"+"</td>"+
			 		"<td>"+"입사일"+"</td>"+
			 		"<td>"+"급여"+"</td>"+
			 		"<td>"+"상여금"+"</td>"+
			 		"<td>"+"부서번호"+"</td>"
		}).appendTo("#list-table")//이것을 테이블에 붙임
		
		//JSP값을 javascript 에서 쓸 수 있는 방법
		
		
		//javascript안에 jstl 문법이 들어갔음
	<c:forEach var = "list_table" items="${emps}">
		htmls += '<tr>';
		htmls += '<td>'+'${list.empno}'+'</td>';
		htmls += '<td>'+'${list.ename}'+'</td>';
		htmls += '<td>'+'${list.job}'+'</td>';
		htmls += '<td>'+'${list.mgr}'+'</td>';
		htmls += '<td>'+'${list.hiredate}'+'</td>';
		htmls += '<td>'+'${list.sal}'+'</td>';
		htmls += '<td>'+'${list.comm}'+'</td>';
		htmls += '<td>'+'${list.deptno}'+'</td>';
		htmls += '<td>';
		</c:forEach>
		
		$("#list_table").append(htmls);
	}
	//jsp (el=$) - jstl(c:) - html - javascript

</script>
<script>
	$(document).ready(function(){
		makeList();
	});
</script>
</head>
<body>
	
		<table id="list_table" width="500" cellpadding="0" cellspacing="0" border="1" align="center">
	
		
		
	</table>
	
	
</body>
</html>