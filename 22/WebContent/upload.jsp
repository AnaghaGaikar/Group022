<!DOCTYPE html>
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
		 background-image: url("img/parallax/1.jpg");
	}
    	</style>
<meta charset="ISO-8859-1">
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
<a href="userHome.jsp"><input type="button" value="BACK" name="BACK" class="btn btn-primary"/></a><br><br>
	<form method="post" action="upload" enctype="multipart/form-data">
	<div align="center" class="fileinput fileinput-new" data-provides="fileinput">
	<span class="btn btn-default btn-file"><span>Choose file</span>
	 <input type="file" name="file"></span><br><br>
	<span>
			<input type="submit" value="upload" class="btn btn-success">
			</span>
			</div>
	</form>
</body>
</html>