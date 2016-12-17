/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.controller;

import java.util.ArrayList;
import java.util.List;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.services.ServiceClient;


/**
 *
 * @author Utilisateur
 */
public class ControllerClient 
{
    public void insertClient(Client client)
    {
        
      
        ServiceClient serviceClient=new ServiceClient();
        serviceClient.insertClient(client);

        //return client;
    }
    
    public List<Client> selectClient()
    { 
       ServiceClient serviceClient=new ServiceClient();
       List<Client> clientList = serviceClient.selectClient();
       return clientList;
        
        
    }
    
}
