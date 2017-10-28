/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasel.Model.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author victor
 */
public class QueryFactory {
    
    public static ResultSet querySelect(String SQL) throws SQLException{
        Connection c = ConnectionFactory.newConnection();
        Statement st = c.createStatement();
        
        return st.executeQuery(SQL);
        
        
    }
    public static int queryUpdate(String SQL) throws SQLException{
        Connection c = ConnectionFactory.newConnection();
        Statement st = c.createStatement();
        return st.executeUpdate(SQL);
    }
   
}
