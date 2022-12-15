/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.g8.Interfaces;

import com.g8.Models.vRegistroVentas;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface DAORegistroVentas {
    
    public void registrar (vRegistroVentas registro) throws Exception;
    public List<vRegistroVentas> listar() throws Exception;
    
}
