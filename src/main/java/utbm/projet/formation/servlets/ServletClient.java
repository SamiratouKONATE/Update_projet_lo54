/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utbm.projet.formation.controller.ControllerClient;
import utbm.projet.formation.controller.ControllerCourseSession;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.entity.Course_Session;

/**
 *
 * @author Utilisateur
 */
public class ServletClient extends HttpServlet
{
    public static final String VUE="/WEB-INF/Inscription.jsp";
   // private String resultat;
    private Map<String, String> erreurs= new HashMap<String, String>();
    
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
      
        HttpSession session=request.getSession();
        String course_session_id=request.getParameter("id");
        session.setAttribute("ics", course_session_id);
	this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        HttpSession session=request.getSession();
        String resultat="";
        
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String address=request.getParameter("address");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String course_session_id= (String)session.getAttribute("ics");
        int id=Integer.parseInt(course_session_id);
        
        ControllerCourseSession controllerCourseSession=new ControllerCourseSession();
        Course_Session courseSession=controllerCourseSession.selectCourseSessionById(id);
        Client client=new Client();
        client.setCourse_session(courseSession);
        
         try {
            validationNom(nom);
        } catch ( Exception e ) {
            setErreur("nom", e.getMessage() );
        }
           client.setFirstname(nom);
        
           
        
        try {
            validationPrenom(prenom);
        } catch ( Exception e ) {
            setErreur("prenom", e.getMessage() );
        }
           client.setLastname(prenom);
           
        
         try {
            validationAdresse( address );
        } catch ( Exception e ) {
            setErreur( "address", e.getMessage() );
        }
         
         client.setAddress(address);
         
         
         try {
            validationTelephone( phone );
        } catch ( Exception e ) {
            setErreur("phone", e.getMessage() );
        }
           
        client.setPhone(phone);
        
         try {
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur("email", e.getMessage() );
        }
         
         client.setEmail(email);

        
        

        if (erreurs.isEmpty()) {
            
            resultat="Inscription à la session réussie!";
            ControllerClient controllerClient=new ControllerClient();
            controllerClient.insertClient(client);
   
        } else {
            /* Sinon, ré-affichage du formulaire de création avec les erreurs */
            resultat="Veuillez reprendre votre incription";
            request.setAttribute("id", id);
            
           // this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
            
        }
        request.setAttribute("client", client);
        request.setAttribute("erreurs", erreurs);
        request.setAttribute("resultat",resultat);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
   }   
    
    private void validationNom( String nom ) throws Exception 
    {
        if ( !nom.isEmpty() && nom.trim().length()<2 )
            
        {
            throw new Exception( "Votre nom doit contenir plus d'un caractère." );
        }
    }
    // validation prenom

    private void validationPrenom( String prenom ) throws Exception {
        if ( !prenom.isEmpty() && prenom.trim().length()<2) {
            throw new Exception( "Votre prenom doit contenir plus d'un caractère.." );
        }
    }

    // validation adresse

    private void validationAdresse( String adresse ) throws Exception {
        if ( !adresse.isEmpty() && adresse.trim().length() > 30) {
            throw new Exception( "Votre adresse " );
        }
    }

    // validation telephone
    private void validationTelephone( String telephone ) throws Exception {
        if ( !telephone.isEmpty()) {
            if ( telephone.matches( "^\\d+$" ) ) {
                throw new Exception( "Le numéro de téléphone doit uniquement contenir des chiffres." );
            } else if ( telephone.length() < 4 ) {
                throw new Exception( "Le numéro de téléphone doit contenir au moins 4 chiffres." );
            }
        } else {
            throw new Exception( "Merci d'entrer un numéro de téléphone." );
        }
    }
    
    
     private void validationEmail( String email ) throws Exception {
        if ( !email.isEmpty() && email.trim().length()>30) {
            throw new Exception( "Votre adresse n'est pas valide" );
        }
    }

      private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }
      
 
      
      
}
