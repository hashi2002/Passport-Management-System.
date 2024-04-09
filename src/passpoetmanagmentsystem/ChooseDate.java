/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passpoetmanagmentsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author nethm
 */
public class ChooseDate {
    
    
    
    public String[] search(String nic){
        
       
        String[] a = new String [3];
        
        Connection conn = Connectdb.connect();
        
        
        try {
            String query = "select * from connectdb.date where nic = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1,nic);
            
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            a[0] = rs.getString("date1");
            a[1] = rs.getString("date2");
            a[2]= rs.getString("date3");
            
            return a;
        }
        
        catch(Exception ex){
            System.out.println(a[1]);
        }
        return a;
    }
    
    
    public void setdate(String num,String nic){
        
        
        ChooseDate ob = new ChooseDate();
        String array[] = ob.search(nic);
        
         Connection conn = Connectdb.connect();
        
      if(num.equals("1")){
        try {
            String query = "update connectdb.application set date = ? where nic = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1,array[0]);
            pst.setString(2,nic);
            
            int row = pst.executeUpdate();
            
            if(row == 1){
                System.out.println("success"); 
            }
        } catch(Exception ex){
            System.out.println("error");
        }
      }
      else if(num.equals("2")){
        try {
            String query = "update connectdb.application set date = ? where nic = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1,array[1]);
            pst.setString(2,nic);
            
            int row = pst.executeUpdate();
            
            if(row == 1){
                System.out.println("success"); 
            }
        } catch(Exception ex){
            System.out.println("error");
        }
      }
      else{
           try {
            String query = "update connectdb.application set date = ? where nic = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1,array[2]);
            pst.setString(2,nic);
            
            int row = pst.executeUpdate();
            
            if(row == 1){
                System.out.println("success"); 
            }
        } catch(Exception ex){
            System.out.println("error");
        }
          
      }
      
        
        
    }
    
}
