/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.upeu.examenlp.test;

import com.google.gson.Gson;
import pe.edu.upeu.examenfinal.config.Conexion;
import pe.edu.upeu.examenfinal.dao.UsuarioDao;
import pe.edu.upeu.examenfinal.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author Lenovo
 */
public class test {
    static UsuarioDao ud = new UsuarioDaoImpl();
    static Gson g = new Gson();
    
    public static void main(String[] args) {
        // TODO code application logic here
        if (Conexion.getConnection()!=null) {
            System.out.println("Conectado");
        } else {
            System.out.println("Error");
        }
        System.out.println(g.toJson(ud.login("noelia.rivera", "123")));
    }
    }

