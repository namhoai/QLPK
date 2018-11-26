/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoaiNam
 */
public class DatabaseConnection {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/qlpk";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    
    private static DatabaseConnection instance;

    private DatabaseConnection(){}
       
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection openConnection() {
        try {
            Class.forName(DatabaseConnection.DRIVER);
            return DriverManager.getConnection(DatabaseConnection.URL, DatabaseConnection.USERNAME, DatabaseConnection.PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection cn) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (cn != null && !cn.isClosed()) {
                cn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
