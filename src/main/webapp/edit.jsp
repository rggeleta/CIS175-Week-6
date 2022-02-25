<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="navigationServlet">
		<table>
			<c:forEach items="${requestScope.allEmployee}" var="currentitem">
				<tr>
					<td><input type="radio" name="id" value="${currentemployee.id}"></td>
					<td>${currentemployee.empFirstName}</td>
					<td>${currentemployee.empLastName}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToEmployee"> <input
			type="submit" value="delete" name="doThisToEmployee"> <input
			type="submit" value="add" name="doThisToEmployee">
	</form>
</body>
</html>