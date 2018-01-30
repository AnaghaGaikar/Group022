<%@page import="dto.PatientIssue"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DoctorRegistrationDao"%>
<%@page import="dto.DoctorRegistration"%>
<%@page import="dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

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
    background-color:black;
    color: white;
}
</style>


<body>


<%
Admin a = (Admin)session.getAttribute("data");
 %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome <%=a.getEmail()%></a>
    </div>
    <ul class="nav navbar-nav">
     <li ><a href="home.jsp">Home</a></li>
      <li ><a href="ShowAllPatients">Patients</a></li>
      
      <li class="active"><a href="ShowTreatingPatientsServlet">Treating Patients</a></li>
      
      <li><a href="Details_to_Update">Update Profile</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>
<table id="customers" align="center" border="1px">
	<tr align="center">
		<td>Patient Id</td>
		<td>Patient First Name</td>
		<td>Patient Last Name</td>
		<td>Patient Email</td>
		<td>Health Issue</td>
		<td>Symptoms</td>
		<td>Reports</td>
		<td>Delete Patient</td>
	</tr>
<%
/* 	Admin a=(Admin)session.getAttribute("data");
 	DoctorRegistrationDao dao=new DoctorRegistrationDao();
 	ArrayList<PatientIssue> list=dao.SelectTreatingPatients(a); */
 	ArrayList<PatientIssue> list=(ArrayList<PatientIssue>)session.getAttribute("list");
 	for(PatientIssue d:list)
 	{
		%>
		<tr align="center">
			<td><%=d.getPatientId() %></td>
			<td><%=d.getPatientFname() %></td>
			<td><%=d.getPatientLname() %></td>
			<td><%=d.getPatientEmail() %></td>
			<td><%=d.getDisease() %></td>
			<td><%=d.getSymptoms() %></td>
			 <td><a href = "DownloadReports?files=<%=d.getDoctorEmail() %>">Download</a></td>
			<!--  --><td class="hide"><%=d.getFiles() %></td>
			<td><a href="delete_Patient_from_list?patientId=<%=d.getPatientId()%>">Delete</td>
		</tr>
 		<%
 	}
%>
 </table>
</body>
</html>