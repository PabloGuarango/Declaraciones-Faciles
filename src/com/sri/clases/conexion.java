/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sri.clases;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathani
 */
public class conexion {
    private Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoImpues","root","LAN.root");
           System.out.println("conexion establecida");
          
       } catch (Exception e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }

}
