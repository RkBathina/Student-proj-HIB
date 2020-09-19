<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditExam</title>
</head>
<body>
	<form action="editexam" method="post">
		<h2>Updating Exam of Id:"<%=request.getParameter("eid") %>"</h2>
		<%request.setAttribute("eid", request.getParameter("eid")); %>
		<table>
			<tr>
				<td>EId</td>
				<td><input type="text" name="eid" value="<%=request.getParameter("eid")%>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>ExamName</td>
				<td><input type="text" name="ename"></td>
			</tr>
		</table>
		<input type="submit" value="Update">
		<input type="reset" value="Cancel">
		
	</form>

</body>
</html>