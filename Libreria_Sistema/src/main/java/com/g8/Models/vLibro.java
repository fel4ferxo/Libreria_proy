/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Models;

/**
 *
 * @author Fernando Reinoso Revilla
 */
public class vLibro {
    
    private int codigo;
    private String nombre_l;
    private String autor_l;
    private String aniopub_l;
    private String volumen_l;
    private String edicion_l;
    private String descripcion_l;
    private String precio_l;
    private String imagen_link;

    public vLibro(int codigo, String nombre_l, String autor_l, String aniopub_l, String volumen_l, String edicion_l, String descripcion_l, String precio_l, String imagen_link) {
        this.codigo = codigo;
        this.nombre_l = nombre_l;
        this.autor_l = autor_l;
        this.aniopub_l = aniopub_l;
        this.volumen_l = volumen_l;
        this.edicion_l = edicion_l;
        this.descripcion_l = descripcion_l;
        this.precio_l = precio_l;
        this.imagen_link = imagen_link;
    }

    //Constructor Libros
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_l() {
        return nombre_l;
    }

    public void setNombre_l(String nombre_l) {
        this.nombre_l = nombre_l;
    }

    public String getAutor_l() {
        return autor_l;
    }

    public void setAutor_l(String autor_l) {
        this.autor_l = autor_l;
    }

    public String getAniopub_l() {
        return aniopub_l;
    }

    public void setAniopub_l(String aniopub_l) {
        this.aniopub_l = aniopub_l;
    }

    public String getVolumen_l() {
        return volumen_l;
    }

    public void setVolumen_l(String volumen_l) {
        this.volumen_l = volumen_l;
    }

    public String getEdicion_l() {
        return edicion_l;
    }

    public void setEdicion_l(String edicion_l) {
        this.edicion_l = edicion_l;
    }

    public String getDescripcion_l() {
        return descripcion_l;
    }

    public void setDescripcion_l(String descripcion_l) {
        this.descripcion_l = descripcion_l;
    }

    public String getPrecio_l() {
        return precio_l;
    }

    public void setPrecio_l(String precio_l) {
        this.precio_l = precio_l;
    }

    public String getImagen_link() {
        return imagen_link;
    }

    public void setImagen_link(String imagen_link) {
        this.imagen_link = imagen_link;
    }

    public void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setLocation(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
          
}
