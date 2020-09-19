<%@page import="java.text.ParseException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.dxc.dao.StudentDAO"%>
<%@page import="com.dxc.beans.Student1"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayStudents</title>
</head>
<body>
	<h2>Student DataBase</h2>
	<table>
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Dob</th>
	<th>Email</th>
	<th>Mobile</th>
	</tr>
	<%
	List<Student1> students=new StudentDAO().findAll();
	for(Student1 student : students)
	{
		%>
		<tr>
		
		<td><%= student.getId()%></td>
		<td><%= student.getName()%></td>
		<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy"); %>
		<td><%= df.format(student.getDob()) %></td>
		<td><%=student.getEmail()%></td>
		<td><%=student.getMobile() %></td>		
		<td><a href='Edit.jsp?id=<%=student.getId()%>'>Edit</a>/<a href='delete?id=<%=student.getId()%>'>Delete</a></td>
		</tr>
		<%
	}
	%>
	</table>
	<br><a href="addStudent.jsp">Add New Student</a><br><br>
	<form action="logout">
		<input type="submit" value="Logout">
	</form>

</body>
</html>