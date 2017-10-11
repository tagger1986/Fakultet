
package com.in2.fakultet.prijavaispita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class TestKonekcije {
    
    
    public static void main(String[] args) throws SQLException {
        
        Connection connection = null;
        
        try{
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "FAKULTET", "123");
            Statement stat;
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM fakultet.student");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Ima ukupno kolona:");
            System.out.println(rsmd.getColumnCount());
            
        
        }catch(SQLException ex){
                System.out.println("Konekcija neuspesna");
                ex.printStackTrace();
                
       
        }finally {
            System.out.println("Konekcija zatvorena");
            connection.close();
            
        }
        
        
        
        
        
        
        
    }
    
}
