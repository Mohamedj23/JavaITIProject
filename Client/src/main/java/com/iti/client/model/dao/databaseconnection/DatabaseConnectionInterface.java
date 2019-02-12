/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.model.dao.databaseconnection;

/**
 *
 * @author Mohamed Jamal
 */
public interface DatabaseConnectionInterface {
    
    public void connectToDatabase();
    public void disconnectFromDatabase();
}
