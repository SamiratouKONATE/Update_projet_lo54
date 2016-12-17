/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utbm.projet.formation.controller.ControllerLocation;
import utbm.projet.formation.entity.Location;

/**
 *
 * @author Utilisateur
 */
public class ServletLocation extends HttpServlet {
     
    public static final String VUE="/WEB-INF/catalogue.jsp";
    
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
    {
        ControllerLocation controllerLocation=new ControllerLocation();
        List<Location> currentList=new ArrayList<Location>();
        currentList=controllerLocation.selectLocation();
        request.setAttribute("listLocation", currentList);
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
    
}
