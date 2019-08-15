/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asianpaint.login;
/**
 *
 * @author Mathuragini
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    
    // create a function to connect with mysql database
    public static Connection dbconnect(){
        Connection conn = null;
        try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                String connectionUrl = "jdbc:mysql://localhost:3306/asianpaint?useSSL=false";
                String connectionUser = "root";
                String connectionPassword = "root";
            conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
            System.out.println("Connected");

        } catch (Exception e) {
            System.out.println("Error from dbconnection"+e );
        }
        return conn;  
    } 
}
