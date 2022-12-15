/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Models;

/**
 *
 * @author Fernando Reinoso Revilla
 */
public class vComprador {
    
    private int codigo_v;
    private String nombre_v;
    private String apellidos_v;
    private String dni_v;
    private String fecha_nacimiento_v;

    public vComprador(int codigo_v, String nombre_v, String apellidos_v, String dni_v, String fecha_nacimiento_v) {
        this.codigo_v = codigo_v;
        this.nombre_v = nombre_v;
        this.apellidos_v = apellidos_v;
        this.dni_v = dni_v;
        this.fecha_nacimiento_v = fecha_nacimiento_v;
    }

    public int getCodigo_v() {
        return codigo_v;
    }

    public void setCodigo_v(int codigo_v) {
        this.codigo_v = codigo_v;
    }

    public String getNombre_v() {
        return nombre_v;
    }

    public void setNombre_v(String nombre_v) {
        this.nombre_v = nombre_v;
    }

    public String getApellidos_v() {
        return apellidos_v;
    }

    public void setApellidos_v(String apellidos_v) {
        this.apellidos_v = apellidos_v;
    }

    public String getDni_v() {
        return dni_v;
    }

    public void setDni_v(String dni_v) {
        this.dni_v = dni_v;
    }

    public String getFecha_nacimiento_v() {
        return fecha_nacimiento_v;
    }

    public void setFecha_nacimiento_v(String fecha_nacimiento_v) {
        this.fecha_nacimiento_v = fecha_nacimiento_v;
    }
    
     
}
