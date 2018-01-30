<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/jquery-ui.css" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>
        <title>User Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	body{
			background-height:100%;
			background-width:100%;
			background-size:cover;
		 background-image: url("images/MedicalConsultancy.jpg");
	}
</style>
</head>
<body >
		<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		String email=(String)session.getAttribute("email");
		if(email!=null){
			session.setAttribute("email", email);
		}
			if(email==null){
	            response.sendRedirect("index.jsp");
	        }
		%>
		<%-- <p>Welcome <%=email%></p> --%>
		<div class="container">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
		
		 <a href="ShowDataController"><input type="button" value="My Profile" name="My Profile"/></a>
        <a href="MedicalHistoryController"><input type="button" value="Medical History" name="Medical History" /></a>
        <a href="NewQuery.jsp"><input type="button" value="New Query" name="New Query" /></a>
        <a href="chat.jsp"><input type="button" value="Chat/Video" name="Chat/Video" /></a>
		
		
		
		</div>
		<div class="col-sm-2"> <button onclick="window.location.href='Logout'" class="btn btn-primary">Logout</button></div>		
		<!-- </div>
		  <div align="right">   
       
        </div>
        <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
       
        </nav>
        <div  style="margin-left:250px;">
	        <div style="float: left;" > -->
	      		
							
				
			<!-- 	
		  	</div>
				
			<div style="float: left;margin-left:8px;"><table><tr><td></td></tr></table></div>
			<div style="float: left;margin-left:8px;"><table><tr><td></td></tr></table></div>
			<div style="float: left;margin-left:8px;"></div> -->
						
      </div>
		
</body>
</html>