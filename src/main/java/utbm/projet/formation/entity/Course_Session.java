/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.entity;

import java.util.Date;

/**
 *
 * @author Utilisateur
 */
public class Course_Session {
    private int id_course_session;
    private Date start_date;
    private Date end_date;
    private Location location;
    private Course course;

    public int getId_course_session() {
        return id_course_session;
    }

    public void setId_course_session(int id_course_session) {
        this.id_course_session = id_course_session;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
}
