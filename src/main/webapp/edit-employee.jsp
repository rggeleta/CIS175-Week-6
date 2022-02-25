<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="editEmployeeServlet" method="post">
		Employee FirstName: <input type="text" name="empFirstName" value="${employeeToEdit.empFirstName}">
		</br>
		Employee Last Name: <input type="text" name="empLastName" value="${employeeToEdit.empLastName}">
		</br>
		<input type="hidden" name="id" value="${employeeToEdit.id}"> <input
			type="submit" value="Save Edited Employee">
	</form>
</body>
</html>