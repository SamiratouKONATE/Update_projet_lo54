/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.repository.DaoCourse_Session;
import utbm.projet.formation.services.ServiceCourseSession;

/**
 *
 * @author Utilisateur
 */
public class ControllerCourseSession 
{
    /**
     * 
     * @return 
     */
    public List <Course_Session> getCoursesWithDetails()
    {
        ServiceCourseSession serviceCourseSession=new ServiceCourseSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=serviceCourseSession.selectCourseSession();
        return course_Session;
    }
    
    /**
     * 
     * @param idCourseSession
     * @return 
     */
     public Course_Session selectCourseSessionById(int idCourseSession)
    {
         ServiceCourseSession serviceCourseSession=new ServiceCourseSession();
         return serviceCourseSession.selectCourseSessionById(idCourseSession);
    }
     /**
      * 
      * @param value
      * @return 
      */
     public List <Course_Session> getCoursesWithDetails(Date value)
    {
        ServiceCourseSession serviceCourseSession=new ServiceCourseSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=serviceCourseSession.getCoursesWithDetails(value);
        return course_Session;
    }
     /**
      * 
      * @param value
      * @return 
      */
      public List <Course_Session> getCoursesWithDetailsTitle(String title)
    {
        ServiceCourseSession serviceCourseSession=new ServiceCourseSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=serviceCourseSession.getCoursesWithDetailsTitle(title);
        return course_Session;
    }
      
      public List <Course_Session> getCoursesWithDetailsLocation(String location)
    {
        ServiceCourseSession serviceCourseSession=new ServiceCourseSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        course_Session=serviceCourseSession.getCoursesWithDetailsLocation(location);
        return course_Session;
    }
}
