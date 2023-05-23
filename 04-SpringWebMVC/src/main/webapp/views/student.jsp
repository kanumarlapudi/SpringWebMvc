<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">

		<tr>
			<td>Student ID:</td>
			<td>${std.id}</td>
		</tr>


		<tr>
			<td>First Name:</td>
			<td>${std.firstName}</td>
		</tr>

		<tr>
			<td>Last Name :</td>
			<td>${std.lastName}</td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td>${std.gender}</td>
		</tr>
		<tr>
			<td>City :</td>
			<td>${std.city}</td>
		</tr>
		<tr>
			<td>DOB :</td>
			<td>${std.dob}</td>
		</tr>


	</table>
</body>
</html>