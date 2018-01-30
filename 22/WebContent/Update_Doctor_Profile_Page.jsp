<%@page import="dto.Admin"%>
<%@page import="dto.DoctorRegistration"%>
<% DoctorRegistration d = (DoctorRegistration)session.getAttribute("drInfo"); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
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
      
      <li><a href="ShowTreatingPatientsServlet">Treating Patients</a></li>
      
      <li class="active"><a href="Details_to_Update">Update Profile</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>
	<form class="form-horizontal" action="Update_doctor_profile_servlet" method="post">
<div class="form-group">
    <label for="inputName3" class="col-sm-2 control-label hor-form">Doctor First Name:*</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" required="required" name="firstName" value="<%=d.getFirstName() %>" pattern="[A-Za-z]{}" title="Name is always in letters" maxlength="30">
    </div>
  </div>
  <div class="form-group">
    <label for="inputName3" class="col-sm-2 control-label hor-form">Doctor Last Name:*</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" required="required" name="lastName" value="<%=d.getLastName()%>" pattern="[A-Za-z]{}" title="Name is always in letters" maxlength="30">
    </div>
  </div>
  
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label hor-form">Email:*</label>
    <div class="col-sm-6">
      <input type="email" class="form-control" id="inputEmail3" placeholder="Email" required="required" name="email" readonly value="<%=d.getEmail()%>" >
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label hor-form">Password:*</label>
    <div class="col-sm-6">
      <input type="password" class="form-control" id="password" placeholder="Password" width="100" required="required" name="password" value="12345678" data-toggle="password">
    </div>
    <div class="col-sm-3"> (Default Password is 12345678) </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label hor-form">Contact:*</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="contact" placeholder="Contact" width="100" required="required" name="contactNo" value="<%=d.getContactNo()%>" maxlength="15"pattern="[0-9]{}"title="contact_no is in number" maxlength="10">
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label hor-form">Address:</label>
    <div class="col-sm-6">
    
      <input type="text" class="form-control" id="address" placeholder="Address" width="100" name="address" value="<%=d.getAddress()%>" maxlength="500"pattern="[A-Za-z0-9]{}" title="address is always in letters" maxlength="30">
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label hor-form">City:</label>
    
    													
    <div class="col-sm-6">
    <select name="city" onchange = "showSelection()" class="form-control" width="100">
<option selected="true" disabled="disabled">Select City</option>
<!-- <select class="form-control input-md" placeholder="City" required="required" name="city"> 
    													  <option selected="true" disabled="disabled">Select City</option>-->
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
														  														</select>
    
       <!-- <input type="text" class="form-control" id="city" placeholder="City" width="100" name="city" maxlength="50">  -->
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label hor-form">Pincode:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="pincode" placeholder="Pincode" width="100" name="pinCode" value="<%=d.getPinCode()%>" maxlength="6"title="pincode is always in letters">
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label hor-form">Degree:</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="degree" placeholder="Degree" width="100" name="degree" value="<%=d.getDegree()%>" maxlength="50" pattern="[A-Za-z]{}" title="Name is always in letters" maxlength="30">
    </div>
  </div>
   <div class="form-group">
    <label class="col-sm-2 control-label hor-form">specialization:</label>
    <div class="col-sm-6">
 													

    <select name="specialization" onchange = "showSelection()" class="form-control" width="100">
<option value="select">select</option>
				   <option value="Cardiologist">Cardiologist</option>
				   <option value="Neurologist">Neurologist</option>
				   <option value="Pediatrician">Pediatrician</option>
				   <option value="Dermatologist">Dermatologist</option>
				 </select><br>
  </div>
  
 							<div class="row">
								<div class="col-sm-8 col-sm-offset-2">
									<input type="submit" class="btn-success btn" value="Submit">
									<input type="reset" class="btn-inverse btn" value="Reset" >
								</div>
							</div>
</form>
</div>

								</div>
							</div>				
						
						</div>
						</div>
					</div>					
				</div>		
			</div>
			
		</form>	
	