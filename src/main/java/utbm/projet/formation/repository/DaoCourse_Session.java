/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.entity.Course_Session;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Utilisateur
 */
public class DaoCourse_Session 
{
    /**
     * 
     * @return 
     */
    
    public List<Course_Session> selectCourseSession()
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
         try
        {
                session.beginTransaction();
                Query query=session.createQuery("from Course_Session");
                course_Session=query.list();
                
                
                session.getTransaction().commit();
        }
        catch (HibernateException he)
        {
	    he.printStackTrace();
	    if(session.getTransaction() != null)
            { 
	        try 
                {
	            session.getTransaction().rollback();	
	        }
                catch(HibernateException he2)
                {
                    he2.printStackTrace();
                } 
            }
	}
		
	finally 
        {
	     if(session != null) 
            {
	          try 
                  {
                      session.close();
                  }
                  catch(HibernateException he3)
                  {
                      he3.printStackTrace();
                  }
            }
        }
      return course_Session;
    }
    
    /**
     * 
     * @param value
     * @return 
     */
    public List<Course_Session> getCoursesWithDetails(Date start_date) {
      
        Session session=HibernateUtil.getSessionFactory().openSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        try {
            session.beginTransaction();
            String sql="from Course_Session cs where cs.start_date=:start_date";
            Query query=session.createQuery(sql);
            query.setDate("start_date", start_date);
            course_Session=query.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException he2) {
                    he2.printStackTrace();
                }
            }
        }
        return course_Session;
    }
    
        public List<Course_Session> getCoursesWithDetailsTitle(String title) {
      
        Session session=HibernateUtil.getSessionFactory().openSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        try {
            session.beginTransaction();
            String sql="from Course_Session cs where cs.course.title like:title";
            Query query=session.createQuery(sql);
            query.setParameter("title", "%"+title+"%");
            //query.setDate("start_date", start_date);
            course_Session=query.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException he2) {
                    he2.printStackTrace();
                }
            }
        }
        return course_Session;
    }
    
     /**
      * recuperer les sessions par ville
      * 
      */
    /**
     * 
     * @param location
     * @return 
     */
    public List<Course_Session> getCoursesWithDetailsLocation(String location) {
      
        Session session=HibernateUtil.getSessionFactory().openSession();
        List <Course_Session> course_Session=new ArrayList<Course_Session>();
        try {
            session.beginTransaction();
            String sql="from Course_Session cs where cs.location.city=:location";
            Query query=session.createQuery(sql);
            query.setString("location", location);
            course_Session=query.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException he2) {
                    he2.printStackTrace();
                }
            }
        }
        return course_Session;
    }
    
        
    /**
     * 
     * @param idCourseSession
     * @return 
     */
     public Course_Session selectCourseSessionById(int idCourseSession)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        Course_Session course_session=new Course_Session();
        
         try
        {
                session.beginTransaction();
               course_session =(Course_Session) session.get(Course_Session.class,idCourseSession);
                session.getTransaction().commit();
        }
        catch (HibernateException he)
        {
	    he.printStackTrace();
	    if(session.getTransaction() != null)
            { 
	        try 
                {
	            session.getTransaction().rollback();	
	        }
                catch(HibernateException he2)
                {
                    he2.printStackTrace();
                } 
            }
	}
		
	finally 
        {
	     if(session != null) 
            {
	          try 
                  {
                      session.close();
                  }
                  catch(HibernateException he3)
                  {
                      he3.printStackTrace();
                  }
            }
        }
      return course_session;
    }
}
