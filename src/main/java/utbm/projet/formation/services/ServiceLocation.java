/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.services;

import java.util.List;
import utbm.projet.formation.entity.Location;
import utbm.projet.formation.repository.DaoLocation;

/**
 *
 * @author Utilisateur
 */
public class ServiceLocation {
    /**
     * 
     * @return 
     */
    public List <Location> selectLocation(){
        DaoLocation daoLocation=new DaoLocation();
        List <Location> locationList=daoLocation.selectLocation();
       return locationList;
    }
}
