<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Address</th>
			<th>DELETE</th>
			<th>Edit</th>
		</tr>
		<c:forEach var="student" items="${list}">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.phone }</td>
				<td>${student.address }</td>
				<td><a href="delete?id=${student.id }">Delete</a></td>
				<td><a href="edit?id=${student.id }">EDIT</a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>