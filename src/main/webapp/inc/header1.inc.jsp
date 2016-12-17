<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
			<header> 
				<div class="row-1">
					<h1>
						<a class="logo" href="index.php">SPL.esi</a>
						<strong class="slog">Formations en ligne</strong>
					</h1>
					<form id="search-form" method="post" enctype="multipart/form-data">
						<fieldset>
							<div class="search-form">					
								<input type="text" name="search" value="Saisir pour Rechercher" onBlur="if(this.value=='') this.value='Saisir pour Rechercher'" onFocus="if(this.value =='Saisir pour Rechercher' ) this.value=''" />
								<a class="BT" href="#" onClick="document.getElementById('search-form').submit()">Recherche</a>	
							</div>
							
						</fieldset>
					</form>
				</div>
				
					<div class="row-2">
						<nav>
							<ul class="menu">
						  		<li><a  href="<c:url value="/accueil" />"  >Acceuil</a></li>
								<li><a  href="">Présentation</a></li>
						  		<li><a  href="<c:url value="/formation" />">Formations</a></li>
						  		<li><a  href="">Ecoles partenaires</a></li>
						  		<li class="last-item"><a href="">Nous contacter</a></li>
							</ul>
						</nav>
					</div>

			</header>
	
    