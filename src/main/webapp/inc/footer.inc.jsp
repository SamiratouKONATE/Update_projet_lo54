<!-- footer -->
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
			<footer>
				<div class="row-top">
					<div class="row-padding">
						<div class="wrapper">
							<div class="col-1">
								<h4 style="text-decoration:underline;">Addresse</h4>
								<dl class="address">
									<dt><span>Pays:</span>France</dt>
									<dd><span>Ville:</span>Belfort</dd>
									<dd><span>Adresse:</span>Université de Technologie de Belfort Montbéliard 90010 Belfort Cedex</dd>
									<dd><span>Standard:</span><a href="#">+33(0)384583000</a></dd>
								</dl>
							</div>
							<div class="col-2">
								<h4 style="text-decoration:underline;">Nous suivre</h4>
								<ul class="list-services">
									<li class="item-1"><a href="#">Facebook</a></li>
									<li class="item-2"><a href="#">Twitter</a></li>
									<li class="item-3"><a href="#">LinkedIn</a></li>
								</ul>
							</div>
							<div class="col-3">
								<h4 style="text-decoration:underline;">Liens utiles</h4>
								<ul class="list-1">
									<li><a href="http://www.utbm.fr/">UTBM</a></li>
									<li><a href="#">UTC</a></li>
									<li><a href="#">UTT</a></li> 
									<li><a href="#">....</a></li>
								</ul>
							</div>
							<div class="col-4">
								<!---->
                                	
									<div class="grid3">
										<div id="datepicker"></div>
									</div>
                                <!---->
							</div>
						</div>
					</div>
				</div>
				<div class="row-bot">
					<div class="aligncenter">
						<p class="p0">Copyright Samira&Assane</p>
						<!-- {%FOOTER_LINK} -->
					</div>
				</div>
			</footer>
    <script type="text/javascript">
		$(document).ready(function() {
			$('.pics').cycle({
				fx: 'toss',
				next:	 '#next', 
				prev:	 '#prev' 
			});
			
			// Datepicker
			$('#datepicker').datepicker({
				inline: true
			});
			
		});
	</script>
	
	
    