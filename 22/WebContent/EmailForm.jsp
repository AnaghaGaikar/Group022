<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/jquery-ui.css" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>

<link rel="stylesheet" href="css/styleEmail.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function abc() {
	window.history.back();
}
</script>

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
    <li ><a href="home.jsp">Home</a></li>
      <li class="active" ><a href="ShowAllPatients">Patients</a></li>
      
      <li><a href="ShowTreatingPatientsServlet">Treating Patients</a></li>
      
      <li><a href="Details_to_Update">Update Profile</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="index.jsp"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
    </ul>
  </div>
</nav>
</head>
<body>





	<form class="form-horizontal" class="form" action="MailResult.jsp" method="post">
		<div class="panel-group">
		<div align="center" class=" panel panel-Warning">

		<div class="panel-heading"><strong>Send Email</strong></div>
		<div class="panel-body">
		<p type="Recipient address:">
			<input placeholder="Enter Email Id" name="recipientEmail" required=""></input> </p>
		
		
		<p type="Subject">
			<input placeholder="Subject" name="subject" required="" ></input>
		</p>
		<p type="Content" float="left-corner">
			<textarea placeholder="Your Content" name="content" required="" style="margin: 0px; width: 293px; height: 183px;"></textarea>
		</p>
		<button type="submit">Send Email</button>
		<button value="Back" onclick="abc()">Back</button>
		</div>
		</div>
</div>
	</form>

</body>
</html>