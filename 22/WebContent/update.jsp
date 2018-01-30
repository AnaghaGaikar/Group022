<%@page import="dto.User_registration"%>
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
		 background-image: url("images/medical-student-oxbridge-clinical.jpg");
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%-- <%
        String email=(String)session.getAttribute("email");
       
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("index.jsp");
        }
       
  %> --%>
<a href="userHome.jsp"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a>
<div align="right">
<a href="updateinfo.jsp"><input type="button" value="update Information" ></a></div>

	<div>
	<table align="center" border="1px solid black" style="background-color:#63e0d5;" class="table">
			<thead>
				<tr>
					<th colspan="9" >Patient Information</th>
					
				</tr>
				<tr>
					<th >First Name</th>
					<th  >Last Name</th>
					<th  >Email</th>
					<th  >Address</th>
					<th  >State</th>
					<th  >City</th>
					<th  >Pin Code</th>
					<th  >Age</th>
					<th  >Contact no</th>
				</tr>
			</thead>
			
			<tbody>
			
				<%
				
				ArrayList<User_registration> list=(ArrayList<User_registration>)request.getAttribute("arraylist");
					for(User_registration u :list){
				%> 
				<tr style="text-align: center;">
					<td><%=u.getFirstname() %></td>
					<td><%=u.getLastname() %></td>
					<td><%=u.getEmail() %></td>
					<td><%=u.getAddress() %></td>
					<td><%=u.getState() %></td>
					<td><%=u.getCity() %></td>
					<td><%=u.getPincode() %></td>
					<td><%=u.getAge() %></td>
					<td><%=u.getContact() %></td>
					
				</tr> 
				 <%
					}
				%> 
			</tbody>
		</table>
	</div>

</body>
</html>