<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>
</head>
<body>


			
			
		<form action = 'actionServlet' method = 'post'>
			<button type = "submit" name = "Action" value = "studentlist">Back</button>
		</form>
	<center>
			<h1>Assign Teacher</h1>
			<table style = 'width:15%' border = "2">
			<form action = "studentFormServlet" method = "post">
					<tr><th>Class ID<input type = "text" name = "classid"></th></tr>
					<tr><th>Select Subject: <select class="form-select" aria-label="Default select example" name = "subject">
									  <option selected>Subject</option>
									  <option value="English">English</option>
									  <option value="Hindi">Hindi</option>
									  <option value="Science A">Science A</option>
									  <option value="Science B">Science B</option>
									  <option value="Maths A">Maths A</option>
									  <option value="Maths B">Maths B</option>
									  <option value="Social A">Social A</option>
									  <option value="Social B">Social B</option>
									</select></th></tr>
					
					<tr><th><button type = "submit" name = "form"  value = "classform" align = "center">Submit</button></th></tr>	
			</form>	
			</table>
	</center>
</body>
</html>