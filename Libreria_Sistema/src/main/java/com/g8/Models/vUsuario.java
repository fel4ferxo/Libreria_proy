/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Models;

/**
 *
 * @author Fernando Reinoso Revilla
 */
public class vUsuario {
    
    private int codigo_u;
    private String nombre_u;
    private String apellidos_u;
    private String dni_u;
    private String fecha_nacimiento_u;
    private String usuario_u;
    private String password_u;

    public vUsuario(int codigo_u, String nombre_u, String apellidos_u, String dni_u, String fecha_nacimiento_u, String usuario_u, String password_u) {
        this.codigo_u = codigo_u;
        this.nombre_u = nombre_u;
        this.apellidos_u = apellidos_u;
        this.dni_u = dni_u;
        this.fecha_nacimiento_u = fecha_nacimiento_u;
        this.usuario_u = usuario_u;
        this.password_u = password_u;
    }

    public vUsuario() {
        
    }

    public int getCodigo_u() {
        return codigo_u;
    }

    public void setCodigo_u(int codigo_u) {
        this.codigo_u = codigo_u;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getApellidos_u() {
        return apellidos_u;
    }

    public void setApellidos_u(String apellidos_u) {
        this.apellidos_u = apellidos_u;
    }

    public String getDni_u() {
        return dni_u;
    }

    public void setDni_u(String dni_u) {
        this.dni_u = dni_u;
    }

    public String getFecha_nacimiento_u() {
        return fecha_nacimiento_u;
    }

    public void setFecha_nacimiento_u(String fecha_nacimiento_u) {
        this.fecha_nacimiento_u = fecha_nacimiento_u;
    }

    public String getUsuario_u() {
        return usuario_u;
    }

    public void setUsuario_u(String usuario_u) {
        this.usuario_u = usuario_u;
    }

    public String getPassword_u() {
        return password_u;
    }

    public void setPassword_u(String password_u) {
        this.password_u = password_u;
    }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setLocation(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}



