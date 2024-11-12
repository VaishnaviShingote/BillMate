/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionPackage;

import java.sql.*;

/**
 *
 * @author shiva
 */
public class ConnectionProvider {
    public static Connection getcon() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "11223344");
            return con;
        } catch (Exception e) {
            return null;
        }
    }

}
