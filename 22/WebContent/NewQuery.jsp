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
		 background-image: url("img/bodybg/bg1.png");
	}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
            response.sendRedirect("index.jsp");
        }
        
        
        %>
         <%-- <p>Welcome <%=email%></p>  --%>

<a href="userHome.jsp"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a>
	<form action="UserQueryController" method="post" >
		<table align="center" rows="30" cols="30" border="1px solid black" class="table">
			<tr>
				<td><th>Select Type Of Disease</td>
				<td>
				  <select name="disease" required class="form-control">
				  <option value="select">select</option>
				   <option value="Cardiologist">Cardiologist</option>
				   <option value="Neurologist">Neurologist</option>
				   <option value="Pediatrician">Pediatrician</option>
				   <option value="Dermatologist">Dermatologist</option>
				 </select>
				</td>
			</tr>
			<tr>
				<td><th>Symptoms</td>
				<td>
					<textarea name="symptoms" rows="10" cols="30"></textarea>
					
				</td>
			</tr>
			
			<tr><td></td><td></td>
				<td><input type="submit" value="submit" class="btn btn-success"></td>
			</tr>
		</table>
	</form>
	<div align="center">
		<a href="upload.jsp"><input type="button" value="Upload Reports" name="Upload Reports" /></a>
	</div>
			

</body>
</html>