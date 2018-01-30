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
		 background-image: url("images/maledoctor.jpg");
	}
    	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="result">
		<h3>${requestScope["message"]}</h3>
		<br>
	</div>
	<table>
	<tr><td>
	File name : ${requestScope["name"]}</td></tr>
	 <tr><td>File size : ${requestScope["size"]}</td></tr>
	 <tr><td>File type : ${requestScope["type"]}</td></tr>
	<tr><td> File path : ${requestScope["file path"]}</td></tr> 
	</table>
 <a href="NewQuery.jsp"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a>
</body>
</html>