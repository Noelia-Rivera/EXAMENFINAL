/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examenfinal.daoImpl;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import pe.edu.upeu.examenfinal.config.Conexion;
import pe.edu.upeu.examenfinal.dao.UsuarioDao;
import pe.edu.upeu.examenfinal.dto.LoginDTO;

/**
 *
 * @author Lenovo
 */
public class UsuarioDaoImpl implements UsuarioDao {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cn;

    @Override
    public List<LoginDTO> login(String username, String pass) {
        List<LoginDTO> lista = new ArrayList<>();
        String SQL = "SELECT u.idusuario, e.nombre, e.apellidos, u.username, r.nombre AS rol FROM USUARIO u "
                + "INNER JOIN EMPLEADO e ON u.idempleado = e.idempleado "
                + "INNER JOIN ROL r ON u.idrol = r.idrol "
                + "WHERE u.username = ? AND u.clave = ? ";
        try {
            cn = Conexion.getConnection();
            ps = cn.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                LoginDTO ld = new LoginDTO();
                ld.setIdusuario(rs.getInt("idusuario"));
                ld.setNombre(rs.getString("nombre"));
                ld.setApellidos(rs.getString("apellidos"));
                ld.setUsername(rs.getString("username"));
                ld.setRol(rs.getString("rol"));
                lista.add(ld);
            }
        } catch (Exception e) {
            System.out.println("Login: " + e);
        }
        return lista;
    }

}
