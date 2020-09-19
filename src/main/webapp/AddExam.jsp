<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddExam</title>
</head>
<body>
	<form action="saveexam" method="post">
	EId:<input type="text" name="eid"><br>
	EName:<input type="text" name="ename"><br>
	<input type="submit" value="Add">
	<input type="reset" value="Cancel">
	</form>
</body>
</html>