/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Success");            
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Driver not found" + cnfe);
        }        
        String url="jdbc:mysql://localhost:3306/proyecto_ventas?zeroDateTimeBehavior=convertToNull";        
        try{
          DBConnection=DriverManager.getConnection(url,"root","");
          System.out.println("Database Connected");
        }
        catch(SQLException se){
          System.out.println("Database Not Found");  
        }
        return DBConnection;
        
 
        
        
    }
    
}
