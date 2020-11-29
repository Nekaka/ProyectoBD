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
public class Ventas {
    private int id;
    private int id_user;
    private int total;
    private String fecha_venta;
    private int estado;
    
    public Ventas(){
        
    }
    
    public Ventas(int id, int id_user,int total, String fecha_venta, int estado){
        this.id = id;
        this.id_user = id_user;
        this.total = total;
        this.fecha_venta = fecha_venta;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
   }
