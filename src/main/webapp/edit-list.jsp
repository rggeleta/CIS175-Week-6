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
	<form action="employeeDetailsServlet" method="post">
		<input type="hidden" name="id" value="${listToEdit.id}"> List
		Name: <input type="text" name="listName"
			value="${listToEdit.listName}"><br /> Trip date: <input
			type="text" name="month" placeholder="mm" size="4" value="${month}">
		<input type="text" name="day" placeholder="dd" size="4"
			value="${date}">, <input type="text" name="year"
			placeholder="yyyy" size="4" value="${year}"> Employee Name: <input
			type="text" name="employeeName"
			value="${listToEdit.employees.employeeName}"><br /> Available
		Items:<br /> <select name="allItemsToAdd" multiple size="6">
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<option value="${currentitem.id}">${currentitem.store}|
					${currentitem.item}</option>
			</c:forEach>
		</select> <br /> <input type="submit" value="Edit List and Add New Employee">
	</form>
	<a href="index.html">Go add new employee instead.</a>

</body>
</html>