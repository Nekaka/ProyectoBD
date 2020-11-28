/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vania
 */
public class Boletas {
    private int id;
    private int id_ventas;
    private String id_producto;
    private int cantidad;
    private int precio_venta;
    
  public Boletas(){
        
    }
  public Boletas(int id, int id_ventas, String id_producto, int cantidad, int precio_venta){
        this.id = id;
        this.id_ventas = id_ventas;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }
    
}
