/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.examenfinal.dao;

import java.util.List;
import pe.edu.upeu.examenfinal.dto.LoginDTO;

/**
 *
 * @author Lenovo
 */
public interface UsuarioDao {
    public List<LoginDTO> login(String username, String pass);
}
