/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g8.Datos;

/**
 *
 * @author Fernando Reinoso Revilla
 */
public class vRegistroVentas {
    
    private int codigo_r;//codigo de registro
    private String codigo;//codigo de libro
    private String codigo_v;//codigo de comprador
    private double precio_venta;
    private String tipo_entrega;
    private String modo_pago;
    private String info_extra;

    public vRegistroVentas(int codigo_r, String codigo, String codigo_v, double precio_venta, String tipo_entrega, String modo_pago, String info_extra) {
        this.codigo_r = codigo_r;
        this.codigo = codigo;
        this.codigo_v = codigo_v;
        this.precio_venta = precio_venta;
        this.tipo_entrega = tipo_entrega;
        this.modo_pago = modo_pago;
        this.info_extra = info_extra;
    }

    public int getCodigo_r() {
        return codigo_r;
    }

    public void setCodigo_r(int codigo_r) {
        this.codigo_r = codigo_r;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo_v() {
        return codigo_v;
    }

    public void setCodigo_v(String codigo_v) {
        this.codigo_v = codigo_v;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getTipo_entrega() {
        return tipo_entrega;
    }

    public void setTipo_entrega(String tipo_entrega) {
        this.tipo_entrega = tipo_entrega;
    }

    public String getModo_pago() {
        return modo_pago;
    }

    public void setModo_pago(String modo_pago) {
        this.modo_pago = modo_pago;
    }

    public String getInfo_extra() {
        return info_extra;
    }

    public void setInfo_extra(String info_extra) {
        this.info_extra = info_extra;
    }
    
    
    
}
