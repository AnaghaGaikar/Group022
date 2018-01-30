
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Medical</title>
  <link href="css2/bootstrap.min.css" rel="stylesheet" type="text/css">
  <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="plugins/cubeportfolio/css/cubeportfolio.min.css">
	<link href="css2/nivo-lightbox.css" rel="stylesheet" />
	<link href="css2/nivo-lightbox-theme/default/default.css" rel="stylesheet" type="text/css" />
	<link href="css2/owl.carousel.css" rel="stylesheet" media="screen" />
    <link href="css2/owl.theme.css" rel="stylesheet" media="screen" />
	<link href="css2/animate.css" rel="stylesheet" />
    <link href="css2/style.css" rel="stylesheet">
    <link href="css2/login.css" rel="stylesheet">
    
     <!-- show pass -->
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-show-password/1.0.3/bootstrap-show-password.min.js"></script>
    <!-- end show pass -->  
    
    <!-- boxed bg -->
	<link id="bodybg" href="bodybg/bg1.css" rel="stylesheet" type="text/css" />
	<!-- template skin -->
	<link id="t-colors" href="color/default.css" rel="stylesheet">

<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Infirmary Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/jquery-ui.css" />
<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/numscroller-1.0.js"></script>

<!-- //js -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>

<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Viga' rel='stylesheet' type='text/css'>



	<!-- start-smoth-scrolling -->
	
		<script>
	function checkPassword(form)
	{
		if(form.userpassword.value != "") 
		{
	     	 if(form.userpassword.value.length < 6)
			 {
	        	 alert("Error: Password must contain at least six characters!");
	       		 form.userpassword.focus();
	       	     return false;
	     	 }
			 if(form.userpassword.value == form.userName.value)
			 {
	      	     alert("Error: Password must be different from Username!");
	         	 form.userpassword.focus();
	        	 return false;
	     	 }
			 re = /[0-9]/;
	    	  if(!re.test(form.userpassword.value))
			 {
	        	  alert("Error: password must contain at least one number (0-9)!");
	       		  form.userpassword.focus();
	        	  return false;
	      	 }
	        	re = /[a-z]/;
	     	 if(!re.test(form.userpassword.value))
			 {
	       	    alert("Error: password must contain at least one lowercase letter (a-z)!");
	            form.userpassword.focus();
	            return false;
	         }
	      re = /[A-Z]/;
	      if(!re.test(form.userpassword.value)) 
			{
	           alert("Error: password must contain at least one uppercase letter (A-Z)!");
	          form.userpassword.focus();
	          return false;
	        }
		 } 
		else {
	      alert("Error: Please check that you've entered correct password!");
	      form.userpassword.focus();
	      return false;
	    }

	    alert("You entered a valid password: " + form.userpassword.value);
	    return true;
	}
	</script>
	
	
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
	<!-- start-smoth-scrolling -->

	<script src="js/responsiveslides.min.js"></script>
</head>
<body>
<!-- header -->
<div class="header wow zoomIn">
	<div class="container">
		<div class="header_left" data-wow-duration="2s" data-wow-delay="0.5s">
			<ul>
				<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>+123 456 7890</li>
				<li><a href="mailto:info@example.com"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info@example.com</a></li>
			</ul>
		</div>
		<div class="header_right">
			<div class="login">
				<ul>
					<li><a href="#" data-toggle="modal" data-target="#myModal4"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>Login</a></li>
					<li>
						<div class="search-bar">
							<div class="search">		
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i> </a>
							</div>
							<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
								<div id="small-dialog" class="mfp-hide">
									<div class="search-top">
										<div class="login_pop">
											<form action="#" method="post">
												<input type="submit" value="">
												<input type="text" name="Type something..." value="Type something..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
											</form>
										</div>				
									</div>
									<script>
												$(document).ready(function() {
												$('.popup-with-zoom-anim').magnificPopup({
													type: 'inline',
													fixedContentPos: false,
													fixedBgPos: true,
													overflowY: 'auto',
													closeBtnInside: true,
													preloader: false,
													midClick: true,
													removalDelay: 300,
													mainClass: 'my-mfp-zoom-in'
												});
																												
												});
									</script>				
								</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!-- //header -->
<div class="header-bottom">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
					<div class="logo grid">
						<div class="grid__item color-3">
							<h1><a class="link link--nukun" href="index.jsp"><i></i>INFI<span>R</span>MARY</a></h1>
						</div>
					</div>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse nav-wil links" id="bs-example-navbar-collapse-1">
					<nav class="menu menu--horatio">
						<ul class="nav navbar-nav menu__list">
							<li class="menu__item "><a href="index.jsp" class="menu__link">Home</a></li>
							<li class="menu__item menu__item--current"><a href="contact.jsp" class="menu__link">Contact</a></li>
						</ul>
					</nav>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
		</div>
	</div>

<!-- banner -->
<div class="banner page_head">

