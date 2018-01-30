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
		 background-image: url("images/pic1.jpg");
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String email=(String)session.getAttribute("email");	
if(email==null)
{
	response.sendRedirect("index.jsp");	
}
%>
<div><a href="ShowDataController"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a></div>

	 <form action="userUpdateController" method="post" >
	 <table  class="table"><tr><td>
    	
    						<tr><td><label>Address:</label></td><td>
    							<textarea rows="2" name="address" class="form-control input-md" required="required" placeholder="Address" maxlength="500"></textarea></td></tr>
    													<tr><td><label>State:*</label></td><td>
    													<input type="text" name="state" class="form-control input-md" value="Maharashtra" maxlength="25" readonly></td></tr>
                            
    													<tr><td><label>City:*</label></td><td>
    													<select  placeholder="City" required="required" name="city">
    													  <option selected="true" disabled="disabled">Select City</option>
														  <option value="Ahmednagar">Ahmednagar</option>
														  <option value="Amravati">Amravati</option>
														  <option value="Baramati">Baramati</option>
														  <option value="Bhiwandi"> Bhiwandi</option>  
														  <option value="Hingoli"> Hingoli </option>
														  <option value="Ichalkaranji"> Ichalkaranji </option>
														  <option value="Jalgaon">Jalgaon</option>
														  <option value="Jalna ">Jalna </option>
														  <option value="Kolhapur">Kolhapur</option>
														  <option value="Latur"> Latur </option>
														  <option value="Mumbai"> Mumbai</option>  
														  <option value="Nagapur"> Nagapur</option>
														  <option value="Navi Mumbai"> Navi Mumbai</option>
														  <option value="Panvel"> Panvel</option>
														  <option value="Pune">Pune</option>
														  <option value="Ratnagiri"> Ratnagiri </option>
														  <option value="Sangli">Sangli</option>
														  <option value="Solapur">Solapur</option>
														  														</select></td></tr>
    												
    													<tr><td><label>Pincode:</label></td><td>
    													<input type="text" name="pincode" id="pincode" class="form-control input-md" placeholder="pincode" maxlength="6"></td></tr>
                                                    
    													<tr><td><label>Age:*</label><br></td><td>
    													<input type="number" name="age" id="age" class="form-control input-md"  placeholder="Age" required="required" maxlength="3" ></td></tr>
                                             
    													<tr><td><label>Contact number:*</label></td><td>
    													<input type="text" name="contact" id="phone" class="form-control input-md"  placeholder="Contact" required="required" maxlength="10"></td></tr>
                                                     
    										<tr><td colspan="2"><input type="submit" value="Submit" class="btn btn-success"></td></tr>
	
			
			
		</form>	
</body>
</html>