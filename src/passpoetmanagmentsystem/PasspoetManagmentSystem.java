/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



package passpoetmanagmentsystem;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PasspoetManagmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        String user = "root";
        String password = "Hashi2002.";
        String url = "jdbc:mysql://localhost:3306/connectdb";
        
        
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PasspoetManagmentSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LoadingHome lh = new LoadingHome();
        HomePage hp = new HomePage();
        lh.setVisible(true);
        
        for (int i =1; i<=100 ; i++){
            try{
                Thread.sleep(80);
                lh.abcd.setValue(i);
                
                if(i%2==0){
                    lh.pleaseWait.setText("Please Wait...");
                    
                }else{
                    lh.pleaseWait.setText("Please Wait....");
                }
                
                
                if(i==100){
                    lh.setVisible(false);
                    hp.setVisible(true);
                    
                }
                
            }catch (InterruptedException e){
                Logger.getLogger(LoadingHome.class.getName()).log(Level.SEVERE, null , e);
                
            }
        }
        
        
    }
        
    
}
