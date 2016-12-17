/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.repository.DaoCourse_Session;

/**
 *
 * @author Utilisateur
 */
public class ServiceCourseSession 
{
    /**
     * 
     * @return 
     */
    public List <Course_Session> selectCourseSession()
    {
        DaoCourse_Session daoCourse_Session=new DaoCourse_Session();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=daoCourse_Session.selectCourseSession();
        return course_Session;
    }
    /**
     * 
     * @param idCourseSession
     * @return 
     */
    public Course_Session selectCourseSessionById(int idCourseSession)
    {
         DaoCourse_Session daoCourse_Session=new DaoCourse_Session();
         return daoCourse_Session.selectCourseSessionById(idCourseSession);
    }
    /**
     * 
     * @param value
     * @return 
     */
    public List <Course_Session> getCoursesWithDetails(Date value)
    {
        DaoCourse_Session daoCourse_Session=new DaoCourse_Session();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=daoCourse_Session.getCoursesWithDetails(value);
        return course_Session;
    }
    /**
     * 
     * @param value
     * @return 
     */
   public List <Course_Session> getCoursesWithDetailsTitle(String title){
       DaoCourse_Session daoCourse_Session=new DaoCourse_Session();
       List <Course_Session> course_Session=new ArrayList<Course_Session>();
       course_Session=daoCourse_Session.getCoursesWithDetailsTitle(title);
       return course_Session;
   }
   /**
    * 
    * @param location
    * @return 
    */
      public List <Course_Session> getCoursesWithDetailsLocation(String location){
       DaoCourse_Session daoCourse_Session=new DaoCourse_Session();
       List <Course_Session> course_Session=new ArrayList<Course_Session>();
       course_Session=daoCourse_Session.getCoursesWithDetailsLocation(location);
       return course_Session;
   }
}

