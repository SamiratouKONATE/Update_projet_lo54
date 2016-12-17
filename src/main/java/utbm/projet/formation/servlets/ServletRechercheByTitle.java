/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utbm.projet.formation.controller.ControllerCourseSession;
import utbm.projet.formation.controller.ControllerLocation;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.entity.Location;
import static utbm.projet.formation.servlets.ServletRecherche.VUE;

/**
 *
 * @author Utilisateur
 */
public class ServletRechercheByTitle extends HttpServlet{
     public static final String VUE="/WEB-INF/catalogue.jsp";
     
     public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
         
         //recuperation de la valeur saisie
        
         String title=request.getParameter("rechercheTitle");
      
         //location
         ControllerLocation controllerLocation=new ControllerLocation();
         List<Location> locationList=new ArrayList<Location>();
        locationList=controllerLocation.selectLocation();

        //recupération des cours selon le mot clé saisi par user
        ControllerCourseSession courseList= new ControllerCourseSession();
        List<Course_Session> currentList=new ArrayList<Course_Session>();
        currentList=courseList.getCoursesWithDetailsTitle(title);
        
        request.setAttribute("listLocation", locationList);
        request.setAttribute("listCourse", currentList);
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
         
     }
    
}
