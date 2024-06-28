/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examenfinal.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class Conexion {
    private static Connection cn;
    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            if (cn == null) {
                cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "C##NRIVERA", "12345");
            }
        } catch (Exception e) {
            System.out.println("Conexion: " +e);
        }
        return cn;
    }
}
