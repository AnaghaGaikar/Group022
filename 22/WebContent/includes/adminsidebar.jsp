<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<title>Insert title here</title>
<!-- bootstrap icon display as white - note icon -->
<style type="text/css">
.white, .white a {
	  color: #fff;
	}
</style>
</head>
<body>
<!--/sidebar-menu-->
				<div class="sidebar-menu">
					<header class="logo1">
						<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> 
					</header>
						<div style="border-top:1px ridge rgba(255, 255, 255, 0.15)"></div>
                           <div class="menu">
									<ul id="menu" >
										<li><a href="CountRowServlet"><i class="fa fa-tachometer"></i> <span>Dashboard</span><div class="clearfix"></div></a></li>
										 <li id="menu-academico" ><a href="adminsendmail.jsp"><i class="fa fa-envelope nav_icon"></i><span>Mail</span><div class="clearfix"></div></a></li>
									<li><a href="adminview.jsp"><i class="glyphicon glyphicon-bed white"></i>  <span>Patients</span><div class="clearfix"></div></a></li>
							        
							        <li id="menu-academico" ><a href="#"><i class="fa fa-file-text-o" aria-hidden="true"></i><span> Complaint</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="adminviewcomplaint.jsp">Patient Complaint</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adminviewdoctorcomplaint.jsp">Doctorwise Complaint</a></li>
										  </ul>
									</li>
							        
							        <li id="menu-academico" ><a href="adminviewdoctor.jsp"><i class="fa fa-user-md" aria-hidden="true"></i><span> Doctor</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										   
									</li>
									 <li id="menu-academico" ><a href="#"><i class="glyphicon glyphicon-folder-open white" aria-hidden="true"></i><span> Feedback</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										 <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="adminviewfeedback.jsp">View Feedback</a></li>
											<li id="menu-academico-avaliacoes" ><a href="adminviewreplyfeedback.jsp">View Reply Feedback</a></li>
										 </ul>
									 </li>
									 <li id="menu-academico" ><a href="#"><i class="glyphicon glyphicon-heart white"></i><span> Doctor Opinion Data</span> <span class="fa fa-angle-right" style="float: right"></span><div class="clearfix"></div></a>
										 <ul id="menu-academico-sub" >
										   <li id="menu-academico-avaliacoes" ><a href="docopiniondata.jsp">All Data</a></li>
											
										 </ul>
									 </li>
									
									 <li><a href="admindata.jsp"><i class="glyphicon glyphicon-user white"></i>  <span>Admin Data</span><div class="clearfix"></div></a></li>
								  </ul>
								</div>
							  </div>
							  
							<div class="clearfix"></div>		
							</div>
							<script>
							var toggle = true;
										
							$(".sidebar-icon").click(function() {                
							  if (toggle)
							  {
								$(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
								$("#menu span").css({"position":"absolute"});
							  }
							  else
							  {
								$(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
								setTimeout(function() {
								  $("#menu span").css({"position":"relative"});
								}, 400);
							  }
											
											toggle = !toggle;
										});
							</script>
</body>
</html>