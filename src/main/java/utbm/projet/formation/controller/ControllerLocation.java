/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.controller;

import java.util.List;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.services.ServiceLocation;

/**
 *
 * @author Utilisateur
 */
public class ControllerLocation {
    /**
     * 
     * @return 
     */
    public List<Location> selectLocation(){ 
       ServiceLocation serviceLocation=new ServiceLocation();
       List<Location> locationList = serviceLocation.selectLocation();
       return locationList;
        
        
    }
  
    
}
