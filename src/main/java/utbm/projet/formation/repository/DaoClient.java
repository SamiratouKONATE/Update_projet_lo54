/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.repository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.util.HibernateUtil;

/**
 *
 * @author Utilisateur
 */
public class DaoClient 
{
    public void insertClient(Client client)
    {
         Session session=HibernateUtil.getSessionFactory().openSession();
          try
        {
            session.beginTransaction();
            session.persist(client);
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
    
}
    /**
     * 
     * @return la liste des clients en affichant leur nom
     */
    public List <Client> selectClient()
    {
        Session session=HibernateUtil.getSessionFactory().openSession();
        List <Client> clientList=new ArrayList<Client>();
         try
        {
                session.beginTransaction();
                Query query=session.createQuery("select lastname from Client");
                clientList=query.list();
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
      return clientList;
    }
         
}
    

