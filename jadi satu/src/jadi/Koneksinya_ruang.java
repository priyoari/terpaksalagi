/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadi;

/**
 *
 * @author mozaze
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Koneksinya_ruang {
    
    private static Connection koneksinya;
    public static Connection getKonksi(){
        if(koneksinya==null){
            try{
                String url="jdbc:mysql://localhost:3306/ruang";
                String username="root";
                String Password="";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksinya=DriverManager.getConnection(url, username, Password);
                
            }catch(SQLException t){
                  JOptionPane.showMessageDialog(null, "tidak bisa buat koneksi"+t);
                  Logger.getLogger(Koneksinya_ruang.class.getName()).log(Level.SEVERE,null,t);
            }
        }
        return koneksinya;
    }
    
}
