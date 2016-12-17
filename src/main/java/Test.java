/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import utbm.projet.formation.controller.ControllerCourseSession;
import utbm.projet.formation.entity.Course_Session;

/**
 *
 * @author Utilisateur
 */
public class Test
{
    public static void main(String args[] )
    {
        ControllerCourseSession cs=new ControllerCourseSession();
        Course_Session c;
        List<Course_Session> ls=new ArrayList<Course_Session>();
        ls=cs.getCoursesWithDetails();
        Iterator<Course_Session> it=ls.iterator();
//        Hibernate.initialize(c.getCourse());
        while(it.hasNext())
        {
            c=it.next();

            System.out.println("cours "+c.getCourse().getCode() +" "+c.getCourse().getTitle()+" "+c.getStart_date()+" "+c.getEnd_date()+" "+c.getLocation().getCity() );
        }
    }
}
