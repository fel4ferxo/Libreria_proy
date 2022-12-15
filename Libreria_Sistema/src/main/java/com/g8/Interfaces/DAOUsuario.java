/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.g8.Interfaces;

import com.g8.Models.vUsuario;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface DAOUsuario {
    
    public void registrar (vUsuario usuario) throws Exception;
    public void modificar (vUsuario usuario) throws Exception;
    public void eliminar (vUsuario usuario) throws Exception;
    public List<vUsuario> listar() throws Exception;
    
}
