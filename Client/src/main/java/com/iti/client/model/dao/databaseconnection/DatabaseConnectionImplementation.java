/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.model.dao.databaseconnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mohamed Jamal
 */
public class DatabaseConnectionImplementation implements DatabaseConnectionInterface{
    
    Connection connection;
    Statement statment;
    String username;
    String password;
    
    @Override
    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/myDB");
            statment = connection.createStatement();
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public void disconnectFromDatabase() {
    }
    
    
    
}