</div>
<!-- //banner -->
<div class="map_contact">
<h3 class="tittle">Registration</h3>
	<section id="intro" class="intro">
    <form action="userRegistrationController" method="post" >
		
			<div class="container">
				<div class="row">
					
					<div class="col-lg-6">
						<div class="form-wrapper">
						<h6 style="color: red">${errmail}</h6>
						<div class="wow fadeInRight" data-wow-duration="2s" data-wow-delay="0.2s">
						 
							<div class="panel panel-skin">
							<div class="panel-heading">
									<h3 class="panel-title"><span class="fa fa-pencil-square-o"></span> Registration for Inquiry: </h3>
									</div>
									<div class="panel-body">
								
									    <div id="sendmessage"></div>
                                        <div id="errormessage">
                                      
                                        </div>
                                   
    										<div class="row">
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>First Name:*</label>
    													<input type="text" name="firstname" id="first_name" class="form-control input-md" placeholder="First Name" required="required" maxlength="25">
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Last Name:*</label>
    													<input type="text" name="lastname" id="last_name" class="form-control input-md" placeholder="Last Name" required="required" maxlength="25">
                                                        <div class="validation"></div>
    												</div>
    											</div>
    										</div>
    										<div class="row">
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Email:*</label>
    													<input type="email" name="email" id="email" class="form-control input-md" placeholder="Email" required="required" maxlength="40">
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Password:*</label>
    													<input type="password" name="password" id="password" class="form-control input-md" placeholder="Password" required="required" data-toggle="password" maxlength="30">
                                                        <div class="validation"></div>
    												</div>
    											</div>
    										</div>
    										<div class="row">
    											<div class="col-xs col-sm-12 col-md-12">
    												<div class="form-group">
    													<label>Address:</label>
    													<textarea rows="2" name="address" class="form-control input-md" placeholder="Address" maxlength="500"></textarea>
                                                        <div class="validation"></div>
    												</div>
    											</div>
    										</div>
    											<div class="row">
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>State:*</label>
    													<input type="text" name="state" class="form-control input-md" value="Maharashtra" maxlength="25" readonly>
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>City:*</label>
    													<select class="form-control input-md" placeholder="City" required="required" name="city">
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
														  														</select>
    													<!-- <input type="text" name="city" id="city" class="form-control input-md" placeholder="City" required="required" maxlength="25"> -->
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											</div>
    												<div class="row">
    												<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Pincode:</label>
    													<input type="text" name="pincode" id="pincode" class="form-control input-md" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" placeholder="Pincode" maxlength="6">
                                                         <div class="validation"></div>
    												</div>
    											</div>    										
    										
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Gender:*</label> <br>
    													<input type="radio" name="gender" id="gender" value="Male"  data-msg="Please select you sex:" required="required"> Male
    													<input type="radio" name="gender" id="gender" value="Female" data-msg="Please select you sex:" required="required"> Female
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											</div>
    											<div class="row">
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Age:*</label><br>
    													<input type="number" name="age" id="age" class="form-control input-md" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" placeholder="Age" required="required" maxlength="3" >
                                                        <div class="validation"></div>
    												</div>
    											</div>
    											<div class="col-xs col-sm-6 col-md-6">
    												<div class="form-group">
    													<label>Contact number:*</label>
    													<input type="text" name="contact" id="phone" class="form-control input-md" oninput="this.value = this.value.replace(/[^0-9.]/g, ''); this.value = this.value.replace(/(\..*)\./g, '$1');" placeholder="Contact" required="required" maxlength="10">
                                                        <div class="validation"></div>
    												</div>
    											</div>
    										</div>
    										<input type="submit" value="Submit" class="btn btn-skin btn-block btn-lg">

								</div>
							</div>				
						
						</div> 
						</div>
					</div>					
				</div>		
			</div>
			
		</form>	
    </section>
	
</div>
<!-- //contact -->
<!-- contact -->
<div class="contact">
	<div class="container">
		
		<div class="col-md-6 contact-right wow fadeInLeft animated animated" data-wow-delay="0.4s">
			<h3>Contact Us</h3>
			<div class="strip"></div>
			<ul class="con-icons">
				<li><span class="glyphicon glyphicon-phone" aria-hidden="true"></span>+123 456 7890</li>
				<li><a href="mailto:info@example.com"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>info@example.com</a></li>
			</ul>
			<ul class="fb_icons">
				<li class="hvr-rectangle-out"><a class="fb" href="#"></a></li>
				<li class="hvr-rectangle-out"><a class="twit" href="#"></a></li>
				<li class="hvr-rectangle-out"><a class="goog" href="#"></a></li>
				<li class="hvr-rectangle-out"><a class="pin" href="#"></a></li>
				<li class="hvr-rectangle-out"><a class="drib" href="#"></a></li>
			</ul>
			
		</div>
		<div class="col-md-6 contact-left wow fadeInRight animated animated" data-wow-delay="0.4s">
			<h2>Information</h2>
			</div>
		<div class="clearfix"></div>
	</div>
</div>
<!-- //contact -->
<!-- login -->
			<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" >
				<div class="modal-dialog" role="document">
					<div class="modal-content modal-info">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body modal-spa">
							<div class="login-grids">
									
									<div class="login-right">
										<h3>Sign in with your account</h3>
										<form action="LoginServlet" method="post">
											<div class="sign-in">
						<div>
											<select name="usertype">
											<option value="" disabled selected hidden>Login as..</option>
											<option value="admin">Admin</option>
											<option value="doctor">Doctor</option>
											<option value="user">User</option>
											</select>
				</div>
												<h4>Email :</h4>
												<input type="text" name="email" value="email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'email';}" required="">	
											</div>
											<div class="sign-in">
												<h4>Password :</h4>
												<input type="password" name="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}" required="">
												<a href="#">Forgot password?</a>
											</div>
											<div class="single-bottom">
												<input type="checkbox"  id="brand" value="">
												<label for="brand"><span></span>Remember Me.</label>
											</div>
											<div class="sign-in">
												<input type="submit" value="SIGNIN" >
											</div>
										</form>
									</div>
									
								<p>By logging in you agree to our <a href="#">Terms and Conditions</a> and <a href="#">Privacy Policy</a></p>
							</div>
						</div>
					</div>
				</div>
			</div>
<!-- //login -->
<!-- login -->
			
<!-- //login -->

</body>
</html>

