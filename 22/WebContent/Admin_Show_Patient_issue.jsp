
<%@page import="dto.PatientIssue"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
		<td>Health Issue</td>
		<td>Symptoms</td>
		<td>reports</td>
		<td>Doctor Email</td>
		<td>Doctor First Name</td>
		<td>Doctor First Name</td>
	</tr>
<%
	/* Admin a=(Admin)session.getAttribute("data");
	System.out.println(a.getUserName());
 	DoctorRegistrationDao dao=new DoctorRegistrationDao(); */
 	ArrayList<PatientIssue> list=(ArrayList<PatientIssue>)session.getAttribute("list");
	System.out.println("   jsp page"+list);
 	for(PatientIssue d:list)
 	{
		%>
			<tr>
			<td><%=d.getPatientId() %></td>
			<td><%=d.getPatientFname() %></td>
			<td><%=d.getPatientLname() %></td>
			<td><%=d.getPatientEmail() %></td>
			<td><%=d.getDisease() %></td>
			<td><%=d.getSymptoms() %></td>
			<td><%=d.getFiles() %></td>
			<td><%=d.getDoctorEmail() %></td>
			<td><%=d.getDoctorFname() %></td>
			<td><%=d.getDoctorLname() %></td>
			
		</tr>
 		<%
 	}
%>
 </table>
</body>
</html>