/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Connector {
     Connection c=null;
     public static Connection connect(){
         try{
            Class.forName("java.sql.Driver");
            String path="jdbc:mysql://localhost:3311/n_update";
            String user="root";
            String pass="root";
            Connection c=DriverManager.getConnection(path,user,pass);
            
            
            
            
           return c;
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty Field"+ex);
            return null;
        }
     }
}
