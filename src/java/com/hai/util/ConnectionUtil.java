/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nisarg
 */
public class ConnectionUtil {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://nisarg10.cxppgnnqsffg.us-west-2.rds.amazonaws.com:3306/hai";
    public static Connection con = null;

    public static Connection getCon() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "nisarg", "nisarg10");
        } catch (ClassNotFoundException e) {
            System.out.println("Error in Class.forName " + e);
        } catch (SQLException e) {
            System.out.println("Error in con " + e);
        }
        return con;
    }
}
