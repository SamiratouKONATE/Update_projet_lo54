
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="fr">
<head>
	<c:import url="/inc/head.inc.jsp" />
</head>
<body id="page1">
<!-- header -->
	<div class="bg">
		<div class="main">
			<header>
                                <c:import url="/inc/header1.inc.jsp" />
				
				
			</header>
<!-- content -->
			<section id="content">
			  <div class="padding">
			    <div class="wrapper">
			

				  </div>
					<p>
			    <div class="box-bg margin-bot">
				<p>tytttttttt</p>
             <!--         <?php  include("menu2.inc.html");?> -->
			  </div>
			</section>
<!-- footer -->         <c:import url="/inc/footer.inc.jsp" />
			
		</div>
	</div>
	<script type="text/javascript"> Cufon.now(); </script>
	<script type="text/javascript">
		$(function(){
			$('.slider')._TMS({
				prevBu:'.prev',
				nextBu:'.next',
				playBu:'.play',
				duration:800,
				easing:'easeOutQuad',
				preset:'simpleFade',
				pagination:false,
				slideshow:3000,
				numStatus:false,
				pauseOnHover:true,
				banners:true,
				waitBannerAnimation:false,
				bannerShow:function(banner){
					banner
						.hide()
						.fadeIn(500)
				},
				bannerHide:function(banner){
					banner
						.show()
						.fadeOut(500)
				}
			});
		})
	</script>
</body>
</html>
