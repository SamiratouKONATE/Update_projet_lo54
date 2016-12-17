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
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utbm.projet.formation.controller.ControllerCourseSession;
import utbm.projet.formation.controller.ControllerLocation;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.entity.Location;

/**
 *
 * @author Utilisateur
 */
public class ServletRecherche extends HttpServlet {
    
    public static final String VUE="/WEB-INF/catalogue.jsp";
    
     public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
         
         List<Course_Session> currentList=new ArrayList<Course_Session>();
         ControllerCourseSession courseList= new ControllerCourseSession();
         ControllerLocation controllerLocation=new ControllerLocation();
         List<Location> locationList=new ArrayList<Location>();
         
         
         
         
         //recuperation de la valeur saisie
         String value=request.getParameter("rechercheR");
         String title=request.getParameter("rechercheTitle");
         String location=request.getParameter("selectR");
         Date date = null;
           //conversion string en date
         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
         
          ArrayList<String> parameterNames = new ArrayList<String>();
         Enumeration en=request.getParameterNames();
         
         while (en.hasMoreElements()) {
            String parameterName = (String) en.nextElement();
            parameterNames.add(parameterName);
        }

         for(int i=0;i<parameterNames.size();i++)
         {
             //System.out.println(parameterNames.get(i));
             if(parameterNames.get(i).equals("rechercheR") && !value.isEmpty() )
             {
                // System.out.println("TOTO");
                // System.out.println("value "+value);
                 try {
                    date = formatter.parse(value); 
                    java.sql.Date start_date = new java.sql.Date(date.getTime());
                     currentList=courseList.getCoursesWithDetails(start_date);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
             }
             
             if(parameterNames.get(i).equals("rechercheTitle") && !title.isEmpty() )
             {
                 //System.out.println("TITI");
                 //System.out.println("title "+title);
                 currentList=courseList.getCoursesWithDetailsTitle(title);
             }
             
             if(parameterNames.get(i).equals("selectR") && !location.isEmpty())
             {
               //  System.out.println("TATA");
               //  System.out.println("location "+location);
                 currentList=courseList.getCoursesWithDetailsLocation(location);
             }
             
         }
    
       
         
         locationList=controllerLocation.selectLocation();
        
          //request.setAttribute("listCourse", currentList);
         request.setAttribute("listCourse", currentList);
         request.setAttribute("listLocation", locationList);
         this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

     }
    
}
