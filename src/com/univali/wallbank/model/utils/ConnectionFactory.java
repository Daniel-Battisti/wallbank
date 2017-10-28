/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasel.Model.utils;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author victor
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/estoque";
    private static final String USER = "root";
    private static final String PASSWORD = "P1nK1666";
    
    public static Connection newConnection() throws SQLException{
        
        DriverManager.deregisterDriver(new Driver());
        
        return DriverManager.getConnection(URL,USER,PASSWORD);
        
    }
    
}
