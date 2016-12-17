$(document).ready(function(){
		
		$('.menu li a').click(function(){

			$('a').removeClass('active');
			$(this).addClass('active'); 
			
			$('.page5').load('ajoutsupport.inc.html');
			
		});
});