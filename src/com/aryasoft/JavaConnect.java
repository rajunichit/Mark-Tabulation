/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aryasoft;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Mindbowser-MB
 */
public class JavaConnect {

    Connection con = null;

    public static Connection connectDB() {
        try {
//            Class.forName("org.sqlite.JDBC");
//            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mindbowser-MB\\Desktop\\AryaProject\\examinfo.sqlite");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aryadb","root","root");

            JOptionPane.showMessageDialog(null, "Connection established");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
