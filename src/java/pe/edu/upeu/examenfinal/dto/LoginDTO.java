/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.examenfinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    private int idusuario;
    private String username;
    private String nombre;
    private String apellidos;
    private String rol;
}
