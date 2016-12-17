<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
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
                    <div class="col-3M">
			<div class="indent">
                            <div id="wrapperM">
                                <h2 class="p0">Les formations disponibles</h2>												
                                    <div>
                                        <form id="recherche-cat" method="post" action="<c:url value="/recherche" />">
                                            
                                            <fieldset>
                                                <table border="0" cellpadding="0" cellspacing="0">
                                                     <tr>
                                                        <td width="144">
                                                            <input id="rechercheR" name="rechercheR" type="text" class="top-search-inp" placeholder="Rechercher par date"   />
                                                        </td>
                                                        <td width="46">
                                                              <input type="submit" class="SR" >
                                                        </td>
                                                        
                                                        <td width="48">
                                                            
                                                        </td>
                                                        
                                                        
                                                        
                                                        <td width="144">
                                                            <input id="rechercheTitle" name="rechercheTitle" type="text" class="top-search-inp" placeholder="Rechercher par titre" />
                                                        </td>
                                                        <td width="46">
                                                              <input type="submit" class="SR" >
                                                        </td>
                                                        
                                                        <td width="48">
                                                            
                                                        </td>
                                                        
                                                        
                                                        <td width="144">
                                                            <table cellpadding="0" cellspacing="0" border="0" >								
                                                                <tr>
                                                                    
                                                                     <td width="100%">
                                                                        <select  class="styledselect" id="selectR" name="selectR">
                                                                            <option disabled selected>
                                                                                   Rechercher par ville
                                                                            </option>  
                                                                            <c:forEach items="${listLocation}" var="location">
                                                                                <option>
                                                                                   ${location.getCity()}
                                                                                </option>         
                                                                            </c:forEach>
                                                                               
                                                                        </select> 
                                                                    </td>
                                                                    <td width="46">
                                                                        <input type="submit" class="SR" >
                                                                     </td>
                                                                </tr>
															 
                                                            </table>
                                                         </td>
                                                        </tr> 
															 
                                                </table>
													  
					</fieldset>
                                    </form>
                               </div>
			<p>
			<div id="wrapperM2">
                            <div id="rech1">          	
				<form id="mainform" action="">
                                    <table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
                                        <tr>
                                              	  <th class="table-header-check"><a id="toggle-all" ></a> </th>
                                                  <th class="table-header-repeat line-left minwidth-1Mc"><a href="">Code</a>	</th>
                                                  <th class="table-header-repeat line-left minwidth-1M"><a href="">Titre</a>	</th>
                                                  <th class="table-header-repeat line-left minwidth-1"><a href="">Localité</a></th>
                                                  <th class="table-header-repeat line-left"><a href="">Date début</a></th>
                                                   <th class="table-header-repeat line-left"><a href="">Date fin</a></th>
                                                  <th class="table-header-repeat line-left"><a href="">S'inscrire</a></th>
                                                  
                                       
                                         </tr>	
                                          <c:forEach items="${listCourse}" var="cours">
                                              <tr>
                                                 <td>
                                                    ${cours.getId_course_session()}
                                                 </td>
                                                 <td>
                                                      ${cours.getCourse().getCode()}
                                                 </td>
                                                
                                                 <td>
                                                      ${cours.getCourse().getTitle()}
                                                 </td>
                                                 
                                                  <td>
                                                      ${cours.getLocation().getCity()}
                                                 </td>
                                                 
                                                 <td>
                                                      ${cours.getStart_date()}
                                                 </td>
                                                 
                                                  <td>
                                                      ${cours.getEnd_date()}
                                                 </td>
                                                 
                                                 <td width="72">
                                                       <a  href="<c:url value="/inscription?id=${cours.getId_course_session()}"/>">Inscrire</a>
                                                 </td>
                                              </tr>       
                                           </c:forEach>
                                       
                                        
                                    </table>
                                </form>
                            </div>
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
