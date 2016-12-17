
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utbm.projet.formation.controller.ControllerClient;
import utbm.projet.formation.controller.ControllerCourseSession;
import utbm.projet.formation.controller.ControllerLocation;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.entity.Location;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utilisateur
 */
public class App 
{
    public static void main(String agrs[]) throws ParseException
    {
        /* ControllerClient controllerClient=new ControllerClient();
        List <Client> clientList=controllerClient.selectClient();
        for(int i=0;i<clientList.size();i++)
        {
        System.out.println("LastName: "+clientList.get(i));
        }*/
        /* ControllerLocation cl=new ControllerLocation();
        List <Location> ls=cl.selectLocation();
        
        for(int i=0;i<ls.size();i++)
        {
        System.out.println("LastName: "+ls.get(i).getCity());
        }*/
       
        
        
      // SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
       /*SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       Date yourDate = sdf.parse("09-11-2016");
       //
       java.sql.Date mysqlDate = new java.sql.Date(yourDate.getTime());
       //
       System.out.println(mysqlDate);
        
        ControllerCourseSession cs=new ControllerCourseSession();
         List <Course_Session> course_Session=cs.getCoursesWithDetails(mysqlDate);
       
        for(int i=0;i<course_Session.size();i++)
        {
        System.out.println("LastName: "+course_Session.get(i).getCourse().getTitle());
        }*/
        
        ControllerCourseSession cs=new ControllerCourseSession();
         List <Course_Session> course_Session=cs.getCoursesWithDetailsTitle("Java");
         for(int i=0;i<course_Session.size();i++)
        {
        System.out.println("LastName: "+course_Session.get(i).getCourse().getTitle());
        }
    }
    
}
