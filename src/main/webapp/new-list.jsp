<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createNewListServlet" method="post">
		List Name: <input type="text" name="listName"><br /> Trip
		Date: <input type="text" name="month" placeholder="mm" size="4">
		<input type="text" name="day" placeholder="dd" size="4"> <input
			type="text" name="year" placeholder="yyyy" size="4"> Employee Name
		Name: <input type="text" name="employeeName"><br /> Available
		Employees :<br /> <select name="allEmployeeToAdd" multiple size="6">
			<c:forEach items="${requestScope.allItems}" var="currentemployee">
				<option value="${currentitem.id}">${currentitem.store} |
					${currentemployee.employee}</option>
			</c:forEach>
		</select> <br /> <input type="submit" value="Create a list and Add employee">

	</form>
	<a href="index.html">Go add new employee instead.</a>


</body>
</html>