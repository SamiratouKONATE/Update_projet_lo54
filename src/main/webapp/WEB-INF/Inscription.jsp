<%-- 
    Document   : Inscription
    Created on : 3 déc. 2016, 10:01:07
    Author     : Utilisateur
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
	<c:import url="/inc/head.inc.jsp" />
    </head>
<body id="page5">
<!-- header -->
<div class="bg">
    <div class="main">
	<c:import url="/inc/header1.inc.jsp" />
<!-- content -->
	<section id="content">
            <div class="padding">
		<div class="wrapper margin-bot">
                    <div class="col-3">
                        <div class="indent">
                            <div id="wrapper">
                                <h2 class="p0">Formulaire d'inscription</h2>
                                <label>
                                    <c:out value="${resultat}"/>
                                </label>
                                    <div id="steps">
                                        <form id="formElem" name="formElem" action="<c:url value="/inscription"/>" method="post">
                                          <fieldset class="step">
                                              <legend>Inscription à une session</legend>
                                              <p>
                                                  <label for="nom">Nom <a style="color:red;font-size:24px;">*</a></label>
                                                  <input id="nom" name="nom" value="<c:out value="${ client.firstname}"/>" required/>
                                                  <label >${erreurs['nom']}</label>
                                              </p>
                                              
                                              <p>
                                                  <label for="prenom">Prenom <a style="color:red;font-size:24px;">*</a></label>
                                                  <input id="prenom" name="prenom" required/>
                                              </p>
                                              
                                              <p>
                                                  <label for="address">Addresse <a style="color:red;font-size:24px;">*</a></label>
                                                  <input id="address" name="address" required/>
                                              </p>
                                              
                                              <p>
                                                  <label for="phone">Numéro de téléphone <a style="color:red;font-size:24px;">*</a></label>
                                                  <input id="phone" name="phone" required/>
                                              </p>
                                              
                                              <p>
                                                  <label for="email">Email</label>
                                                  <input id="email" name="email" placeholder="example@utbm.fr" type="email" AUTOCOMPLETE=ON required/>
                                              </p>
                                              
                                          </fieldset>
                                          
                                           Les champs suivis de (<a style="color:red;font-size:24px;">*</a>) sont obligatoires.
                                            <div style="float:right;">
                                                      <button id="bvalue" type="submit">Valider</button>
                                                      <button id="bannuler" type="reset">Annuler</button>
                                           </div>
                                      </form>
                                    </div>
                                 </div>
                             </div>
                         </div>
                     </div>
                 </div>
            </section>
            <c:import url="/inc/footer.inc.jsp" />
        </div>
    </div>  
<script type="text/javascript"> Cufon.now(); </script>
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

</body>
</html>
