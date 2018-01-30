<%@page import="dto.User_registration"%>
<%@page import="java.sql.Array"%>
<%@page import="dto.DoctorRegistration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color:#000000;
    color: white;
}
</style>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<%
 %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    
      <a class="navbar-brand" href="#"></a>
    </div>
    <ul class="nav navbar-nav">
    <li ><a href="AdminHome.jsp">Home</a></li>
      <li class="active" ><a href="AdminPatientsServ">Patients</a></li>
   
      <li><a href="AdminPatientIssueServ">Patients Issue</a></li> 
   
      <li class="active"><a href="AdminDocSer">Doctors</a></li>
      

    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>
<table id="customers" align="center" border="1px">
	<tr>
		<td>Patient Id</td>
		<td>Patient First Name</td>
		<td>Patient Last Name</td>
		<td>Patient Email</td>
		<td hidden="true">Password</td>
		<td>Adress</td>
		<td>State</td>
		<td>City</td>
		<td>Pincode</td>
		<td>Gender</td>
		<td>Age</td>
		<td>Contact</td>
	</tr>
<%
	/* Admin a=(Admin)session.getAttribute("data");
	System.out.println(a.getUserName());
 	DoctorRegistrationDao dao=new DoctorRegistrationDao(); */
 	ArrayList<User_registration> list=(ArrayList<User_registration>)session.getAttribute("list");
	System.out.println("   jsp page"+list);
 	for(User_registration d:list)
 	{
		%>
			<tr>
			<td><%=d.getUserId() %></td>
			<td><%=d.getFirstname() %></td>
			<td><%=d.getLastname() %></td>
			<td><%=d.getEmail() %></td>
			<td><%=d.getPassword() %></td>	
			<td><%=d.getAddress() %></td>
			<td><%=d.getState() %></td>
			<td><%=d.getCity() %></td>
			<td><%=d.getPincode() %></td>
			<td><%=d.getGender() %></td>
			<td><%=d.getAge() %></td>
			<td><%=d.getContact() %></td>
			
			<td><a href="Delete_Patient?patientId=<%=d.getUserId()%>">Delete</td>
		</tr>
 		<%
 	}
%>
 </table>

</body>
</html>