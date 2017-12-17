
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<style>
.error {
	color: red;
	
}
.color{
    color:white;
    
}
.pagecenter{
    
    margin-left: 800px;
	margin-right: auto;
	max-width: 600px;
	float: none;
	
}
</style>
<!DOCTYPE HTML>
<html>
<head>
<title>Auto Show a Autos-transportation category Flat bootstrap Responsive  Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="<c:url value= "/resources/css/style.css" />"  rel="stylesheet" />
<link href="<c:url value= "/resources/css/bootstrap.css" />"  rel="stylesheet" />

<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Auto Show Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="/resources/js/jquery-1.11.1.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/app.js"></script>

<!-- start menu -->
<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
</script>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="banner">
            
            
   	  <div class="container">
   	  	<div class="navbar-header">
   		<div class="logo">
			<a href="index"><img src="resources/images/auto.png" alt=""/></a>
		
                  
               
          </div>
	     <div class="navg">
	     	
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
                 
                 
                 
	       </div>
	     </div>
	     <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
	         <ul class="nav navbar-nav">
		        <li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Models<b class="caret"></b></a>
		            <ul class="dropdown-menu">		            
                    <li><div class="col1 nav-float">
							<div class="h_nav">
								<h4>New</h4>
								<ul>
									<li><a href="models" onclick="message()">Honda</a></li>
									<li><a href="models">Toyota</a></li>
									<li><a href="models">Mahindra</a></li>
									<li><a href="models">Tata</a></li>
									<li><a href="models">Ford</a></li>
									<li><a href="models">Chevrolet</a></li>
									<li><a href="models">Renault</a></li>
									<li><a href="models">Nissan</a></li>
									<li><a href="models">Skoda</a></li>
								</ul>
							</div>							
						</div></li>
						<li><div class="col1 nav-float">
							<div class="h_nav">
								<h4>Upcoming</h4>
								<ul>
									<li><a href="models">Audi</a></li>
									<li><a href="models">Bmw</a></li>
									<li><a href="models">Jaguar</a></li>
									<li><a href="models">Mercedes-benz</a></li>
									<li><a href="models">Volkswagen</a></li>
									<li><a href="models">Datsun</a></li>
									<li><a href="models">Lamborghini</a></li>
									<li><a href="models">Ferrari</a></li>
									<li><a href="models">Rolls-Royce</a></li>
								</ul>
							</div>							
						</div></li>
						<li><div class="col2 nav-imgs">
							<div class="h_nav nav-img">
								<h4>Trends</h4>
								<ul>
									<li class>
										<div class="p_left">
										  <img src="resources/images/p1.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
									<li>
										<div class="p_left">
										  <img src="images/p2.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
									<li>
										<div class="p_left">
										  <img src="images/p3.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
								</ul>	
							</div>												
						</div></li>
					  <div class="clearfix"> </div>                  
		            </ul>
		        </li>
		        <li class="dropdown">
		        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Used<b class="caret"></b></a>
		            <ul class="dropdown-menu nav-equal">		            
                    <li><div class="col1 nav-float">
							<div class="h_nav">
								<h4>New</h4>
								<ul>
									<li><a href="models">Honda</a></li>
									<li><a href="models">Toyota</a></li>
									<li><a href="models">Mahindra</a></li>
									<li><a href="models">Tata</a></li>
									<li><a href="models">Ford</a></li>
									<li><a href="models">Chevrolet</a></li>
									<li><a href="models">Renault</a></li>
									<li><a href="models">Nissan</a></li>
									<li><a href="models">Skoda</a></li>
								</ul>
							</div>							
						</div></li>
						<li><div class="col1 nav-float">
							<div class="h_nav">
								<h4>Upcoming</h4>
								<ul>
									<li><a href="models">Audi</a></li>
									<li><a href="models">Bmw</a></li>
									<li><a href="models">Jaguar</a></li>
									<li><a href="models">Mercedes-benz</a></li>
									<li><a href="models">Volkswagen</a></li>
									<li><a href="models">Datsun</a></li>
									<li><a href="models">Lamborghini</a></li>
									<li><a href="models">Ferrari</a></li>
									<li><a href="models">Rolls-Royce</a></li>
								</ul>
							</div>							
						</div></li>
						<li><div class="col2 nav-imgs">
							<div class="h_nav nav-img">
								<h4>Trends</h4>
								<ul>
									<li class>
										<div class="p_left">
										  <img src="resources/images/p1.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
									<li>
										<div class="p_left">
										  <img src="images/p2.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
									<li>
										<div class="p_left">
										  <img src="images/p3.jpg" class="img-responsive" alt=""/>
										</div>
										<div class="p_right">
											<h4><a href="#">Cars</a></h4>
											<span class="item-cat"><small><a href="#">Ferrari</a></small></span>
											<span class="price">100000 $</span>
										</div>
										<div class="clearfix"> </div>
									</li>
								</ul>	
							</div>												
						</div>
						</li>				                  
		            </ul>
		        </li>
		        <li class="dropdown">
		            <a class="last-nav" href="brands">Brands</a>
		        </li>
		        <li class="dropdown">
		            <a class="last-nav" href="index" >Sales</a>	            
		        </li>	       
		        <li><a class="last-nav" href="404">News</a></li>
	        
                 
                 </ul>
                 <form:form method="post" action="check1" modelAttribute="command" class="pagecenter" >
           <h1 class="color">LOGIN</h1>
           
           
      	<table  >  
         <tr>  
          <td class="color"><span class="glyphicon glyphicon-user"></span>NAME: </td> 
          <td><form:input path="username"  /><form:errors path="username" cssClass="error"/></td> 
          
         </tr>  
         <tr>  
          <td class="color" ><span class="glyphicon glyphicon-lock"></span>PASSWORD:</td>  
          <td><form:input type="password" path="password" /><form:errors path="password" cssClass="error"/></td>
          
         </tr>  
         <tr>  
          <td> </td>  
          <td><input type="submit" value="LOGIN" /></td>  
         </tr>  
        </table>
          </form:form>    
		</div>
        <div class="clearfix"> </div>     
       </div>
       <div class="header_arrow">
          <a href="#arrow" class="scroll"><span> </span></a>
        </div>
    </div>

   <div class="main">
    <div class="container">
     <div class="top_grid" id="arrow">
   	  <div class="content_top">
   		<div class="col-md-8 col1">
   				 <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/1.jpg" class="img-responsive" alt=""/><div class="b-wrapper1 long-img"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
        </div>
   		<div class="col-md-4">
   		   <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/pic2.jpg" class="img-responsive" alt=""/><div class="b-wrapper1"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
   		  <div class="grid1">
   		  	 <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/pic3.jpg" class="img-responsive" alt=""/><div class="b-wrapper1"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
   		  </div>
   		</div>
   		<div class="clearfix"> </div>
   	  </div>
   	  <div class="content_middle">
   	  	<div class="col-md-4 col2">
   	  			 <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/pic4.jpg" class="img-responsive" alt=""/><div class=" b-wrapper"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
   	  	</div>
   	  	<div class="col-md-4 col2">
   	  			 <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/pic5.jpg" class="img-responsive" alt=""/><div class=" b-wrapper"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
   	  	</div>
   	  	<div class="col-md-4">
   	  			 <a href="#" class="b-link-stroke b-animate-go  thickbox">
		   <img src="resources/images/pic6.jpg" class="img-responsive" alt=""/><div class=" b-wrapper"><h2 class="b-animate b-from-left    b-delay03 ">Photo 1</h2><p class="b-animate b-from-right    b-delay03 ">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p></div></a>
   	  	</div>
   	  	<div class="clearfix"> </div>
   	  </div>
   	  </div>
   	</div>
   	<div class="content_middle_bottom">
   		<div class="header-left" id="home">
		      <section>
				<ul class="lb-album" >
					<li>
						<a href="#image-1">
							<img src="resources/images/g1.jpg"  class="img-responsive" alt="image01"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-1">
							<a href="#page" class="lb-close">x Close</a>
							<img src="resources/images/g1.jpg"  class="img-responsive" alt="image01"/>
					
						</div>
					</li>
					<li>
						<a href="#image-2">
							<img src="resources/images/g2.jpg"  class="img-responsive" alt="image02"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-2">
							<img src="resources/images/g2.jpg"  class="img-responsive" alt="image02"/>
					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-3">
							<img src="resources/images/g3.jpg"  class="img-responsive" alt="image03"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-3">
							<img src="resources/images/g3.jpg"  class="img-responsive" alt="image03"/>						
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-4">
							<img src="resources/images/g4.jpg"  class="img-responsive" alt="image04"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-4">
							<img src="resources/images/g4.jpg"  class="img-responsive" alt="image04"/>					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-5">
							<img src="resources/images/g5.jpg"  class="img-responsive" alt="image05"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-5">
							<img src="resources/images/g5.jpg"  class="img-responsive" alt="image05"/>					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-6">
							<img src="resources/images/g6.jpg"  class="img-responsive" alt="image06"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-6">
							<img src="resources/images/g6.jpg"  class="img-responsive" alt="image06"/>					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-7">
							<img src="resources/images/g7.jpg"  class="img-responsive" alt="image07"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-7">
							<img src="resources/images/g7.jpg"  class="img-responsive" alt="image07"/>					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<li>
						<a href="#image-8">
							<img src="resources/images/g8.jpg"  class="img-responsive" alt="image08"/>
							<span>Libero tempore</span>
						</a>
						<div class="lb-overlay" id="image-8">
							<img src="resources/images/g8.jpg"  class="img-responsive" alt="image08"/>					
							<a href="#page" class="lb-close">x Close</a>
						</div>
					</li>
					<div class="clearfix"></div>
				</ul>
			</section>
		</div>
		<div class="field_content">
		    <h1>Auto Show on Showroom</h1>
		    <h2>View New cars</h2>
		</div>
	 </div>
   </div>
   <div class="footer">
   	 <div class="container">
   		<div class="cssmenu">
				<ul>
					<li class="active"><a href="privacy">Privacy</a></li>
					<li><a href="termofservice">Terms</a></li>
					<li><a href="#">Shop</a></li>
					<li><a href="about">About</a></li>
					<li><a href="contact">Contact</a></li>
				</ul>
		</div>
		<ul class="social">
			<li><a href=""> <i class="instagram"> </i> </a></li>
			<li><a href=""><i class="fb"> </i> </a></li>
			<li><a href=""><i class="tw"> </i> </a></li>
	    </ul>
	    <div class="clearfix"></div>
	    <div class="copy">
           <p>&copy; 2016 Auto Show.All rights reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
	    </div>
   	</div>
   </div>
</body>
</html>		

<!---->
   


		
         


         
