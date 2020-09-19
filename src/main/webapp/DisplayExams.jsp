<%@page import="java.text.ParseException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.dxc.dao.ExamDAO"%>
<%@page import="com.dxc.service.ExamServiceImpl" %>
<%@page import="com.dxc.beans.Exam"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DispalyExamks</title>
</head>
<body>
	<h2>Exams Data</h2>
	<table >
		<tr>
		<th>EId</th>
		<th>EName</th>
		</tr>
		<%
		List<Exam> exams = new ExamServiceImpl().findAll();
		for(Exam exam : exams)
		{
			%>
			<tr>
			<td><%=exam.getEid() %></td>
			<td><%=exam.getEname() %></td>
			<td><a href='EditExam.jsp?eid=<%=exam.getEid()%> '>Edit</a>/<a href='deleteexam?eid=<%=exam.getEid()%> '>Delete</a></td>
			</tr>
			<% 
		}
		%>
		
	</table>
	<br><a href="AddExam.jsp">Add New Exam</a><br><br>
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
	
</body>
</html>