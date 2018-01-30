<%@page import="dto.Patientissuedto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/jquery-ui.css" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>

<style>

body{
			background-height:100%;
			background-width:100%;
			background-size:cover;
		 background-image: url("images/c2.jpg");
	}
    	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="userHome.jsp"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a>

<table align="center" border="1px solid black" style="background-color:#63e0d5;" >
			<thead>
				<tr>
					<th colspan="9" >Patient Information</th>
					
				</tr>
				<tr>
					<th >Patient First Name</th>
					<th  >Patient Last Name</th>
					<th  >Patient Email</th>
					<th  >Disease</th>
					<th  >Symptoms</th>
					<th  >Doctor Email</th>
					<th  >Doctor Name</th>
					<th  >Doctor Last Name</th>
				
				</tr>
			</thead>
			
			<tbody>
			
				<%
					ArrayList<Patientissuedto> list=(ArrayList<Patientissuedto>)request.getAttribute("arraylist");
				for(Patientissuedto u:list){
				//ArrayList<Patientissuedto> list=(ArrayList<Patientissuedto>)request.getAttribute("arraylist");
					//for(Patientissuedto u :list){
				%> 
				<tr style="text-align: center;">
					<td><%=u.getPatientFname() %></td>
					<td><%=u.getPatientLname() %></td>
					<td><%=u.getPatientEmail() %></td>
					<td><%=u.getDisease() %></td>
					<td><%=u.getSymptoms() %></td>
					<td><%=u.getDoctorEmail() %></td>
					<td><%=u.getDoctorFname() %></td>
					<td><%=u.getDoctorLname() %></td>
					
					
				</tr> 
				 <%
					}
				%> 
			</tbody>
		</table>
</body>
</html>