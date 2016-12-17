$(document).ready(function()
{
(function($)
			{
			$("#profileens").hide();
			$("#profileetud").hide();
			/*<!-- vfvfmm;:-->*/
			$("#typedeprofile").change(function(event)
				{
				sp=$("#typedeprofile option:selected");
					
					if(sp.val()=="Etudiant")
					{
						$("#profileens").fadeOut("slow");$("#profileens").hide(); 
						$("#profileetud").fadeIn("slow"); $("#profileetud").show().fadeOut("slow").fadeIn("slow");
						$("#matriculeens").removeAttr('required');
						$("#matriculeetud").add('required');
					}
					if(sp.val()=="Enseignant")
					{
						$("#profileetud").fadeOut("slow");$("#profileetud").hide(); 
						$("#profileens").fadeIn("slow"); $("#profileens").show().fadeOut("slow").fadeIn("slow");
						$("#matriculeetud").removeAttr('required');
						$("#matriculeens").add('required');
					}
					if(sp.val()=="Aucun")
					{
						$("#profileens").fadeIn("slow").fadeOut("slow").hide();
						$("#profileetud").fadeIn("slow").fadeOut("slow").hide();
					}
				})
			})(jQuery);	
		(function($)
			{
				$("#filiere").change(function(event)
				{
					
					var sp= $("#filiere option:selected");
					var ret= $("#niveau option").length;
					var ver= $("#niveau option")[2];
					/*<!--alert(ret);-->
					<!--alert(ver);-->*/
					if(sp.val()=="CICI"){ver.remove();}else{ if(ret==2)$("#niveau").append(new Option("3�me ann�e",""));}
					
				})
			})(jQuery);	
		(function($)
			{
				$("#cpassword").change(function(event)
				{
					
					var cpass= $(this).val();
					var pass=$("#password").val();
					if(cpass!=pass){$("#cpassword").css('color', 'red');}else{$("#cpassword").css('color', 'black');}
					
				})
				$("#password").change(function(event)
				{
					var cpass= $(this).val();
					var pass=$("#password").val();
					if(cpass!=pass){$("#cpassword").css('color', 'red');}else{$("#cpassword").css('color', 'black');}
					
				})
				$("#steps").change(function(event)
				{
					if($("#cpassword").val()!=$("#password").val())
					{
						/*<!--alert("mais ca doit marcher");-->*/
						$("#cpassword").val(null);
					}
				})
			})(jQuery);	
});