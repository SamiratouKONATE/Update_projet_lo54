/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.services;

import java.util.ArrayList;
import java.util.List;
import utbm.projet.formation.entity.Client;
import utbm.projet.formation.repository.DaoClient;

/**
 *
 * @author Utilisateur
 */
public class ServiceClient 
{
    /**
     * 
     * @param client 
     */
    public void insertClient(Client client)
    {
        DaoClient daoClient=new DaoClient();
        daoClient.insertClient(client);
        
    }
    
    /**
     * 
     * @return la liste des clients
     */
    public List<Client> selectClient()
    {
        DaoClient daoClient=new DaoClient();
        List <Client> clientList=daoClient.selectClient();
       return clientList;
    }
}
