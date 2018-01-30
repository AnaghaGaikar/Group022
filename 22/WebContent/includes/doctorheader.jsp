<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>


	<!--header start here-->
	<div class="header-main">
		<div class="logo-w3-agile">
			<img src="#" alt="" width="220" height="58" />
		</div>
		<div class="w3layouts-left" style="background-color: white"></div>

		<div class="w3layouts-left" style="background-color: white">

			<!-- View data by other languahe -->
			<div id="google_translate_element"></div>
			<script type="text/javascript">
				function googleTranslateElementInit() {
					new google.translate.TranslateElement(
							{
								pageLanguage : 'en',
								layout : google.translate.TranslateElement.InlineLayout.SIMPLE
							}, 'google_translate_element');
				}
			</script>
			<script type="text/javascript"
				src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
			<!-- end -->

		</div>

		<div class="profile_details w3l">
			<ul>
				<li class="dropdown profile_details_drop"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false">
						<div class="profile_img">
							<span class="prfil-img"><img src="img/logo.png" alt="">
							</span>
							<div class="user-name"></div>
							<i class="fa fa-angle-down"></i> <i class="fa fa-angle-up"></i>
							<div class="clearfix"></div>
						</div>
				</a>
					<ul class="dropdown-menu drp-mnu">

						<li><a href="updatedoctorprofile.jsp"><i
								class="fa fa-user"></i> Profile</a></li>
						<li><a href="doctorlogin?query=logout"><i
								class="fa fa-sign-out"></i> Logout</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
	<!--heder end here-->
</body>
</html>