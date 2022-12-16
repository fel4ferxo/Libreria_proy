/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.g8.Interfaces;

import com.g8.Models.vLibro;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface DAOLibro {
    public void registrar (vLibro libro) throws Exception;
    public boolean modificar (vLibro libro) throws Exception;
    public boolean eliminar (vLibro libro) throws Exception;
    public List<vLibro> listar() throws Exception;
}
