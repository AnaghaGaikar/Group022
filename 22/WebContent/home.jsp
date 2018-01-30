<%@page import="dto.Admin"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<title>Welcome User</title>
</head>
<style>

body {
    background-image: url("img/doc.jpg");
    background-repeat: no-repeat, repeat;
		   
}


</style>

<body>

<% Admin a=(Admin)session.getAttribute("data");%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome <%=a.getEmail()%></a>
    </div>
    <ul class="nav navbar-nav">
    <li class="active"><a href="home.jsp">Home</a></li>
      <li ><a href="ShowAllPatients">Patients</a></li>
      
      <li><a href="ShowTreatingPatientsServlet">Treating Patients</a></li>
      
      <li><a href="Details_to_Update">Update Profile</a></li>
       <li><a href="EmailForm.jsp"> Send Email</a></li>
 
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>


<!-- --------------------------------------------------------------- -->


















<!-- successfull login -->
<!-- <form action="ShowTreatingPatientsServlet" method="post"> -->
<!-- <input type="submit" value="show treating details" > -->

<%-- <% Admin a=(Admin)session.getAttribute("data");  --%>

<%-- %> --%>
<!-- </form> -->


<!-- <form action="ShowAllPatients" method="post"> -->
<!-- <input type="submit" value="show All details" > -->

<%-- <% Admin b=(Admin)session.getAttribute("data");  --%>

<%-- %> --%>
<!-- </form> -->

<!-- <form action="Details_to_Update" method="post"> -->
<!-- <input type="submit" value="Update profile" > -->

<%-- <% Admin c=(Admin)session.getAttribute("data");  --%>

<%-- %> --%>
<!-- </form> -->

</body>
</html>
