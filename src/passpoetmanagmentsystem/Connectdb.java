/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passpoetmanagmentsystem;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Connectdb {
   
        
    public static Connection connect() {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		String username = "root";
		String pwd = "Hashi2002.";
		String dbname = "connectdb";
		try {
                    
                Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"connectdb","root","Hashi2002.");
		
                return conn;
		}
		catch(SQLException e) {
		
                return conn;
		
		} catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectdb.class.getName()).log(Level.SEVERE, null, ex);
            return conn;
        }

	}

    static Object mycon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
