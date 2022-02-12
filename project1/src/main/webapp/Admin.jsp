<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <title>Learner's Academy </title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
  
  
</head>
<body>

<center>
<div class="w3-container w3-teal">
<br>
<form action="logoutServlet">
   
   <div class = "text-right">
    <button type="submit" class="btn btn-default  right" value = "logout" name = "logout">Logout</button>
    </div>
  </form>


  <h1>LEARNER'S ACADEMY</h1><br>

<br><br><br><br><br><br><br><br>

<div id="frm">

<div style="display: inline;" align="center">
      <div style="float: left;">

<form action = "actionServlet" method ="get">
<button type = "submit" name = "Action" value = "studentlist" class="btn btn-primary">&nbsp;&nbsp;&nbsp;Student List&nbsp;&nbsp;&nbsp;</button>
</form>
</div>

<div style="float: left;">
<form action = "actionServlet" method ="get">
<button type = "submit" name = "Action" value = "teacherlist" class="btn btn-primary">&nbsp;&nbsp;&nbsp;Teacher List&nbsp;&nbsp;&nbsp;</button>
</form>

</div>
<div style="float: right;">
<form action = "actionServlet" method ="get">
<button type = "submit" name = "Action" value = "subjectlist" class="btn btn-primary">&nbsp;&nbsp;&nbsp;Subject List&nbsp;&nbsp;&nbsp;</button>
</form>

</div>
<div style="float: right;">
<form action = "actionServlet" method ="get">
<button type = "submit" name = "Action" value = "classlist" class="btn btn-primary">&nbsp;&nbsp;&nbsp;Class List&nbsp;&nbsp;&nbsp;</button>
</form>

</div>

<div style="float: center;">
<form action = "actionServlet" method ="get">
<button type = "submit" name = "Action" value = "viewall" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;View All&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
</form>
<br>
</div>

</div>

</div>
</center>

</body>
</html>
